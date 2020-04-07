
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

public class NGramTokenFilter  implements XContentable<NGramTokenFilter> {
  
  static final ParseField MAX_GRAM = new ParseField("max_gram");
  private Integer _maxGram;
  public Integer getMaxGram() { return this._maxGram; }
  public NGramTokenFilter setMaxGram(Integer val) { this._maxGram = val; return this; }


  static final ParseField MIN_GRAM = new ParseField("min_gram");
  private Integer _minGram;
  public Integer getMinGram() { return this._minGram; }
  public NGramTokenFilter setMinGram(Integer val) { this._minGram = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public NGramTokenFilter fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return NGramTokenFilter.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<NGramTokenFilter, Void> PARSER =
    new ConstructingObjectParser<>(NGramTokenFilter.class.getName(), false, args -> new NGramTokenFilter());

  static {
    PARSER.declareInteger(NGramTokenFilter::setMaxGram, MAX_GRAM);
    PARSER.declareInteger(NGramTokenFilter::setMinGram, MIN_GRAM);
  }

}
