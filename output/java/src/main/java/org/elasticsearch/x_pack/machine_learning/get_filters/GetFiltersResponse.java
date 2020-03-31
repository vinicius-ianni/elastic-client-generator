
package org.elasticsearch.x_pack.machine_learning.get_filters;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.x_pack.machine_learning.get_filters.*;

public class GetFiltersResponse  {
  
  private Long _count;
  public Long getCount() { return this._count; }
  public GetFiltersResponse setCount(Long val) { this._count = val; return this; }


  private Filter[] _filters;
  public Filter[] getFilters() { return this._filters; }
  public GetFiltersResponse setFilters(Filter[] val) { this._filters = val; return this; }

}
