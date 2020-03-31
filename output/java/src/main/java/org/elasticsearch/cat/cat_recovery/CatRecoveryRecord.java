
package org.elasticsearch.cat.cat_recovery;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class CatRecoveryRecord  {
  
  private String _bytes;
  public String getBytes() { return this._bytes; }
  public CatRecoveryRecord setBytes(String val) { this._bytes = val; return this; }


  private String _bytesPercent;
  public String getBytesPercent() { return this._bytesPercent; }
  public CatRecoveryRecord setBytesPercent(String val) { this._bytesPercent = val; return this; }


  private String _bytesRecovered;
  public String getBytesRecovered() { return this._bytesRecovered; }
  public CatRecoveryRecord setBytesRecovered(String val) { this._bytesRecovered = val; return this; }


  private String _bytesTotal;
  public String getBytesTotal() { return this._bytesTotal; }
  public CatRecoveryRecord setBytesTotal(String val) { this._bytesTotal = val; return this; }


  private String _files;
  public String getFiles() { return this._files; }
  public CatRecoveryRecord setFiles(String val) { this._files = val; return this; }


  private String _filesPercent;
  public String getFilesPercent() { return this._filesPercent; }
  public CatRecoveryRecord setFilesPercent(String val) { this._filesPercent = val; return this; }


  private String _filesRecovered;
  public String getFilesRecovered() { return this._filesRecovered; }
  public CatRecoveryRecord setFilesRecovered(String val) { this._filesRecovered = val; return this; }


  private String _filesTotal;
  public String getFilesTotal() { return this._filesTotal; }
  public CatRecoveryRecord setFilesTotal(String val) { this._filesTotal = val; return this; }


  private String _index;
  public String getIndex() { return this._index; }
  public CatRecoveryRecord setIndex(String val) { this._index = val; return this; }


  private String _repository;
  public String getRepository() { return this._repository; }
  public CatRecoveryRecord setRepository(String val) { this._repository = val; return this; }


  private String _shard;
  public String getShard() { return this._shard; }
  public CatRecoveryRecord setShard(String val) { this._shard = val; return this; }


  private String _snapshot;
  public String getSnapshot() { return this._snapshot; }
  public CatRecoveryRecord setSnapshot(String val) { this._snapshot = val; return this; }


  private String _sourceHost;
  public String getSourceHost() { return this._sourceHost; }
  public CatRecoveryRecord setSourceHost(String val) { this._sourceHost = val; return this; }


  private String _sourceNode;
  public String getSourceNode() { return this._sourceNode; }
  public CatRecoveryRecord setSourceNode(String val) { this._sourceNode = val; return this; }


  private String _stage;
  public String getStage() { return this._stage; }
  public CatRecoveryRecord setStage(String val) { this._stage = val; return this; }


  private String _targetHost;
  public String getTargetHost() { return this._targetHost; }
  public CatRecoveryRecord setTargetHost(String val) { this._targetHost = val; return this; }


  private String _targetNode;
  public String getTargetNode() { return this._targetNode; }
  public CatRecoveryRecord setTargetNode(String val) { this._targetNode = val; return this; }


  private String _time;
  public String getTime() { return this._time; }
  public CatRecoveryRecord setTime(String val) { this._time = val; return this; }


  private Long _translogOps;
  public Long getTranslogOps() { return this._translogOps; }
  public CatRecoveryRecord setTranslogOps(Long val) { this._translogOps = val; return this; }


  private String _translogOpsPercent;
  public String getTranslogOpsPercent() { return this._translogOpsPercent; }
  public CatRecoveryRecord setTranslogOpsPercent(String val) { this._translogOpsPercent = val; return this; }


  private Long _translogOpsRecovered;
  public Long getTranslogOpsRecovered() { return this._translogOpsRecovered; }
  public CatRecoveryRecord setTranslogOpsRecovered(Long val) { this._translogOpsRecovered = val; return this; }


  private String _type;
  public String getType() { return this._type; }
  public CatRecoveryRecord setType(String val) { this._type = val; return this; }

}
