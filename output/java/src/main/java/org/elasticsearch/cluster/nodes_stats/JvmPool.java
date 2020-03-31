
package org.elasticsearch.cluster.nodes_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class JvmPool  {
  
  private String _max;
  public String getMax() { return this._max; }
  public JvmPool setMax(String val) { this._max = val; return this; }


  private Long _maxInBytes;
  public Long getMaxInBytes() { return this._maxInBytes; }
  public JvmPool setMaxInBytes(Long val) { this._maxInBytes = val; return this; }


  private String _peakMax;
  public String getPeakMax() { return this._peakMax; }
  public JvmPool setPeakMax(String val) { this._peakMax = val; return this; }


  private Long _peakMaxInBytes;
  public Long getPeakMaxInBytes() { return this._peakMaxInBytes; }
  public JvmPool setPeakMaxInBytes(Long val) { this._peakMaxInBytes = val; return this; }


  private String _peakUsed;
  public String getPeakUsed() { return this._peakUsed; }
  public JvmPool setPeakUsed(String val) { this._peakUsed = val; return this; }


  private Long _peakUsedInBytes;
  public Long getPeakUsedInBytes() { return this._peakUsedInBytes; }
  public JvmPool setPeakUsedInBytes(Long val) { this._peakUsedInBytes = val; return this; }


  private String _used;
  public String getUsed() { return this._used; }
  public JvmPool setUsed(String val) { this._used = val; return this; }


  private Long _usedInBytes;
  public Long getUsedInBytes() { return this._usedInBytes; }
  public JvmPool setUsedInBytes(Long val) { this._usedInBytes = val; return this; }

}
