
package org.elasticsearch.search.search.rescoring;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.search.search.rescoring.*;
import org.elasticsearch.internal.*;

public class Rescore  {
  
  private RescoreQuery _query;
  public RescoreQuery getQuery() { return this._query; }
  public Rescore setQuery(RescoreQuery val) { this._query = val; return this; }


  private Integer _windowSize;
  public Integer getWindowSize() { return this._windowSize; }
  public Rescore setWindowSize(Integer val) { this._windowSize = val; return this; }

}
