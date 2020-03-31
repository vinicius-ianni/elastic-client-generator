
package org.elasticsearch.analysis.analyzers;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.analysis.*;

public class PatternAnalyzer  {
  
  private String _flags;
  public String getFlags() { return this._flags; }
  public PatternAnalyzer setFlags(String val) { this._flags = val; return this; }


  private Boolean _lowercase;
  public Boolean getLowercase() { return this._lowercase; }
  public PatternAnalyzer setLowercase(Boolean val) { this._lowercase = val; return this; }


  private String _pattern;
  public String getPattern() { return this._pattern; }
  public PatternAnalyzer setPattern(String val) { this._pattern = val; return this; }


  private StopWords _stopwords;
  public StopWords getStopwords() { return this._stopwords; }
  public PatternAnalyzer setStopwords(StopWords val) { this._stopwords = val; return this; }

}
