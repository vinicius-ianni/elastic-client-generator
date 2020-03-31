
package org.elasticsearch.x_pack.info.x_pack_usage;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class RoleUsage  {
  
  private Boolean _dls;
  public Boolean getDls() { return this._dls; }
  public RoleUsage setDls(Boolean val) { this._dls = val; return this; }


  private Boolean _fls;
  public Boolean getFls() { return this._fls; }
  public RoleUsage setFls(Boolean val) { this._fls = val; return this; }


  private Long _size;
  public Long getSize() { return this._size; }
  public RoleUsage setSize(Long val) { this._size = val; return this; }

}
