
package org.elasticsearch.aggregations.metric.scripted_metric;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_options.scripting.*;

public class ScriptedMetricAggregation  {
  
  private Script _combineScript;
  public Script getCombineScript() { return this._combineScript; }
  public ScriptedMetricAggregation setCombineScript(Script val) { this._combineScript = val; return this; }


  private Script _initScript;
  public Script getInitScript() { return this._initScript; }
  public ScriptedMetricAggregation setInitScript(Script val) { this._initScript = val; return this; }


  private Script _mapScript;
  public Script getMapScript() { return this._mapScript; }
  public ScriptedMetricAggregation setMapScript(Script val) { this._mapScript = val; return this; }


  private Map<String, Object> _params;
  public Map<String, Object> getParams() { return this._params; }
  public ScriptedMetricAggregation setParams(Map<String, Object> val) { this._params = val; return this; }


  private Script _reduceScript;
  public Script getReduceScript() { return this._reduceScript; }
  public ScriptedMetricAggregation setReduceScript(Script val) { this._reduceScript = val; return this; }

}
