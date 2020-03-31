
package org.elasticsearch.common_options.stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class FielddataStats  {
  
  private Long _evictions;
  public Long getEvictions() { return this._evictions; }
  public FielddataStats setEvictions(Long val) { this._evictions = val; return this; }


  private Long _memorySizeInBytes;
  public Long getMemorySizeInBytes() { return this._memorySizeInBytes; }
  public FielddataStats setMemorySizeInBytes(Long val) { this._memorySizeInBytes = val; return this; }

}
