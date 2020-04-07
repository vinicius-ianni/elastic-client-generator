
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

public class MainError  implements XContentable<MainError> {
  
  static final ParseField HEADERS = new ParseField("headers");
  private NamedContainer<String, String> _headers;
  public NamedContainer<String, String> getHeaders() { return this._headers; }
  public MainError setHeaders(NamedContainer<String, String> val) { this._headers = val; return this; }


  static final ParseField ROOT_CAUSE = new ParseField("root_cause");
  private List<ErrorCause> _rootCause;
  public List<ErrorCause> getRootCause() { return this._rootCause; }
  public MainError setRootCause(List<ErrorCause> val) { this._rootCause = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public MainError fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return MainError.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<MainError, Void> PARSER =
    new ConstructingObjectParser<>(MainError.class.getName(), false, args -> new MainError());

  static {
    PARSER.declareObject(MainError::setHeaders, (p, t) ->  new NamedContainer<>(n -> () -> n,pp -> String.PARSER.apply(pp, null)), HEADERS);;
    PARSER.declareObjectArray(MainError::setRootCause, (p, t) -> ErrorCause.PARSER.apply(p), ROOT_CAUSE);
  }

}
