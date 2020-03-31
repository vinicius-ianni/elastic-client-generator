
package org.elasticsearch.indices.index_management.rollover_index;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class RolloverIndexResponse  {
  
  private Map<String, Boolean> _conditions;
  public Map<String, Boolean> getConditions() { return this._conditions; }
  public RolloverIndexResponse setConditions(Map<String, Boolean> val) { this._conditions = val; return this; }


  private Boolean _dryRun;
  public Boolean getDryRun() { return this._dryRun; }
  public RolloverIndexResponse setDryRun(Boolean val) { this._dryRun = val; return this; }


  private String _newIndex;
  public String getNewIndex() { return this._newIndex; }
  public RolloverIndexResponse setNewIndex(String val) { this._newIndex = val; return this; }


  private String _oldIndex;
  public String getOldIndex() { return this._oldIndex; }
  public RolloverIndexResponse setOldIndex(String val) { this._oldIndex = val; return this; }


  private Boolean _rolledOver;
  public Boolean getRolledOver() { return this._rolledOver; }
  public RolloverIndexResponse setRolledOver(Boolean val) { this._rolledOver = val; return this; }


  private Boolean _shardsAcknowledged;
  public Boolean getShardsAcknowledged() { return this._shardsAcknowledged; }
  public RolloverIndexResponse setShardsAcknowledged(Boolean val) { this._shardsAcknowledged = val; return this; }

}
