
package org.elasticsearch.x_pack.roll_up.delete_rollup_job;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class DeleteRollupJobRequest  implements XContentable<DeleteRollupJobRequest> {
  

  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public DeleteRollupJobRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return DeleteRollupJobRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<DeleteRollupJobRequest, Void> PARSER =
    new ConstructingObjectParser<>(DeleteRollupJobRequest.class.getName(), false, args -> new DeleteRollupJobRequest());

  static {
    
  }

}
