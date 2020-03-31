
package org.elasticsearch.indices.index_management.shrink_index;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.index_name.*;
import org.elasticsearch.indices.alias_management.*;
import org.elasticsearch.common_options.time_unit.*;

public class ShrinkIndexRequest  {
  
  private Map<IndexName, Alias> _aliases;
  public Map<IndexName, Alias> getAliases() { return this._aliases; }
  public ShrinkIndexRequest setAliases(Map<IndexName, Alias> val) { this._aliases = val; return this; }


  private Map<String, Object> _settings;
  public Map<String, Object> getSettings() { return this._settings; }
  public ShrinkIndexRequest setSettings(Map<String, Object> val) { this._settings = val; return this; }


  private Time _masterTimeout;
  public Time getMasterTimeout() { return this._masterTimeout; }
  public ShrinkIndexRequest setMasterTimeout(Time val) { this._masterTimeout = val; return this; }


  private Time _timeout;
  public Time getTimeout() { return this._timeout; }
  public ShrinkIndexRequest setTimeout(Time val) { this._timeout = val; return this; }


  private String _waitForActiveShards;
  public String getWaitForActiveShards() { return this._waitForActiveShards; }
  public ShrinkIndexRequest setWaitForActiveShards(String val) { this._waitForActiveShards = val; return this; }

}
