
package org.elasticsearch.cluster.nodes_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class ScriptStats  {
  
  private Long _cacheEvictions;
  public Long getCacheEvictions() { return this._cacheEvictions; }
  public ScriptStats setCacheEvictions(Long val) { this._cacheEvictions = val; return this; }


  private Long _compilations;
  public Long getCompilations() { return this._compilations; }
  public ScriptStats setCompilations(Long val) { this._compilations = val; return this; }

}
