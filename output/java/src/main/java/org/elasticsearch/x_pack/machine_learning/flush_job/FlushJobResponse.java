
package org.elasticsearch.x_pack.machine_learning.flush_job;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class FlushJobResponse  {
  
  private Boolean _flushed;
  public Boolean getFlushed() { return this._flushed; }
  public FlushJobResponse setFlushed(Boolean val) { this._flushed = val; return this; }

}
