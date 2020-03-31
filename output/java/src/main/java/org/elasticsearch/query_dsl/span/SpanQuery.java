
package org.elasticsearch.query_dsl.span;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
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

public class SpanQuery  {
  
  private SpanContainingQuery _spanContaining;
  public SpanContainingQuery getSpanContaining() { return this._spanContaining; }
  public SpanQuery setSpanContaining(SpanContainingQuery val) { this._spanContaining = val; return this; }


  private SpanFieldMaskingQuery _fieldMaskingSpan;
  public SpanFieldMaskingQuery getFieldMaskingSpan() { return this._fieldMaskingSpan; }
  public SpanQuery setFieldMaskingSpan(SpanFieldMaskingQuery val) { this._fieldMaskingSpan = val; return this; }


  private SpanFirstQuery _spanFirst;
  public SpanFirstQuery getSpanFirst() { return this._spanFirst; }
  public SpanQuery setSpanFirst(SpanFirstQuery val) { this._spanFirst = val; return this; }


  private SpanGapQuery _spanGap;
  public SpanGapQuery getSpanGap() { return this._spanGap; }
  public SpanQuery setSpanGap(SpanGapQuery val) { this._spanGap = val; return this; }


  private SpanMultiTermQuery _spanMulti;
  public SpanMultiTermQuery getSpanMulti() { return this._spanMulti; }
  public SpanQuery setSpanMulti(SpanMultiTermQuery val) { this._spanMulti = val; return this; }


  private SpanNearQuery _spanNear;
  public SpanNearQuery getSpanNear() { return this._spanNear; }
  public SpanQuery setSpanNear(SpanNearQuery val) { this._spanNear = val; return this; }


  private SpanNotQuery _spanNot;
  public SpanNotQuery getSpanNot() { return this._spanNot; }
  public SpanQuery setSpanNot(SpanNotQuery val) { this._spanNot = val; return this; }


  private SpanOrQuery _spanOr;
  public SpanOrQuery getSpanOr() { return this._spanOr; }
  public SpanQuery setSpanOr(SpanOrQuery val) { this._spanOr = val; return this; }


  private SpanTermQuery _spanTerm;
  public SpanTermQuery getSpanTerm() { return this._spanTerm; }
  public SpanQuery setSpanTerm(SpanTermQuery val) { this._spanTerm = val; return this; }


  private SpanWithinQuery _spanWithin;
  public SpanWithinQuery getSpanWithin() { return this._spanWithin; }
  public SpanQuery setSpanWithin(SpanWithinQuery val) { this._spanWithin = val; return this; }

}
