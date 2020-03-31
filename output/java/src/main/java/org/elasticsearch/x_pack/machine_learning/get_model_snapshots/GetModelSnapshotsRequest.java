
package org.elasticsearch.x_pack.machine_learning.get_model_snapshots;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.x_pack.machine_learning.job.*;
import org.elasticsearch.common_abstractions.infer.field.*;

public class GetModelSnapshotsRequest  {
  
  private Boolean _desc;
  public Boolean getDesc() { return this._desc; }
  public GetModelSnapshotsRequest setDesc(Boolean val) { this._desc = val; return this; }


  private Date _end;
  public Date getEnd() { return this._end; }
  public GetModelSnapshotsRequest setEnd(Date val) { this._end = val; return this; }


  private Page _page;
  public Page getPage() { return this._page; }
  public GetModelSnapshotsRequest setPage(Page val) { this._page = val; return this; }


  private Field _sort;
  public Field getSort() { return this._sort; }
  public GetModelSnapshotsRequest setSort(Field val) { this._sort = val; return this; }


  private Date _start;
  public Date getStart() { return this._start; }
  public GetModelSnapshotsRequest setStart(Date val) { this._start = val; return this; }

}
