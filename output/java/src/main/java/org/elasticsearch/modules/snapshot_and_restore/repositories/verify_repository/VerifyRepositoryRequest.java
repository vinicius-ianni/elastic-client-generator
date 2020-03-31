
package org.elasticsearch.modules.snapshot_and_restore.repositories.verify_repository;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_options.time_unit.*;

public class VerifyRepositoryRequest  {
  
  private Time _masterTimeout;
  public Time getMasterTimeout() { return this._masterTimeout; }
  public VerifyRepositoryRequest setMasterTimeout(Time val) { this._masterTimeout = val; return this; }


  private Time _timeout;
  public Time getTimeout() { return this._timeout; }
  public VerifyRepositoryRequest setTimeout(Time val) { this._timeout = val; return this; }

}
