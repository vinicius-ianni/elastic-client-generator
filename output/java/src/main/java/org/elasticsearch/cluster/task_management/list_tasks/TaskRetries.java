
package org.elasticsearch.cluster.task_management.list_tasks;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class TaskRetries  {
  
  private Integer _bulk;
  public Integer getBulk() { return this._bulk; }
  public TaskRetries setBulk(Integer val) { this._bulk = val; return this; }


  private Integer _search;
  public Integer getSearch() { return this._search; }
  public TaskRetries setSearch(Integer val) { this._search = val; return this; }

}
