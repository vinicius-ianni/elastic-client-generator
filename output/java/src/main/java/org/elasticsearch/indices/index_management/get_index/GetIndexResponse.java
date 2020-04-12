
package org.elasticsearch.indices.index_management.get_index;

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
import org.elasticsearch.common_abstractions.response.*;
import org.elasticsearch.common_abstractions.infer.index_name.*;
import org.elasticsearch.index_modules.index_settings.*;

public class GetIndexResponse extends DictionaryResponseBase<IndexName, IndexState> implements XContentable<GetIndexResponse> {
  

  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    builder.startObject();
    
    builder.endObject();
    return builder;
  }

  @Override
  public GetIndexResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return GetIndexResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<GetIndexResponse, Void> PARSER =
    new ConstructingObjectParser<>(GetIndexResponse.class.getName(), false, args -> new GetIndexResponse());

  static {
    
  }

}
