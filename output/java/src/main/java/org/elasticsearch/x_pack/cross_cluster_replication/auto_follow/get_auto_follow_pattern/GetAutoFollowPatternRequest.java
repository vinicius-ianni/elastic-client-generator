
package org.elasticsearch.x_pack.cross_cluster_replication.auto_follow.get_auto_follow_pattern;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class GetAutoFollowPatternRequest  implements XContentable<GetAutoFollowPatternRequest> {
  

  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public GetAutoFollowPatternRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return GetAutoFollowPatternRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<GetAutoFollowPatternRequest, Void> PARSER =
    new ConstructingObjectParser<>(GetAutoFollowPatternRequest.class.getName(), false, args -> new GetAutoFollowPatternRequest());

  static {
    
  }

}
