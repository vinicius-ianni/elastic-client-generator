
package org.elasticsearch.x_pack.machine_learning.delete_expired_data;

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


public class DeleteExpiredDataResponse  implements XContentable<DeleteExpiredDataResponse> {
  
  static final ParseField DELETED = new ParseField("deleted");
  private Boolean _deleted;
  public Boolean getDeleted() { return this._deleted; }
  public DeleteExpiredDataResponse setDeleted(Boolean val) { this._deleted = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public DeleteExpiredDataResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return DeleteExpiredDataResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<DeleteExpiredDataResponse, Void> PARSER =
    new ConstructingObjectParser<>(DeleteExpiredDataResponse.class.getName(), false, args -> new DeleteExpiredDataResponse());

  static {
    PARSER.declareBoolean(DeleteExpiredDataResponse::setDeleted, DELETED);
  }

}
