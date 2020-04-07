
package org.elasticsearch.x_pack.info.x_pack_usage;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.x_pack.info.x_pack_usage.*;

public class XPackUsageResponse  implements XContentable<XPackUsageResponse> {
  
  static final ParseField SQL = new ParseField("sql");
  private SqlUsage _sql;
  public SqlUsage getSql() { return this._sql; }
  public XPackUsageResponse setSql(SqlUsage val) { this._sql = val; return this; }


  static final ParseField ROLLUP = new ParseField("rollup");
  private XPackUsage _rollup;
  public XPackUsage getRollup() { return this._rollup; }
  public XPackUsageResponse setRollup(XPackUsage val) { this._rollup = val; return this; }


  static final ParseField DATA_FRAME = new ParseField("data_frame");
  private XPackUsage _dataFrame;
  public XPackUsage getDataFrame() { return this._dataFrame; }
  public XPackUsageResponse setDataFrame(XPackUsage val) { this._dataFrame = val; return this; }


  static final ParseField FLATTENED = new ParseField("flattened");
  private XPackUsage _flattened;
  public XPackUsage getFlattened() { return this._flattened; }
  public XPackUsageResponse setFlattened(XPackUsage val) { this._flattened = val; return this; }


  static final ParseField DATA_SCIENCE = new ParseField("data_science");
  private XPackUsage _dataScience;
  public XPackUsage getDataScience() { return this._dataScience; }
  public XPackUsageResponse setDataScience(XPackUsage val) { this._dataScience = val; return this; }


  static final ParseField ILM = new ParseField("ilm");
  private IlmUsage _ilm;
  public IlmUsage getIlm() { return this._ilm; }
  public XPackUsageResponse setIlm(IlmUsage val) { this._ilm = val; return this; }


  static final ParseField CCR = new ParseField("ccr");
  private CcrUsage _ccr;
  public CcrUsage getCcr() { return this._ccr; }
  public XPackUsageResponse setCcr(CcrUsage val) { this._ccr = val; return this; }


  static final ParseField WATCHER = new ParseField("watcher");
  private AlertingUsage _watcher;
  public AlertingUsage getWatcher() { return this._watcher; }
  public XPackUsageResponse setWatcher(AlertingUsage val) { this._watcher = val; return this; }


  static final ParseField GRAPH = new ParseField("graph");
  private XPackUsage _graph;
  public XPackUsage getGraph() { return this._graph; }
  public XPackUsageResponse setGraph(XPackUsage val) { this._graph = val; return this; }


  static final ParseField LOGSTASH = new ParseField("logstash");
  private XPackUsage _logstash;
  public XPackUsage getLogstash() { return this._logstash; }
  public XPackUsageResponse setLogstash(XPackUsage val) { this._logstash = val; return this; }


  static final ParseField ML = new ParseField("ml");
  private MachineLearningUsage _ml;
  public MachineLearningUsage getMl() { return this._ml; }
  public XPackUsageResponse setMl(MachineLearningUsage val) { this._ml = val; return this; }


  static final ParseField MONITORING = new ParseField("monitoring");
  private MonitoringUsage _monitoring;
  public MonitoringUsage getMonitoring() { return this._monitoring; }
  public XPackUsageResponse setMonitoring(MonitoringUsage val) { this._monitoring = val; return this; }


  static final ParseField SECURITY = new ParseField("security");
  private SecurityUsage _security;
  public SecurityUsage getSecurity() { return this._security; }
  public XPackUsageResponse setSecurity(SecurityUsage val) { this._security = val; return this; }


  static final ParseField VECTORS = new ParseField("vectors");
  private VectorUsage _vectors;
  public VectorUsage getVectors() { return this._vectors; }
  public XPackUsageResponse setVectors(VectorUsage val) { this._vectors = val; return this; }


  static final ParseField VOTING_ONLY = new ParseField("voting_only");
  private XPackUsage _votingOnly;
  public XPackUsage getVotingOnly() { return this._votingOnly; }
  public XPackUsageResponse setVotingOnly(XPackUsage val) { this._votingOnly = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public XPackUsageResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return XPackUsageResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<XPackUsageResponse, Void> PARSER =
    new ConstructingObjectParser<>(XPackUsageResponse.class.getName(), false, args -> new XPackUsageResponse());

  static {
    PARSER.declareObject(XPackUsageResponse::setSql, (p, t) -> SqlUsage.PARSER.apply(p, null), SQL);
    PARSER.declareObject(XPackUsageResponse::setRollup, (p, t) -> XPackUsage.PARSER.apply(p, null), ROLLUP);
    PARSER.declareObject(XPackUsageResponse::setDataFrame, (p, t) -> XPackUsage.PARSER.apply(p, null), DATA_FRAME);
    PARSER.declareObject(XPackUsageResponse::setFlattened, (p, t) -> XPackUsage.PARSER.apply(p, null), FLATTENED);
    PARSER.declareObject(XPackUsageResponse::setDataScience, (p, t) -> XPackUsage.PARSER.apply(p, null), DATA_SCIENCE);
    PARSER.declareObject(XPackUsageResponse::setIlm, (p, t) -> IlmUsage.PARSER.apply(p, null), ILM);
    PARSER.declareObject(XPackUsageResponse::setCcr, (p, t) -> CcrUsage.PARSER.apply(p, null), CCR);
    PARSER.declareObject(XPackUsageResponse::setWatcher, (p, t) -> AlertingUsage.PARSER.apply(p, null), WATCHER);
    PARSER.declareObject(XPackUsageResponse::setGraph, (p, t) -> XPackUsage.PARSER.apply(p, null), GRAPH);
    PARSER.declareObject(XPackUsageResponse::setLogstash, (p, t) -> XPackUsage.PARSER.apply(p, null), LOGSTASH);
    PARSER.declareObject(XPackUsageResponse::setMl, (p, t) -> MachineLearningUsage.PARSER.apply(p, null), ML);
    PARSER.declareObject(XPackUsageResponse::setMonitoring, (p, t) -> MonitoringUsage.PARSER.apply(p, null), MONITORING);
    PARSER.declareObject(XPackUsageResponse::setSecurity, (p, t) -> SecurityUsage.PARSER.apply(p, null), SECURITY);
    PARSER.declareObject(XPackUsageResponse::setVectors, (p, t) -> VectorUsage.PARSER.apply(p, null), VECTORS);
    PARSER.declareObject(XPackUsageResponse::setVotingOnly, (p, t) -> XPackUsage.PARSER.apply(p, null), VOTING_ONLY);
  }

}
