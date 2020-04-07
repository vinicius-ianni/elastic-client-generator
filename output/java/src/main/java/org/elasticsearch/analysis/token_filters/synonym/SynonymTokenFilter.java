
package org.elasticsearch.analysis.token_filters.synonym;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.analysis.token_filters.synonym.*;

public class SynonymTokenFilter  implements XContentable<SynonymTokenFilter> {
  
  static final ParseField EXPAND = new ParseField("expand");
  private Boolean _expand;
  public Boolean getExpand() { return this._expand; }
  public SynonymTokenFilter setExpand(Boolean val) { this._expand = val; return this; }


  static final ParseField FORMAT = new ParseField("format");
  private SynonymFormat _format;
  public SynonymFormat getFormat() { return this._format; }
  public SynonymTokenFilter setFormat(SynonymFormat val) { this._format = val; return this; }


  static final ParseField LENIENT = new ParseField("lenient");
  private Boolean _lenient;
  public Boolean getLenient() { return this._lenient; }
  public SynonymTokenFilter setLenient(Boolean val) { this._lenient = val; return this; }


  static final ParseField SYNONYMS = new ParseField("synonyms");
  private List<String> _synonyms;
  public List<String> getSynonyms() { return this._synonyms; }
  public SynonymTokenFilter setSynonyms(List<String> val) { this._synonyms = val; return this; }


  static final ParseField SYNONYMS_PATH = new ParseField("synonyms_path");
  private String _synonymsPath;
  public String getSynonymsPath() { return this._synonymsPath; }
  public SynonymTokenFilter setSynonymsPath(String val) { this._synonymsPath = val; return this; }


  static final ParseField TOKENIZER = new ParseField("tokenizer");
  private String _tokenizer;
  public String getTokenizer() { return this._tokenizer; }
  public SynonymTokenFilter setTokenizer(String val) { this._tokenizer = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public SynonymTokenFilter fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return SynonymTokenFilter.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<SynonymTokenFilter, Void> PARSER =
    new ConstructingObjectParser<>(SynonymTokenFilter.class.getName(), false, args -> new SynonymTokenFilter());

  static {
    PARSER.declareBoolean(SynonymTokenFilter::setExpand, EXPAND);
    PARSER.declareObject(SynonymTokenFilter::setFormat, (p, t) -> SynonymFormat.PARSER.apply(p, null), FORMAT);
    PARSER.declareBoolean(SynonymTokenFilter::setLenient, LENIENT);
    PARSER.declareStringArray(SynonymTokenFilter::setSynonyms, SYNONYMS);
    PARSER.declareString(SynonymTokenFilter::setSynonymsPath, SYNONYMS_PATH);
    PARSER.declareString(SynonymTokenFilter::setTokenizer, TOKENIZER);
  }

}
