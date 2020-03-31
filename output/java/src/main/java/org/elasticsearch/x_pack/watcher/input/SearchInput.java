
package org.elasticsearch.x_pack.watcher.input;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.watcher.input.*;
import org.elasticsearch.common_options.time_unit.*;

public class SearchInput  {
  
  private String[] _extract;
  public String[] getExtract() { return this._extract; }
  public SearchInput setExtract(String[] val) { this._extract = val; return this; }


  private SearchInputRequest _request;
  public SearchInputRequest getRequest() { return this._request; }
  public SearchInput setRequest(SearchInputRequest val) { this._request = val; return this; }


  private Time _timeout;
  public Time getTimeout() { return this._timeout; }
  public SearchInput setTimeout(Time val) { this._timeout = val; return this; }

}
