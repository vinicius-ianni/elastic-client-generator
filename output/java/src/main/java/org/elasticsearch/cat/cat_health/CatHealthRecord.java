
package org.elasticsearch.cat.cat_health;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class CatHealthRecord  {
  
  private String _cluster;
  public String getCluster() { return this._cluster; }
  public CatHealthRecord setCluster(String val) { this._cluster = val; return this; }


  private String _epoch;
  public String getEpoch() { return this._epoch; }
  public CatHealthRecord setEpoch(String val) { this._epoch = val; return this; }


  private String _init;
  public String getInit() { return this._init; }
  public CatHealthRecord setInit(String val) { this._init = val; return this; }


  private String _nodeData;
  public String getNodeData() { return this._nodeData; }
  public CatHealthRecord setNodeData(String val) { this._nodeData = val; return this; }


  private String _nodeTotal;
  public String getNodeTotal() { return this._nodeTotal; }
  public CatHealthRecord setNodeTotal(String val) { this._nodeTotal = val; return this; }


  private String _pendingTasks;
  public String getPendingTasks() { return this._pendingTasks; }
  public CatHealthRecord setPendingTasks(String val) { this._pendingTasks = val; return this; }


  private String _pri;
  public String getPri() { return this._pri; }
  public CatHealthRecord setPri(String val) { this._pri = val; return this; }


  private String _relo;
  public String getRelo() { return this._relo; }
  public CatHealthRecord setRelo(String val) { this._relo = val; return this; }


  private String _shards;
  public String getShards() { return this._shards; }
  public CatHealthRecord setShards(String val) { this._shards = val; return this; }


  private String _status;
  public String getStatus() { return this._status; }
  public CatHealthRecord setStatus(String val) { this._status = val; return this; }


  private String _timestamp;
  public String getTimestamp() { return this._timestamp; }
  public CatHealthRecord setTimestamp(String val) { this._timestamp = val; return this; }


  private String _unassign;
  public String getUnassign() { return this._unassign; }
  public CatHealthRecord setUnassign(String val) { this._unassign = val; return this; }

}
