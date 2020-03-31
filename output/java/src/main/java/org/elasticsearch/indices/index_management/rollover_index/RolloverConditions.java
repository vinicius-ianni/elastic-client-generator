
package org.elasticsearch.indices.index_management.rollover_index;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_options.time_unit.*;
import org.elasticsearch.internal.*;

public class RolloverConditions  {
  
  private Time _maxAge;
  public Time getMaxAge() { return this._maxAge; }
  public RolloverConditions setMaxAge(Time val) { this._maxAge = val; return this; }


  private Long _maxDocs;
  public Long getMaxDocs() { return this._maxDocs; }
  public RolloverConditions setMaxDocs(Long val) { this._maxDocs = val; return this; }


  private String _maxSize;
  public String getMaxSize() { return this._maxSize; }
  public RolloverConditions setMaxSize(String val) { this._maxSize = val; return this; }

}
