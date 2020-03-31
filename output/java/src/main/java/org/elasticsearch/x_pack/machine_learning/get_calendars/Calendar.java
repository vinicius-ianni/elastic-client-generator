
package org.elasticsearch.x_pack.machine_learning.get_calendars;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class Calendar  {
  
  private String _calendarId;
  public String getCalendarId() { return this._calendarId; }
  public Calendar setCalendarId(String val) { this._calendarId = val; return this; }


  private String[] _jobIds;
  public String[] getJobIds() { return this._jobIds; }
  public Calendar setJobIds(String[] val) { this._jobIds = val; return this; }


  private String _description;
  public String getDescription() { return this._description; }
  public Calendar setDescription(String val) { this._description = val; return this; }

}
