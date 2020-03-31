
package org.elasticsearch.x_pack.ilm.get_lifecycle;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.x_pack.ilm.*;

public class LifecyclePolicy  {
  
  private Date _modifiedDate;
  public Date getModifiedDate() { return this._modifiedDate; }
  public LifecyclePolicy setModifiedDate(Date val) { this._modifiedDate = val; return this; }


  private Policy _policy;
  public Policy getPolicy() { return this._policy; }
  public LifecyclePolicy setPolicy(Policy val) { this._policy = val; return this; }


  private Integer _version;
  public Integer getVersion() { return this._version; }
  public LifecyclePolicy setVersion(Integer val) { this._version = val; return this; }

}
