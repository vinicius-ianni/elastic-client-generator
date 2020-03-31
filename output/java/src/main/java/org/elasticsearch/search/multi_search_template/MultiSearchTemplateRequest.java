
package org.elasticsearch.search.multi_search_template;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.common.*;
import org.elasticsearch.search.search_template.*;

public class MultiSearchTemplateRequest  {
  
  private Boolean _ccsMinimizeRoundtrips;
  public Boolean getCcsMinimizeRoundtrips() { return this._ccsMinimizeRoundtrips; }
  public MultiSearchTemplateRequest setCcsMinimizeRoundtrips(Boolean val) { this._ccsMinimizeRoundtrips = val; return this; }


  private Long _maxConcurrentSearches;
  public Long getMaxConcurrentSearches() { return this._maxConcurrentSearches; }
  public MultiSearchTemplateRequest setMaxConcurrentSearches(Long val) { this._maxConcurrentSearches = val; return this; }


  private SearchType _searchType;
  public SearchType getSearchType() { return this._searchType; }
  public MultiSearchTemplateRequest setSearchType(SearchType val) { this._searchType = val; return this; }


  private Boolean _totalHitsAsInteger;
  public Boolean getTotalHitsAsInteger() { return this._totalHitsAsInteger; }
  public MultiSearchTemplateRequest setTotalHitsAsInteger(Boolean val) { this._totalHitsAsInteger = val; return this; }


  private Boolean _typedKeys;
  public Boolean getTypedKeys() { return this._typedKeys; }
  public MultiSearchTemplateRequest setTypedKeys(Boolean val) { this._typedKeys = val; return this; }


  private Map<String, SearchTemplateRequest> _operations;
  public Map<String, SearchTemplateRequest> getOperations() { return this._operations; }
  public MultiSearchTemplateRequest setOperations(Map<String, SearchTemplateRequest> val) { this._operations = val; return this; }

}
