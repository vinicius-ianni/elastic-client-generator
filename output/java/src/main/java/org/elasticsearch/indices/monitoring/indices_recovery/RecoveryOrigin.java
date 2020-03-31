
package org.elasticsearch.indices.monitoring.indices_recovery;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class RecoveryOrigin  {
  
  private String _hostname;
  public String getHostname() { return this._hostname; }
  public RecoveryOrigin setHostname(String val) { this._hostname = val; return this; }


  private String _id;
  public String getId() { return this._id; }
  public RecoveryOrigin setId(String val) { this._id = val; return this; }


  private String _ip;
  public String getIp() { return this._ip; }
  public RecoveryOrigin setIp(String val) { this._ip = val; return this; }


  private String _name;
  public String getName() { return this._name; }
  public RecoveryOrigin setName(String val) { this._name = val; return this; }

}
