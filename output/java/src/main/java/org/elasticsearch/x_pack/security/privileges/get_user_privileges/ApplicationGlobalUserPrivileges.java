
package org.elasticsearch.x_pack.security.privileges.get_user_privileges;

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
import org.elasticsearch.x_pack.security.privileges.get_user_privileges.*;

public class ApplicationGlobalUserPrivileges  implements XContentable<ApplicationGlobalUserPrivileges> {
  
  static final ParseField MANAGE = new ParseField("manage");
  private ManageUserPrivileges _manage;
  public ManageUserPrivileges getManage() { return this._manage; }
  public ApplicationGlobalUserPrivileges setManage(ManageUserPrivileges val) { this._manage = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ApplicationGlobalUserPrivileges fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ApplicationGlobalUserPrivileges.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ApplicationGlobalUserPrivileges, Void> PARSER =
    new ConstructingObjectParser<>(ApplicationGlobalUserPrivileges.class.getName(), false, args -> new ApplicationGlobalUserPrivileges());

  static {
    PARSER.declareObject(ApplicationGlobalUserPrivileges::setManage, (p, t) -> ManageUserPrivileges.PARSER.apply(p, t), MANAGE);
  }

}
