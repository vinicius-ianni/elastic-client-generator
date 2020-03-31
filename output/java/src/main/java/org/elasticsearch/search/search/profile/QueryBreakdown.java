
package org.elasticsearch.search.search.profile;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class QueryBreakdown  {
  
  private Long _advance;
  public Long getAdvance() { return this._advance; }
  public QueryBreakdown setAdvance(Long val) { this._advance = val; return this; }


  private Long _buildScorer;
  public Long getBuildScorer() { return this._buildScorer; }
  public QueryBreakdown setBuildScorer(Long val) { this._buildScorer = val; return this; }


  private Long _createWeight;
  public Long getCreateWeight() { return this._createWeight; }
  public QueryBreakdown setCreateWeight(Long val) { this._createWeight = val; return this; }


  private Long _match;
  public Long getMatch() { return this._match; }
  public QueryBreakdown setMatch(Long val) { this._match = val; return this; }


  private Long _nextDoc;
  public Long getNextDoc() { return this._nextDoc; }
  public QueryBreakdown setNextDoc(Long val) { this._nextDoc = val; return this; }


  private Long _score;
  public Long getScore() { return this._score; }
  public QueryBreakdown setScore(Long val) { this._score = val; return this; }

}
