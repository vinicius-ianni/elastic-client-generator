
package org.elasticsearch.indices.alias_management.put_alias;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.query_dsl.abstractions.container.*;
import org.elasticsearch.common_abstractions.infer.join_field_routing.*;
import org.elasticsearch.common_options.time_unit.*;

public class PutAliasRequest  {
  
  private QueryContainer _filter;
  public QueryContainer getFilter() { return this._filter; }
  public PutAliasRequest setFilter(QueryContainer val) { this._filter = val; return this; }


  private Routing _indexRouting;
  public Routing getIndexRouting() { return this._indexRouting; }
  public PutAliasRequest setIndexRouting(Routing val) { this._indexRouting = val; return this; }


  private Boolean _isWriteIndex;
  public Boolean getIsWriteIndex() { return this._isWriteIndex; }
  public PutAliasRequest setIsWriteIndex(Boolean val) { this._isWriteIndex = val; return this; }


  private Routing _routing;
  public Routing getRouting() { return this._routing; }
  public PutAliasRequest setRouting(Routing val) { this._routing = val; return this; }


  private Routing _searchRouting;
  public Routing getSearchRouting() { return this._searchRouting; }
  public PutAliasRequest setSearchRouting(Routing val) { this._searchRouting = val; return this; }


  private Time _masterTimeout;
  public Time getMasterTimeout() { return this._masterTimeout; }
  public PutAliasRequest setMasterTimeout(Time val) { this._masterTimeout = val; return this; }


  private Time _timeout;
  public Time getTimeout() { return this._timeout; }
  public PutAliasRequest setTimeout(Time val) { this._timeout = val; return this; }

}
