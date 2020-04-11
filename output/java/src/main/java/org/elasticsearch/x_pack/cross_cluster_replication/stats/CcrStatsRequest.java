
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


public class CcrStatsRequest  implements XContentable<CcrStatsRequest> {
  

  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public CcrStatsRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return CcrStatsRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<CcrStatsRequest, Void> PARSER =
    new ConstructingObjectParser<>(CcrStatsRequest.class.getName(), false, args -> new CcrStatsRequest());

  static {
    
  }

}
