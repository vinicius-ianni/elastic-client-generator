
package org.elasticsearch.indices.monitoring.indices_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class ShardPath  {
  
  private String _dataPath;
  public String getDataPath() { return this._dataPath; }
  public ShardPath setDataPath(String val) { this._dataPath = val; return this; }


  private Boolean _isCustomDataPath;
  public Boolean getIsCustomDataPath() { return this._isCustomDataPath; }
  public ShardPath setIsCustomDataPath(Boolean val) { this._isCustomDataPath = val; return this; }


  private String _statePath;
  public String getStatePath() { return this._statePath; }
  public ShardPath setStatePath(String val) { this._statePath = val; return this; }

}
