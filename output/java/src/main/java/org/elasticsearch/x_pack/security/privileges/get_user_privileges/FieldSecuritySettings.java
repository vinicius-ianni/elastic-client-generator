
package org.elasticsearch.x_pack.security.privileges.get_user_privileges;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class FieldSecuritySettings  {
  
  private String[] _except;
  public String[] getExcept() { return this._except; }
  public FieldSecuritySettings setExcept(String[] val) { this._except = val; return this; }


  private String[] _grant;
  public String[] getGrant() { return this._grant; }
  public FieldSecuritySettings setGrant(String[] val) { this._grant = val; return this; }

}
