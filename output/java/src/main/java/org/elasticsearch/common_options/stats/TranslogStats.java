
package org.elasticsearch.common_options.stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class TranslogStats  {
  
  private Long _earliestLastModifiedAge;
  public Long getEarliestLastModifiedAge() { return this._earliestLastModifiedAge; }
  public TranslogStats setEarliestLastModifiedAge(Long val) { this._earliestLastModifiedAge = val; return this; }


  private Long _operations;
  public Long getOperations() { return this._operations; }
  public TranslogStats setOperations(Long val) { this._operations = val; return this; }


  private String _size;
  public String getSize() { return this._size; }
  public TranslogStats setSize(String val) { this._size = val; return this; }


  private Long _sizeInBytes;
  public Long getSizeInBytes() { return this._sizeInBytes; }
  public TranslogStats setSizeInBytes(Long val) { this._sizeInBytes = val; return this; }


  private Integer _uncommittedOperations;
  public Integer getUncommittedOperations() { return this._uncommittedOperations; }
  public TranslogStats setUncommittedOperations(Integer val) { this._uncommittedOperations = val; return this; }


  private String _uncommittedSize;
  public String getUncommittedSize() { return this._uncommittedSize; }
  public TranslogStats setUncommittedSize(String val) { this._uncommittedSize = val; return this; }


  private Long _uncommittedSizeInBytes;
  public Long getUncommittedSizeInBytes() { return this._uncommittedSizeInBytes; }
  public TranslogStats setUncommittedSizeInBytes(Long val) { this._uncommittedSizeInBytes = val; return this; }

}
