
package org.elasticsearch.x_pack.machine_learning.get_datafeeds;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.x_pack.machine_learning.datafeed.*;

public class GetDatafeedsResponse  {
  
  private Long _count;
  public Long getCount() { return this._count; }
  public GetDatafeedsResponse setCount(Long val) { this._count = val; return this; }


  private DatafeedConfig[] _datafeeds;
  public DatafeedConfig[] getDatafeeds() { return this._datafeeds; }
  public GetDatafeedsResponse setDatafeeds(DatafeedConfig[] val) { this._datafeeds = val; return this; }

}
