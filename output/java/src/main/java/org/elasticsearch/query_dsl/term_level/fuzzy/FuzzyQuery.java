
package org.elasticsearch.query_dsl.term_level.fuzzy;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.query_dsl.multi_term_query_rewrite.*;

public class FuzzyQuery  {
  
  private Integer _maxExpansions;
  public Integer getMaxExpansions() { return this._maxExpansions; }
  public FuzzyQuery setMaxExpansions(Integer val) { this._maxExpansions = val; return this; }


  private Integer _prefixLength;
  public Integer getPrefixLength() { return this._prefixLength; }
  public FuzzyQuery setPrefixLength(Integer val) { this._prefixLength = val; return this; }


  private MultiTermQueryRewrite _rewrite;
  public MultiTermQueryRewrite getRewrite() { return this._rewrite; }
  public FuzzyQuery setRewrite(MultiTermQueryRewrite val) { this._rewrite = val; return this; }


  private Boolean _transpositions;
  public Boolean getTranspositions() { return this._transpositions; }
  public FuzzyQuery setTranspositions(Boolean val) { this._transpositions = val; return this; }

}
