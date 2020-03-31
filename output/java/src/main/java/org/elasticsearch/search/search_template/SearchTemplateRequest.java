
package org.elasticsearch.search.search_template;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common.*;
import org.elasticsearch.common_abstractions.infer.join_field_routing.*;
import org.elasticsearch.common_options.time_unit.*;

public class SearchTemplateRequest  {
  
  private Boolean _allowNoIndices;
  public Boolean getAllowNoIndices() { return this._allowNoIndices; }
  public SearchTemplateRequest setAllowNoIndices(Boolean val) { this._allowNoIndices = val; return this; }


  private Boolean _ccsMinimizeRoundtrips;
  public Boolean getCcsMinimizeRoundtrips() { return this._ccsMinimizeRoundtrips; }
  public SearchTemplateRequest setCcsMinimizeRoundtrips(Boolean val) { this._ccsMinimizeRoundtrips = val; return this; }


  private ExpandWildcards _expandWildcards;
  public ExpandWildcards getExpandWildcards() { return this._expandWildcards; }
  public SearchTemplateRequest setExpandWildcards(ExpandWildcards val) { this._expandWildcards = val; return this; }


  private Boolean _explain;
  public Boolean getExplain() { return this._explain; }
  public SearchTemplateRequest setExplain(Boolean val) { this._explain = val; return this; }


  private Boolean _ignoreThrottled;
  public Boolean getIgnoreThrottled() { return this._ignoreThrottled; }
  public SearchTemplateRequest setIgnoreThrottled(Boolean val) { this._ignoreThrottled = val; return this; }


  private Boolean _ignoreUnavailable;
  public Boolean getIgnoreUnavailable() { return this._ignoreUnavailable; }
  public SearchTemplateRequest setIgnoreUnavailable(Boolean val) { this._ignoreUnavailable = val; return this; }


  private String _preference;
  public String getPreference() { return this._preference; }
  public SearchTemplateRequest setPreference(String val) { this._preference = val; return this; }


  private Boolean _profile;
  public Boolean getProfile() { return this._profile; }
  public SearchTemplateRequest setProfile(Boolean val) { this._profile = val; return this; }


  private Routing _routing;
  public Routing getRouting() { return this._routing; }
  public SearchTemplateRequest setRouting(Routing val) { this._routing = val; return this; }


  private Time _scroll;
  public Time getScroll() { return this._scroll; }
  public SearchTemplateRequest setScroll(Time val) { this._scroll = val; return this; }


  private SearchType _searchType;
  public SearchType getSearchType() { return this._searchType; }
  public SearchTemplateRequest setSearchType(SearchType val) { this._searchType = val; return this; }


  private Boolean _totalHitsAsInteger;
  public Boolean getTotalHitsAsInteger() { return this._totalHitsAsInteger; }
  public SearchTemplateRequest setTotalHitsAsInteger(Boolean val) { this._totalHitsAsInteger = val; return this; }


  private Boolean _typedKeys;
  public Boolean getTypedKeys() { return this._typedKeys; }
  public SearchTemplateRequest setTypedKeys(Boolean val) { this._typedKeys = val; return this; }


  private String _id;
  public String getId() { return this._id; }
  public SearchTemplateRequest setId(String val) { this._id = val; return this; }


  private Map<String, Object> _params;
  public Map<String, Object> getParams() { return this._params; }
  public SearchTemplateRequest setParams(Map<String, Object> val) { this._params = val; return this; }


  private String _source;
  public String getSource() { return this._source; }
  public SearchTemplateRequest setSource(String val) { this._source = val; return this; }

}
