
package org.elasticsearch.indices.index_settings.index_templates.index_template_exists;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_options.time_unit.*;

public class IndexTemplateExistsRequest  {
  
  private Boolean _flatSettings;
  public Boolean getFlatSettings() { return this._flatSettings; }
  public IndexTemplateExistsRequest setFlatSettings(Boolean val) { this._flatSettings = val; return this; }


  private Boolean _local;
  public Boolean getLocal() { return this._local; }
  public IndexTemplateExistsRequest setLocal(Boolean val) { this._local = val; return this; }


  private Time _masterTimeout;
  public Time getMasterTimeout() { return this._masterTimeout; }
  public IndexTemplateExistsRequest setMasterTimeout(Time val) { this._masterTimeout = val; return this; }

}
