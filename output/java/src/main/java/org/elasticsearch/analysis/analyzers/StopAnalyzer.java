
package org.elasticsearch.analysis.analyzers;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.analysis.*;

public class StopAnalyzer  {
  
  private StopWords _stopwords;
  public StopWords getStopwords() { return this._stopwords; }
  public StopAnalyzer setStopwords(StopWords val) { this._stopwords = val; return this; }


  private String _stopwordsPath;
  public String getStopwordsPath() { return this._stopwordsPath; }
  public StopAnalyzer setStopwordsPath(String val) { this._stopwordsPath = val; return this; }

}
