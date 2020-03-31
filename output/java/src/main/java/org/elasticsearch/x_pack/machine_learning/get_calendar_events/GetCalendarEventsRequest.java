
package org.elasticsearch.x_pack.machine_learning.get_calendar_events;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class GetCalendarEventsRequest  {
  
  private Date _end;
  public Date getEnd() { return this._end; }
  public GetCalendarEventsRequest setEnd(Date val) { this._end = val; return this; }


  private String _jobId;
  public String getJobId() { return this._jobId; }
  public GetCalendarEventsRequest setJobId(String val) { this._jobId = val; return this; }


  private String _start;
  public String getStart() { return this._start; }
  public GetCalendarEventsRequest setStart(String val) { this._start = val; return this; }


  private Integer _from;
  public Integer getFrom() { return this._from; }
  public GetCalendarEventsRequest setFrom(Integer val) { this._from = val; return this; }


  private Integer _size;
  public Integer getSize() { return this._size; }
  public GetCalendarEventsRequest setSize(Integer val) { this._size = val; return this; }

}
