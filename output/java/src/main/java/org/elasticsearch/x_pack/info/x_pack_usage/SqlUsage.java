
package org.elasticsearch.x_pack.info.x_pack_usage;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.x_pack.info.x_pack_usage.*;

public class SqlUsage  {
  
  private Map<String, Integer> _features;
  public Map<String, Integer> getFeatures() { return this._features; }
  public SqlUsage setFeatures(Map<String, Integer> val) { this._features = val; return this; }


  private Map<String, QueryUsage> _queries;
  public Map<String, QueryUsage> getQueries() { return this._queries; }
  public SqlUsage setQueries(Map<String, QueryUsage> val) { this._queries = val; return this; }

}
