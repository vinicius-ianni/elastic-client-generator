
package org.elasticsearch.analysis.plugins.kuromoji;

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

public class KuromojiStemmerTokenFilter  implements XContentable<KuromojiStemmerTokenFilter> {
  
  static final ParseField MINIMUM_LENGTH = new ParseField("minimum_length");
  private Integer _minimumLength;
  public Integer getMinimumLength() { return this._minimumLength; }
  public KuromojiStemmerTokenFilter setMinimumLength(Integer val) { this._minimumLength = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public KuromojiStemmerTokenFilter fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return KuromojiStemmerTokenFilter.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<KuromojiStemmerTokenFilter, Void> PARSER =
    new ConstructingObjectParser<>(KuromojiStemmerTokenFilter.class.getName(), false, args -> new KuromojiStemmerTokenFilter());

  static {
    PARSER.declareInteger(KuromojiStemmerTokenFilter::setMinimumLength, MINIMUM_LENGTH);
  }

}
