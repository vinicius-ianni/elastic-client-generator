
package org.elasticsearch.x_pack.info.x_pack_usage;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class RealmUsage  {
  
  private String[] _name;
  public String[] getName() { return this._name; }
  public RealmUsage setName(String[] val) { this._name = val; return this; }


  private Long[] _order;
  public Long[] getOrder() { return this._order; }
  public RealmUsage setOrder(Long[] val) { this._order = val; return this; }


  private Long[] _size;
  public Long[] getSize() { return this._size; }
  public RealmUsage setSize(Long[] val) { this._size = val; return this; }

}
