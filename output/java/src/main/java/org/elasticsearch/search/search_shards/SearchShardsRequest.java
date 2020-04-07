
package org.elasticsearch.search.search_shards;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.common.*;
import org.elasticsearch.common_abstractions.infer.join_field_routing.*;

public class SearchShardsRequest  implements XContentable<SearchShardsRequest> {
  
  static final ParseField ALLOW_NO_INDICES = new ParseField("allow_no_indices");
  private Boolean _allowNoIndices;
  public Boolean getAllowNoIndices() { return this._allowNoIndices; }
  public SearchShardsRequest setAllowNoIndices(Boolean val) { this._allowNoIndices = val; return this; }


  static final ParseField EXPAND_WILDCARDS = new ParseField("expand_wildcards");
  private ExpandWildcards _expandWildcards;
  public ExpandWildcards getExpandWildcards() { return this._expandWildcards; }
  public SearchShardsRequest setExpandWildcards(ExpandWildcards val) { this._expandWildcards = val; return this; }


  static final ParseField IGNORE_UNAVAILABLE = new ParseField("ignore_unavailable");
  private Boolean _ignoreUnavailable;
  public Boolean getIgnoreUnavailable() { return this._ignoreUnavailable; }
  public SearchShardsRequest setIgnoreUnavailable(Boolean val) { this._ignoreUnavailable = val; return this; }


  static final ParseField LOCAL = new ParseField("local");
  private Boolean _local;
  public Boolean getLocal() { return this._local; }
  public SearchShardsRequest setLocal(Boolean val) { this._local = val; return this; }


  static final ParseField PREFERENCE = new ParseField("preference");
  private String _preference;
  public String getPreference() { return this._preference; }
  public SearchShardsRequest setPreference(String val) { this._preference = val; return this; }


  static final ParseField ROUTING = new ParseField("routing");
  private Routing _routing;
  public Routing getRouting() { return this._routing; }
  public SearchShardsRequest setRouting(Routing val) { this._routing = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public SearchShardsRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return SearchShardsRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<SearchShardsRequest, Void> PARSER =
    new ConstructingObjectParser<>(SearchShardsRequest.class.getName(), false, args -> new SearchShardsRequest());

  static {
    PARSER.declareBoolean(SearchShardsRequest::setAllowNoIndices, ALLOW_NO_INDICES);
    PARSER.declareObject(SearchShardsRequest::setExpandWildcards, (p, t) -> ExpandWildcards.PARSER.apply(p, null), EXPAND_WILDCARDS);
    PARSER.declareBoolean(SearchShardsRequest::setIgnoreUnavailable, IGNORE_UNAVAILABLE);
    PARSER.declareBoolean(SearchShardsRequest::setLocal, LOCAL);
    PARSER.declareString(SearchShardsRequest::setPreference, PREFERENCE);
    PARSER.declareRouting(SearchShardsRequest::setRouting, (p, t) -> Routing.createFrom(p), ROUTING);
  }

}
