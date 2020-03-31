
package org.elasticsearch.query_dsl.compound.function_score;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.query_dsl.compound.function_score.functions.*;
import org.elasticsearch.internal.*;
import org.elasticsearch.query_dsl.abstractions.container.*;

public class FunctionScoreQuery  {
  
  private FunctionBoostMode _boostMode;
  public FunctionBoostMode getBoostMode() { return this._boostMode; }
  public FunctionScoreQuery setBoostMode(FunctionBoostMode val) { this._boostMode = val; return this; }


  private ScoreFunction[] _functions;
  public ScoreFunction[] getFunctions() { return this._functions; }
  public FunctionScoreQuery setFunctions(ScoreFunction[] val) { this._functions = val; return this; }


  private Double _maxBoost;
  public Double getMaxBoost() { return this._maxBoost; }
  public FunctionScoreQuery setMaxBoost(Double val) { this._maxBoost = val; return this; }


  private Double _minScore;
  public Double getMinScore() { return this._minScore; }
  public FunctionScoreQuery setMinScore(Double val) { this._minScore = val; return this; }


  private QueryContainer _query;
  public QueryContainer getQuery() { return this._query; }
  public FunctionScoreQuery setQuery(QueryContainer val) { this._query = val; return this; }


  private FunctionScoreMode _scoreMode;
  public FunctionScoreMode getScoreMode() { return this._scoreMode; }
  public FunctionScoreQuery setScoreMode(FunctionScoreMode val) { this._scoreMode = val; return this; }

}
