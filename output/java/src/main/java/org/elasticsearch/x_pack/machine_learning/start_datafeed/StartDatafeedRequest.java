
package org.elasticsearch.x_pack.machine_learning.start_datafeed;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.common_options.time_unit.*;

public class StartDatafeedRequest  {
  
  private Date _end;
  public Date getEnd() { return this._end; }
  public StartDatafeedRequest setEnd(Date val) { this._end = val; return this; }


  private Date _start;
  public Date getStart() { return this._start; }
  public StartDatafeedRequest setStart(Date val) { this._start = val; return this; }


  private Time _timeout;
  public Time getTimeout() { return this._timeout; }
  public StartDatafeedRequest setTimeout(Time val) { this._timeout = val; return this; }

}
