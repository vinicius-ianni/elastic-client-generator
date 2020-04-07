
package org.elasticsearch.analysis.token_filters;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.internal.*;

public class LengthTokenFilter  implements XContentable<LengthTokenFilter> {
  
  static final ParseField MAX = new ParseField("max");
  private Integer _max;
  public Integer getMax() { return this._max; }
  public LengthTokenFilter setMax(Integer val) { this._max = val; return this; }


  static final ParseField MIN = new ParseField("min");
  private Integer _min;
  public Integer getMin() { return this._min; }
  public LengthTokenFilter setMin(Integer val) { this._min = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public LengthTokenFilter fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return LengthTokenFilter.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<LengthTokenFilter, Void> PARSER =
    new ConstructingObjectParser<>(LengthTokenFilter.class.getName(), false, args -> new LengthTokenFilter());

  static {
    PARSER.declareInteger(LengthTokenFilter::setMax, MAX);
    PARSER.declareInteger(LengthTokenFilter::setMin, MIN);
  }

}
