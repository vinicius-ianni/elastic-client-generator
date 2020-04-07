
package org.elasticsearch.x_pack.roll_up.start_rollup_job;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class StartRollupJobRequest  implements XContentable<StartRollupJobRequest> {
  

  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public StartRollupJobRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return StartRollupJobRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<StartRollupJobRequest, Void> PARSER =
    new ConstructingObjectParser<>(StartRollupJobRequest.class.getName(), false, args -> new StartRollupJobRequest());

  static {
    
  }

}
