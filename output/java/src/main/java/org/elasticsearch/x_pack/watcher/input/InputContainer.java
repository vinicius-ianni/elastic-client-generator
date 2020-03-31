
package org.elasticsearch.x_pack.watcher.input;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.watcher.input.*;

public class InputContainer  {
  
  private ChainInput _chain;
  public ChainInput getChain() { return this._chain; }
  public InputContainer setChain(ChainInput val) { this._chain = val; return this; }


  private HttpInput _http;
  public HttpInput getHttp() { return this._http; }
  public InputContainer setHttp(HttpInput val) { this._http = val; return this; }


  private SearchInput _search;
  public SearchInput getSearch() { return this._search; }
  public InputContainer setSearch(SearchInput val) { this._search = val; return this; }


  private SimpleInput _simple;
  public SimpleInput getSimple() { return this._simple; }
  public InputContainer setSimple(SimpleInput val) { this._simple = val; return this; }

}
