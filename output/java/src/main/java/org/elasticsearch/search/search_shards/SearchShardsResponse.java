
package org.elasticsearch.search.search_shards;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.search.search_shards.*;

public class SearchShardsResponse  {
  
  private Map<String, SearchNode> _nodes;
  public Map<String, SearchNode> getNodes() { return this._nodes; }
  public SearchShardsResponse setNodes(Map<String, SearchNode> val) { this._nodes = val; return this; }


  private SearchShard[][] _shards;
  public SearchShard[][] getShards() { return this._shards; }
  public SearchShardsResponse setShards(SearchShard[][] val) { this._shards = val; return this; }

}
