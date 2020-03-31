
package org.elasticsearch.cat.cat_master;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class CatMasterRecord  {
  
  private String _id;
  public String getId() { return this._id; }
  public CatMasterRecord setId(String val) { this._id = val; return this; }


  private String _ip;
  public String getIp() { return this._ip; }
  public CatMasterRecord setIp(String val) { this._ip = val; return this; }


  private String _node;
  public String getNode() { return this._node; }
  public CatMasterRecord setNode(String val) { this._node = val; return this; }

}
