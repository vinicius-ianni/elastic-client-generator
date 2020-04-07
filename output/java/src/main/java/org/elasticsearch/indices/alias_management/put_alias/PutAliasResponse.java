
package org.elasticsearch.indices.alias_management.put_alias;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class PutAliasResponse  implements XContentable<PutAliasResponse> {
  

  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public PutAliasResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return PutAliasResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<PutAliasResponse, Void> PARSER =
    new ConstructingObjectParser<>(PutAliasResponse.class.getName(), false, args -> new PutAliasResponse());

  static {
    
  }

}
