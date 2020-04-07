
package org.elasticsearch.query_dsl.span;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.query_dsl.span.containing.*;
import org.elasticsearch.query_dsl.span.field_masking.*;
import org.elasticsearch.query_dsl.span.first.*;
import org.elasticsearch.query_dsl.span.gap.*;
import org.elasticsearch.query_dsl.span.multi_term.*;
import org.elasticsearch.query_dsl.span.near.*;
import org.elasticsearch.query_dsl.span.not.*;
import org.elasticsearch.query_dsl.span.or.*;
import org.elasticsearch.query_dsl.span.term.*;
import org.elasticsearch.query_dsl.span.within.*;

public class SpanQuery  implements XContentable<SpanQuery> {
  
  static final ParseField SPAN_CONTAINING = new ParseField("span_containing");
  private SpanContainingQuery _spanContaining;
  public SpanContainingQuery getSpanContaining() { return this._spanContaining; }
  public SpanQuery setSpanContaining(SpanContainingQuery val) { this._spanContaining = val; return this; }


  static final ParseField FIELD_MASKING_SPAN = new ParseField("field_masking_span");
  private SpanFieldMaskingQuery _fieldMaskingSpan;
  public SpanFieldMaskingQuery getFieldMaskingSpan() { return this._fieldMaskingSpan; }
  public SpanQuery setFieldMaskingSpan(SpanFieldMaskingQuery val) { this._fieldMaskingSpan = val; return this; }


  static final ParseField SPAN_FIRST = new ParseField("span_first");
  private SpanFirstQuery _spanFirst;
  public SpanFirstQuery getSpanFirst() { return this._spanFirst; }
  public SpanQuery setSpanFirst(SpanFirstQuery val) { this._spanFirst = val; return this; }


  static final ParseField SPAN_GAP = new ParseField("span_gap");
  private SpanGapQuery _spanGap;
  public SpanGapQuery getSpanGap() { return this._spanGap; }
  public SpanQuery setSpanGap(SpanGapQuery val) { this._spanGap = val; return this; }


  static final ParseField SPAN_MULTI = new ParseField("span_multi");
  private SpanMultiTermQuery _spanMulti;
  public SpanMultiTermQuery getSpanMulti() { return this._spanMulti; }
  public SpanQuery setSpanMulti(SpanMultiTermQuery val) { this._spanMulti = val; return this; }


  static final ParseField SPAN_NEAR = new ParseField("span_near");
  private SpanNearQuery _spanNear;
  public SpanNearQuery getSpanNear() { return this._spanNear; }
  public SpanQuery setSpanNear(SpanNearQuery val) { this._spanNear = val; return this; }


  static final ParseField SPAN_NOT = new ParseField("span_not");
  private SpanNotQuery _spanNot;
  public SpanNotQuery getSpanNot() { return this._spanNot; }
  public SpanQuery setSpanNot(SpanNotQuery val) { this._spanNot = val; return this; }


  static final ParseField SPAN_OR = new ParseField("span_or");
  private SpanOrQuery _spanOr;
  public SpanOrQuery getSpanOr() { return this._spanOr; }
  public SpanQuery setSpanOr(SpanOrQuery val) { this._spanOr = val; return this; }


  static final ParseField SPAN_TERM = new ParseField("span_term");
  private SpanTermQuery _spanTerm;
  public SpanTermQuery getSpanTerm() { return this._spanTerm; }
  public SpanQuery setSpanTerm(SpanTermQuery val) { this._spanTerm = val; return this; }


  static final ParseField SPAN_WITHIN = new ParseField("span_within");
  private SpanWithinQuery _spanWithin;
  public SpanWithinQuery getSpanWithin() { return this._spanWithin; }
  public SpanQuery setSpanWithin(SpanWithinQuery val) { this._spanWithin = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public SpanQuery fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return SpanQuery.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<SpanQuery, Void> PARSER =
    new ConstructingObjectParser<>(SpanQuery.class.getName(), false, args -> new SpanQuery());

  static {
    PARSER.declareObject(SpanQuery::setSpanContaining, (p, t) -> SpanContainingQuery.PARSER.apply(p, null), SPAN_CONTAINING);
    PARSER.declareObject(SpanQuery::setFieldMaskingSpan, (p, t) -> SpanFieldMaskingQuery.PARSER.apply(p, null), FIELD_MASKING_SPAN);
    PARSER.declareObject(SpanQuery::setSpanFirst, (p, t) -> SpanFirstQuery.PARSER.apply(p, null), SPAN_FIRST);
    PARSER.declareObject(SpanQuery::setSpanGap, (p, t) -> SpanGapQuery.PARSER.apply(p, null), SPAN_GAP);
    PARSER.declareObject(SpanQuery::setSpanMulti, (p, t) -> SpanMultiTermQuery.PARSER.apply(p, null), SPAN_MULTI);
    PARSER.declareObject(SpanQuery::setSpanNear, (p, t) -> SpanNearQuery.PARSER.apply(p, null), SPAN_NEAR);
    PARSER.declareObject(SpanQuery::setSpanNot, (p, t) -> SpanNotQuery.PARSER.apply(p, null), SPAN_NOT);
    PARSER.declareObject(SpanQuery::setSpanOr, (p, t) -> SpanOrQuery.PARSER.apply(p, null), SPAN_OR);
    PARSER.declareObject(SpanQuery::setSpanTerm, (p, t) -> SpanTermQuery.PARSER.apply(p, null), SPAN_TERM);
    PARSER.declareObject(SpanQuery::setSpanWithin, (p, t) -> SpanWithinQuery.PARSER.apply(p, null), SPAN_WITHIN);
  }

}
