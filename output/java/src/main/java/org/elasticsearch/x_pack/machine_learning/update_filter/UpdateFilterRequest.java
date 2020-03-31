
package org.elasticsearch.x_pack.machine_learning.update_filter;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class UpdateFilterRequest  {
  
  private String[] _addItems;
  public String[] getAddItems() { return this._addItems; }
  public UpdateFilterRequest setAddItems(String[] val) { this._addItems = val; return this; }


  private String _description;
  public String getDescription() { return this._description; }
  public UpdateFilterRequest setDescription(String val) { this._description = val; return this; }


  private String[] _removeItems;
  public String[] getRemoveItems() { return this._removeItems; }
  public UpdateFilterRequest setRemoveItems(String[] val) { this._removeItems = val; return this; }

}
