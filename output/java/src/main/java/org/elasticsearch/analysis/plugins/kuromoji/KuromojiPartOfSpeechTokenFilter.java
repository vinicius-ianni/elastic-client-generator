
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




public class KuromojiPartOfSpeechTokenFilter  implements XContentable<KuromojiPartOfSpeechTokenFilter> {
  
  static final ParseField STOPTAGS = new ParseField("stoptags");
  private List<String> _stoptags;
  public List<String> getStoptags() { return this._stoptags; }
  public KuromojiPartOfSpeechTokenFilter setStoptags(List<String> val) { this._stoptags = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public KuromojiPartOfSpeechTokenFilter fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return KuromojiPartOfSpeechTokenFilter.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<KuromojiPartOfSpeechTokenFilter, Void> PARSER =
    new ConstructingObjectParser<>(KuromojiPartOfSpeechTokenFilter.class.getName(), false, args -> new KuromojiPartOfSpeechTokenFilter());

  static {
    PARSER.declareStringArray(KuromojiPartOfSpeechTokenFilter::setStoptags, STOPTAGS);
  }

}
