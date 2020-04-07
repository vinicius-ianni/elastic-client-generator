
package org.elasticsearch.search.suggesters.completion_suggester;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.common_options.fuzziness.*;
import org.elasticsearch.internal.*;

public class SuggestFuzziness  implements XContentable<SuggestFuzziness> {
  
  static final ParseField FUZZINESS = new ParseField("fuzziness");
  private Fuzziness _fuzziness;
  public Fuzziness getFuzziness() { return this._fuzziness; }
  public SuggestFuzziness setFuzziness(Fuzziness val) { this._fuzziness = val; return this; }


  static final ParseField MIN_LENGTH = new ParseField("min_length");
  private Integer _minLength;
  public Integer getMinLength() { return this._minLength; }
  public SuggestFuzziness setMinLength(Integer val) { this._minLength = val; return this; }


  static final ParseField PREFIX_LENGTH = new ParseField("prefix_length");
  private Integer _prefixLength;
  public Integer getPrefixLength() { return this._prefixLength; }
  public SuggestFuzziness setPrefixLength(Integer val) { this._prefixLength = val; return this; }


  static final ParseField TRANSPOSITIONS = new ParseField("transpositions");
  private Boolean _transpositions;
  public Boolean getTranspositions() { return this._transpositions; }
  public SuggestFuzziness setTranspositions(Boolean val) { this._transpositions = val; return this; }


  static final ParseField UNICODE_AWARE = new ParseField("unicode_aware");
  private Boolean _unicodeAware;
  public Boolean getUnicodeAware() { return this._unicodeAware; }
  public SuggestFuzziness setUnicodeAware(Boolean val) { this._unicodeAware = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public SuggestFuzziness fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return SuggestFuzziness.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<SuggestFuzziness, Void> PARSER =
    new ConstructingObjectParser<>(SuggestFuzziness.class.getName(), false, args -> new SuggestFuzziness());

  static {
    PARSER.declareObject(SuggestFuzziness::setFuzziness, (p, t) -> Fuzziness.PARSER.apply(p, null), FUZZINESS);
    PARSER.declareInteger(SuggestFuzziness::setMinLength, MIN_LENGTH);
    PARSER.declareInteger(SuggestFuzziness::setPrefixLength, PREFIX_LENGTH);
    PARSER.declareBoolean(SuggestFuzziness::setTranspositions, TRANSPOSITIONS);
    PARSER.declareBoolean(SuggestFuzziness::setUnicodeAware, UNICODE_AWARE);
  }

}
