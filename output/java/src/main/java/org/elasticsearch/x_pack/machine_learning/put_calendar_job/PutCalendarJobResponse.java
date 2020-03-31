
package org.elasticsearch.x_pack.machine_learning.put_calendar_job;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class PutCalendarJobResponse  {
  
  private String _calendarId;
  public String getCalendarId() { return this._calendarId; }
  public PutCalendarJobResponse setCalendarId(String val) { this._calendarId = val; return this; }


  private String _description;
  public String getDescription() { return this._description; }
  public PutCalendarJobResponse setDescription(String val) { this._description = val; return this; }


  private String[] _jobIds;
  public String[] getJobIds() { return this._jobIds; }
  public PutCalendarJobResponse setJobIds(String[] val) { this._jobIds = val; return this; }

}
