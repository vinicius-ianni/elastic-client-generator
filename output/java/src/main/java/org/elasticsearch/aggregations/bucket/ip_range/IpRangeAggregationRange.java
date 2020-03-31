
package org.elasticsearch.aggregations.bucket.ip_range;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class IpRangeAggregationRange  {
  
  private String _from;
  public String getFrom() { return this._from; }
  public IpRangeAggregationRange setFrom(String val) { this._from = val; return this; }


  private String _mask;
  public String getMask() { return this._mask; }
  public IpRangeAggregationRange setMask(String val) { this._mask = val; return this; }


  private String _to;
  public String getTo() { return this._to; }
  public IpRangeAggregationRange setTo(String val) { this._to = val; return this; }

}
