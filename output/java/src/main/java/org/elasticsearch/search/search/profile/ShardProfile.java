
package org.elasticsearch.search.search.profile;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.search.search.profile.*;

public class ShardProfile  implements XContentable<ShardProfile> {
  
  static final ParseField AGGREGATIONS = new ParseField("aggregations");
  private List<AggregationProfile> _aggregations;
  public List<AggregationProfile> getAggregations() { return this._aggregations; }
  public ShardProfile setAggregations(List<AggregationProfile> val) { this._aggregations = val; return this; }


  static final ParseField ID = new ParseField("id");
  private String _id;
  public String getId() { return this._id; }
  public ShardProfile setId(String val) { this._id = val; return this; }


  static final ParseField SEARCHES = new ParseField("searches");
  private List<SearchProfile> _searches;
  public List<SearchProfile> getSearches() { return this._searches; }
  public ShardProfile setSearches(List<SearchProfile> val) { this._searches = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ShardProfile fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ShardProfile.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ShardProfile, Void> PARSER =
    new ConstructingObjectParser<>(ShardProfile.class.getName(), false, args -> new ShardProfile());

  static {
    PARSER.declareObjectArray(ShardProfile::setAggregations, (p, t) -> AggregationProfile.PARSER.apply(p), AGGREGATIONS);
    PARSER.declareString(ShardProfile::setId, ID);
    PARSER.declareObjectArray(ShardProfile::setSearches, (p, t) -> SearchProfile.PARSER.apply(p), SEARCHES);
  }

}
