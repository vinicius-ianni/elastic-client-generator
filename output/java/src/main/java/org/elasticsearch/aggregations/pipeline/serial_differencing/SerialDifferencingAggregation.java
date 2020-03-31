
package org.elasticsearch.aggregations.pipeline.serial_differencing;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class SerialDifferencingAggregation  {
  
  private Integer _lag;
  public Integer getLag() { return this._lag; }
  public SerialDifferencingAggregation setLag(Integer val) { this._lag = val; return this; }

}
