
package org.elasticsearch.cluster.nodes_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class DataPathStats  {
  
  private String _available;
  public String getAvailable() { return this._available; }
  public DataPathStats setAvailable(String val) { this._available = val; return this; }


  private Long _availableInBytes;
  public Long getAvailableInBytes() { return this._availableInBytes; }
  public DataPathStats setAvailableInBytes(Long val) { this._availableInBytes = val; return this; }


  private String _diskQueue;
  public String getDiskQueue() { return this._diskQueue; }
  public DataPathStats setDiskQueue(String val) { this._diskQueue = val; return this; }


  private Long _diskReads;
  public Long getDiskReads() { return this._diskReads; }
  public DataPathStats setDiskReads(Long val) { this._diskReads = val; return this; }


  private String _diskReadSize;
  public String getDiskReadSize() { return this._diskReadSize; }
  public DataPathStats setDiskReadSize(String val) { this._diskReadSize = val; return this; }


  private Long _diskReadSizeInBytes;
  public Long getDiskReadSizeInBytes() { return this._diskReadSizeInBytes; }
  public DataPathStats setDiskReadSizeInBytes(Long val) { this._diskReadSizeInBytes = val; return this; }


  private Long _diskWrites;
  public Long getDiskWrites() { return this._diskWrites; }
  public DataPathStats setDiskWrites(Long val) { this._diskWrites = val; return this; }


  private String _diskWriteSize;
  public String getDiskWriteSize() { return this._diskWriteSize; }
  public DataPathStats setDiskWriteSize(String val) { this._diskWriteSize = val; return this; }


  private Long _diskWriteSizeInBytes;
  public Long getDiskWriteSizeInBytes() { return this._diskWriteSizeInBytes; }
  public DataPathStats setDiskWriteSizeInBytes(Long val) { this._diskWriteSizeInBytes = val; return this; }


  private String _free;
  public String getFree() { return this._free; }
  public DataPathStats setFree(String val) { this._free = val; return this; }


  private Long _freeInBytes;
  public Long getFreeInBytes() { return this._freeInBytes; }
  public DataPathStats setFreeInBytes(Long val) { this._freeInBytes = val; return this; }


  private String _mount;
  public String getMount() { return this._mount; }
  public DataPathStats setMount(String val) { this._mount = val; return this; }


  private String _path;
  public String getPath() { return this._path; }
  public DataPathStats setPath(String val) { this._path = val; return this; }


  private String _total;
  public String getTotal() { return this._total; }
  public DataPathStats setTotal(String val) { this._total = val; return this; }


  private Long _totalInBytes;
  public Long getTotalInBytes() { return this._totalInBytes; }
  public DataPathStats setTotalInBytes(Long val) { this._totalInBytes = val; return this; }


  private String _type;
  public String getType() { return this._type; }
  public DataPathStats setType(String val) { this._type = val; return this; }

}
