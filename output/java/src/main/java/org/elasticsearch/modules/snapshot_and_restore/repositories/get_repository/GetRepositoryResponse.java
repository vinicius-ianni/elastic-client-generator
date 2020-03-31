
package org.elasticsearch.modules.snapshot_and_restore.repositories.get_repository;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.modules.snapshot_and_restore.repositories.*;

public class GetRepositoryResponse  {
  
  private Map<String, SnapshotRepository> _repositories;
  public Map<String, SnapshotRepository> getRepositories() { return this._repositories; }
  public GetRepositoryResponse setRepositories(Map<String, SnapshotRepository> val) { this._repositories = val; return this; }

}
