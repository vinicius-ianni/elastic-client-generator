
package org.elasticsearch.analysis.token_filters.synonym;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.analysis.token_filters.synonym.*;

public class SynonymGraphTokenFilter  {
  
  private Boolean _expand;
  public Boolean getExpand() { return this._expand; }
  public SynonymGraphTokenFilter setExpand(Boolean val) { this._expand = val; return this; }


  private SynonymFormat _format;
  public SynonymFormat getFormat() { return this._format; }
  public SynonymGraphTokenFilter setFormat(SynonymFormat val) { this._format = val; return this; }


  private Boolean _lenient;
  public Boolean getLenient() { return this._lenient; }
  public SynonymGraphTokenFilter setLenient(Boolean val) { this._lenient = val; return this; }


  private String[] _synonyms;
  public String[] getSynonyms() { return this._synonyms; }
  public SynonymGraphTokenFilter setSynonyms(String[] val) { this._synonyms = val; return this; }


  private String _synonymsPath;
  public String getSynonymsPath() { return this._synonymsPath; }
  public SynonymGraphTokenFilter setSynonymsPath(String val) { this._synonymsPath = val; return this; }


  private String _tokenizer;
  public String getTokenizer() { return this._tokenizer; }
  public SynonymGraphTokenFilter setTokenizer(String val) { this._tokenizer = val; return this; }

}
