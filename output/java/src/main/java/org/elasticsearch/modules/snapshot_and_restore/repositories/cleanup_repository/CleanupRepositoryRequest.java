
package org.elasticsearch.modules.snapshot_and_restore.repositories.cleanup_repository;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_options.time_unit.*;

public class CleanupRepositoryRequest  {
  
  private Time _masterTimeout;
  public Time getMasterTimeout() { return this._masterTimeout; }
  public CleanupRepositoryRequest setMasterTimeout(Time val) { this._masterTimeout = val; return this; }


  private Time _timeout;
  public Time getTimeout() { return this._timeout; }
  public CleanupRepositoryRequest setTimeout(Time val) { this._timeout = val; return this; }

}
