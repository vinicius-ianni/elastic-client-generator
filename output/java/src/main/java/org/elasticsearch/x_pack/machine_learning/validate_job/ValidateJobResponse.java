
package org.elasticsearch.x_pack.machine_learning.validate_job;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class ValidateJobResponse  implements XContentable<ValidateJobResponse> {
  

  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ValidateJobResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ValidateJobResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ValidateJobResponse, Void> PARSER =
    new ConstructingObjectParser<>(ValidateJobResponse.class.getName(), false, args -> new ValidateJobResponse());

  static {
    
  }

}
