
package org.elasticsearch.x_pack.license.delete_license;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class DeleteLicenseRequest  implements XContentable<DeleteLicenseRequest> {
  

  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public DeleteLicenseRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return DeleteLicenseRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<DeleteLicenseRequest, Void> PARSER =
    new ConstructingObjectParser<>(DeleteLicenseRequest.class.getName(), false, args -> new DeleteLicenseRequest());

  static {
    
  }

}
