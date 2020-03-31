
package org.elasticsearch.x_pack.machine_learning.delete_calendar_job;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.id.*;

public class DeleteCalendarJobResponse  {
  
  private String _calendarId;
  public String getCalendarId() { return this._calendarId; }
  public DeleteCalendarJobResponse setCalendarId(String val) { this._calendarId = val; return this; }


  private String _description;
  public String getDescription() { return this._description; }
  public DeleteCalendarJobResponse setDescription(String val) { this._description = val; return this; }


  private Id[] _jobIds;
  public Id[] getJobIds() { return this._jobIds; }
  public DeleteCalendarJobResponse setJobIds(Id[] val) { this._jobIds = val; return this; }

}
