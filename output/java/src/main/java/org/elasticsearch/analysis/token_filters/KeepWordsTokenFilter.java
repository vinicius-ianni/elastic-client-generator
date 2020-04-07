
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




public class KeepWordsTokenFilter  implements XContentable<KeepWordsTokenFilter> {
  
  static final ParseField KEEP_WORDS = new ParseField("keep_words");
  private List<String> _keepWords;
  public List<String> getKeepWords() { return this._keepWords; }
  public KeepWordsTokenFilter setKeepWords(List<String> val) { this._keepWords = val; return this; }


  static final ParseField KEEP_WORDS_CASE = new ParseField("keep_words_case");
  private Boolean _keepWordsCase;
  public Boolean getKeepWordsCase() { return this._keepWordsCase; }
  public KeepWordsTokenFilter setKeepWordsCase(Boolean val) { this._keepWordsCase = val; return this; }


  static final ParseField KEEP_WORDS_PATH = new ParseField("keep_words_path");
  private String _keepWordsPath;
  public String getKeepWordsPath() { return this._keepWordsPath; }
  public KeepWordsTokenFilter setKeepWordsPath(String val) { this._keepWordsPath = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public KeepWordsTokenFilter fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return KeepWordsTokenFilter.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<KeepWordsTokenFilter, Void> PARSER =
    new ConstructingObjectParser<>(KeepWordsTokenFilter.class.getName(), false, args -> new KeepWordsTokenFilter());

  static {
    PARSER.declareStringArray(KeepWordsTokenFilter::setKeepWords, KEEP_WORDS);
    PARSER.declareBoolean(KeepWordsTokenFilter::setKeepWordsCase, KEEP_WORDS_CASE);
    PARSER.declareString(KeepWordsTokenFilter::setKeepWordsPath, KEEP_WORDS_PATH);
  }

}
