
package org.elasticsearch.search.search.rescoring;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.query_dsl.abstractions.container.*;
import org.elasticsearch.internal.*;
import org.elasticsearch.search.search.rescoring.*;

public class RescoreQuery  {
  
  private QueryContainer _rescoreQuery;
  public QueryContainer getRescoreQuery() { return this._rescoreQuery; }
  public RescoreQuery setRescoreQuery(QueryContainer val) { this._rescoreQuery = val; return this; }


  private Double _queryWeight;
  public Double getQueryWeight() { return this._queryWeight; }
  public RescoreQuery setQueryWeight(Double val) { this._queryWeight = val; return this; }


  private Double _rescoreQueryWeight;
  public Double getRescoreQueryWeight() { return this._rescoreQueryWeight; }
  public RescoreQuery setRescoreQueryWeight(Double val) { this._rescoreQueryWeight = val; return this; }


  private ScoreMode _scoreMode;
  public ScoreMode getScoreMode() { return this._scoreMode; }
  public RescoreQuery setScoreMode(ScoreMode val) { this._scoreMode = val; return this; }

}
