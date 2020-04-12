
package org.elasticsearch.aggregations.pipeline;

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


public class BucketsPath  implements XContentable<BucketsPath> {
  

  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    
    return builder;
  }

  @Override
  public BucketsPath fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return BucketsPath.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<BucketsPath, Void> PARSER =
    new ConstructingObjectParser<>(BucketsPath.class.getName(), false, args -> new BucketsPath());

  static {
    
  }

}
