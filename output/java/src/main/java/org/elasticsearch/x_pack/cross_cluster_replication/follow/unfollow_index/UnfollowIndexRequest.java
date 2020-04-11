
package org.elasticsearch.x_pack.cross_cluster_replication.follow.unfollow_index;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


public class UnfollowIndexRequest  implements XContentable<UnfollowIndexRequest> {
  

  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public UnfollowIndexRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return UnfollowIndexRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<UnfollowIndexRequest, Void> PARSER =
    new ConstructingObjectParser<>(UnfollowIndexRequest.class.getName(), false, args -> new UnfollowIndexRequest());

  static {
    
  }

}
