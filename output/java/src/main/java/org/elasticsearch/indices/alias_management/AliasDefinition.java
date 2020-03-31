
package org.elasticsearch.indices.alias_management;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.query_dsl.abstractions.container.*;

public class AliasDefinition  {
  
  private QueryContainer _filter;
  public QueryContainer getFilter() { return this._filter; }
  public AliasDefinition setFilter(QueryContainer val) { this._filter = val; return this; }


  private String _indexRouting;
  public String getIndexRouting() { return this._indexRouting; }
  public AliasDefinition setIndexRouting(String val) { this._indexRouting = val; return this; }


  private Boolean _isWriteIndex;
  public Boolean getIsWriteIndex() { return this._isWriteIndex; }
  public AliasDefinition setIsWriteIndex(Boolean val) { this._isWriteIndex = val; return this; }


  private String _routing;
  public String getRouting() { return this._routing; }
  public AliasDefinition setRouting(String val) { this._routing = val; return this; }


  private String _searchRouting;
  public String getSearchRouting() { return this._searchRouting; }
  public AliasDefinition setSearchRouting(String val) { this._searchRouting = val; return this; }

}
