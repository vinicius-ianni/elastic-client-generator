
package org.elasticsearch.query_dsl.full_text.match_phrase_prefix;

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
import org.elasticsearch.internal.*;
import org.elasticsearch.query_dsl.full_text.multi_match.*;

public class MatchPhrasePrefixQuery  implements XContentable<MatchPhrasePrefixQuery> {
  
  static final ParseField ANALYZER = new ParseField("analyzer");
  private String _analyzer;
  public String getAnalyzer() { return this._analyzer; }
  public MatchPhrasePrefixQuery setAnalyzer(String val) { this._analyzer = val; return this; }


  static final ParseField MAX_EXPANSIONS = new ParseField("max_expansions");
  private Integer _maxExpansions;
  public Integer getMaxExpansions() { return this._maxExpansions; }
  public MatchPhrasePrefixQuery setMaxExpansions(Integer val) { this._maxExpansions = val; return this; }


  static final ParseField QUERY = new ParseField("query");
  private String _query;
  public String getQuery() { return this._query; }
  public MatchPhrasePrefixQuery setQuery(String val) { this._query = val; return this; }


  static final ParseField SLOP = new ParseField("slop");
  private Integer _slop;
  public Integer getSlop() { return this._slop; }
  public MatchPhrasePrefixQuery setSlop(Integer val) { this._slop = val; return this; }


  static final ParseField ZERO_TERMS_QUERY = new ParseField("zero_terms_query");
  private ZeroTermsQuery _zeroTermsQuery;
  public ZeroTermsQuery getZeroTermsQuery() { return this._zeroTermsQuery; }
  public MatchPhrasePrefixQuery setZeroTermsQuery(ZeroTermsQuery val) { this._zeroTermsQuery = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public MatchPhrasePrefixQuery fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return MatchPhrasePrefixQuery.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<MatchPhrasePrefixQuery, Void> PARSER =
    new ConstructingObjectParser<>(MatchPhrasePrefixQuery.class.getName(), false, args -> new MatchPhrasePrefixQuery());

  static {
    PARSER.declareString(MatchPhrasePrefixQuery::setAnalyzer, ANALYZER);
    PARSER.declareInt(MatchPhrasePrefixQuery::setMaxExpansions, MAX_EXPANSIONS);
    PARSER.declareString(MatchPhrasePrefixQuery::setQuery, QUERY);
    PARSER.declareInt(MatchPhrasePrefixQuery::setSlop, SLOP);
    PARSER.declareObject(MatchPhrasePrefixQuery::setZeroTermsQuery, (p, t) -> ZeroTermsQuery.PARSER.apply(p), ZERO_TERMS_QUERY);
  }

}
