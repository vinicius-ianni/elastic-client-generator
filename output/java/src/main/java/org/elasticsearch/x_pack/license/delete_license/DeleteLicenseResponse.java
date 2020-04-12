
package org.elasticsearch.x_pack.license.delete_license;

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


public class DeleteLicenseResponse  implements XContentable<DeleteLicenseResponse> {
  

  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    
    return builder;
  }

  @Override
  public DeleteLicenseResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return DeleteLicenseResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<DeleteLicenseResponse, Void> PARSER =
    new ConstructingObjectParser<>(DeleteLicenseResponse.class.getName(), false, args -> new DeleteLicenseResponse());

  static {
    
  }

}
