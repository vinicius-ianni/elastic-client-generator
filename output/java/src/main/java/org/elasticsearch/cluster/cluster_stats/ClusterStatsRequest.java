
package org.elasticsearch.cluster.cluster_stats;

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
import org.elasticsearch.common_options.time_unit.*;

public class ClusterStatsRequest  implements XContentable<ClusterStatsRequest> {
  
  static final ParseField FLAT_SETTINGS = new ParseField("flat_settings");
  private Boolean _flatSettings;
  public Boolean getFlatSettings() { return this._flatSettings; }
  public ClusterStatsRequest setFlatSettings(Boolean val) { this._flatSettings = val; return this; }


  static final ParseField TIMEOUT = new ParseField("timeout");
  private Time _timeout;
  public Time getTimeout() { return this._timeout; }
  public ClusterStatsRequest setTimeout(Time val) { this._timeout = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ClusterStatsRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ClusterStatsRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ClusterStatsRequest, Void> PARSER =
    new ConstructingObjectParser<>(ClusterStatsRequest.class.getName(), false, args -> new ClusterStatsRequest());

  static {
    PARSER.declareBoolean(ClusterStatsRequest::setFlatSettings, FLAT_SETTINGS);
    PARSER.declareObject(ClusterStatsRequest::setTimeout, (p, t) -> Time.PARSER.apply(p, t), TIMEOUT);
  }

}
