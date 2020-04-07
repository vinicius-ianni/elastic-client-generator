
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




public class KuromojiReadingFormTokenFilter  implements XContentable<KuromojiReadingFormTokenFilter> {
  
  static final ParseField USE_ROMAJI = new ParseField("use_romaji");
  private Boolean _useRomaji;
  public Boolean getUseRomaji() { return this._useRomaji; }
  public KuromojiReadingFormTokenFilter setUseRomaji(Boolean val) { this._useRomaji = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public KuromojiReadingFormTokenFilter fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return KuromojiReadingFormTokenFilter.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<KuromojiReadingFormTokenFilter, Void> PARSER =
    new ConstructingObjectParser<>(KuromojiReadingFormTokenFilter.class.getName(), false, args -> new KuromojiReadingFormTokenFilter());

  static {
    PARSER.declareBoolean(KuromojiReadingFormTokenFilter::setUseRomaji, USE_ROMAJI);
  }

}
