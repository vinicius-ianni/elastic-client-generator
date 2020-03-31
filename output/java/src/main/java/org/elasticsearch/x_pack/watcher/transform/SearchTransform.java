
package org.elasticsearch.x_pack.watcher.transform;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.watcher.input.*;
import org.elasticsearch.common_options.time_unit.*;

public class SearchTransform  {
  
  private SearchInputRequest _request;
  public SearchInputRequest getRequest() { return this._request; }
  public SearchTransform setRequest(SearchInputRequest val) { this._request = val; return this; }


  private Time _timeout;
  public Time getTimeout() { return this._timeout; }
  public SearchTransform setTimeout(Time val) { this._timeout = val; return this; }

}
