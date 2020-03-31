
package org.elasticsearch.x_pack.info.x_pack_info;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.info.x_pack_info.*;

public class XPackFeatures  {
  
  private XPackFeature _ccr;
  public XPackFeature getCcr() { return this._ccr; }
  public XPackFeatures setCcr(XPackFeature val) { this._ccr = val; return this; }


  private XPackFeature _dataFrame;
  public XPackFeature getDataFrame() { return this._dataFrame; }
  public XPackFeatures setDataFrame(XPackFeature val) { this._dataFrame = val; return this; }


  private XPackFeature _flattened;
  public XPackFeature getFlattened() { return this._flattened; }
  public XPackFeatures setFlattened(XPackFeature val) { this._flattened = val; return this; }


  private XPackFeature _dataScience;
  public XPackFeature getDataScience() { return this._dataScience; }
  public XPackFeatures setDataScience(XPackFeature val) { this._dataScience = val; return this; }


  private XPackFeature _graph;
  public XPackFeature getGraph() { return this._graph; }
  public XPackFeatures setGraph(XPackFeature val) { this._graph = val; return this; }


  private XPackFeature _ilm;
  public XPackFeature getIlm() { return this._ilm; }
  public XPackFeatures setIlm(XPackFeature val) { this._ilm = val; return this; }


  private XPackFeature _logstash;
  public XPackFeature getLogstash() { return this._logstash; }
  public XPackFeatures setLogstash(XPackFeature val) { this._logstash = val; return this; }


  private XPackFeature _ml;
  public XPackFeature getMl() { return this._ml; }
  public XPackFeatures setMl(XPackFeature val) { this._ml = val; return this; }


  private XPackFeature _monitoring;
  public XPackFeature getMonitoring() { return this._monitoring; }
  public XPackFeatures setMonitoring(XPackFeature val) { this._monitoring = val; return this; }


  private XPackFeature _rollup;
  public XPackFeature getRollup() { return this._rollup; }
  public XPackFeatures setRollup(XPackFeature val) { this._rollup = val; return this; }


  private XPackFeature _security;
  public XPackFeature getSecurity() { return this._security; }
  public XPackFeatures setSecurity(XPackFeature val) { this._security = val; return this; }


  private XPackFeature _sql;
  public XPackFeature getSql() { return this._sql; }
  public XPackFeatures setSql(XPackFeature val) { this._sql = val; return this; }


  private XPackFeature _vectors;
  public XPackFeature getVectors() { return this._vectors; }
  public XPackFeatures setVectors(XPackFeature val) { this._vectors = val; return this; }


  private XPackFeature _watcher;
  public XPackFeature getWatcher() { return this._watcher; }
  public XPackFeatures setWatcher(XPackFeature val) { this._watcher = val; return this; }

}
