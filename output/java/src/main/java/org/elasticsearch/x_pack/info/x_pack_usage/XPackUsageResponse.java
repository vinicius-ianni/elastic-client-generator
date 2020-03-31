
package org.elasticsearch.x_pack.info.x_pack_usage;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.info.x_pack_usage.*;

public class XPackUsageResponse  {
  
  private SqlUsage _sql;
  public SqlUsage getSql() { return this._sql; }
  public XPackUsageResponse setSql(SqlUsage val) { this._sql = val; return this; }


  private XPackUsage _rollup;
  public XPackUsage getRollup() { return this._rollup; }
  public XPackUsageResponse setRollup(XPackUsage val) { this._rollup = val; return this; }


  private XPackUsage _dataFrame;
  public XPackUsage getDataFrame() { return this._dataFrame; }
  public XPackUsageResponse setDataFrame(XPackUsage val) { this._dataFrame = val; return this; }


  private XPackUsage _flattened;
  public XPackUsage getFlattened() { return this._flattened; }
  public XPackUsageResponse setFlattened(XPackUsage val) { this._flattened = val; return this; }


  private XPackUsage _dataScience;
  public XPackUsage getDataScience() { return this._dataScience; }
  public XPackUsageResponse setDataScience(XPackUsage val) { this._dataScience = val; return this; }


  private IlmUsage _ilm;
  public IlmUsage getIlm() { return this._ilm; }
  public XPackUsageResponse setIlm(IlmUsage val) { this._ilm = val; return this; }


  private CcrUsage _ccr;
  public CcrUsage getCcr() { return this._ccr; }
  public XPackUsageResponse setCcr(CcrUsage val) { this._ccr = val; return this; }


  private AlertingUsage _watcher;
  public AlertingUsage getWatcher() { return this._watcher; }
  public XPackUsageResponse setWatcher(AlertingUsage val) { this._watcher = val; return this; }


  private XPackUsage _graph;
  public XPackUsage getGraph() { return this._graph; }
  public XPackUsageResponse setGraph(XPackUsage val) { this._graph = val; return this; }


  private XPackUsage _logstash;
  public XPackUsage getLogstash() { return this._logstash; }
  public XPackUsageResponse setLogstash(XPackUsage val) { this._logstash = val; return this; }


  private MachineLearningUsage _ml;
  public MachineLearningUsage getMl() { return this._ml; }
  public XPackUsageResponse setMl(MachineLearningUsage val) { this._ml = val; return this; }


  private MonitoringUsage _monitoring;
  public MonitoringUsage getMonitoring() { return this._monitoring; }
  public XPackUsageResponse setMonitoring(MonitoringUsage val) { this._monitoring = val; return this; }


  private SecurityUsage _security;
  public SecurityUsage getSecurity() { return this._security; }
  public XPackUsageResponse setSecurity(SecurityUsage val) { this._security = val; return this; }


  private VectorUsage _vectors;
  public VectorUsage getVectors() { return this._vectors; }
  public XPackUsageResponse setVectors(VectorUsage val) { this._vectors = val; return this; }


  private XPackUsage _votingOnly;
  public XPackUsage getVotingOnly() { return this._votingOnly; }
  public XPackUsageResponse setVotingOnly(XPackUsage val) { this._votingOnly = val; return this; }

}
