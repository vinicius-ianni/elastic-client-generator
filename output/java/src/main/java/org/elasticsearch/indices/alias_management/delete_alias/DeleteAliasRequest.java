
package org.elasticsearch.indices.alias_management.delete_alias;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_options.time_unit.*;

public class DeleteAliasRequest  {
  
  private Time _masterTimeout;
  public Time getMasterTimeout() { return this._masterTimeout; }
  public DeleteAliasRequest setMasterTimeout(Time val) { this._masterTimeout = val; return this; }


  private Time _timeout;
  public Time getTimeout() { return this._timeout; }
  public DeleteAliasRequest setTimeout(Time val) { this._timeout = val; return this; }

}
