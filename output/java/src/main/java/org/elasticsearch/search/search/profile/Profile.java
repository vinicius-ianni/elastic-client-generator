
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

public class Profile  implements XContentable<Profile> {
  
  static final ParseField SHARDS = new ParseField("shards");
  private List<ShardProfile> _shards;
  public List<ShardProfile> getShards() { return this._shards; }
  public Profile setShards(List<ShardProfile> val) { this._shards = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public Profile fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return Profile.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<Profile, Void> PARSER =
    new ConstructingObjectParser<>(Profile.class.getName(), false, args -> new Profile());

  static {
    PARSER.declareObjectArray(Profile::setShards, (p, t) -> ShardProfile.PARSER.apply(p), SHARDS);
  }

}
