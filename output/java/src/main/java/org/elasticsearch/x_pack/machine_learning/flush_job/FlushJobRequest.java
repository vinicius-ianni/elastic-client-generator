
package org.elasticsearch.x_pack.machine_learning.flush_job;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class FlushJobRequest  {
  
  private String _skipTime;
  public String getSkipTime() { return this._skipTime; }
  public FlushJobRequest setSkipTime(String val) { this._skipTime = val; return this; }


  private Date _advanceTime;
  public Date getAdvanceTime() { return this._advanceTime; }
  public FlushJobRequest setAdvanceTime(Date val) { this._advanceTime = val; return this; }


  private Boolean _calcInterim;
  public Boolean getCalcInterim() { return this._calcInterim; }
  public FlushJobRequest setCalcInterim(Boolean val) { this._calcInterim = val; return this; }


  private Date _end;
  public Date getEnd() { return this._end; }
  public FlushJobRequest setEnd(Date val) { this._end = val; return this; }


  private Date _start;
  public Date getStart() { return this._start; }
  public FlushJobRequest setStart(Date val) { this._start = val; return this; }

}
