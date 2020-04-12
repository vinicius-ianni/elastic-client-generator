
package org.elasticsearch.x_pack.cross_cluster_replication.stats;

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
import org.elasticsearch.x_pack.cross_cluster_replication.follow.follow_index_stats.*;

public class CcrFollowStats  implements XContentable<CcrFollowStats> {
  
  static final ParseField INDICES = new ParseField("indices");
  private List<FollowIndexStats> _indices;
  public List<FollowIndexStats> getIndices() { return this._indices; }
  public CcrFollowStats setIndices(List<FollowIndexStats> val) { this._indices = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    if (_indices != null) {
      builder.array(INDICES.getPreferredName(), _indices);
    }
    return builder;
  }

  @Override
  public CcrFollowStats fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return CcrFollowStats.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<CcrFollowStats, Void> PARSER =
    new ConstructingObjectParser<>(CcrFollowStats.class.getName(), false, args -> new CcrFollowStats());

  static {
    PARSER.declareObjectArray(CcrFollowStats::setIndices, (p, t) -> FollowIndexStats.PARSER.apply(p, t), INDICES);
  }

}
