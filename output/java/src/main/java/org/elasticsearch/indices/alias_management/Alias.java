
package org.elasticsearch.indices.alias_management;

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

public class Alias  implements XContentable<Alias> {
  
  static final ParseField FILTER = new ParseField("filter");
  private QueryContainer _filter;
  public QueryContainer getFilter() { return this._filter; }
  public Alias setFilter(QueryContainer val) { this._filter = val; return this; }


  static final ParseField INDEX_ROUTING = new ParseField("index_routing");
  private Routing _indexRouting;
  public Routing getIndexRouting() { return this._indexRouting; }
  public Alias setIndexRouting(Routing val) { this._indexRouting = val; return this; }


  static final ParseField IS_WRITE_INDEX = new ParseField("is_write_index");
  private Boolean _isWriteIndex;
  public Boolean getIsWriteIndex() { return this._isWriteIndex; }
  public Alias setIsWriteIndex(Boolean val) { this._isWriteIndex = val; return this; }


  static final ParseField ROUTING = new ParseField("routing");
  private Routing _routing;
  public Routing getRouting() { return this._routing; }
  public Alias setRouting(Routing val) { this._routing = val; return this; }


  static final ParseField SEARCH_ROUTING = new ParseField("search_routing");
  private Routing _searchRouting;
  public Routing getSearchRouting() { return this._searchRouting; }
  public Alias setSearchRouting(Routing val) { this._searchRouting = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public Alias fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return Alias.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<Alias, Void> PARSER =
    new ConstructingObjectParser<>(Alias.class.getName(), false, args -> new Alias());

  static {
    PARSER.declareObject(Alias::setFilter, (p, t) -> QueryContainer.PARSER.apply(p, null), FILTER);
    PARSER.declareRouting(Alias::setIndexRouting, (p, t) -> Routing.createFrom(p), INDEX_ROUTING);
    PARSER.declareBoolean(Alias::setIsWriteIndex, IS_WRITE_INDEX);
    PARSER.declareRouting(Alias::setRouting, (p, t) -> Routing.createFrom(p), ROUTING);
    PARSER.declareRouting(Alias::setSearchRouting, (p, t) -> Routing.createFrom(p), SEARCH_ROUTING);
  }

}
