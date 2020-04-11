
package org.elasticsearch.common_abstractions.response;

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
import org.elasticsearch.common.*;

public class ResponseBase  implements XContentable<ResponseBase> {
  
  static final ParseField ERROR = new ParseField("error");
  private ServerError _error;
  public ServerError getError() { return this._error; }
  public ResponseBase setError(ServerError val) { this._error = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ResponseBase fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ResponseBase.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ResponseBase, Void> PARSER =
    new ConstructingObjectParser<>(ResponseBase.class.getName(), false, args -> new ResponseBase());

  static {
    PARSER.declareObject(ResponseBase::setError, (p, t) -> ServerError.PARSER.apply(p, t), ERROR);
  }

}
