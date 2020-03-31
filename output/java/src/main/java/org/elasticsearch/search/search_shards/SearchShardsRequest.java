
package org.elasticsearch.search.search_shards;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common.*;
import org.elasticsearch.common_abstractions.infer.join_field_routing.*;

public class SearchShardsRequest  {
  
  private Boolean _allowNoIndices;
  public Boolean getAllowNoIndices() { return this._allowNoIndices; }
  public SearchShardsRequest setAllowNoIndices(Boolean val) { this._allowNoIndices = val; return this; }


  private ExpandWildcards _expandWildcards;
  public ExpandWildcards getExpandWildcards() { return this._expandWildcards; }
  public SearchShardsRequest setExpandWildcards(ExpandWildcards val) { this._expandWildcards = val; return this; }


  private Boolean _ignoreUnavailable;
  public Boolean getIgnoreUnavailable() { return this._ignoreUnavailable; }
  public SearchShardsRequest setIgnoreUnavailable(Boolean val) { this._ignoreUnavailable = val; return this; }


  private Boolean _local;
  public Boolean getLocal() { return this._local; }
  public SearchShardsRequest setLocal(Boolean val) { this._local = val; return this; }


  private String _preference;
  public String getPreference() { return this._preference; }
  public SearchShardsRequest setPreference(String val) { this._preference = val; return this; }


  private Routing _routing;
  public Routing getRouting() { return this._routing; }
  public SearchShardsRequest setRouting(Routing val) { this._routing = val; return this; }

}
