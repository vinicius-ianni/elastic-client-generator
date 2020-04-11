
package org.elasticsearch.x_pack.slm.delete_lifecycle;

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


public class DeleteSnapshotLifecycleRequest  implements XContentable<DeleteSnapshotLifecycleRequest> {
  

  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public DeleteSnapshotLifecycleRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return DeleteSnapshotLifecycleRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<DeleteSnapshotLifecycleRequest, Void> PARSER =
    new ConstructingObjectParser<>(DeleteSnapshotLifecycleRequest.class.getName(), false, args -> new DeleteSnapshotLifecycleRequest());

  static {
    
  }

}
