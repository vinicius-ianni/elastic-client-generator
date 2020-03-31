
package org.elasticsearch.x_pack.machine_learning.get_categories;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.machine_learning.job.results.*;
import org.elasticsearch.internal.*;

public class GetCategoriesResponse  {
  
  private CategoryDefinition[] _categories;
  public CategoryDefinition[] getCategories() { return this._categories; }
  public GetCategoriesResponse setCategories(CategoryDefinition[] val) { this._categories = val; return this; }


  private Long _count;
  public Long getCount() { return this._count; }
  public GetCategoriesResponse setCount(Long val) { this._count = val; return this; }

}
