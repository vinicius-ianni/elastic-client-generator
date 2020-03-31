
package org.elasticsearch.indices.index_settings.index_templates.get_index_template;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.index_name.*;
import org.elasticsearch.indices.alias_management.*;
import org.elasticsearch.mapping.*;
import org.elasticsearch.internal.*;

public class TemplateMapping  {
  
  private Map<IndexName, Alias> _aliases;
  public Map<IndexName, Alias> getAliases() { return this._aliases; }
  public TemplateMapping setAliases(Map<IndexName, Alias> val) { this._aliases = val; return this; }


  private String[] _indexPatterns;
  public String[] getIndexPatterns() { return this._indexPatterns; }
  public TemplateMapping setIndexPatterns(String[] val) { this._indexPatterns = val; return this; }


  private TypeMapping _mappings;
  public TypeMapping getMappings() { return this._mappings; }
  public TemplateMapping setMappings(TypeMapping val) { this._mappings = val; return this; }


  private Integer _order;
  public Integer getOrder() { return this._order; }
  public TemplateMapping setOrder(Integer val) { this._order = val; return this; }


  private Map<String, Object> _settings;
  public Map<String, Object> getSettings() { return this._settings; }
  public TemplateMapping setSettings(Map<String, Object> val) { this._settings = val; return this; }


  private Integer _version;
  public Integer getVersion() { return this._version; }
  public TemplateMapping setVersion(Integer val) { this._version = val; return this; }

}
