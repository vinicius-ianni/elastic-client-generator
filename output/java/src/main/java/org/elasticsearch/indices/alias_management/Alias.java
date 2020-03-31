
package org.elasticsearch.indices.alias_management;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.query_dsl.abstractions.container.*;
import org.elasticsearch.common_abstractions.infer.join_field_routing.*;

public class Alias  {
  
  private QueryContainer _filter;
  public QueryContainer getFilter() { return this._filter; }
  public Alias setFilter(QueryContainer val) { this._filter = val; return this; }


  private Routing _indexRouting;
  public Routing getIndexRouting() { return this._indexRouting; }
  public Alias setIndexRouting(Routing val) { this._indexRouting = val; return this; }


  private Boolean _isWriteIndex;
  public Boolean getIsWriteIndex() { return this._isWriteIndex; }
  public Alias setIsWriteIndex(Boolean val) { this._isWriteIndex = val; return this; }


  private Routing _routing;
  public Routing getRouting() { return this._routing; }
  public Alias setRouting(Routing val) { this._routing = val; return this; }


  private Routing _searchRouting;
  public Routing getSearchRouting() { return this._searchRouting; }
  public Alias setSearchRouting(Routing val) { this._searchRouting = val; return this; }

}
