
package org.elasticsearch.search.suggesters.phrase_suggester;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.search.suggesters.phrase_suggester.*;

public class PhraseSuggestCollate  {
  
  private Map<String, Object> _params;
  public Map<String, Object> getParams() { return this._params; }
  public PhraseSuggestCollate setParams(Map<String, Object> val) { this._params = val; return this; }


  private Boolean _prune;
  public Boolean getPrune() { return this._prune; }
  public PhraseSuggestCollate setPrune(Boolean val) { this._prune = val; return this; }


  private PhraseSuggestCollateQuery _query;
  public PhraseSuggestCollateQuery getQuery() { return this._query; }
  public PhraseSuggestCollate setQuery(PhraseSuggestCollateQuery val) { this._query = val; return this; }

}
