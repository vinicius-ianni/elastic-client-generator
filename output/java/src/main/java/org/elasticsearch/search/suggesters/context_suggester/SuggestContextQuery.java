
package org.elasticsearch.search.suggesters.context_suggester;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.search.suggesters.context_suggester.*;
import org.elasticsearch.query_dsl.geo.*;
import org.elasticsearch.common_options.geo.*;

public class SuggestContextQuery  {
  
  private Double _boost;
  public Double getBoost() { return this._boost; }
  public SuggestContextQuery setBoost(Double val) { this._boost = val; return this; }


  private Context _context;
  public Context getContext() { return this._context; }
  public SuggestContextQuery setContext(Context val) { this._context = val; return this; }


  private Either<Distance[], Integer[]> _neighbours;
  public Either<Distance[], Integer[]> getNeighbours() { return this._neighbours; }
  public SuggestContextQuery setNeighbours(Either<Distance[], Integer[]> val) { this._neighbours = val; return this; }


  private Either<Distance, Integer> _precision;
  public Either<Distance, Integer> getPrecision() { return this._precision; }
  public SuggestContextQuery setPrecision(Either<Distance, Integer> val) { this._precision = val; return this; }


  private Boolean _prefix;
  public Boolean getPrefix() { return this._prefix; }
  public SuggestContextQuery setPrefix(Boolean val) { this._prefix = val; return this; }

}
