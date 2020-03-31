
package org.elasticsearch.x_pack.machine_learning.get_buckets;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.x_pack.machine_learning.job.*;
import org.elasticsearch.common_abstractions.infer.field.*;

public class GetBucketsRequest  {
  
  private Double _anomalyScore;
  public Double getAnomalyScore() { return this._anomalyScore; }
  public GetBucketsRequest setAnomalyScore(Double val) { this._anomalyScore = val; return this; }


  private Boolean _desc;
  public Boolean getDesc() { return this._desc; }
  public GetBucketsRequest setDesc(Boolean val) { this._desc = val; return this; }


  private Date _end;
  public Date getEnd() { return this._end; }
  public GetBucketsRequest setEnd(Date val) { this._end = val; return this; }


  private Boolean _excludeInterim;
  public Boolean getExcludeInterim() { return this._excludeInterim; }
  public GetBucketsRequest setExcludeInterim(Boolean val) { this._excludeInterim = val; return this; }


  private Boolean _expand;
  public Boolean getExpand() { return this._expand; }
  public GetBucketsRequest setExpand(Boolean val) { this._expand = val; return this; }


  private Page _page;
  public Page getPage() { return this._page; }
  public GetBucketsRequest setPage(Page val) { this._page = val; return this; }


  private Field _sort;
  public Field getSort() { return this._sort; }
  public GetBucketsRequest setSort(Field val) { this._sort = val; return this; }


  private Date _start;
  public Date getStart() { return this._start; }
  public GetBucketsRequest setStart(Date val) { this._start = val; return this; }

}
