
package org.elasticsearch.indices.index_settings.index_templates.put_index_template;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.index_name.*;
import org.elasticsearch.indices.alias_management.*;
import org.elasticsearch.mapping.*;
import org.elasticsearch.internal.*;
import org.elasticsearch.common_options.time_unit.*;

public class PutIndexTemplateRequest  {
  
  private Map<IndexName, Alias> _aliases;
  public Map<IndexName, Alias> getAliases() { return this._aliases; }
  public PutIndexTemplateRequest setAliases(Map<IndexName, Alias> val) { this._aliases = val; return this; }


  private String[] _indexPatterns;
  public String[] getIndexPatterns() { return this._indexPatterns; }
  public PutIndexTemplateRequest setIndexPatterns(String[] val) { this._indexPatterns = val; return this; }


  private TypeMapping _mappings;
  public TypeMapping getMappings() { return this._mappings; }
  public PutIndexTemplateRequest setMappings(TypeMapping val) { this._mappings = val; return this; }


  private Integer _order;
  public Integer getOrder() { return this._order; }
  public PutIndexTemplateRequest setOrder(Integer val) { this._order = val; return this; }


  private Map<String, Object> _settings;
  public Map<String, Object> getSettings() { return this._settings; }
  public PutIndexTemplateRequest setSettings(Map<String, Object> val) { this._settings = val; return this; }


  private Integer _version;
  public Integer getVersion() { return this._version; }
  public PutIndexTemplateRequest setVersion(Integer val) { this._version = val; return this; }


  private Boolean _create;
  public Boolean getCreate() { return this._create; }
  public PutIndexTemplateRequest setCreate(Boolean val) { this._create = val; return this; }


  private Boolean _flatSettings;
  public Boolean getFlatSettings() { return this._flatSettings; }
  public PutIndexTemplateRequest setFlatSettings(Boolean val) { this._flatSettings = val; return this; }


  private Boolean _includeTypeName;
  public Boolean getIncludeTypeName() { return this._includeTypeName; }
  public PutIndexTemplateRequest setIncludeTypeName(Boolean val) { this._includeTypeName = val; return this; }


  private Time _masterTimeout;
  public Time getMasterTimeout() { return this._masterTimeout; }
  public PutIndexTemplateRequest setMasterTimeout(Time val) { this._masterTimeout = val; return this; }


  private Time _timeout;
  public Time getTimeout() { return this._timeout; }
  public PutIndexTemplateRequest setTimeout(Time val) { this._timeout = val; return this; }

}
