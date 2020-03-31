
package org.elasticsearch.x_pack.machine_learning.forecast_job;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class ForecastJobResponse  {
  
  private String _forecastId;
  public String getForecastId() { return this._forecastId; }
  public ForecastJobResponse setForecastId(String val) { this._forecastId = val; return this; }

}
