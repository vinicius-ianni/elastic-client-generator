
package org.elasticsearch.internal;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class PlainRequestBase<TParameters>  {
  
  private Boolean _errorTrace;
  public Boolean getErrorTrace() { return this._errorTrace; }
  public PlainRequestBase<TParameters> setErrorTrace(Boolean val) { this._errorTrace = val; return this; }


  private String[] _filterPath;
  public String[] getFilterPath() { return this._filterPath; }
  public PlainRequestBase<TParameters> setFilterPath(String[] val) { this._filterPath = val; return this; }


  private Boolean _human;
  public Boolean getHuman() { return this._human; }
  public PlainRequestBase<TParameters> setHuman(Boolean val) { this._human = val; return this; }


  private Boolean _pretty;
  public Boolean getPretty() { return this._pretty; }
  public PlainRequestBase<TParameters> setPretty(Boolean val) { this._pretty = val; return this; }


  private String _sourceQueryString;
  public String getSourceQueryString() { return this._sourceQueryString; }
  public PlainRequestBase<TParameters> setSourceQueryString(String val) { this._sourceQueryString = val; return this; }

}
