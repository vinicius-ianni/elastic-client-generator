
package org.elasticsearch.ingest.put_pipeline;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class PutPipelineResponse  implements XContentable<PutPipelineResponse> {
  

  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public PutPipelineResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return PutPipelineResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<PutPipelineResponse, Void> PARSER =
    new ConstructingObjectParser<>(PutPipelineResponse.class.getName(), false, args -> new PutPipelineResponse());

  static {
    
  }

}
