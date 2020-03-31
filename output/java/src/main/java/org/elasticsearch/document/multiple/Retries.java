
package org.elasticsearch.document.multiple;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class Retries  {
  
  private Long _bulk;
  public Long getBulk() { return this._bulk; }
  public Retries setBulk(Long val) { this._bulk = val; return this; }


  private Long _search;
  public Long getSearch() { return this._search; }
  public Retries setSearch(Long val) { this._search = val; return this; }

}
