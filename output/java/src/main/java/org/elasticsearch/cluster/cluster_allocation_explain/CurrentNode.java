
package org.elasticsearch.cluster.cluster_allocation_explain;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class CurrentNode  {
  
  private String _id;
  public String getId() { return this._id; }
  public CurrentNode setId(String val) { this._id = val; return this; }


  private String _name;
  public String getName() { return this._name; }
  public CurrentNode setName(String val) { this._name = val; return this; }


  private Map<String, String> _attributes;
  public Map<String, String> getAttributes() { return this._attributes; }
  public CurrentNode setAttributes(Map<String, String> val) { this._attributes = val; return this; }


  private String _transportAddress;
  public String getTransportAddress() { return this._transportAddress; }
  public CurrentNode setTransportAddress(String val) { this._transportAddress = val; return this; }


  private Integer _weightRanking;
  public Integer getWeightRanking() { return this._weightRanking; }
  public CurrentNode setWeightRanking(Integer val) { this._weightRanking = val; return this; }

}
