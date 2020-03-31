
package org.elasticsearch.search.search.profile;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.search.search.profile.*;

public class ShardProfile  {
  
  private AggregationProfile[] _aggregations;
  public AggregationProfile[] getAggregations() { return this._aggregations; }
  public ShardProfile setAggregations(AggregationProfile[] val) { this._aggregations = val; return this; }


  private String _id;
  public String getId() { return this._id; }
  public ShardProfile setId(String val) { this._id = val; return this; }


  private SearchProfile[] _searches;
  public SearchProfile[] getSearches() { return this._searches; }
  public ShardProfile setSearches(SearchProfile[] val) { this._searches = val; return this; }

}
