
package org.elasticsearch.cluster.nodes_info;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class NodeInfoMemory  {
  
  private String _total;
  public String getTotal() { return this._total; }
  public NodeInfoMemory setTotal(String val) { this._total = val; return this; }


  private Long _totalInBytes;
  public Long getTotalInBytes() { return this._totalInBytes; }
  public NodeInfoMemory setTotalInBytes(Long val) { this._totalInBytes = val; return this; }

}
