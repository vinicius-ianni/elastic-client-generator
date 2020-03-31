
package org.elasticsearch.common_options.stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class SearchStats  {
  
  private Long _fetchCurrent;
  public Long getFetchCurrent() { return this._fetchCurrent; }
  public SearchStats setFetchCurrent(Long val) { this._fetchCurrent = val; return this; }


  private Long _fetchTimeInMillis;
  public Long getFetchTimeInMillis() { return this._fetchTimeInMillis; }
  public SearchStats setFetchTimeInMillis(Long val) { this._fetchTimeInMillis = val; return this; }


  private Long _fetchTotal;
  public Long getFetchTotal() { return this._fetchTotal; }
  public SearchStats setFetchTotal(Long val) { this._fetchTotal = val; return this; }


  private Long _openContexts;
  public Long getOpenContexts() { return this._openContexts; }
  public SearchStats setOpenContexts(Long val) { this._openContexts = val; return this; }


  private Long _queryCurrent;
  public Long getQueryCurrent() { return this._queryCurrent; }
  public SearchStats setQueryCurrent(Long val) { this._queryCurrent = val; return this; }


  private Long _queryTimeInMillis;
  public Long getQueryTimeInMillis() { return this._queryTimeInMillis; }
  public SearchStats setQueryTimeInMillis(Long val) { this._queryTimeInMillis = val; return this; }


  private Long _queryTotal;
  public Long getQueryTotal() { return this._queryTotal; }
  public SearchStats setQueryTotal(Long val) { this._queryTotal = val; return this; }


  private Long _scrollCurrent;
  public Long getScrollCurrent() { return this._scrollCurrent; }
  public SearchStats setScrollCurrent(Long val) { this._scrollCurrent = val; return this; }


  private Long _scrollTimeInMillis;
  public Long getScrollTimeInMillis() { return this._scrollTimeInMillis; }
  public SearchStats setScrollTimeInMillis(Long val) { this._scrollTimeInMillis = val; return this; }


  private Long _scrollTotal;
  public Long getScrollTotal() { return this._scrollTotal; }
  public SearchStats setScrollTotal(Long val) { this._scrollTotal = val; return this; }


  private Long _suggestCurrent;
  public Long getSuggestCurrent() { return this._suggestCurrent; }
  public SearchStats setSuggestCurrent(Long val) { this._suggestCurrent = val; return this; }


  private Long _suggestTimeInMillis;
  public Long getSuggestTimeInMillis() { return this._suggestTimeInMillis; }
  public SearchStats setSuggestTimeInMillis(Long val) { this._suggestTimeInMillis = val; return this; }


  private Long _suggestTotal;
  public Long getSuggestTotal() { return this._suggestTotal; }
  public SearchStats setSuggestTotal(Long val) { this._suggestTotal = val; return this; }

}
