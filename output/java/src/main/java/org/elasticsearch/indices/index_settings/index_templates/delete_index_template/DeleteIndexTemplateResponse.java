
package org.elasticsearch.indices.index_settings.index_templates.delete_index_template;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class DeleteIndexTemplateResponse  implements XContentable<DeleteIndexTemplateResponse> {
  

  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public DeleteIndexTemplateResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return DeleteIndexTemplateResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<DeleteIndexTemplateResponse, Void> PARSER =
    new ConstructingObjectParser<>(DeleteIndexTemplateResponse.class.getName(), false, args -> new DeleteIndexTemplateResponse());

  static {
    
  }

}
