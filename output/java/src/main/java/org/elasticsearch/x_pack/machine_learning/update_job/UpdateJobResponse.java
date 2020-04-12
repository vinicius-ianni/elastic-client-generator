
package org.elasticsearch.x_pack.machine_learning.update_job;

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


public class UpdateJobResponse  implements XContentable<UpdateJobResponse> {
  

  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    
    return builder;
  }

  @Override
  public UpdateJobResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return UpdateJobResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<UpdateJobResponse, Void> PARSER =
    new ConstructingObjectParser<>(UpdateJobResponse.class.getName(), false, args -> new UpdateJobResponse());

  static {
    
  }

}
