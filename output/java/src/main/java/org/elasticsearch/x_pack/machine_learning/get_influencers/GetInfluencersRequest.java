
package org.elasticsearch.x_pack.machine_learning.get_influencers;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.x_pack.machine_learning.job.*;
import org.elasticsearch.common_abstractions.infer.field.*;

public class GetInfluencersRequest  {
  
  private Boolean _descending;
  public Boolean getDescending() { return this._descending; }
  public GetInfluencersRequest setDescending(Boolean val) { this._descending = val; return this; }


  private Date _end;
  public Date getEnd() { return this._end; }
  public GetInfluencersRequest setEnd(Date val) { this._end = val; return this; }


  private Boolean _excludeInterim;
  public Boolean getExcludeInterim() { return this._excludeInterim; }
  public GetInfluencersRequest setExcludeInterim(Boolean val) { this._excludeInterim = val; return this; }


  private Double _influencerScore;
  public Double getInfluencerScore() { return this._influencerScore; }
  public GetInfluencersRequest setInfluencerScore(Double val) { this._influencerScore = val; return this; }


  private Page _page;
  public Page getPage() { return this._page; }
  public GetInfluencersRequest setPage(Page val) { this._page = val; return this; }


  private Field _sort;
  public Field getSort() { return this._sort; }
  public GetInfluencersRequest setSort(Field val) { this._sort = val; return this; }


  private Date _start;
  public Date getStart() { return this._start; }
  public GetInfluencersRequest setStart(Date val) { this._start = val; return this; }

}
