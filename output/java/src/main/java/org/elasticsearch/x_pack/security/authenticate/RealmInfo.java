
package org.elasticsearch.x_pack.security.authenticate;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class RealmInfo  {
  
  private String _name;
  public String getName() { return this._name; }
  public RealmInfo setName(String val) { this._name = val; return this; }


  private String _type;
  public String getType() { return this._type; }
  public RealmInfo setType(String val) { this._type = val; return this; }

}
