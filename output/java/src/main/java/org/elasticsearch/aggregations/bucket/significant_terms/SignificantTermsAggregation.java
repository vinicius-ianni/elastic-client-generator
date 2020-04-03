
package org.elasticsearch.aggregations.bucket.significant_terms;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.query_dsl.abstractions.container.*;
import org.elasticsearch.aggregations.bucket.significant_terms.heuristics.*;
import org.elasticsearch.aggregations.bucket.significant_terms.*;
import org.elasticsearch.aggregations.bucket.terms.*;
import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.internal.*;

public class SignificantTermsAggregation  {
  
  private QueryContainer _backgroundFilter;
  public QueryContainer getBackgroundFilter() { return this._backgroundFilter; }
  public SignificantTermsAggregation setBackgroundFilter(QueryContainer val) { this._backgroundFilter = val; return this; }


  private ChiSquareHeuristic _chiSquare;
  public ChiSquareHeuristic getChiSquare() { return this._chiSquare; }
  public SignificantTermsAggregation setChiSquare(ChiSquareHeuristic val) { this._chiSquare = val; return this; }


  private IncludeExclude _exclude;
  public IncludeExclude getExclude() { return this._exclude; }
  public SignificantTermsAggregation setExclude(IncludeExclude val) { this._exclude = val; return this; }


  private TermsAggregationExecutionHint _executionHint;
  public TermsAggregationExecutionHint getExecutionHint() { return this._executionHint; }
  public SignificantTermsAggregation setExecutionHint(TermsAggregationExecutionHint val) { this._executionHint = val; return this; }


  private Field _field;
  public Field getField() { return this._field; }
  public SignificantTermsAggregation setField(Field val) { this._field = val; return this; }


  private GoogleNormalizedDistanceHeuristic _gnd;
  public GoogleNormalizedDistanceHeuristic getGnd() { return this._gnd; }
  public SignificantTermsAggregation setGnd(GoogleNormalizedDistanceHeuristic val) { this._gnd = val; return this; }


  private IncludeExclude _include;
  public IncludeExclude getInclude() { return this._include; }
  public SignificantTermsAggregation setInclude(IncludeExclude val) { this._include = val; return this; }


  private Long _minDocCount;
  public Long getMinDocCount() { return this._minDocCount; }
  public SignificantTermsAggregation setMinDocCount(Long val) { this._minDocCount = val; return this; }


  private MutualInformationHeuristic _mutualInformation;
  public MutualInformationHeuristic getMutualInformation() { return this._mutualInformation; }
  public SignificantTermsAggregation setMutualInformation(MutualInformationHeuristic val) { this._mutualInformation = val; return this; }


  private PercentageScoreHeuristic _percentage;
  public PercentageScoreHeuristic getPercentage() { return this._percentage; }
  public SignificantTermsAggregation setPercentage(PercentageScoreHeuristic val) { this._percentage = val; return this; }


  private ScriptedHeuristic _scriptHeuristic;
  public ScriptedHeuristic getScriptHeuristic() { return this._scriptHeuristic; }
  public SignificantTermsAggregation setScriptHeuristic(ScriptedHeuristic val) { this._scriptHeuristic = val; return this; }


  private Long _shardMinDocCount;
  public Long getShardMinDocCount() { return this._shardMinDocCount; }
  public SignificantTermsAggregation setShardMinDocCount(Long val) { this._shardMinDocCount = val; return this; }


  private Integer _shardSize;
  public Integer getShardSize() { return this._shardSize; }
  public SignificantTermsAggregation setShardSize(Integer val) { this._shardSize = val; return this; }


  private Integer _size;
  public Integer getSize() { return this._size; }
  public SignificantTermsAggregation setSize(Integer val) { this._size = val; return this; }

}