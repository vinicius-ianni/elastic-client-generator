
package org.elasticsearch.x_pack.slm.execute_lifecycle;

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


public class ExecuteSnapshotLifecycleRequest  implements XContentable<ExecuteSnapshotLifecycleRequest> {
  

  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ExecuteSnapshotLifecycleRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ExecuteSnapshotLifecycleRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ExecuteSnapshotLifecycleRequest, Void> PARSER =
    new ConstructingObjectParser<>(ExecuteSnapshotLifecycleRequest.class.getName(), false, args -> new ExecuteSnapshotLifecycleRequest());

  static {
    
  }

}
