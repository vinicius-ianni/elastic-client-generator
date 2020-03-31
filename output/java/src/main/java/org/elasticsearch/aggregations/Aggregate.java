
package org.elasticsearch.aggregations;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class Aggregate  {
  
  private Map<String, Object> _meta;
  public Map<String, Object> getMeta() { return this._meta; }
  public Aggregate setMeta(Map<String, Object> val) { this._meta = val; return this; }

}
