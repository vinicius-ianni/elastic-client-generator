
package org.elasticsearch.modules.snapshot_and_restore.repositories.delete_repository;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class DeleteRepositoryResponse  implements XContentable<DeleteRepositoryResponse> {
  

  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public DeleteRepositoryResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return DeleteRepositoryResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<DeleteRepositoryResponse, Void> PARSER =
    new ConstructingObjectParser<>(DeleteRepositoryResponse.class.getName(), false, args -> new DeleteRepositoryResponse());

  static {
    
  }

}
