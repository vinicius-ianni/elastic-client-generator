
package org.elasticsearch.x_pack.license.post_license;

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
import org.elasticsearch.x_pack.license.post_license.*;
import org.elasticsearch.x_pack.license.get_license.*;

public class PostLicenseResponse  implements XContentable<PostLicenseResponse> {
  
  static final ParseField ACKNOWLEDGE = new ParseField("acknowledge");
  private LicenseAcknowledgement _acknowledge;
  public LicenseAcknowledgement getAcknowledge() { return this._acknowledge; }
  public PostLicenseResponse setAcknowledge(LicenseAcknowledgement val) { this._acknowledge = val; return this; }


  static final ParseField ACKNOWLEDGED = new ParseField("acknowledged");
  private Boolean _acknowledged;
  public Boolean getAcknowledged() { return this._acknowledged; }
  public PostLicenseResponse setAcknowledged(Boolean val) { this._acknowledged = val; return this; }


  static final ParseField LICENSE_STATUS = new ParseField("license_status");
  private LicenseStatus _licenseStatus;
  public LicenseStatus getLicenseStatus() { return this._licenseStatus; }
  public PostLicenseResponse setLicenseStatus(LicenseStatus val) { this._licenseStatus = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public PostLicenseResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return PostLicenseResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<PostLicenseResponse, Void> PARSER =
    new ConstructingObjectParser<>(PostLicenseResponse.class.getName(), false, args -> new PostLicenseResponse());

  static {
    PARSER.declareObject(PostLicenseResponse::setAcknowledge, (p, t) -> LicenseAcknowledgement.PARSER.apply(p, t), ACKNOWLEDGE);
    PARSER.declareBoolean(PostLicenseResponse::setAcknowledged, ACKNOWLEDGED);
    PARSER.declareObject(PostLicenseResponse::setLicenseStatus, (p, t) -> LicenseStatus.PARSER.apply(p), LICENSE_STATUS);
  }

}
