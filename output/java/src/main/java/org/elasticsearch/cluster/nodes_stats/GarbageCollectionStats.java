
package org.elasticsearch.cluster.nodes_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.cluster.nodes_stats.*;

public class GarbageCollectionStats  {
  
  private Map<String, GarbageCollectionGenerationStats> _collectors;
  public Map<String, GarbageCollectionGenerationStats> getCollectors() { return this._collectors; }
  public GarbageCollectionStats setCollectors(Map<String, GarbageCollectionGenerationStats> val) { this._collectors = val; return this; }

}
