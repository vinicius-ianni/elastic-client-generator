
package org.elasticsearch.query_dsl.specialized.rank_feature;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.query_dsl.specialized.rank_feature.*;

public class RankFeatureQuery  {
  
  private RankFeatureFunction _function;
  public RankFeatureFunction getFunction() { return this._function; }
  public RankFeatureQuery setFunction(RankFeatureFunction val) { this._function = val; return this; }

}
