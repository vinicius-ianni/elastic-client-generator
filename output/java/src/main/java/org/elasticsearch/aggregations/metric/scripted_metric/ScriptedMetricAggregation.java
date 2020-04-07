
package org.elasticsearch.aggregations.metric.scripted_metric;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.common_options.scripting.*;

public class ScriptedMetricAggregation  implements XContentable<ScriptedMetricAggregation> {
  
  static final ParseField COMBINE_SCRIPT = new ParseField("combine_script");
  private Script _combineScript;
  public Script getCombineScript() { return this._combineScript; }
  public ScriptedMetricAggregation setCombineScript(Script val) { this._combineScript = val; return this; }


  static final ParseField INIT_SCRIPT = new ParseField("init_script");
  private Script _initScript;
  public Script getInitScript() { return this._initScript; }
  public ScriptedMetricAggregation setInitScript(Script val) { this._initScript = val; return this; }


  static final ParseField MAP_SCRIPT = new ParseField("map_script");
  private Script _mapScript;
  public Script getMapScript() { return this._mapScript; }
  public ScriptedMetricAggregation setMapScript(Script val) { this._mapScript = val; return this; }


  static final ParseField PARAMS = new ParseField("params");
  private NamedContainer<String, Object> _params;
  public NamedContainer<String, Object> getParams() { return this._params; }
  public ScriptedMetricAggregation setParams(NamedContainer<String, Object> val) { this._params = val; return this; }


  static final ParseField REDUCE_SCRIPT = new ParseField("reduce_script");
  private Script _reduceScript;
  public Script getReduceScript() { return this._reduceScript; }
  public ScriptedMetricAggregation setReduceScript(Script val) { this._reduceScript = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ScriptedMetricAggregation fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ScriptedMetricAggregation.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ScriptedMetricAggregation, Void> PARSER =
    new ConstructingObjectParser<>(ScriptedMetricAggregation.class.getName(), false, args -> new ScriptedMetricAggregation());

  static {
    PARSER.declareObject(ScriptedMetricAggregation::setCombineScript, (p, t) -> Script.PARSER.apply(p, null), COMBINE_SCRIPT);
    PARSER.declareObject(ScriptedMetricAggregation::setInitScript, (p, t) -> Script.PARSER.apply(p, null), INIT_SCRIPT);
    PARSER.declareObject(ScriptedMetricAggregation::setMapScript, (p, t) -> Script.PARSER.apply(p, null), MAP_SCRIPT);
    PARSER.declareObject(ScriptedMetricAggregation::setParams, (p, t) ->  new NamedContainer<>(n -> () -> n,XContentParser::binaryValue), PARAMS);;
    PARSER.declareObject(ScriptedMetricAggregation::setReduceScript, (p, t) -> Script.PARSER.apply(p, null), REDUCE_SCRIPT);
  }

}
