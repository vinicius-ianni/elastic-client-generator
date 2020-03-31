
package org.elasticsearch.common_options.stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class DocStats  {
  
  private Long _count;
  public Long getCount() { return this._count; }
  public DocStats setCount(Long val) { this._count = val; return this; }


  private Long _deleted;
  public Long getDeleted() { return this._deleted; }
  public DocStats setDeleted(Long val) { this._deleted = val; return this; }

}
