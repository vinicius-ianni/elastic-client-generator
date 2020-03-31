
package org.elasticsearch.common_options.stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class CompletionStats  {
  
  private Long _sizeInBytes;
  public Long getSizeInBytes() { return this._sizeInBytes; }
  public CompletionStats setSizeInBytes(Long val) { this._sizeInBytes = val; return this; }

}
