
package org.elasticsearch.x_pack.info.x_pack_usage;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class QueryUsage  {
  
  private Integer _total;
  public Integer getTotal() { return this._total; }
  public QueryUsage setTotal(Integer val) { this._total = val; return this; }


  private Integer _paging;
  public Integer getPaging() { return this._paging; }
  public QueryUsage setPaging(Integer val) { this._paging = val; return this; }


  private Integer _failed;
  public Integer getFailed() { return this._failed; }
  public QueryUsage setFailed(Integer val) { this._failed = val; return this; }


  private Integer _count;
  public Integer getCount() { return this._count; }
  public QueryUsage setCount(Integer val) { this._count = val; return this; }

}
