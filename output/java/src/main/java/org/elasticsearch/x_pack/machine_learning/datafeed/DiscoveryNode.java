
package org.elasticsearch.x_pack.machine_learning.datafeed;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class DiscoveryNode  {
  
  private Map<String, String> _attributes;
  public Map<String, String> getAttributes() { return this._attributes; }
  public DiscoveryNode setAttributes(Map<String, String> val) { this._attributes = val; return this; }


  private String _ephemeralId;
  public String getEphemeralId() { return this._ephemeralId; }
  public DiscoveryNode setEphemeralId(String val) { this._ephemeralId = val; return this; }


  private String _id;
  public String getId() { return this._id; }
  public DiscoveryNode setId(String val) { this._id = val; return this; }


  private String _name;
  public String getName() { return this._name; }
  public DiscoveryNode setName(String val) { this._name = val; return this; }


  private String _transportAddress;
  public String getTransportAddress() { return this._transportAddress; }
  public DiscoveryNode setTransportAddress(String val) { this._transportAddress = val; return this; }

}
