
package org.elasticsearch.x_pack.security.privileges.get_user_privileges;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.security.privileges.get_user_privileges.*;

public class QueryUserPrivileges  {
  
  private TermUserPrivileges _term;
  public TermUserPrivileges getTerm() { return this._term; }
  public QueryUserPrivileges setTerm(TermUserPrivileges val) { this._term = val; return this; }

}
