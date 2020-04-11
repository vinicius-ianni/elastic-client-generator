
package org.elasticsearch.query_dsl.joining.nested;

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
import org.elasticsearch.search.search.inner_hits.*;
import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.query_dsl.abstractions.container.*;
import org.elasticsearch.query_dsl.joining.nested.*;

public class NestedQuery  implements XContentable<NestedQuery> {
  
  static final ParseField IGNORE_UNMAPPED = new ParseField("ignore_unmapped");
  private Boolean _ignoreUnmapped;
  public Boolean getIgnoreUnmapped() { return this._ignoreUnmapped; }
  public NestedQuery setIgnoreUnmapped(Boolean val) { this._ignoreUnmapped = val; return this; }


  static final ParseField INNER_HITS = new ParseField("inner_hits");
  private InnerHits _innerHits;
  public InnerHits getInnerHits() { return this._innerHits; }
  public NestedQuery setInnerHits(InnerHits val) { this._innerHits = val; return this; }


  static final ParseField PATH = new ParseField("path");
  private Field _path;
  public Field getPath() { return this._path; }
  public NestedQuery setPath(Field val) { this._path = val; return this; }


  static final ParseField QUERY = new ParseField("query");
  private QueryContainer _query;
  public QueryContainer getQuery() { return this._query; }
  public NestedQuery setQuery(QueryContainer val) { this._query = val; return this; }


  static final ParseField SCORE_MODE = new ParseField("score_mode");
  private NestedScoreMode _scoreMode;
  public NestedScoreMode getScoreMode() { return this._scoreMode; }
  public NestedQuery setScoreMode(NestedScoreMode val) { this._scoreMode = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public NestedQuery fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return NestedQuery.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<NestedQuery, Void> PARSER =
    new ConstructingObjectParser<>(NestedQuery.class.getName(), false, args -> new NestedQuery());

  static {
    PARSER.declareBoolean(NestedQuery::setIgnoreUnmapped, IGNORE_UNMAPPED);
    PARSER.declareObject(NestedQuery::setInnerHits, (p, t) -> InnerHits.PARSER.apply(p, t), INNER_HITS);
    PARSER.declareObject(NestedQuery::setPath, (p, t) -> Field.createFrom(p), PATH);
    PARSER.declareObject(NestedQuery::setQuery, (p, t) -> QueryContainer.PARSER.apply(p, t), QUERY);
    PARSER.declareObject(NestedQuery::setScoreMode, (p, t) -> NestedScoreMode.PARSER.apply(p), SCORE_MODE);
  }

}
