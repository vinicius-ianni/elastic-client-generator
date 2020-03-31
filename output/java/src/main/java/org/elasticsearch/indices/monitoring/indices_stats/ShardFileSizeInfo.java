
package org.elasticsearch.indices.monitoring.indices_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class ShardFileSizeInfo  {
  
  private String _description;
  public String getDescription() { return this._description; }
  public ShardFileSizeInfo setDescription(String val) { this._description = val; return this; }


  private Long _sizeInBytes;
  public Long getSizeInBytes() { return this._sizeInBytes; }
  public ShardFileSizeInfo setSizeInBytes(Long val) { this._sizeInBytes = val; return this; }

}
