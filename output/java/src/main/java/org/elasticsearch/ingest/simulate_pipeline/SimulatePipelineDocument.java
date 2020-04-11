
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
import org.elasticsearch.common_abstractions.infer.id.*;
import org.elasticsearch.common_abstractions.infer.index_name.*;

public class SimulatePipelineDocument  implements XContentable<SimulatePipelineDocument> {
  
  static final ParseField ID = new ParseField("_id");
  private Id _id;
  public Id getId() { return this._id; }
  public SimulatePipelineDocument setId(Id val) { this._id = val; return this; }


  static final ParseField INDEX = new ParseField("_index");
  private IndexName _index;
  public IndexName getIndex() { return this._index; }
  public SimulatePipelineDocument setIndex(IndexName val) { this._index = val; return this; }


  static final ParseField SOURCE = new ParseField("_source");
  private Object _source;
  public Object getSource() { return this._source; }
  public SimulatePipelineDocument setSource(Object val) { this._source = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public SimulatePipelineDocument fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return SimulatePipelineDocument.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<SimulatePipelineDocument, Void> PARSER =
    new ConstructingObjectParser<>(SimulatePipelineDocument.class.getName(), false, args -> new SimulatePipelineDocument());

  static {
    PARSER.declareObject(SimulatePipelineDocument::setId, (p, t) -> Id.createFrom(p), ID);
    PARSER.declareObject(SimulatePipelineDocument::setIndex, (p, t) -> IndexName.createFrom(p), INDEX);
    PARSER.declareObject(SimulatePipelineDocument::setSource, (p, t) -> p.objectText(), SOURCE);
  }

}
