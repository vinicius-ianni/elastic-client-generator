
package org.elasticsearch.search.search.sort;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;
import org.elasticsearch.query_dsl.abstractions.container.*;
import org.elasticsearch.search.search.sort.*;
import org.elasticsearch.common_abstractions.infer.field.*;

public class NestedSort  implements XContentable<NestedSort> {
  
  static final ParseField FILTER = new ParseField("filter");
  private QueryContainer _filter;
  public QueryContainer getFilter() { return this._filter; }
  public NestedSort setFilter(QueryContainer val) { this._filter = val; return this; }


  static final ParseField NESTED = new ParseField("nested");
  private NestedSort _nested;
  public NestedSort getNested() { return this._nested; }
  public NestedSort setNested(NestedSort val) { this._nested = val; return this; }


  static final ParseField PATH = new ParseField("path");
  private Field _path;
  public Field getPath() { return this._path; }
  public NestedSort setPath(Field val) { this._path = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    if (_filter != null) {
      builder.field(FILTER.getPreferredName());
      _filter.toXContent(builder, params);
    }
    if (_nested != null) {
      builder.field(NESTED.getPreferredName());
      _nested.toXContent(builder, params);
    }
    builder.field(PATH.getPreferredName());
    _path.toXContent(builder, params);
    return builder;
  }

  @Override
  public NestedSort fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return NestedSort.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<NestedSort, Void> PARSER =
    new ConstructingObjectParser<>(NestedSort.class.getName(), false, args -> new NestedSort());

  static {
    PARSER.declareObject(NestedSort::setFilter, (p, t) -> QueryContainer.PARSER.apply(p, t), FILTER);
    PARSER.declareObject(NestedSort::setNested, (p, t) -> NestedSort.PARSER.apply(p, t), NESTED);
    PARSER.declareObject(NestedSort::setPath, (p, t) -> Field.createFrom(p), PATH);
  }

}
