
package org.elasticsearch.x_pack.machine_learning.forecast_job;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.common_options.time_unit.*;

public class ForecastJobRequest  implements XContentable<ForecastJobRequest> {
  
  static final ParseField DURATION = new ParseField("duration");
  private Time _duration;
  public Time getDuration() { return this._duration; }
  public ForecastJobRequest setDuration(Time val) { this._duration = val; return this; }


  static final ParseField EXPIRES_IN = new ParseField("expires_in");
  private Time _expiresIn;
  public Time getExpiresIn() { return this._expiresIn; }
  public ForecastJobRequest setExpiresIn(Time val) { this._expiresIn = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ForecastJobRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ForecastJobRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ForecastJobRequest, Void> PARSER =
    new ConstructingObjectParser<>(ForecastJobRequest.class.getName(), false, args -> new ForecastJobRequest());

  static {
    PARSER.declareObject(ForecastJobRequest::setDuration, (p, t) -> Time.PARSER.apply(p, null), DURATION);
    PARSER.declareObject(ForecastJobRequest::setExpiresIn, (p, t) -> Time.PARSER.apply(p, null), EXPIRES_IN);
  }

}
