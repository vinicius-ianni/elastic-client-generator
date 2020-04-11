
package org.elasticsearch.x_pack.ilm.delete_lifecycle;

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


public class DeleteLifecycleRequest  implements XContentable<DeleteLifecycleRequest> {
  

  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public DeleteLifecycleRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return DeleteLifecycleRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<DeleteLifecycleRequest, Void> PARSER =
    new ConstructingObjectParser<>(DeleteLifecycleRequest.class.getName(), false, args -> new DeleteLifecycleRequest());

  static {
    
  }

}
