
package org.elasticsearch.x_pack.roll_up.rollup_search;

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


public class RollupSearchResponse<TDocument>  implements XContentable<RollupSearchResponse<TDocument>> {
  

  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    
    return builder;
  }

  @Override
  public RollupSearchResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return RollupSearchResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<RollupSearchResponse, Void> PARSER =
    new ConstructingObjectParser<>(RollupSearchResponse.class.getName(), false, args -> new RollupSearchResponse());

  static {
    
  }

}
