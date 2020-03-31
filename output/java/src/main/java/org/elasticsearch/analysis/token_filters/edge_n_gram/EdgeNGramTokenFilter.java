
package org.elasticsearch.analysis.token_filters.edge_n_gram;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.analysis.token_filters.edge_n_gram.*;

public class EdgeNGramTokenFilter  {
  
  private Integer _maxGram;
  public Integer getMaxGram() { return this._maxGram; }
  public EdgeNGramTokenFilter setMaxGram(Integer val) { this._maxGram = val; return this; }


  private Integer _minGram;
  public Integer getMinGram() { return this._minGram; }
  public EdgeNGramTokenFilter setMinGram(Integer val) { this._minGram = val; return this; }


  private EdgeNGramSide _side;
  public EdgeNGramSide getSide() { return this._side; }
  public EdgeNGramTokenFilter setSide(EdgeNGramSide val) { this._side = val; return this; }

}
