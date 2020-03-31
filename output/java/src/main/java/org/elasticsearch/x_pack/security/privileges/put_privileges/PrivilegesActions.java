
package org.elasticsearch.x_pack.security.privileges.put_privileges;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class PrivilegesActions  {
  
  private String[] _actions;
  public String[] getActions() { return this._actions; }
  public PrivilegesActions setActions(String[] val) { this._actions = val; return this; }


  private Map<String, Object> _metadata;
  public Map<String, Object> getMetadata() { return this._metadata; }
  public PrivilegesActions setMetadata(Map<String, Object> val) { this._metadata = val; return this; }

}
