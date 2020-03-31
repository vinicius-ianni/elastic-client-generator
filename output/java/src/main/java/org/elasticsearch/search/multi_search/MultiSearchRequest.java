
package org.elasticsearch.search.multi_search;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.common.*;
import org.elasticsearch.search.search.*;

public class MultiSearchRequest  {
  
  private Boolean _ccsMinimizeRoundtrips;
  public Boolean getCcsMinimizeRoundtrips() { return this._ccsMinimizeRoundtrips; }
  public MultiSearchRequest setCcsMinimizeRoundtrips(Boolean val) { this._ccsMinimizeRoundtrips = val; return this; }


  private Long _maxConcurrentSearches;
  public Long getMaxConcurrentSearches() { return this._maxConcurrentSearches; }
  public MultiSearchRequest setMaxConcurrentSearches(Long val) { this._maxConcurrentSearches = val; return this; }


  private Long _maxConcurrentShardRequests;
  public Long getMaxConcurrentShardRequests() { return this._maxConcurrentShardRequests; }
  public MultiSearchRequest setMaxConcurrentShardRequests(Long val) { this._maxConcurrentShardRequests = val; return this; }


  private Long _preFilterShardSize;
  public Long getPreFilterShardSize() { return this._preFilterShardSize; }
  public MultiSearchRequest setPreFilterShardSize(Long val) { this._preFilterShardSize = val; return this; }


  private SearchType _searchType;
  public SearchType getSearchType() { return this._searchType; }
  public MultiSearchRequest setSearchType(SearchType val) { this._searchType = val; return this; }


  private Boolean _totalHitsAsInteger;
  public Boolean getTotalHitsAsInteger() { return this._totalHitsAsInteger; }
  public MultiSearchRequest setTotalHitsAsInteger(Boolean val) { this._totalHitsAsInteger = val; return this; }


  private Boolean _typedKeys;
  public Boolean getTypedKeys() { return this._typedKeys; }
  public MultiSearchRequest setTypedKeys(Boolean val) { this._typedKeys = val; return this; }


  private Map<String, SearchRequest> _operations;
  public Map<String, SearchRequest> getOperations() { return this._operations; }
  public MultiSearchRequest setOperations(Map<String, SearchRequest> val) { this._operations = val; return this; }

}
