
package org.elasticsearch.modules.snapshot_and_restore.repositories.verify_repository;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.modules.snapshot_and_restore.repositories.verify_repository.*;

public class VerifyRepositoryResponse  {
  
  private Map<String, CompactNodeInfo> _nodes;
  public Map<String, CompactNodeInfo> getNodes() { return this._nodes; }
  public VerifyRepositoryResponse setNodes(Map<String, CompactNodeInfo> val) { this._nodes = val; return this; }

}
