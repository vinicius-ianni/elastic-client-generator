
package org.elasticsearch.indices.alias_management.put_alias;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.query_dsl.abstractions.container.*;
import org.elasticsearch.common_abstractions.infer.join_field_routing.*;
import org.elasticsearch.common_options.time_unit.*;

public class PutAliasRequest  implements XContentable<PutAliasRequest> {
  
  static final ParseField FILTER = new ParseField("filter");
  private QueryContainer _filter;
  public QueryContainer getFilter() { return this._filter; }
  public PutAliasRequest setFilter(QueryContainer val) { this._filter = val; return this; }


  static final ParseField INDEX_ROUTING = new ParseField("index_routing");
  private Routing _indexRouting;
  public Routing getIndexRouting() { return this._indexRouting; }
  public PutAliasRequest setIndexRouting(Routing val) { this._indexRouting = val; return this; }


  static final ParseField IS_WRITE_INDEX = new ParseField("is_write_index");
  private Boolean _isWriteIndex;
  public Boolean getIsWriteIndex() { return this._isWriteIndex; }
  public PutAliasRequest setIsWriteIndex(Boolean val) { this._isWriteIndex = val; return this; }


  static final ParseField ROUTING = new ParseField("routing");
  private Routing _routing;
  public Routing getRouting() { return this._routing; }
  public PutAliasRequest setRouting(Routing val) { this._routing = val; return this; }


  static final ParseField SEARCH_ROUTING = new ParseField("search_routing");
  private Routing _searchRouting;
  public Routing getSearchRouting() { return this._searchRouting; }
  public PutAliasRequest setSearchRouting(Routing val) { this._searchRouting = val; return this; }


  static final ParseField MASTER_TIMEOUT = new ParseField("master_timeout");
  private Time _masterTimeout;
  public Time getMasterTimeout() { return this._masterTimeout; }
  public PutAliasRequest setMasterTimeout(Time val) { this._masterTimeout = val; return this; }


  static final ParseField TIMEOUT = new ParseField("timeout");
  private Time _timeout;
  public Time getTimeout() { return this._timeout; }
  public PutAliasRequest setTimeout(Time val) { this._timeout = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public PutAliasRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return PutAliasRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<PutAliasRequest, Void> PARSER =
    new ConstructingObjectParser<>(PutAliasRequest.class.getName(), false, args -> new PutAliasRequest());

  static {
    PARSER.declareObject(PutAliasRequest::setFilter, (p, t) -> QueryContainer.PARSER.apply(p, null), FILTER);
    PARSER.declareRouting(PutAliasRequest::setIndexRouting, (p, t) -> Routing.createFrom(p), INDEX_ROUTING);
    PARSER.declareBoolean(PutAliasRequest::setIsWriteIndex, IS_WRITE_INDEX);
    PARSER.declareRouting(PutAliasRequest::setRouting, (p, t) -> Routing.createFrom(p), ROUTING);
    PARSER.declareRouting(PutAliasRequest::setSearchRouting, (p, t) -> Routing.createFrom(p), SEARCH_ROUTING);
    PARSER.declareObject(PutAliasRequest::setMasterTimeout, (p, t) -> Time.PARSER.apply(p, null), MASTER_TIMEOUT);
    PARSER.declareObject(PutAliasRequest::setTimeout, (p, t) -> Time.PARSER.apply(p, null), TIMEOUT);
  }

}
