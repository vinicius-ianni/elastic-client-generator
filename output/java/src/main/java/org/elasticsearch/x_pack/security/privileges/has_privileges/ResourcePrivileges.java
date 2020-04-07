
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




public class ResourcePrivileges  implements XContentable<ResourcePrivileges> {
  
  static final ParseField PRIVILEGES = new ParseField("privileges");
  private NamedContainer<String, Boolean> _privileges;
  public NamedContainer<String, Boolean> getPrivileges() { return this._privileges; }
  public ResourcePrivileges setPrivileges(NamedContainer<String, Boolean> val) { this._privileges = val; return this; }


  static final ParseField RESOURCE = new ParseField("resource");
  private String _resource;
  public String getResource() { return this._resource; }
  public ResourcePrivileges setResource(String val) { this._resource = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ResourcePrivileges fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ResourcePrivileges.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ResourcePrivileges, Void> PARSER =
    new ConstructingObjectParser<>(ResourcePrivileges.class.getName(), false, args -> new ResourcePrivileges());

  static {
    PARSER.declareObject(ResourcePrivileges::setPrivileges, (p, t) ->  new NamedContainer<>(n -> () -> n,pp -> Boolean.PARSER.apply(pp, null)), PRIVILEGES);;
    PARSER.declareString(ResourcePrivileges::setResource, RESOURCE);
  }

}
