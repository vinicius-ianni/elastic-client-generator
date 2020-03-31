
package org.elasticsearch.x_pack.machine_learning.machine_learning_info;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.machine_learning.machine_learning_info.*;

public class Defaults  {
  
  private AnomalyDetectors _anomalyDetectors;
  public AnomalyDetectors getAnomalyDetectors() { return this._anomalyDetectors; }
  public Defaults setAnomalyDetectors(AnomalyDetectors val) { this._anomalyDetectors = val; return this; }


  private Datafeeds _datafeeds;
  public Datafeeds getDatafeeds() { return this._datafeeds; }
  public Defaults setDatafeeds(Datafeeds val) { this._datafeeds = val; return this; }

}
