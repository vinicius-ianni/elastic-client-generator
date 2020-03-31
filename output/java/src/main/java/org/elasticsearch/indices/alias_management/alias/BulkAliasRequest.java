
package org.elasticsearch.indices.alias_management.alias;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.indices.alias_management.alias.actions.*;
import org.elasticsearch.common_options.time_unit.*;

public class BulkAliasRequest  {
  
  private AliasAction[] _actions;
  public AliasAction[] getActions() { return this._actions; }
  public BulkAliasRequest setActions(AliasAction[] val) { this._actions = val; return this; }


  private Time _masterTimeout;
  public Time getMasterTimeout() { return this._masterTimeout; }
  public BulkAliasRequest setMasterTimeout(Time val) { this._masterTimeout = val; return this; }


  private Time _timeout;
  public Time getTimeout() { return this._timeout; }
  public BulkAliasRequest setTimeout(Time val) { this._timeout = val; return this; }

}
