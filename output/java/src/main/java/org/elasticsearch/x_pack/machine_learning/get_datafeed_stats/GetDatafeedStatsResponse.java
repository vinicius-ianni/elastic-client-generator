
package org.elasticsearch.x_pack.machine_learning.get_datafeed_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.x_pack.machine_learning.datafeed.*;

public class GetDatafeedStatsResponse  {
  
  private Long _count;
  public Long getCount() { return this._count; }
  public GetDatafeedStatsResponse setCount(Long val) { this._count = val; return this; }


  private DatafeedStats[] _datafeeds;
  public DatafeedStats[] getDatafeeds() { return this._datafeeds; }
  public GetDatafeedStatsResponse setDatafeeds(DatafeedStats[] val) { this._datafeeds = val; return this; }

}
