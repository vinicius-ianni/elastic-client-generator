
package org.elasticsearch.index_modules.index_settings;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.index_name.*;
import org.elasticsearch.indices.alias_management.*;
import org.elasticsearch.mapping.*;

public class IndexState  {
  
  private Map<IndexName, Alias> _aliases;
  public Map<IndexName, Alias> getAliases() { return this._aliases; }
  public IndexState setAliases(Map<IndexName, Alias> val) { this._aliases = val; return this; }


  private TypeMapping _mappings;
  public TypeMapping getMappings() { return this._mappings; }
  public IndexState setMappings(TypeMapping val) { this._mappings = val; return this; }


  private Map<String, Object> _settings;
  public Map<String, Object> getSettings() { return this._settings; }
  public IndexState setSettings(Map<String, Object> val) { this._settings = val; return this; }

}
