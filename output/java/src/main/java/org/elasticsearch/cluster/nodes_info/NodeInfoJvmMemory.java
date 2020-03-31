
package org.elasticsearch.cluster.nodes_info;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class NodeInfoJvmMemory  {
  
  private String _directMax;
  public String getDirectMax() { return this._directMax; }
  public NodeInfoJvmMemory setDirectMax(String val) { this._directMax = val; return this; }


  private Long _directMaxInBytes;
  public Long getDirectMaxInBytes() { return this._directMaxInBytes; }
  public NodeInfoJvmMemory setDirectMaxInBytes(Long val) { this._directMaxInBytes = val; return this; }


  private String _heapInit;
  public String getHeapInit() { return this._heapInit; }
  public NodeInfoJvmMemory setHeapInit(String val) { this._heapInit = val; return this; }


  private Long _heapInitInBytes;
  public Long getHeapInitInBytes() { return this._heapInitInBytes; }
  public NodeInfoJvmMemory setHeapInitInBytes(Long val) { this._heapInitInBytes = val; return this; }


  private String _heapMax;
  public String getHeapMax() { return this._heapMax; }
  public NodeInfoJvmMemory setHeapMax(String val) { this._heapMax = val; return this; }


  private Long _heapMaxInBytes;
  public Long getHeapMaxInBytes() { return this._heapMaxInBytes; }
  public NodeInfoJvmMemory setHeapMaxInBytes(Long val) { this._heapMaxInBytes = val; return this; }


  private String _nonHeapInit;
  public String getNonHeapInit() { return this._nonHeapInit; }
  public NodeInfoJvmMemory setNonHeapInit(String val) { this._nonHeapInit = val; return this; }


  private Long _nonHeapInitInBytes;
  public Long getNonHeapInitInBytes() { return this._nonHeapInitInBytes; }
  public NodeInfoJvmMemory setNonHeapInitInBytes(Long val) { this._nonHeapInitInBytes = val; return this; }


  private String _nonHeapMax;
  public String getNonHeapMax() { return this._nonHeapMax; }
  public NodeInfoJvmMemory setNonHeapMax(String val) { this._nonHeapMax = val; return this; }


  private Long _nonHeapMaxInBytes;
  public Long getNonHeapMaxInBytes() { return this._nonHeapMaxInBytes; }
  public NodeInfoJvmMemory setNonHeapMaxInBytes(Long val) { this._nonHeapMaxInBytes = val; return this; }

}
