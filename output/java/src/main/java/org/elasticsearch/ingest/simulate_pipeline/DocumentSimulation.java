
package org.elasticsearch.ingest.simulate_pipeline;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;
import org.elasticsearch.ingest.simulate_pipeline.*;
import org.elasticsearch.common_abstractions.lazy_document.*;

public class DocumentSimulation  implements XContentable<DocumentSimulation> {
  
  static final ParseField ID = new ParseField("_id");
  private String _id;
  public String getId() { return this._id; }
  public DocumentSimulation setId(String val) { this._id = val; return this; }


  static final ParseField INDEX = new ParseField("_index");
  private String _index;
  public String getIndex() { return this._index; }
  public DocumentSimulation setIndex(String val) { this._index = val; return this; }


  static final ParseField INGEST = new ParseField("_ingest");
  private Ingest _ingest;
  public Ingest getIngest() { return this._ingest; }
  public DocumentSimulation setIngest(Ingest val) { this._ingest = val; return this; }


  static final ParseField PARENT = new ParseField("_parent");
  private String _parent;
  public String getParent() { return this._parent; }
  public DocumentSimulation setParent(String val) { this._parent = val; return this; }


  static final ParseField ROUTING = new ParseField("_routing");
  private String _routing;
  public String getRouting() { return this._routing; }
  public DocumentSimulation setRouting(String val) { this._routing = val; return this; }


  static final ParseField SOURCE = new ParseField("_source");
  private LazyDocument _source;
  public LazyDocument getSource() { return this._source; }
  public DocumentSimulation setSource(LazyDocument val) { this._source = val; return this; }


  static final ParseField TYPE = new ParseField("_type");
  private String _type;
  public String getType() { return this._type; }
  public DocumentSimulation setType(String val) { this._type = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    builder.field(ID.getPreferredName(), _id);
    builder.field(INDEX.getPreferredName(), _index);
    if (_ingest != null) {
      builder.field(INGEST.getPreferredName());
      _ingest.toXContent(builder, params);
    }
    builder.field(PARENT.getPreferredName(), _parent);
    builder.field(ROUTING.getPreferredName(), _routing);
    if (_source != null) {
      builder.field(SOURCE.getPreferredName());
      _source.toXContent(builder, params);
    }
    builder.field(TYPE.getPreferredName(), _type);
    return builder;
  }

  @Override
  public DocumentSimulation fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return DocumentSimulation.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<DocumentSimulation, Void> PARSER =
    new ConstructingObjectParser<>(DocumentSimulation.class.getName(), false, args -> new DocumentSimulation());

  static {
    PARSER.declareString(DocumentSimulation::setId, ID);
    PARSER.declareString(DocumentSimulation::setIndex, INDEX);
    PARSER.declareObject(DocumentSimulation::setIngest, (p, t) -> Ingest.PARSER.apply(p, t), INGEST);
    PARSER.declareString(DocumentSimulation::setParent, PARENT);
    PARSER.declareString(DocumentSimulation::setRouting, ROUTING);
    PARSER.declareObject(DocumentSimulation::setSource, (p, t) -> LazyDocument.PARSER.apply(p, t), SOURCE);
    PARSER.declareString(DocumentSimulation::setType, TYPE);
  }

}
