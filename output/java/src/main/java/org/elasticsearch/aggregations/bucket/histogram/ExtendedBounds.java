
package org.elasticsearch.aggregations.bucket.histogram;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class ExtendedBounds<T>  {
  
  private T _max;
  public T getMax() { return this._max; }
  public ExtendedBounds<T> setMax(T val) { this._max = val; return this; }


  private T _min;
  public T getMin() { return this._min; }
  public ExtendedBounds<T> setMin(T val) { this._min = val; return this; }

}
