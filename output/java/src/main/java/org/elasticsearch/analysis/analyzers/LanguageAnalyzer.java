
package org.elasticsearch.analysis.analyzers;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.analysis.languages.*;
import org.elasticsearch.analysis.*;

public class LanguageAnalyzer  {
  
  private Language _language;
  public Language getLanguage() { return this._language; }
  public LanguageAnalyzer setLanguage(Language val) { this._language = val; return this; }


  private String[] _stemExclusion;
  public String[] getStemExclusion() { return this._stemExclusion; }
  public LanguageAnalyzer setStemExclusion(String[] val) { this._stemExclusion = val; return this; }


  private StopWords _stopwords;
  public StopWords getStopwords() { return this._stopwords; }
  public LanguageAnalyzer setStopwords(StopWords val) { this._stopwords = val; return this; }


  private String _stopwordsPath;
  public String getStopwordsPath() { return this._stopwordsPath; }
  public LanguageAnalyzer setStopwordsPath(String val) { this._stopwordsPath = val; return this; }


  private String _type;
  public String getType() { return this._type; }
  public LanguageAnalyzer setType(String val) { this._type = val; return this; }

}
