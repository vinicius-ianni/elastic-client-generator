
package org.elasticsearch.indices.index_management.create_index;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.index_name.*;
import org.elasticsearch.indices.alias_management.*;
import org.elasticsearch.mapping.*;
import org.elasticsearch.common_options.time_unit.*;

public class CreateIndexRequest  {
  
  private Map<IndexName, Alias> _aliases;
  public Map<IndexName, Alias> getAliases() { return this._aliases; }
  public CreateIndexRequest setAliases(Map<IndexName, Alias> val) { this._aliases = val; return this; }


  private TypeMapping _mappings;
  public TypeMapping getMappings() { return this._mappings; }
  public CreateIndexRequest setMappings(TypeMapping val) { this._mappings = val; return this; }


  private Map<String, Object> _settings;
  public Map<String, Object> getSettings() { return this._settings; }
  public CreateIndexRequest setSettings(Map<String, Object> val) { this._settings = val; return this; }


  private Boolean _includeTypeName;
  public Boolean getIncludeTypeName() { return this._includeTypeName; }
  public CreateIndexRequest setIncludeTypeName(Boolean val) { this._includeTypeName = val; return this; }


  private Time _masterTimeout;
  public Time getMasterTimeout() { return this._masterTimeout; }
  public CreateIndexRequest setMasterTimeout(Time val) { this._masterTimeout = val; return this; }


  private Time _timeout;
  public Time getTimeout() { return this._timeout; }
  public CreateIndexRequest setTimeout(Time val) { this._timeout = val; return this; }


  private String _waitForActiveShards;
  public String getWaitForActiveShards() { return this._waitForActiveShards; }
  public CreateIndexRequest setWaitForActiveShards(String val) { this._waitForActiveShards = val; return this; }

}
