
package org.elasticsearch.x_pack.security.role.put_role;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.security.role.*;
import org.elasticsearch.common_abstractions.infer.indices.*;
import org.elasticsearch.query_dsl.abstractions.container.*;

public class IndicesPrivileges  {
  
  private FieldSecurity _fieldSecurity;
  public FieldSecurity getFieldSecurity() { return this._fieldSecurity; }
  public IndicesPrivileges setFieldSecurity(FieldSecurity val) { this._fieldSecurity = val; return this; }


  private Indices _names;
  public Indices getNames() { return this._names; }
  public IndicesPrivileges setNames(Indices val) { this._names = val; return this; }


  private String[] _privileges;
  public String[] getPrivileges() { return this._privileges; }
  public IndicesPrivileges setPrivileges(String[] val) { this._privileges = val; return this; }


  private QueryContainer _query;
  public QueryContainer getQuery() { return this._query; }
  public IndicesPrivileges setQuery(QueryContainer val) { this._query = val; return this; }

}
