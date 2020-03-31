
package org.elasticsearch.cluster.nodes_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class MemoryStats  {
  
  private String _resident;
  public String getResident() { return this._resident; }
  public MemoryStats setResident(String val) { this._resident = val; return this; }


  private Long _residentInBytes;
  public Long getResidentInBytes() { return this._residentInBytes; }
  public MemoryStats setResidentInBytes(Long val) { this._residentInBytes = val; return this; }


  private String _share;
  public String getShare() { return this._share; }
  public MemoryStats setShare(String val) { this._share = val; return this; }


  private Long _shareInBytes;
  public Long getShareInBytes() { return this._shareInBytes; }
  public MemoryStats setShareInBytes(Long val) { this._shareInBytes = val; return this; }


  private String _totalVirtual;
  public String getTotalVirtual() { return this._totalVirtual; }
  public MemoryStats setTotalVirtual(String val) { this._totalVirtual = val; return this; }


  private Long _totalVirtualInBytes;
  public Long getTotalVirtualInBytes() { return this._totalVirtualInBytes; }
  public MemoryStats setTotalVirtualInBytes(Long val) { this._totalVirtualInBytes = val; return this; }

}
