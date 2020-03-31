
package org.elasticsearch.cluster.cluster_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class ClusterNodeCount  {
  
  private Integer _coordinatingOnly;
  public Integer getCoordinatingOnly() { return this._coordinatingOnly; }
  public ClusterNodeCount setCoordinatingOnly(Integer val) { this._coordinatingOnly = val; return this; }


  private Integer _data;
  public Integer getData() { return this._data; }
  public ClusterNodeCount setData(Integer val) { this._data = val; return this; }


  private Integer _ingest;
  public Integer getIngest() { return this._ingest; }
  public ClusterNodeCount setIngest(Integer val) { this._ingest = val; return this; }


  private Integer _master;
  public Integer getMaster() { return this._master; }
  public ClusterNodeCount setMaster(Integer val) { this._master = val; return this; }


  private Integer _total;
  public Integer getTotal() { return this._total; }
  public ClusterNodeCount setTotal(Integer val) { this._total = val; return this; }


  private Integer _votingOnly;
  public Integer getVotingOnly() { return this._votingOnly; }
  public ClusterNodeCount setVotingOnly(Integer val) { this._votingOnly = val; return this; }

}
