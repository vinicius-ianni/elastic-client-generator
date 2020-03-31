
package org.elasticsearch.indices.index_settings.index_templates.get_index_template;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_options.time_unit.*;

public class GetIndexTemplateRequest  {
  
  private Boolean _flatSettings;
  public Boolean getFlatSettings() { return this._flatSettings; }
  public GetIndexTemplateRequest setFlatSettings(Boolean val) { this._flatSettings = val; return this; }


  private Boolean _includeTypeName;
  public Boolean getIncludeTypeName() { return this._includeTypeName; }
  public GetIndexTemplateRequest setIncludeTypeName(Boolean val) { this._includeTypeName = val; return this; }


  private Boolean _local;
  public Boolean getLocal() { return this._local; }
  public GetIndexTemplateRequest setLocal(Boolean val) { this._local = val; return this; }


  private Time _masterTimeout;
  public Time getMasterTimeout() { return this._masterTimeout; }
  public GetIndexTemplateRequest setMasterTimeout(Time val) { this._masterTimeout = val; return this; }

}
