
package org.elasticsearch.search.search_shards;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class SearchNode  {
  
  private String _name;
  public String getName() { return this._name; }
  public SearchNode setName(String val) { this._name = val; return this; }


  private String _transportAddress;
  public String getTransportAddress() { return this._transportAddress; }
  public SearchNode setTransportAddress(String val) { this._transportAddress = val; return this; }

}
