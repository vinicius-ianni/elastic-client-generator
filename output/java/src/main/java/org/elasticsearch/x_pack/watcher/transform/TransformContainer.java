
package org.elasticsearch.x_pack.watcher.transform;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.watcher.transform.*;

public class TransformContainer  {
  
  private ChainTransform _chain;
  public ChainTransform getChain() { return this._chain; }
  public TransformContainer setChain(ChainTransform val) { this._chain = val; return this; }


  private ScriptTransform _script;
  public ScriptTransform getScript() { return this._script; }
  public TransformContainer setScript(ScriptTransform val) { this._script = val; return this; }


  private SearchTransform _search;
  public SearchTransform getSearch() { return this._search; }
  public TransformContainer setSearch(SearchTransform val) { this._search = val; return this; }

}
