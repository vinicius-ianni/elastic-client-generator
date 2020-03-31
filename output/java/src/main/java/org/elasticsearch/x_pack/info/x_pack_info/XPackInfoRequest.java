
package org.elasticsearch.x_pack.info.x_pack_info;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class XPackInfoRequest  {
  
  private String[] _categories;
  public String[] getCategories() { return this._categories; }
  public XPackInfoRequest setCategories(String[] val) { this._categories = val; return this; }

}
