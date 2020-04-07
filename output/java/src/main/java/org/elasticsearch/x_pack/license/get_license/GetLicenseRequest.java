
package org.elasticsearch.x_pack.license.get_license;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class GetLicenseRequest  implements XContentable<GetLicenseRequest> {
  
  static final ParseField LOCAL = new ParseField("local");
  private Boolean _local;
  public Boolean getLocal() { return this._local; }
  public GetLicenseRequest setLocal(Boolean val) { this._local = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public GetLicenseRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return GetLicenseRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<GetLicenseRequest, Void> PARSER =
    new ConstructingObjectParser<>(GetLicenseRequest.class.getName(), false, args -> new GetLicenseRequest());

  static {
    PARSER.declareBoolean(GetLicenseRequest::setLocal, LOCAL);
  }

}
