
package org.elasticsearch.x_pack.security.privileges.has_privileges;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class ApplicationPrivilegesCheck  implements XContentable<ApplicationPrivilegesCheck> {
  
  static final ParseField APPLICATION = new ParseField("application");
  private String _application;
  public String getApplication() { return this._application; }
  public ApplicationPrivilegesCheck setApplication(String val) { this._application = val; return this; }


  static final ParseField PRIVILEGES = new ParseField("privileges");
  private List<String> _privileges;
  public List<String> getPrivileges() { return this._privileges; }
  public ApplicationPrivilegesCheck setPrivileges(List<String> val) { this._privileges = val; return this; }


  static final ParseField RESOURCES = new ParseField("resources");
  private List<String> _resources;
  public List<String> getResources() { return this._resources; }
  public ApplicationPrivilegesCheck setResources(List<String> val) { this._resources = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ApplicationPrivilegesCheck fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ApplicationPrivilegesCheck.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ApplicationPrivilegesCheck, Void> PARSER =
    new ConstructingObjectParser<>(ApplicationPrivilegesCheck.class.getName(), false, args -> new ApplicationPrivilegesCheck());

  static {
    PARSER.declareString(ApplicationPrivilegesCheck::setApplication, APPLICATION);
    PARSER.declareStringArray(ApplicationPrivilegesCheck::setPrivileges, PRIVILEGES);
    PARSER.declareStringArray(ApplicationPrivilegesCheck::setResources, RESOURCES);
  }

}
