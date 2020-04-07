
package org.elasticsearch.query_dsl.abstractions.field_lookup;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.common_abstractions.infer.id.*;
import org.elasticsearch.common_abstractions.infer.index_name.*;
import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.common_abstractions.infer.join_field_routing.*;

public class FieldLookup  implements XContentable<FieldLookup> {
  
  static final ParseField ID = new ParseField("id");
  private Id _id;
  public Id getId() { return this._id; }
  public FieldLookup setId(Id val) { this._id = val; return this; }


  static final ParseField INDEX = new ParseField("index");
  private IndexName _index;
  public IndexName getIndex() { return this._index; }
  public FieldLookup setIndex(IndexName val) { this._index = val; return this; }


  static final ParseField PATH = new ParseField("path");
  private Field _path;
  public Field getPath() { return this._path; }
  public FieldLookup setPath(Field val) { this._path = val; return this; }


  static final ParseField ROUTING = new ParseField("routing");
  private Routing _routing;
  public Routing getRouting() { return this._routing; }
  public FieldLookup setRouting(Routing val) { this._routing = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public FieldLookup fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return FieldLookup.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<FieldLookup, Void> PARSER =
    new ConstructingObjectParser<>(FieldLookup.class.getName(), false, args -> new FieldLookup());

  static {
    PARSER.declareId(FieldLookup::setId, (p, t) -> Id.createFrom(p), ID);
    PARSER.declareIndexName(FieldLookup::setIndex, (p, t) -> IndexName.createFrom(p), INDEX);
    PARSER.declareField(FieldLookup::setPath, (p, t) -> Field.createFrom(p), PATH);
    PARSER.declareRouting(FieldLookup::setRouting, (p, t) -> Routing.createFrom(p), ROUTING);
  }

}
