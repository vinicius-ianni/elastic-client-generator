
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


import org.elasticsearch.x_pack.cross_cluster_replication.auto_follow.get_auto_follow_pattern.*;

public class GetAutoFollowPatternResponse  implements XContentable<GetAutoFollowPatternResponse> {
  
  static final ParseField PATTERNS = new ParseField("patterns");
  private NamedContainer<String, AutoFollowPattern> _patterns;
  public NamedContainer<String, AutoFollowPattern> getPatterns() { return this._patterns; }
  public GetAutoFollowPatternResponse setPatterns(NamedContainer<String, AutoFollowPattern> val) { this._patterns = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public GetAutoFollowPatternResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return GetAutoFollowPatternResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<GetAutoFollowPatternResponse, Void> PARSER =
    new ConstructingObjectParser<>(GetAutoFollowPatternResponse.class.getName(), false, args -> new GetAutoFollowPatternResponse());

  static {
    PARSER.declareObject(GetAutoFollowPatternResponse::setPatterns, (p, t) ->  new NamedContainer<>(n -> () -> n,pp -> AutoFollowPattern.PARSER.apply(pp, null)), PATTERNS);;
  }

}
