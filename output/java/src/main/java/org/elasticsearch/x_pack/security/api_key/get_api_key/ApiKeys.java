
package org.elasticsearch.x_pack.security.api_key.get_api_key;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.internal.*;

public class ApiKeys  implements XContentable<ApiKeys> {
  
  static final ParseField CREATION = new ParseField("creation");
  private Date _creation;
  public Date getCreation() { return this._creation; }
  public ApiKeys setCreation(Date val) { this._creation = val; return this; }


  static final ParseField EXPIRATION = new ParseField("expiration");
  private Date _expiration;
  public Date getExpiration() { return this._expiration; }
  public ApiKeys setExpiration(Date val) { this._expiration = val; return this; }


  static final ParseField ID = new ParseField("id");
  private String _id;
  public String getId() { return this._id; }
  public ApiKeys setId(String val) { this._id = val; return this; }


  static final ParseField INVALIDATED = new ParseField("invalidated");
  private Boolean _invalidated;
  public Boolean getInvalidated() { return this._invalidated; }
  public ApiKeys setInvalidated(Boolean val) { this._invalidated = val; return this; }


  static final ParseField NAME = new ParseField("name");
  private String _name;
  public String getName() { return this._name; }
  public ApiKeys setName(String val) { this._name = val; return this; }


  static final ParseField REALM = new ParseField("realm");
  private String _realm;
  public String getRealm() { return this._realm; }
  public ApiKeys setRealm(String val) { this._realm = val; return this; }


  static final ParseField USERNAME = new ParseField("username");
  private String _username;
  public String getUsername() { return this._username; }
  public ApiKeys setUsername(String val) { this._username = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ApiKeys fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ApiKeys.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ApiKeys, Void> PARSER =
    new ConstructingObjectParser<>(ApiKeys.class.getName(), false, args -> new ApiKeys());

  static {
    PARSER.declareDate(ApiKeys::setCreation, (p, t) -> Date.createFrom(p), CREATION);
    PARSER.declareDate(ApiKeys::setExpiration, (p, t) -> Date.createFrom(p), EXPIRATION);
    PARSER.declareString(ApiKeys::setId, ID);
    PARSER.declareBoolean(ApiKeys::setInvalidated, INVALIDATED);
    PARSER.declareString(ApiKeys::setName, NAME);
    PARSER.declareString(ApiKeys::setRealm, REALM);
    PARSER.declareString(ApiKeys::setUsername, USERNAME);
  }

}
