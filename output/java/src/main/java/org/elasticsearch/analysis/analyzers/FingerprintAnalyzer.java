
package org.elasticsearch.analysis.analyzers;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.analysis.*;

public class FingerprintAnalyzer  {
  
  private Integer _maxOutputSize;
  public Integer getMaxOutputSize() { return this._maxOutputSize; }
  public FingerprintAnalyzer setMaxOutputSize(Integer val) { this._maxOutputSize = val; return this; }


  private Boolean _preserveOriginal;
  public Boolean getPreserveOriginal() { return this._preserveOriginal; }
  public FingerprintAnalyzer setPreserveOriginal(Boolean val) { this._preserveOriginal = val; return this; }


  private String _separator;
  public String getSeparator() { return this._separator; }
  public FingerprintAnalyzer setSeparator(String val) { this._separator = val; return this; }


  private StopWords _stopwords;
  public StopWords getStopwords() { return this._stopwords; }
  public FingerprintAnalyzer setStopwords(StopWords val) { this._stopwords = val; return this; }


  private String _stopwordsPath;
  public String getStopwordsPath() { return this._stopwordsPath; }
  public FingerprintAnalyzer setStopwordsPath(String val) { this._stopwordsPath = val; return this; }

}
