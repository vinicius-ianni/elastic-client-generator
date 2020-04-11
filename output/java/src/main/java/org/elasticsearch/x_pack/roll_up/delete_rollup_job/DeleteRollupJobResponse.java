
package org.elasticsearch.x_pack.roll_up.delete_rollup_job;

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


public class DeleteRollupJobResponse  implements XContentable<DeleteRollupJobResponse> {
  

  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public DeleteRollupJobResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return DeleteRollupJobResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<DeleteRollupJobResponse, Void> PARSER =
    new ConstructingObjectParser<>(DeleteRollupJobResponse.class.getName(), false, args -> new DeleteRollupJobResponse());

  static {
    
  }

}
