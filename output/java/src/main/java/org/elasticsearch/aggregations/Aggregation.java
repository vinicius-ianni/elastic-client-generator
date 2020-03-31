
package org.elasticsearch.aggregations;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class Aggregation  {
  
  private Map<String, Object> _meta;
  public Map<String, Object> getMeta() { return this._meta; }
  public Aggregation setMeta(Map<String, Object> val) { this._meta = val; return this; }


  private String _name;
  public String getName() { return this._name; }
  public Aggregation setName(String val) { this._name = val; return this; }

}
