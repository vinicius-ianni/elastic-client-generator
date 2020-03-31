
package org.elasticsearch.modules.snapshot_and_restore.repositories.create_repository;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.modules.snapshot_and_restore.repositories.*;
import org.elasticsearch.common_options.time_unit.*;

public class CreateRepositoryRequest  {
  
  private SnapshotRepository _repository;
  public SnapshotRepository getRepository() { return this._repository; }
  public CreateRepositoryRequest setRepository(SnapshotRepository val) { this._repository = val; return this; }


  private Time _masterTimeout;
  public Time getMasterTimeout() { return this._masterTimeout; }
  public CreateRepositoryRequest setMasterTimeout(Time val) { this._masterTimeout = val; return this; }


  private Time _timeout;
  public Time getTimeout() { return this._timeout; }
  public CreateRepositoryRequest setTimeout(Time val) { this._timeout = val; return this; }


  private Boolean _verify;
  public Boolean getVerify() { return this._verify; }
  public CreateRepositoryRequest setVerify(Boolean val) { this._verify = val; return this; }

}
