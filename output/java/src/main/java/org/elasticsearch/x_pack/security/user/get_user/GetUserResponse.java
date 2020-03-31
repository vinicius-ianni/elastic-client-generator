
package org.elasticsearch.x_pack.security.user.get_user;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.security.user.get_user.*;
import org.elasticsearch.common_abstractions.response.*;

public class GetUserResponse extends DictionaryResponseBase<String, XPackUser> {
  
  private Map<String, XPackUser> _users;
  public Map<String, XPackUser> getUsers() { return this._users; }
  public GetUserResponse setUsers(Map<String, XPackUser> val) { this._users = val; return this; }

}
