
package org.elasticsearch.modules.snapshot_and_restore.repositories.cleanup_repository;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class CleanupRepositoryResults  {
  
  private Long _deletedBytes;
  public Long getDeletedBytes() { return this._deletedBytes; }
  public CleanupRepositoryResults setDeletedBytes(Long val) { this._deletedBytes = val; return this; }


  private Long _deletedBlobs;
  public Long getDeletedBlobs() { return this._deletedBlobs; }
  public CleanupRepositoryResults setDeletedBlobs(Long val) { this._deletedBlobs = val; return this; }

}
