
package org.elasticsearch.modules.snapshot_and_restore.repositories.cleanup_repository;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.modules.snapshot_and_restore.repositories.cleanup_repository.*;

public class CleanupRepositoryResponse  {
  
  private CleanupRepositoryResults _results;
  public CleanupRepositoryResults getResults() { return this._results; }
  public CleanupRepositoryResponse setResults(CleanupRepositoryResults val) { this._results = val; return this; }

}
