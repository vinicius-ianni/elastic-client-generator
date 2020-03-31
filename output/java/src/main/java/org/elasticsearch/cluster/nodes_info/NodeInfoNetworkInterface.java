
package org.elasticsearch.cluster.nodes_info;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class NodeInfoNetworkInterface  {
  
  private String _address;
  public String getAddress() { return this._address; }
  public NodeInfoNetworkInterface setAddress(String val) { this._address = val; return this; }


  private String _macAddress;
  public String getMacAddress() { return this._macAddress; }
  public NodeInfoNetworkInterface setMacAddress(String val) { this._macAddress = val; return this; }


  private String _name;
  public String getName() { return this._name; }
  public NodeInfoNetworkInterface setName(String val) { this._name = val; return this; }

}
