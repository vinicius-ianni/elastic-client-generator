
package org.elasticsearch.x_pack.sql.query_sql;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class SqlColumn  {
  
  private String _name;
  public String getName() { return this._name; }
  public SqlColumn setName(String val) { this._name = val; return this; }


  private String _type;
  public String getType() { return this._type; }
  public SqlColumn setType(String val) { this._type = val; return this; }

}
