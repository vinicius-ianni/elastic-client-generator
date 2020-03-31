
package org.elasticsearch.indices.index_settings.index_templates.delete_index_template;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_options.time_unit.*;

public class DeleteIndexTemplateRequest  {
  
  private Time _masterTimeout;
  public Time getMasterTimeout() { return this._masterTimeout; }
  public DeleteIndexTemplateRequest setMasterTimeout(Time val) { this._masterTimeout = val; return this; }


  private Time _timeout;
  public Time getTimeout() { return this._timeout; }
  public DeleteIndexTemplateRequest setTimeout(Time val) { this._timeout = val; return this; }

}
