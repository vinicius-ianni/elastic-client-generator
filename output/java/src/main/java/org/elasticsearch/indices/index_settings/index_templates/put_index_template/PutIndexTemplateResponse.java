
package org.elasticsearch.indices.index_settings.index_templates.put_index_template;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class PutIndexTemplateResponse  implements XContentable<PutIndexTemplateResponse> {
  

  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public PutIndexTemplateResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return PutIndexTemplateResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<PutIndexTemplateResponse, Void> PARSER =
    new ConstructingObjectParser<>(PutIndexTemplateResponse.class.getName(), false, args -> new PutIndexTemplateResponse());

  static {
    
  }

}
