
package org.elasticsearch.cluster.nodes_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class LoadAverageStats  {
  
  private Float _15m;
  public Float get15m() { return this._15m; }
  public LoadAverageStats set15m(Float val) { this._15m = val; return this; }


  private Float _5m;
  public Float get5m() { return this._5m; }
  public LoadAverageStats set5m(Float val) { this._5m = val; return this; }


  private Float _1m;
  public Float get1m() { return this._1m; }
  public LoadAverageStats set1m(Float val) { this._1m = val; return this; }

}
