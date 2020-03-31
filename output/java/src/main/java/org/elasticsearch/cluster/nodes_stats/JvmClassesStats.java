
package org.elasticsearch.cluster.nodes_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class JvmClassesStats  {
  
  private Long _currentLoadedCount;
  public Long getCurrentLoadedCount() { return this._currentLoadedCount; }
  public JvmClassesStats setCurrentLoadedCount(Long val) { this._currentLoadedCount = val; return this; }


  private Long _totalLoadedCount;
  public Long getTotalLoadedCount() { return this._totalLoadedCount; }
  public JvmClassesStats setTotalLoadedCount(Long val) { this._totalLoadedCount = val; return this; }


  private Long _totalUnloadedCount;
  public Long getTotalUnloadedCount() { return this._totalUnloadedCount; }
  public JvmClassesStats setTotalUnloadedCount(Long val) { this._totalUnloadedCount = val; return this; }

}
