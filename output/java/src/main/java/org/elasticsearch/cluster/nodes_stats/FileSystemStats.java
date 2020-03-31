
package org.elasticsearch.cluster.nodes_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.cluster.nodes_stats.*;
import org.elasticsearch.internal.*;

public class FileSystemStats  {
  
  private DataPathStats[] _data;
  public DataPathStats[] getData() { return this._data; }
  public FileSystemStats setData(DataPathStats[] val) { this._data = val; return this; }


  private Long _timestamp;
  public Long getTimestamp() { return this._timestamp; }
  public FileSystemStats setTimestamp(Long val) { this._timestamp = val; return this; }


  private TotalFileSystemStats _total;
  public TotalFileSystemStats getTotal() { return this._total; }
  public FileSystemStats setTotal(TotalFileSystemStats val) { this._total = val; return this; }

}
