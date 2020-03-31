
package org.elasticsearch.x_pack.machine_learning.open_job;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_options.time_unit.*;

public class OpenJobRequest  {
  
  private Time _timeout;
  public Time getTimeout() { return this._timeout; }
  public OpenJobRequest setTimeout(Time val) { this._timeout = val; return this; }

}
