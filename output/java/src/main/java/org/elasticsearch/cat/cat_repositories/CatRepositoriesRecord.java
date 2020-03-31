
package org.elasticsearch.cat.cat_repositories;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class CatRepositoriesRecord  {
  
  private String _id;
  public String getId() { return this._id; }
  public CatRepositoriesRecord setId(String val) { this._id = val; return this; }


  private String _type;
  public String getType() { return this._type; }
  public CatRepositoriesRecord setType(String val) { this._type = val; return this; }

}
