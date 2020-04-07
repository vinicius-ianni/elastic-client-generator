
package org.elasticsearch.search;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class TypedSearchRequest  implements XContentable<TypedSearchRequest> {
  

  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public TypedSearchRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return TypedSearchRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<TypedSearchRequest, Void> PARSER =
    new ConstructingObjectParser<>(TypedSearchRequest.class.getName(), false, args -> new TypedSearchRequest());

  static {
    
  }

}
