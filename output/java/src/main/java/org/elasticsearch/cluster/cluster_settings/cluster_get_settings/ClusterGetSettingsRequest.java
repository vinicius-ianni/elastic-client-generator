
package org.elasticsearch.cluster.cluster_settings.cluster_get_settings;

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

public class ClusterGetSettingsRequest  implements XContentable<ClusterGetSettingsRequest> {
  
  static final ParseField FLAT_SETTINGS = new ParseField("flat_settings");
  private Boolean _flatSettings;
  public Boolean getFlatSettings() { return this._flatSettings; }
  public ClusterGetSettingsRequest setFlatSettings(Boolean val) { this._flatSettings = val; return this; }


  static final ParseField INCLUDE_DEFAULTS = new ParseField("include_defaults");
  private Boolean _includeDefaults;
  public Boolean getIncludeDefaults() { return this._includeDefaults; }
  public ClusterGetSettingsRequest setIncludeDefaults(Boolean val) { this._includeDefaults = val; return this; }


  static final ParseField MASTER_TIMEOUT = new ParseField("master_timeout");
  private Time _masterTimeout;
  public Time getMasterTimeout() { return this._masterTimeout; }
  public ClusterGetSettingsRequest setMasterTimeout(Time val) { this._masterTimeout = val; return this; }


  static final ParseField TIMEOUT = new ParseField("timeout");
  private Time _timeout;
  public Time getTimeout() { return this._timeout; }
  public ClusterGetSettingsRequest setTimeout(Time val) { this._timeout = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ClusterGetSettingsRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ClusterGetSettingsRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ClusterGetSettingsRequest, Void> PARSER =
    new ConstructingObjectParser<>(ClusterGetSettingsRequest.class.getName(), false, args -> new ClusterGetSettingsRequest());

  static {
    PARSER.declareBoolean(ClusterGetSettingsRequest::setFlatSettings, FLAT_SETTINGS);
    PARSER.declareBoolean(ClusterGetSettingsRequest::setIncludeDefaults, INCLUDE_DEFAULTS);
    PARSER.declareObject(ClusterGetSettingsRequest::setMasterTimeout, (p, t) -> Time.PARSER.apply(p, null), MASTER_TIMEOUT);
    PARSER.declareObject(ClusterGetSettingsRequest::setTimeout, (p, t) -> Time.PARSER.apply(p, null), TIMEOUT);
  }

}
