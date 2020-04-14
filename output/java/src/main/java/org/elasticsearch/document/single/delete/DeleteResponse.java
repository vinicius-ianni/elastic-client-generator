
package org.elasticsearch.document.single.delete;

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


public class DeleteResponse  implements XContentable<DeleteResponse> {
  
  static final ParseField IS_VALID = new ParseField("is_valid");
  private Boolean _isValid;
  public Boolean getIsValid() { return this._isValid; }
  public DeleteResponse setIsValid(Boolean val) { this._isValid = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    builder.startObject();
    if (_isValid != null) {
      builder.field(IS_VALID.getPreferredName(), _isValid);
    }
    builder.endObject();
    return builder;
  }

  @Override
  public DeleteResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return DeleteResponse.PARSER.apply(parser, null);
  }

  public static final ObjectParser<DeleteResponse, Void> PARSER =
    new ObjectParser<>(DeleteResponse.class.getName(), false, DeleteResponse::new);

  static {
    PARSER.declareBoolean(DeleteResponse::setIsValid, IS_VALID);
  }

}
