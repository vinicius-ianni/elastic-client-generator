
package org.elasticsearch.document.multiple.reindex_rethrottle;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.document.multiple.reindex_rethrottle.*;

public class ReindexRethrottleResponse  {
  
  private Map<String, ReindexNode> _nodes;
  public Map<String, ReindexNode> getNodes() { return this._nodes; }
  public ReindexRethrottleResponse setNodes(Map<String, ReindexNode> val) { this._nodes = val; return this; }

}
