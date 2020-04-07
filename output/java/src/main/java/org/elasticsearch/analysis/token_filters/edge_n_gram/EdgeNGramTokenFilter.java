
package org.elasticsearch.analysis.token_filters.edge_n_gram;

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
import org.elasticsearch.analysis.token_filters.edge_n_gram.*;

public class EdgeNGramTokenFilter  implements XContentable<EdgeNGramTokenFilter> {
  
  static final ParseField MAX_GRAM = new ParseField("max_gram");
  private Integer _maxGram;
  public Integer getMaxGram() { return this._maxGram; }
  public EdgeNGramTokenFilter setMaxGram(Integer val) { this._maxGram = val; return this; }


  static final ParseField MIN_GRAM = new ParseField("min_gram");
  private Integer _minGram;
  public Integer getMinGram() { return this._minGram; }
  public EdgeNGramTokenFilter setMinGram(Integer val) { this._minGram = val; return this; }


  static final ParseField SIDE = new ParseField("side");
  private EdgeNGramSide _side;
  public EdgeNGramSide getSide() { return this._side; }
  public EdgeNGramTokenFilter setSide(EdgeNGramSide val) { this._side = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public EdgeNGramTokenFilter fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return EdgeNGramTokenFilter.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<EdgeNGramTokenFilter, Void> PARSER =
    new ConstructingObjectParser<>(EdgeNGramTokenFilter.class.getName(), false, args -> new EdgeNGramTokenFilter());

  static {
    PARSER.declareInteger(EdgeNGramTokenFilter::setMaxGram, MAX_GRAM);
    PARSER.declareInteger(EdgeNGramTokenFilter::setMinGram, MIN_GRAM);
    PARSER.declareObject(EdgeNGramTokenFilter::setSide, (p, t) -> EdgeNGramSide.PARSER.apply(p, null), SIDE);
  }

}
