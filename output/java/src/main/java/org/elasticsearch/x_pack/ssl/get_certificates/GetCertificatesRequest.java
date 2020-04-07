
package org.elasticsearch.x_pack.ssl.get_certificates;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class GetCertificatesRequest  implements XContentable<GetCertificatesRequest> {
  

  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public GetCertificatesRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return GetCertificatesRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<GetCertificatesRequest, Void> PARSER =
    new ConstructingObjectParser<>(GetCertificatesRequest.class.getName(), false, args -> new GetCertificatesRequest());

  static {
    
  }

}
