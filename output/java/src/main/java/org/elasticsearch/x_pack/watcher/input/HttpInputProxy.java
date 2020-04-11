
package org.elasticsearch.x_pack.watcher.input;

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
import org.elasticsearch.internal.*;

public class HttpInputProxy  implements XContentable<HttpInputProxy> {
  
  static final ParseField HOST = new ParseField("host");
  private String _host;
  public String getHost() { return this._host; }
  public HttpInputProxy setHost(String val) { this._host = val; return this; }


  static final ParseField PORT = new ParseField("port");
  private Integer _port;
  public Integer getPort() { return this._port; }
  public HttpInputProxy setPort(Integer val) { this._port = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public HttpInputProxy fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return HttpInputProxy.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<HttpInputProxy, Void> PARSER =
    new ConstructingObjectParser<>(HttpInputProxy.class.getName(), false, args -> new HttpInputProxy());

  static {
    PARSER.declareString(HttpInputProxy::setHost, HOST);
    PARSER.declareInt(HttpInputProxy::setPort, PORT);
  }

}
