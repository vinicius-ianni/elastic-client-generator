
package org.elasticsearch.x_pack.machine_learning.put_filter;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class PutFilterRequest  {
  
  private String _description;
  public String getDescription() { return this._description; }
  public PutFilterRequest setDescription(String val) { this._description = val; return this; }


  private String[] _items;
  public String[] getItems() { return this._items; }
  public PutFilterRequest setItems(String[] val) { this._items = val; return this; }

}
