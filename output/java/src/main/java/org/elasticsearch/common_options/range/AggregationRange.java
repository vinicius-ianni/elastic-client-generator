
package org.elasticsearch.common_options.range;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class AggregationRange  {
  
  private Double _from;
  public Double getFrom() { return this._from; }
  public AggregationRange setFrom(Double val) { this._from = val; return this; }


  private String _key;
  public String getKey() { return this._key; }
  public AggregationRange setKey(String val) { this._key = val; return this; }


  private Double _to;
  public Double getTo() { return this._to; }
  public AggregationRange setTo(Double val) { this._to = val; return this; }

}
