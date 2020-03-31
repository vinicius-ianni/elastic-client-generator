
package org.elasticsearch.x_pack.machine_learning.delete_job;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class DeleteJobRequest  {
  
  private Boolean _force;
  public Boolean getForce() { return this._force; }
  public DeleteJobRequest setForce(Boolean val) { this._force = val; return this; }


  private Boolean _waitForCompletion;
  public Boolean getWaitForCompletion() { return this._waitForCompletion; }
  public DeleteJobRequest setWaitForCompletion(Boolean val) { this._waitForCompletion = val; return this; }

}
