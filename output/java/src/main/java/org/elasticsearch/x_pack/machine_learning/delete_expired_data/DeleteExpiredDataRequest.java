
package org.elasticsearch.x_pack.machine_learning.delete_expired_data;

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


public class DeleteExpiredDataRequest  implements XContentable<DeleteExpiredDataRequest> {
  

  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    
    return builder;
  }

  @Override
  public DeleteExpiredDataRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return DeleteExpiredDataRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<DeleteExpiredDataRequest, Void> PARSER =
    new ConstructingObjectParser<>(DeleteExpiredDataRequest.class.getName(), false, args -> new DeleteExpiredDataRequest());

  static {
    
  }

}
