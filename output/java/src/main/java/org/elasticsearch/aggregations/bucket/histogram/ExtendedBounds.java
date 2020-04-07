
package org.elasticsearch.aggregations.bucket.histogram;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class ExtendedBounds<T>  implements XContentable<ExtendedBounds> {
  
  static final ParseField MAX = new ParseField("max");
  private T _max;
  public T getMax() { return this._max; }
  public ExtendedBounds<T> setMax(T val) { this._max = val; return this; }


  static final ParseField MIN = new ParseField("min");
  private T _min;
  public T getMin() { return this._min; }
  public ExtendedBounds<T> setMin(T val) { this._min = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ExtendedBounds fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ExtendedBounds.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ExtendedBounds, Void> PARSER =
    new ConstructingObjectParser<>(ExtendedBounds.class.getName(), false, args -> new ExtendedBounds());

  static {
    PARSER.declareObject(ExtendedBounds::setMax, (p, t) -> T.PARSER.apply(p, null), MAX);
    PARSER.declareObject(ExtendedBounds::setMin, (p, t) -> T.PARSER.apply(p, null), MIN);
  }

}
