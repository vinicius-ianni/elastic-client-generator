
package org.elasticsearch.modules.indices.circuit_breaker;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class CircuitBreakerSettings  {
  
  private String _fielddataLimit;
  public String getFielddataLimit() { return this._fielddataLimit; }
  public CircuitBreakerSettings setFielddataLimit(String val) { this._fielddataLimit = val; return this; }


  private Float _fielddataOverhead;
  public Float getFielddataOverhead() { return this._fielddataOverhead; }
  public CircuitBreakerSettings setFielddataOverhead(Float val) { this._fielddataOverhead = val; return this; }


  private String _requestLimit;
  public String getRequestLimit() { return this._requestLimit; }
  public CircuitBreakerSettings setRequestLimit(String val) { this._requestLimit = val; return this; }


  private Float _requestOverhead;
  public Float getRequestOverhead() { return this._requestOverhead; }
  public CircuitBreakerSettings setRequestOverhead(Float val) { this._requestOverhead = val; return this; }


  private String _totalLimit;
  public String getTotalLimit() { return this._totalLimit; }
  public CircuitBreakerSettings setTotalLimit(String val) { this._totalLimit = val; return this; }

}
