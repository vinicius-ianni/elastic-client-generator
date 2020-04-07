
package org.elasticsearch.common;

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
import org.elasticsearch.internal.*;

public class ServerError  implements XContentable<ServerError> {
  
  static final ParseField ERROR = new ParseField("error");
  private MainError _error;
  public MainError getError() { return this._error; }
  public ServerError setError(MainError val) { this._error = val; return this; }


  static final ParseField STATUS = new ParseField("status");
  private Integer _status;
  public Integer getStatus() { return this._status; }
  public ServerError setStatus(Integer val) { this._status = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ServerError fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ServerError.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ServerError, Void> PARSER =
    new ConstructingObjectParser<>(ServerError.class.getName(), false, args -> new ServerError());

  static {
    PARSER.declareObject(ServerError::setError, (p, t) -> MainError.PARSER.apply(p, null), ERROR);
    PARSER.declareInteger(ServerError::setStatus, STATUS);
  }

}
