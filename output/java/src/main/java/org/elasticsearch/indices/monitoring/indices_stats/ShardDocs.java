
package org.elasticsearch.indices.monitoring.indices_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class ShardDocs  {
  
  private Long _count;
  public Long getCount() { return this._count; }
  public ShardDocs setCount(Long val) { this._count = val; return this; }


  private Long _deleted;
  public Long getDeleted() { return this._deleted; }
  public ShardDocs setDeleted(Long val) { this._deleted = val; return this; }

}
