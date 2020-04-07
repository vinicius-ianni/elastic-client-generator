
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




public class CommonGramsTokenFilter  implements XContentable<CommonGramsTokenFilter> {
  
  static final ParseField COMMON_WORDS = new ParseField("common_words");
  private List<String> _commonWords;
  public List<String> getCommonWords() { return this._commonWords; }
  public CommonGramsTokenFilter setCommonWords(List<String> val) { this._commonWords = val; return this; }


  static final ParseField COMMON_WORDS_PATH = new ParseField("common_words_path");
  private String _commonWordsPath;
  public String getCommonWordsPath() { return this._commonWordsPath; }
  public CommonGramsTokenFilter setCommonWordsPath(String val) { this._commonWordsPath = val; return this; }


  static final ParseField IGNORE_CASE = new ParseField("ignore_case");
  private Boolean _ignoreCase;
  public Boolean getIgnoreCase() { return this._ignoreCase; }
  public CommonGramsTokenFilter setIgnoreCase(Boolean val) { this._ignoreCase = val; return this; }


  static final ParseField QUERY_MODE = new ParseField("query_mode");
  private Boolean _queryMode;
  public Boolean getQueryMode() { return this._queryMode; }
  public CommonGramsTokenFilter setQueryMode(Boolean val) { this._queryMode = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public CommonGramsTokenFilter fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return CommonGramsTokenFilter.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<CommonGramsTokenFilter, Void> PARSER =
    new ConstructingObjectParser<>(CommonGramsTokenFilter.class.getName(), false, args -> new CommonGramsTokenFilter());

  static {
    PARSER.declareStringArray(CommonGramsTokenFilter::setCommonWords, COMMON_WORDS);
    PARSER.declareString(CommonGramsTokenFilter::setCommonWordsPath, COMMON_WORDS_PATH);
    PARSER.declareBoolean(CommonGramsTokenFilter::setIgnoreCase, IGNORE_CASE);
    PARSER.declareBoolean(CommonGramsTokenFilter::setQueryMode, QUERY_MODE);
  }

}
