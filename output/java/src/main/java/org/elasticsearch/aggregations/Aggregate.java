
package org.elasticsearch.aggregations;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class Aggregate  implements XContentable<Aggregate> {
  
  static final ParseField META = new ParseField("meta");
  private NamedContainer<String, Object> _meta;
  public NamedContainer<String, Object> getMeta() { return this._meta; }
  public Aggregate setMeta(NamedContainer<String, Object> val) { this._meta = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public Aggregate fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return Aggregate.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<Aggregate, Void> PARSER =
    new ConstructingObjectParser<>(Aggregate.class.getName(), false, args -> new Aggregate());

  static {
    PARSER.declareObject(Aggregate::setMeta, (p, t) ->  new NamedContainer<>(n -> () -> n,XContentParser::binaryValue), META);;
  }

}
