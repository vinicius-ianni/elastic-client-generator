
package org.elasticsearch.x_pack.machine_learning.forecast_job;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_options.time_unit.*;

public class ForecastJobRequest  {
  
  private Time _duration;
  public Time getDuration() { return this._duration; }
  public ForecastJobRequest setDuration(Time val) { this._duration = val; return this; }


  private Time _expiresIn;
  public Time getExpiresIn() { return this._expiresIn; }
  public ForecastJobRequest setExpiresIn(Time val) { this._expiresIn = val; return this; }

}
