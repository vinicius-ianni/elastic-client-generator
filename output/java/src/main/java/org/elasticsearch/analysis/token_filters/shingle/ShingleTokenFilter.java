
package org.elasticsearch.analysis.token_filters.shingle;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class ShingleTokenFilter  {
  
  private String _fillerToken;
  public String getFillerToken() { return this._fillerToken; }
  public ShingleTokenFilter setFillerToken(String val) { this._fillerToken = val; return this; }


  private Integer _maxShingleSize;
  public Integer getMaxShingleSize() { return this._maxShingleSize; }
  public ShingleTokenFilter setMaxShingleSize(Integer val) { this._maxShingleSize = val; return this; }


  private Integer _minShingleSize;
  public Integer getMinShingleSize() { return this._minShingleSize; }
  public ShingleTokenFilter setMinShingleSize(Integer val) { this._minShingleSize = val; return this; }


  private Boolean _outputUnigrams;
  public Boolean getOutputUnigrams() { return this._outputUnigrams; }
  public ShingleTokenFilter setOutputUnigrams(Boolean val) { this._outputUnigrams = val; return this; }


  private Boolean _outputUnigramsIfNoShingles;
  public Boolean getOutputUnigramsIfNoShingles() { return this._outputUnigramsIfNoShingles; }
  public ShingleTokenFilter setOutputUnigramsIfNoShingles(Boolean val) { this._outputUnigramsIfNoShingles = val; return this; }


  private String _tokenSeparator;
  public String getTokenSeparator() { return this._tokenSeparator; }
  public ShingleTokenFilter setTokenSeparator(String val) { this._tokenSeparator = val; return this; }

}
