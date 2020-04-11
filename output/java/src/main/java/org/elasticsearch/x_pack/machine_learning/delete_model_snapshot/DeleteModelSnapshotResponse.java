
package org.elasticsearch.x_pack.machine_learning.delete_model_snapshot;

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


public class DeleteModelSnapshotResponse  implements XContentable<DeleteModelSnapshotResponse> {
  

  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public DeleteModelSnapshotResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return DeleteModelSnapshotResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<DeleteModelSnapshotResponse, Void> PARSER =
    new ConstructingObjectParser<>(DeleteModelSnapshotResponse.class.getName(), false, args -> new DeleteModelSnapshotResponse());

  static {
    
  }

}
