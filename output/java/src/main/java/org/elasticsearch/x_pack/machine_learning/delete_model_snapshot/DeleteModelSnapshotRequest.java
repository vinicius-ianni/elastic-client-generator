
package org.elasticsearch.x_pack.machine_learning.delete_model_snapshot;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class DeleteModelSnapshotRequest  implements XContentable<DeleteModelSnapshotRequest> {
  

  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public DeleteModelSnapshotRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return DeleteModelSnapshotRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<DeleteModelSnapshotRequest, Void> PARSER =
    new ConstructingObjectParser<>(DeleteModelSnapshotRequest.class.getName(), false, args -> new DeleteModelSnapshotRequest());

  static {
    
  }

}
