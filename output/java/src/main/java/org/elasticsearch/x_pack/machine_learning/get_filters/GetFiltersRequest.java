
package org.elasticsearch.x_pack.machine_learning.get_filters;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class GetFiltersRequest  {
  
  private Integer _from;
  public Integer getFrom() { return this._from; }
  public GetFiltersRequest setFrom(Integer val) { this._from = val; return this; }


  private Integer _size;
  public Integer getSize() { return this._size; }
  public GetFiltersRequest setSize(Integer val) { this._size = val; return this; }

}
