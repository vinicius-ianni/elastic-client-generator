
package org.elasticsearch.search.search.profile;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.search.search.profile.*;

public class Profile  {
  
  private ShardProfile[] _shards;
  public ShardProfile[] getShards() { return this._shards; }
  public Profile setShards(ShardProfile[] val) { this._shards = val; return this; }

}
