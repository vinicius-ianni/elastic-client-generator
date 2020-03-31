
package org.elasticsearch.common;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.common.*;

public class ErrorCause  {
  
  private Map<String, Object> _additionalProperties;
  public Map<String, Object> getAdditionalProperties() { return this._additionalProperties; }
  public ErrorCause setAdditionalProperties(Map<String, Object> val) { this._additionalProperties = val; return this; }


  private Long _bytesLimit;
  public Long getBytesLimit() { return this._bytesLimit; }
  public ErrorCause setBytesLimit(Long val) { this._bytesLimit = val; return this; }


  private Long _bytesWanted;
  public Long getBytesWanted() { return this._bytesWanted; }
  public ErrorCause setBytesWanted(Long val) { this._bytesWanted = val; return this; }


  private ErrorCause _causedBy;
  public ErrorCause getCausedBy() { return this._causedBy; }
  public ErrorCause setCausedBy(ErrorCause val) { this._causedBy = val; return this; }


  private Integer _column;
  public Integer getColumn() { return this._column; }
  public ErrorCause setColumn(Integer val) { this._column = val; return this; }


  private ShardFailure[] _failedShards;
  public ShardFailure[] getFailedShards() { return this._failedShards; }
  public ErrorCause setFailedShards(ShardFailure[] val) { this._failedShards = val; return this; }


  private Boolean _grouped;
  public Boolean getGrouped() { return this._grouped; }
  public ErrorCause setGrouped(Boolean val) { this._grouped = val; return this; }


  private String _index;
  public String getIndex() { return this._index; }
  public ErrorCause setIndex(String val) { this._index = val; return this; }


  private String _indexUUID;
  public String getIndexUUID() { return this._indexUUID; }
  public ErrorCause setIndexUUID(String val) { this._indexUUID = val; return this; }


  private String _language;
  public String getLanguage() { return this._language; }
  public ErrorCause setLanguage(String val) { this._language = val; return this; }


  private String _licensedExpiredFeature;
  public String getLicensedExpiredFeature() { return this._licensedExpiredFeature; }
  public ErrorCause setLicensedExpiredFeature(String val) { this._licensedExpiredFeature = val; return this; }


  private Integer _line;
  public Integer getLine() { return this._line; }
  public ErrorCause setLine(Integer val) { this._line = val; return this; }


  private String _phase;
  public String getPhase() { return this._phase; }
  public ErrorCause setPhase(String val) { this._phase = val; return this; }


  private String _reason;
  public String getReason() { return this._reason; }
  public ErrorCause setReason(String val) { this._reason = val; return this; }


  private String[] _resourceId;
  public String[] getResourceId() { return this._resourceId; }
  public ErrorCause setResourceId(String[] val) { this._resourceId = val; return this; }


  private String _resourceType;
  public String getResourceType() { return this._resourceType; }
  public ErrorCause setResourceType(String val) { this._resourceType = val; return this; }


  private String _script;
  public String getScript() { return this._script; }
  public ErrorCause setScript(String val) { this._script = val; return this; }


  private String[] _scriptStack;
  public String[] getScriptStack() { return this._scriptStack; }
  public ErrorCause setScriptStack(String[] val) { this._scriptStack = val; return this; }


  private Integer _shard;
  public Integer getShard() { return this._shard; }
  public ErrorCause setShard(Integer val) { this._shard = val; return this; }


  private String _stackTrace;
  public String getStackTrace() { return this._stackTrace; }
  public ErrorCause setStackTrace(String val) { this._stackTrace = val; return this; }


  private String _type;
  public String getType() { return this._type; }
  public ErrorCause setType(String val) { this._type = val; return this; }

}
