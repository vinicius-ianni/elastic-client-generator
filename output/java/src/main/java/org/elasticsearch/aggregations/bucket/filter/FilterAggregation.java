
package org.elasticsearch.aggregations.bucket.filter;

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

public class FilterAggregation  implements XContentable<FilterAggregation> {
  
  static final ParseField FILTER = new ParseField("filter");
  private QueryContainer _filter;
  public QueryContainer getFilter() { return this._filter; }
  public FilterAggregation setFilter(QueryContainer val) { this._filter = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public FilterAggregation fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return FilterAggregation.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<FilterAggregation, Void> PARSER =
    new ConstructingObjectParser<>(FilterAggregation.class.getName(), false, args -> new FilterAggregation());

  static {
    PARSER.declareObject(FilterAggregation::setFilter, (p, t) -> QueryContainer.PARSER.apply(p, null), FILTER);
  }

}
