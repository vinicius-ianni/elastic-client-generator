
package org.elasticsearch.x_pack.security.role;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.field.*;

public class FieldSecurity  {
  
  private Field[] _except;
  public Field[] getExcept() { return this._except; }
  public FieldSecurity setExcept(Field[] val) { this._except = val; return this; }


  private Field[] _grant;
  public Field[] getGrant() { return this._grant; }
  public FieldSecurity setGrant(Field[] val) { this._grant = val; return this; }

}
