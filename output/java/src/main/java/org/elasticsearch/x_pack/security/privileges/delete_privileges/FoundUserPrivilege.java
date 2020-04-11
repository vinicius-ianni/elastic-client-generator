
package org.elasticsearch.x_pack.security.privileges.delete_privileges;

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


public class FoundUserPrivilege  implements XContentable<FoundUserPrivilege> {
  
  static final ParseField FOUND = new ParseField("found");
  private Boolean _found;
  public Boolean getFound() { return this._found; }
  public FoundUserPrivilege setFound(Boolean val) { this._found = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public FoundUserPrivilege fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return FoundUserPrivilege.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<FoundUserPrivilege, Void> PARSER =
    new ConstructingObjectParser<>(FoundUserPrivilege.class.getName(), false, args -> new FoundUserPrivilege());

  static {
    PARSER.declareBoolean(FoundUserPrivilege::setFound, FOUND);
  }

}
