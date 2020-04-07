
package org.elasticsearch.x_pack.sql;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.internal.*;
import org.elasticsearch.query_dsl.abstractions.container.*;

public class SqlRequest  implements XContentable<SqlRequest> {
  
  static final ParseField FETCH_SIZE = new ParseField("fetch_size");
  private Integer _fetchSize;
  public Integer getFetchSize() { return this._fetchSize; }
  public SqlRequest setFetchSize(Integer val) { this._fetchSize = val; return this; }


  static final ParseField FILTER = new ParseField("filter");
  private QueryContainer _filter;
  public QueryContainer getFilter() { return this._filter; }
  public SqlRequest setFilter(QueryContainer val) { this._filter = val; return this; }


  static final ParseField QUERY = new ParseField("query");
  private String _query;
  public String getQuery() { return this._query; }
  public SqlRequest setQuery(String val) { this._query = val; return this; }


  static final ParseField TIME_ZONE = new ParseField("time_zone");
  private String _timeZone;
  public String getTimeZone() { return this._timeZone; }
  public SqlRequest setTimeZone(String val) { this._timeZone = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public SqlRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return SqlRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<SqlRequest, Void> PARSER =
    new ConstructingObjectParser<>(SqlRequest.class.getName(), false, args -> new SqlRequest());

  static {
    PARSER.declareInteger(SqlRequest::setFetchSize, FETCH_SIZE);
    PARSER.declareObject(SqlRequest::setFilter, (p, t) -> QueryContainer.PARSER.apply(p, null), FILTER);
    PARSER.declareString(SqlRequest::setQuery, QUERY);
    PARSER.declareString(SqlRequest::setTimeZone, TIME_ZONE);
  }

}
