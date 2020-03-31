
package org.elasticsearch.cluster.nodes_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class GarbageCollectionGenerationStats  {
  
  private Long _collectionCount;
  public Long getCollectionCount() { return this._collectionCount; }
  public GarbageCollectionGenerationStats setCollectionCount(Long val) { this._collectionCount = val; return this; }


  private String _collectionTime;
  public String getCollectionTime() { return this._collectionTime; }
  public GarbageCollectionGenerationStats setCollectionTime(String val) { this._collectionTime = val; return this; }


  private Long _collectionTimeInMillis;
  public Long getCollectionTimeInMillis() { return this._collectionTimeInMillis; }
  public GarbageCollectionGenerationStats setCollectionTimeInMillis(Long val) { this._collectionTimeInMillis = val; return this; }

}
