
package org.elasticsearch.x_pack.security.privileges.put_privileges;

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
import org.elasticsearch.x_pack.security.privileges.put_privileges.*;

public class PutPrivilegesRequest  implements XContentable<PutPrivilegesRequest> {
  
  static final ParseField REFRESH = new ParseField("refresh");
  private Refresh _refresh;
  public Refresh getRefresh() { return this._refresh; }
  public PutPrivilegesRequest setRefresh(Refresh val) { this._refresh = val; return this; }


  static final ParseField APPLICATIONS = new ParseField("applications");
  private NamedContainer<String, NamedContainer<String, PrivilegesActions>> _applications;
  public NamedContainer<String, NamedContainer<String, PrivilegesActions>> getApplications() { return this._applications; }
  public PutPrivilegesRequest setApplications(NamedContainer<String, NamedContainer<String, PrivilegesActions>> val) { this._applications = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public PutPrivilegesRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return PutPrivilegesRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<PutPrivilegesRequest, Void> PARSER =
    new ConstructingObjectParser<>(PutPrivilegesRequest.class.getName(), false, args -> new PutPrivilegesRequest());

  static {
    PARSER.declareObject(PutPrivilegesRequest::setRefresh, (p, t) -> Refresh.PARSER.apply(p), REFRESH);
    PARSER.declareObject(PutPrivilegesRequest::setApplications, (p, t) -> new NamedContainer<>(n -> () -> n,null /* TODO NamedContainer<String, PrivilegesActions> */), APPLICATIONS);
  }

}
