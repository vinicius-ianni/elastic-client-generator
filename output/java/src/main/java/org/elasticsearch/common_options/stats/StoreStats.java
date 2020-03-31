
package org.elasticsearch.common_options.stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class StoreStats  {
  
  private String _size;
  public String getSize() { return this._size; }
  public StoreStats setSize(String val) { this._size = val; return this; }


  private Double _sizeInBytes;
  public Double getSizeInBytes() { return this._sizeInBytes; }
  public StoreStats setSizeInBytes(Double val) { this._sizeInBytes = val; return this; }

}
