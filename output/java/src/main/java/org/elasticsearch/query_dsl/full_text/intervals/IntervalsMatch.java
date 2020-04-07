
package org.elasticsearch.query_dsl.full_text.intervals;

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
import org.elasticsearch.common_abstractions.infer.field.*;

public class IntervalsMatch  implements XContentable<IntervalsMatch> {
  
  static final ParseField ANALYZER = new ParseField("analyzer");
  private String _analyzer;
  public String getAnalyzer() { return this._analyzer; }
  public IntervalsMatch setAnalyzer(String val) { this._analyzer = val; return this; }


  static final ParseField MAX_GAPS = new ParseField("max_gaps");
  private Integer _maxGaps;
  public Integer getMaxGaps() { return this._maxGaps; }
  public IntervalsMatch setMaxGaps(Integer val) { this._maxGaps = val; return this; }


  static final ParseField ORDERED = new ParseField("ordered");
  private Boolean _ordered;
  public Boolean getOrdered() { return this._ordered; }
  public IntervalsMatch setOrdered(Boolean val) { this._ordered = val; return this; }


  static final ParseField QUERY = new ParseField("query");
  private String _query;
  public String getQuery() { return this._query; }
  public IntervalsMatch setQuery(String val) { this._query = val; return this; }


  static final ParseField USE_FIELD = new ParseField("use_field");
  private Field _useField;
  public Field getUseField() { return this._useField; }
  public IntervalsMatch setUseField(Field val) { this._useField = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public IntervalsMatch fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return IntervalsMatch.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<IntervalsMatch, Void> PARSER =
    new ConstructingObjectParser<>(IntervalsMatch.class.getName(), false, args -> new IntervalsMatch());

  static {
    PARSER.declareString(IntervalsMatch::setAnalyzer, ANALYZER);
    PARSER.declareInteger(IntervalsMatch::setMaxGaps, MAX_GAPS);
    PARSER.declareBoolean(IntervalsMatch::setOrdered, ORDERED);
    PARSER.declareString(IntervalsMatch::setQuery, QUERY);
    PARSER.declareField(IntervalsMatch::setUseField, (p, t) -> Field.createFrom(p), USE_FIELD);
  }

}
