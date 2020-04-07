
package org.elasticsearch.common_abstractions.response;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.common.*;

public class IResponse  implements XContentable<IResponse> {
  
  static final ParseField ERROR = new ParseField("error");
  private ServerError _error;
  public ServerError getError() { return this._error; }
  public IResponse setError(ServerError val) { this._error = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public IResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return IResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<IResponse, Void> PARSER =
    new ConstructingObjectParser<>(IResponse.class.getName(), false, args -> new IResponse());

  static {
    PARSER.declareObject(IResponse::setError, (p, t) -> ServerError.PARSER.apply(p, null), ERROR);
  }

}
