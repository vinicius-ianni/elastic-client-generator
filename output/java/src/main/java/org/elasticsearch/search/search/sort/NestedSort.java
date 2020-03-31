
package org.elasticsearch.search.search.sort;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.query_dsl.abstractions.container.*;
import org.elasticsearch.search.search.sort.*;
import org.elasticsearch.common_abstractions.infer.field.*;

public class NestedSort  {
  
  private QueryContainer _filter;
  public QueryContainer getFilter() { return this._filter; }
  public NestedSort setFilter(QueryContainer val) { this._filter = val; return this; }


  private NestedSort _nested;
  public NestedSort getNested() { return this._nested; }
  public NestedSort setNested(NestedSort val) { this._nested = val; return this; }


  private Field _path;
  public Field getPath() { return this._path; }
  public NestedSort setPath(Field val) { this._path = val; return this; }

}
