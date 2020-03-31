
package org.elasticsearch.x_pack.security.clear_cached_realms;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class ClearCachedRealmsRequest  {
  
  private String[] _usernames;
  public String[] getUsernames() { return this._usernames; }
  public ClearCachedRealmsRequest setUsernames(String[] val) { this._usernames = val; return this; }

}
