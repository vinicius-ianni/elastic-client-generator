
package org.elasticsearch.indices.index_settings.index_templates.get_index_template;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.indices.index_settings.index_templates.get_index_template.*;
import org.elasticsearch.common_abstractions.response.*;

public class GetIndexTemplateResponse extends DictionaryResponseBase<String, TemplateMapping> {
  
  private Map<String, TemplateMapping> _templateMappings;
  public Map<String, TemplateMapping> getTemplateMappings() { return this._templateMappings; }
  public GetIndexTemplateResponse setTemplateMappings(Map<String, TemplateMapping> val) { this._templateMappings = val; return this; }

}
