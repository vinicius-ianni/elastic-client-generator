
package org.elasticsearch.x_pack.machine_learning.delete_forecast;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_options.time_unit.*;

public class DeleteForecastRequest  {
  
  private Boolean _allowNoForecasts;
  public Boolean getAllowNoForecasts() { return this._allowNoForecasts; }
  public DeleteForecastRequest setAllowNoForecasts(Boolean val) { this._allowNoForecasts = val; return this; }


  private Time _timeout;
  public Time getTimeout() { return this._timeout; }
  public DeleteForecastRequest setTimeout(Time val) { this._timeout = val; return this; }

}
