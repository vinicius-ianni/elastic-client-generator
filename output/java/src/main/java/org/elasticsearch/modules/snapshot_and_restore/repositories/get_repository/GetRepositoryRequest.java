
package org.elasticsearch.modules.snapshot_and_restore.repositories.get_repository;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_options.time_unit.*;

public class GetRepositoryRequest  {
  
  private Boolean _local;
  public Boolean getLocal() { return this._local; }
  public GetRepositoryRequest setLocal(Boolean val) { this._local = val; return this; }


  private Time _masterTimeout;
  public Time getMasterTimeout() { return this._masterTimeout; }
  public GetRepositoryRequest setMasterTimeout(Time val) { this._masterTimeout = val; return this; }

}
