
package org.elasticsearch.x_pack.cross_cluster_replication.follow.resume_follow_index;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class ResumeFollowIndexResponse  implements XContentable<ResumeFollowIndexResponse> {
  

  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ResumeFollowIndexResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ResumeFollowIndexResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ResumeFollowIndexResponse, Void> PARSER =
    new ConstructingObjectParser<>(ResumeFollowIndexResponse.class.getName(), false, args -> new ResumeFollowIndexResponse());

  static {
    
  }

}
