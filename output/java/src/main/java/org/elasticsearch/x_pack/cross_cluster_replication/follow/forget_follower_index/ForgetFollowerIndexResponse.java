
package org.elasticsearch.x_pack.cross_cluster_replication.follow.forget_follower_index;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.common_options.hit.*;

public class ForgetFollowerIndexResponse  implements XContentable<ForgetFollowerIndexResponse> {
  
  static final ParseField SHARDS = new ParseField("_shards");
  private ShardStatistics _shards;
  public ShardStatistics getShards() { return this._shards; }
  public ForgetFollowerIndexResponse setShards(ShardStatistics val) { this._shards = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ForgetFollowerIndexResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ForgetFollowerIndexResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ForgetFollowerIndexResponse, Void> PARSER =
    new ConstructingObjectParser<>(ForgetFollowerIndexResponse.class.getName(), false, args -> new ForgetFollowerIndexResponse());

  static {
    PARSER.declareObject(ForgetFollowerIndexResponse::setShards, (p, t) -> ShardStatistics.PARSER.apply(p, null), SHARDS);
  }

}
