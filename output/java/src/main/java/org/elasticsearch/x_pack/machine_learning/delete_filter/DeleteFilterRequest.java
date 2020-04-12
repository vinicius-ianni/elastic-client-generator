
package org.elasticsearch.x_pack.machine_learning.delete_filter;

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


public class DeleteFilterRequest  implements XContentable<DeleteFilterRequest> {
  

  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    builder.startObject();
    
    builder.endObject();
    return builder;
  }

  @Override
  public DeleteFilterRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return DeleteFilterRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<DeleteFilterRequest, Void> PARSER =
    new ConstructingObjectParser<>(DeleteFilterRequest.class.getName(), false, args -> new DeleteFilterRequest());

  static {
    
  }

}
