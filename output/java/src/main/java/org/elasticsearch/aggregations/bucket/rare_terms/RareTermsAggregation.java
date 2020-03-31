
package org.elasticsearch.aggregations.bucket.rare_terms;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.aggregations.bucket.terms.*;
import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.internal.*;

public class RareTermsAggregation  {
  
  private TermsExclude _exclude;
  public TermsExclude getExclude() { return this._exclude; }
  public RareTermsAggregation setExclude(TermsExclude val) { this._exclude = val; return this; }


  private Field _field;
  public Field getField() { return this._field; }
  public RareTermsAggregation setField(Field val) { this._field = val; return this; }


  private TermsInclude _include;
  public TermsInclude getInclude() { return this._include; }
  public RareTermsAggregation setInclude(TermsInclude val) { this._include = val; return this; }


  private Long _maxDocCount;
  public Long getMaxDocCount() { return this._maxDocCount; }
  public RareTermsAggregation setMaxDocCount(Long val) { this._maxDocCount = val; return this; }


  private Object _missing;
  public Object getMissing() { return this._missing; }
  public RareTermsAggregation setMissing(Object val) { this._missing = val; return this; }


  private Double _precision;
  public Double getPrecision() { return this._precision; }
  public RareTermsAggregation setPrecision(Double val) { this._precision = val; return this; }

}
