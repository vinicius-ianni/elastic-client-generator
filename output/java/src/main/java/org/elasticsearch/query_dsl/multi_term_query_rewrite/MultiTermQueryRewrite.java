
package org.elasticsearch.query_dsl.multi_term_query_rewrite;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.query_dsl.multi_term_query_rewrite.*;
import org.elasticsearch.internal.*;

public class MultiTermQueryRewrite  {
  
  private MultiTermQueryRewrite _constantScore;
  public MultiTermQueryRewrite getConstantScore() { return this._constantScore; }
  public MultiTermQueryRewrite setConstantScore(MultiTermQueryRewrite val) { this._constantScore = val; return this; }


  private MultiTermQueryRewrite _constantScoreBoolean;
  public MultiTermQueryRewrite getConstantScoreBoolean() { return this._constantScoreBoolean; }
  public MultiTermQueryRewrite setConstantScoreBoolean(MultiTermQueryRewrite val) { this._constantScoreBoolean = val; return this; }


  private RewriteMultiTerm _rewrite;
  public RewriteMultiTerm getRewrite() { return this._rewrite; }
  public MultiTermQueryRewrite setRewrite(RewriteMultiTerm val) { this._rewrite = val; return this; }


  private MultiTermQueryRewrite _scoringBoolean;
  public MultiTermQueryRewrite getScoringBoolean() { return this._scoringBoolean; }
  public MultiTermQueryRewrite setScoringBoolean(MultiTermQueryRewrite val) { this._scoringBoolean = val; return this; }


  private Integer _size;
  public Integer getSize() { return this._size; }
  public MultiTermQueryRewrite setSize(Integer val) { this._size = val; return this; }

}
