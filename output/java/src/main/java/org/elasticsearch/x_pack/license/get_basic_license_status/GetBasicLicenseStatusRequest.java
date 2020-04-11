
package org.elasticsearch.x_pack.license.get_basic_license_status;

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


public class GetBasicLicenseStatusRequest  implements XContentable<GetBasicLicenseStatusRequest> {
  

  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public GetBasicLicenseStatusRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return GetBasicLicenseStatusRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<GetBasicLicenseStatusRequest, Void> PARSER =
    new ConstructingObjectParser<>(GetBasicLicenseStatusRequest.class.getName(), false, args -> new GetBasicLicenseStatusRequest());

  static {
    
  }

}
