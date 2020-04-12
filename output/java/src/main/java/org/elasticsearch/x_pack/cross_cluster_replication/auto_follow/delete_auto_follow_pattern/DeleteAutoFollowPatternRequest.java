
package org.elasticsearch.x_pack.cross_cluster_replication.auto_follow.delete_auto_follow_pattern;

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


public class DeleteAutoFollowPatternRequest  implements XContentable<DeleteAutoFollowPatternRequest> {
  

  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    
    return builder;
  }

  @Override
  public DeleteAutoFollowPatternRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return DeleteAutoFollowPatternRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<DeleteAutoFollowPatternRequest, Void> PARSER =
    new ConstructingObjectParser<>(DeleteAutoFollowPatternRequest.class.getName(), false, args -> new DeleteAutoFollowPatternRequest());

  static {
    
  }

}
