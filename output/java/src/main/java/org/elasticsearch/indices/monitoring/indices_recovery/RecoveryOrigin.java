
package org.elasticsearch.indices.monitoring.indices_recovery;

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


public class RecoveryOrigin  implements XContentable<RecoveryOrigin> {
  
  static final ParseField HOSTNAME = new ParseField("hostname");
  private String _hostname;
  public String getHostname() { return this._hostname; }
  public RecoveryOrigin setHostname(String val) { this._hostname = val; return this; }


  static final ParseField ID = new ParseField("id");
  private String _id;
  public String getId() { return this._id; }
  public RecoveryOrigin setId(String val) { this._id = val; return this; }


  static final ParseField IP = new ParseField("ip");
  private String _ip;
  public String getIp() { return this._ip; }
  public RecoveryOrigin setIp(String val) { this._ip = val; return this; }


  static final ParseField NAME = new ParseField("name");
  private String _name;
  public String getName() { return this._name; }
  public RecoveryOrigin setName(String val) { this._name = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    builder.startObject();
    builder.field(HOSTNAME.getPreferredName(), _hostname);
    builder.field(ID.getPreferredName(), _id);
    builder.field(IP.getPreferredName(), _ip);
    builder.field(NAME.getPreferredName(), _name);
    builder.endObject();
    return builder;
  }

  @Override
  public RecoveryOrigin fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return RecoveryOrigin.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<RecoveryOrigin, Void> PARSER =
    new ConstructingObjectParser<>(RecoveryOrigin.class.getName(), false, args -> new RecoveryOrigin());

  static {
    PARSER.declareString(RecoveryOrigin::setHostname, HOSTNAME);
    PARSER.declareString(RecoveryOrigin::setId, ID);
    PARSER.declareString(RecoveryOrigin::setIp, IP);
    PARSER.declareString(RecoveryOrigin::setName, NAME);
  }

}
