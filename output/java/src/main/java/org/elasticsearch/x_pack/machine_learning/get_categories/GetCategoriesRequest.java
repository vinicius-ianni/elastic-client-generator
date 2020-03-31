
package org.elasticsearch.x_pack.machine_learning.get_categories;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.machine_learning.job.*;

public class GetCategoriesRequest  {
  
  private Page _page;
  public Page getPage() { return this._page; }
  public GetCategoriesRequest setPage(Page val) { this._page = val; return this; }

}
