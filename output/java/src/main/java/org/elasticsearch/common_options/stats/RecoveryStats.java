
package org.elasticsearch.common_options.stats;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.internal.*;

public class RecoveryStats  implements XContentable<RecoveryStats> {
  
  static final ParseField CURRENT_AS_SOURCE = new ParseField("current_as_source");
  private Long _currentAsSource;
  public Long getCurrentAsSource() { return this._currentAsSource; }
  public RecoveryStats setCurrentAsSource(Long val) { this._currentAsSource = val; return this; }


  static final ParseField CURRENT_AS_TARGET = new ParseField("current_as_target");
  private Long _currentAsTarget;
  public Long getCurrentAsTarget() { return this._currentAsTarget; }
  public RecoveryStats setCurrentAsTarget(Long val) { this._currentAsTarget = val; return this; }


  static final ParseField THROTTLE_TIME = new ParseField("throttle_time");
  private String _throttleTime;
  public String getThrottleTime() { return this._throttleTime; }
  public RecoveryStats setThrottleTime(String val) { this._throttleTime = val; return this; }


  static final ParseField THROTTLE_TIME_IN_MILLIS = new ParseField("throttle_time_in_millis");
  private Long _throttleTimeInMillis;
  public Long getThrottleTimeInMillis() { return this._throttleTimeInMillis; }
  public RecoveryStats setThrottleTimeInMillis(Long val) { this._throttleTimeInMillis = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public RecoveryStats fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return RecoveryStats.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<RecoveryStats, Void> PARSER =
    new ConstructingObjectParser<>(RecoveryStats.class.getName(), false, args -> new RecoveryStats());

  static {
    PARSER.declareLong(RecoveryStats::setCurrentAsSource, CURRENT_AS_SOURCE);
    PARSER.declareLong(RecoveryStats::setCurrentAsTarget, CURRENT_AS_TARGET);
    PARSER.declareString(RecoveryStats::setThrottleTime, THROTTLE_TIME);
    PARSER.declareLong(RecoveryStats::setThrottleTimeInMillis, THROTTLE_TIME_IN_MILLIS);
  }

}
