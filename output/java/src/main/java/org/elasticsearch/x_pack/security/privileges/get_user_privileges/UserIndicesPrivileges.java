
package org.elasticsearch.x_pack.security.privileges.get_user_privileges;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.security.privileges.get_user_privileges.*;

public class UserIndicesPrivileges  {
  
  private FieldSecuritySettings _fieldSecurity;
  public FieldSecuritySettings getFieldSecurity() { return this._fieldSecurity; }
  public UserIndicesPrivileges setFieldSecurity(FieldSecuritySettings val) { this._fieldSecurity = val; return this; }


  private String[] _names;
  public String[] getNames() { return this._names; }
  public UserIndicesPrivileges setNames(String[] val) { this._names = val; return this; }


  private String[] _privileges;
  public String[] getPrivileges() { return this._privileges; }
  public UserIndicesPrivileges setPrivileges(String[] val) { this._privileges = val; return this; }


  private QueryUserPrivileges _query;
  public QueryUserPrivileges getQuery() { return this._query; }
  public UserIndicesPrivileges setQuery(QueryUserPrivileges val) { this._query = val; return this; }

}
