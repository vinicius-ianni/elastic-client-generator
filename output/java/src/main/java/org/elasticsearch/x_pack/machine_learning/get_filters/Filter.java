
package org.elasticsearch.x_pack.machine_learning.get_filters;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class Filter  {
  
  private String _description;
  public String getDescription() { return this._description; }
  public Filter setDescription(String val) { this._description = val; return this; }


  private String _filterId;
  public String getFilterId() { return this._filterId; }
  public Filter setFilterId(String val) { this._filterId = val; return this; }


  private String[] _items;
  public String[] getItems() { return this._items; }
  public Filter setItems(String[] val) { this._items = val; return this; }

}
