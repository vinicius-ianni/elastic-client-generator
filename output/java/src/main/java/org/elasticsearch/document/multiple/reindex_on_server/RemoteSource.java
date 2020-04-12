
package org.elasticsearch.document.multiple.reindex_on_server;

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

public class RemoteSource  implements XContentable<RemoteSource> {
  
  static final ParseField HOST = new ParseField("host");
  private Uri _host;
  public Uri getHost() { return this._host; }
  public RemoteSource setHost(Uri val) { this._host = val; return this; }


  static final ParseField PASSWORD = new ParseField("password");
  private String _password;
  public String getPassword() { return this._password; }
  public RemoteSource setPassword(String val) { this._password = val; return this; }


  static final ParseField USERNAME = new ParseField("username");
  private String _username;
  public String getUsername() { return this._username; }
  public RemoteSource setUsername(String val) { this._username = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    builder.field(HOST.getPreferredName());
    _host.toXContent(builder, params);
    builder.field(PASSWORD.getPreferredName(), _password);
    builder.field(USERNAME.getPreferredName(), _username);
    return builder;
  }

  @Override
  public RemoteSource fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return RemoteSource.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<RemoteSource, Void> PARSER =
    new ConstructingObjectParser<>(RemoteSource.class.getName(), false, args -> new RemoteSource());

  static {
    PARSER.declareObject(RemoteSource::setHost, (p, t) -> Uri.createFrom(p), HOST);
    PARSER.declareString(RemoteSource::setPassword, PASSWORD);
    PARSER.declareString(RemoteSource::setUsername, USERNAME);
  }

}
