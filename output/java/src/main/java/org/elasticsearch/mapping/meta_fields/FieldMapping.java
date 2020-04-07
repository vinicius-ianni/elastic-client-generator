
package org.elasticsearch.mapping.meta_fields;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class FieldMapping  implements XContentable<FieldMapping> {
  

  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public FieldMapping fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return FieldMapping.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<FieldMapping, Void> PARSER =
    new ConstructingObjectParser<>(FieldMapping.class.getName(), false, args -> new FieldMapping());

  static {
    
  }

}
