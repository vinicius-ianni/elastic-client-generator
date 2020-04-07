
package org.elasticsearch.cluster.cluster_stats;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.internal.*;

public class ClusterNodeCount  implements XContentable<ClusterNodeCount> {
  
  static final ParseField COORDINATING_ONLY = new ParseField("coordinating_only");
  private Integer _coordinatingOnly;
  public Integer getCoordinatingOnly() { return this._coordinatingOnly; }
  public ClusterNodeCount setCoordinatingOnly(Integer val) { this._coordinatingOnly = val; return this; }


  static final ParseField DATA = new ParseField("data");
  private Integer _data;
  public Integer getData() { return this._data; }
  public ClusterNodeCount setData(Integer val) { this._data = val; return this; }


  static final ParseField INGEST = new ParseField("ingest");
  private Integer _ingest;
  public Integer getIngest() { return this._ingest; }
  public ClusterNodeCount setIngest(Integer val) { this._ingest = val; return this; }


  static final ParseField MASTER = new ParseField("master");
  private Integer _master;
  public Integer getMaster() { return this._master; }
  public ClusterNodeCount setMaster(Integer val) { this._master = val; return this; }


  static final ParseField TOTAL = new ParseField("total");
  private Integer _total;
  public Integer getTotal() { return this._total; }
  public ClusterNodeCount setTotal(Integer val) { this._total = val; return this; }


  static final ParseField VOTING_ONLY = new ParseField("voting_only");
  private Integer _votingOnly;
  public Integer getVotingOnly() { return this._votingOnly; }
  public ClusterNodeCount setVotingOnly(Integer val) { this._votingOnly = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ClusterNodeCount fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ClusterNodeCount.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ClusterNodeCount, Void> PARSER =
    new ConstructingObjectParser<>(ClusterNodeCount.class.getName(), false, args -> new ClusterNodeCount());

  static {
    PARSER.declareInteger(ClusterNodeCount::setCoordinatingOnly, COORDINATING_ONLY);
    PARSER.declareInteger(ClusterNodeCount::setData, DATA);
    PARSER.declareInteger(ClusterNodeCount::setIngest, INGEST);
    PARSER.declareInteger(ClusterNodeCount::setMaster, MASTER);
    PARSER.declareInteger(ClusterNodeCount::setTotal, TOTAL);
    PARSER.declareInteger(ClusterNodeCount::setVotingOnly, VOTING_ONLY);
  }

}
