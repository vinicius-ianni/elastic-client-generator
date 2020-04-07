
package org.elasticsearch.indices.alias_management.alias_exists;

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

public class AliasExistsRequest  implements XContentable<AliasExistsRequest> {
  
  static final ParseField ALLOW_NO_INDICES = new ParseField("allow_no_indices");
  private Boolean _allowNoIndices;
  public Boolean getAllowNoIndices() { return this._allowNoIndices; }
  public AliasExistsRequest setAllowNoIndices(Boolean val) { this._allowNoIndices = val; return this; }


  static final ParseField EXPAND_WILDCARDS = new ParseField("expand_wildcards");
  private ExpandWildcards _expandWildcards;
  public ExpandWildcards getExpandWildcards() { return this._expandWildcards; }
  public AliasExistsRequest setExpandWildcards(ExpandWildcards val) { this._expandWildcards = val; return this; }


  static final ParseField IGNORE_UNAVAILABLE = new ParseField("ignore_unavailable");
  private Boolean _ignoreUnavailable;
  public Boolean getIgnoreUnavailable() { return this._ignoreUnavailable; }
  public AliasExistsRequest setIgnoreUnavailable(Boolean val) { this._ignoreUnavailable = val; return this; }


  static final ParseField LOCAL = new ParseField("local");
  private Boolean _local;
  public Boolean getLocal() { return this._local; }
  public AliasExistsRequest setLocal(Boolean val) { this._local = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public AliasExistsRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return AliasExistsRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<AliasExistsRequest, Void> PARSER =
    new ConstructingObjectParser<>(AliasExistsRequest.class.getName(), false, args -> new AliasExistsRequest());

  static {
    PARSER.declareBoolean(AliasExistsRequest::setAllowNoIndices, ALLOW_NO_INDICES);
    PARSER.declareObject(AliasExistsRequest::setExpandWildcards, (p, t) -> ExpandWildcards.PARSER.apply(p, null), EXPAND_WILDCARDS);
    PARSER.declareBoolean(AliasExistsRequest::setIgnoreUnavailable, IGNORE_UNAVAILABLE);
    PARSER.declareBoolean(AliasExistsRequest::setLocal, LOCAL);
  }

}
