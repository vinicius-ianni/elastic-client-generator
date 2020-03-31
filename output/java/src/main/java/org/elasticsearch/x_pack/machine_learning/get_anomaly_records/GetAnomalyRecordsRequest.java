
package org.elasticsearch.x_pack.machine_learning.get_anomaly_records;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.x_pack.machine_learning.job.*;
import org.elasticsearch.common_abstractions.infer.field.*;

public class GetAnomalyRecordsRequest  {
  
  private Boolean _desc;
  public Boolean getDesc() { return this._desc; }
  public GetAnomalyRecordsRequest setDesc(Boolean val) { this._desc = val; return this; }


  private Date _end;
  public Date getEnd() { return this._end; }
  public GetAnomalyRecordsRequest setEnd(Date val) { this._end = val; return this; }


  private Boolean _excludeInterim;
  public Boolean getExcludeInterim() { return this._excludeInterim; }
  public GetAnomalyRecordsRequest setExcludeInterim(Boolean val) { this._excludeInterim = val; return this; }


  private Page _page;
  public Page getPage() { return this._page; }
  public GetAnomalyRecordsRequest setPage(Page val) { this._page = val; return this; }


  private Double _recordScore;
  public Double getRecordScore() { return this._recordScore; }
  public GetAnomalyRecordsRequest setRecordScore(Double val) { this._recordScore = val; return this; }


  private Field _sort;
  public Field getSort() { return this._sort; }
  public GetAnomalyRecordsRequest setSort(Field val) { this._sort = val; return this; }


  private Date _start;
  public Date getStart() { return this._start; }
  public GetAnomalyRecordsRequest setStart(Date val) { this._start = val; return this; }

}
