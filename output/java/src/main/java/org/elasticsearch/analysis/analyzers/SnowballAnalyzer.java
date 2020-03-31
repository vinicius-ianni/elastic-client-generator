
package org.elasticsearch.analysis.analyzers;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.analysis.languages.*;
import org.elasticsearch.analysis.*;

public class SnowballAnalyzer  {
  
  private SnowballLanguage _language;
  public SnowballLanguage getLanguage() { return this._language; }
  public SnowballAnalyzer setLanguage(SnowballLanguage val) { this._language = val; return this; }


  private StopWords _stopwords;
  public StopWords getStopwords() { return this._stopwords; }
  public SnowballAnalyzer setStopwords(StopWords val) { this._stopwords = val; return this; }

}
