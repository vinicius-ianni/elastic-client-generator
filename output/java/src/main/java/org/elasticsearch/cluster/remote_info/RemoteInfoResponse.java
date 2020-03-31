
package org.elasticsearch.cluster.remote_info;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.cluster.remote_info.*;
import org.elasticsearch.common_abstractions.response.*;

public class RemoteInfoResponse extends DictionaryResponseBase<String, RemoteInfo> {
  
  private Map<String, RemoteInfo> _remotes;
  public Map<String, RemoteInfo> getRemotes() { return this._remotes; }
  public RemoteInfoResponse setRemotes(Map<String, RemoteInfo> val) { this._remotes = val; return this; }

}
