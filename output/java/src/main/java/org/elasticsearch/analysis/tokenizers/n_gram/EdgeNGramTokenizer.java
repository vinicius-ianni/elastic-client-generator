
package org.elasticsearch.analysis.tokenizers.n_gram;

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
import org.elasticsearch.analysis.tokenizers.n_gram.*;

public class EdgeNGramTokenizer  implements XContentable<EdgeNGramTokenizer> {
  
  static final ParseField MAX_GRAM = new ParseField("max_gram");
  private Integer _maxGram;
  public Integer getMaxGram() { return this._maxGram; }
  public EdgeNGramTokenizer setMaxGram(Integer val) { this._maxGram = val; return this; }


  static final ParseField MIN_GRAM = new ParseField("min_gram");
  private Integer _minGram;
  public Integer getMinGram() { return this._minGram; }
  public EdgeNGramTokenizer setMinGram(Integer val) { this._minGram = val; return this; }


  static final ParseField TOKEN_CHARS = new ParseField("token_chars");
  private List<TokenChar> _tokenChars;
  public List<TokenChar> getTokenChars() { return this._tokenChars; }
  public EdgeNGramTokenizer setTokenChars(List<TokenChar> val) { this._tokenChars = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public EdgeNGramTokenizer fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return EdgeNGramTokenizer.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<EdgeNGramTokenizer, Void> PARSER =
    new ConstructingObjectParser<>(EdgeNGramTokenizer.class.getName(), false, args -> new EdgeNGramTokenizer());

  static {
    PARSER.declareInteger(EdgeNGramTokenizer::setMaxGram, MAX_GRAM);
    PARSER.declareInteger(EdgeNGramTokenizer::setMinGram, MIN_GRAM);
    PARSER.declareObjectArray(EdgeNGramTokenizer::setTokenChars, (p, t) -> TokenChar.PARSER.apply(p), TOKEN_CHARS);
  }

}
