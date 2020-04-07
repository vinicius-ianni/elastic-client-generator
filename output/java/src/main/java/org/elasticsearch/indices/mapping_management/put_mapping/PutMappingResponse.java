
package org.elasticsearch.indices.mapping_management.put_mapping;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class PutMappingResponse  implements XContentable<PutMappingResponse> {
  

  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public PutMappingResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return PutMappingResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<PutMappingResponse, Void> PARSER =
    new ConstructingObjectParser<>(PutMappingResponse.class.getName(), false, args -> new PutMappingResponse());

  static {
    
  }

}
