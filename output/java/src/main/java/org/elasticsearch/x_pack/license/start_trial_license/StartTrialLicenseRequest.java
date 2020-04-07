
package org.elasticsearch.x_pack.license.start_trial_license;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class StartTrialLicenseRequest  implements XContentable<StartTrialLicenseRequest> {
  
  static final ParseField ACKNOWLEDGE = new ParseField("acknowledge");
  private Boolean _acknowledge;
  public Boolean getAcknowledge() { return this._acknowledge; }
  public StartTrialLicenseRequest setAcknowledge(Boolean val) { this._acknowledge = val; return this; }


  static final ParseField TYPE_QUERY_STRING = new ParseField("type_query_string");
  private String _typeQueryString;
  public String getTypeQueryString() { return this._typeQueryString; }
  public StartTrialLicenseRequest setTypeQueryString(String val) { this._typeQueryString = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public StartTrialLicenseRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return StartTrialLicenseRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<StartTrialLicenseRequest, Void> PARSER =
    new ConstructingObjectParser<>(StartTrialLicenseRequest.class.getName(), false, args -> new StartTrialLicenseRequest());

  static {
    PARSER.declareBoolean(StartTrialLicenseRequest::setAcknowledge, ACKNOWLEDGE);
    PARSER.declareString(StartTrialLicenseRequest::setTypeQueryString, TYPE_QUERY_STRING);
  }

}
