
package org.elasticsearch.document.single.create;

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


public class CreateResponse  implements XContentable<CreateResponse> {
  
  static final ParseField IS_VALID = new ParseField("is_valid");
  private Boolean _isValid;
  public Boolean getIsValid() { return this._isValid; }
  public CreateResponse setIsValid(Boolean val) { this._isValid = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    builder.field(IS_VALID.getPreferredName(), _isValid);
    return builder;
  }

  @Override
  public CreateResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return CreateResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<CreateResponse, Void> PARSER =
    new ConstructingObjectParser<>(CreateResponse.class.getName(), false, args -> new CreateResponse());

  static {
    PARSER.declareBoolean(CreateResponse::setIsValid, IS_VALID);
  }

}
