
package org.elasticsearch.indices.index_management.rollover_index;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.index_name.*;
import org.elasticsearch.indices.alias_management.*;
import org.elasticsearch.indices.index_management.rollover_index.*;
import org.elasticsearch.mapping.*;
import org.elasticsearch.common_options.time_unit.*;

public class RolloverIndexRequest  {
  
  private Map<IndexName, Alias> _aliases;
  public Map<IndexName, Alias> getAliases() { return this._aliases; }
  public RolloverIndexRequest setAliases(Map<IndexName, Alias> val) { this._aliases = val; return this; }


  private RolloverConditions _conditions;
  public RolloverConditions getConditions() { return this._conditions; }
  public RolloverIndexRequest setConditions(RolloverConditions val) { this._conditions = val; return this; }


  private TypeMapping _mappings;
  public TypeMapping getMappings() { return this._mappings; }
  public RolloverIndexRequest setMappings(TypeMapping val) { this._mappings = val; return this; }


  private Map<String, Object> _settings;
  public Map<String, Object> getSettings() { return this._settings; }
  public RolloverIndexRequest setSettings(Map<String, Object> val) { this._settings = val; return this; }


  private Boolean _dryRun;
  public Boolean getDryRun() { return this._dryRun; }
  public RolloverIndexRequest setDryRun(Boolean val) { this._dryRun = val; return this; }


  private Boolean _includeTypeName;
  public Boolean getIncludeTypeName() { return this._includeTypeName; }
  public RolloverIndexRequest setIncludeTypeName(Boolean val) { this._includeTypeName = val; return this; }


  private Time _masterTimeout;
  public Time getMasterTimeout() { return this._masterTimeout; }
  public RolloverIndexRequest setMasterTimeout(Time val) { this._masterTimeout = val; return this; }


  private Time _timeout;
  public Time getTimeout() { return this._timeout; }
  public RolloverIndexRequest setTimeout(Time val) { this._timeout = val; return this; }


  private String _waitForActiveShards;
  public String getWaitForActiveShards() { return this._waitForActiveShards; }
  public RolloverIndexRequest setWaitForActiveShards(String val) { this._waitForActiveShards = val; return this; }

}
