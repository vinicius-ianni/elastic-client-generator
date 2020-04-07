
package org.elasticsearch.indices.status_management.refresh;

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

public class RefreshRequest  implements XContentable<RefreshRequest> {
  
  static final ParseField ALLOW_NO_INDICES = new ParseField("allow_no_indices");
  private Boolean _allowNoIndices;
  public Boolean getAllowNoIndices() { return this._allowNoIndices; }
  public RefreshRequest setAllowNoIndices(Boolean val) { this._allowNoIndices = val; return this; }


  static final ParseField EXPAND_WILDCARDS = new ParseField("expand_wildcards");
  private ExpandWildcards _expandWildcards;
  public ExpandWildcards getExpandWildcards() { return this._expandWildcards; }
  public RefreshRequest setExpandWildcards(ExpandWildcards val) { this._expandWildcards = val; return this; }


  static final ParseField IGNORE_UNAVAILABLE = new ParseField("ignore_unavailable");
  private Boolean _ignoreUnavailable;
  public Boolean getIgnoreUnavailable() { return this._ignoreUnavailable; }
  public RefreshRequest setIgnoreUnavailable(Boolean val) { this._ignoreUnavailable = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public RefreshRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return RefreshRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<RefreshRequest, Void> PARSER =
    new ConstructingObjectParser<>(RefreshRequest.class.getName(), false, args -> new RefreshRequest());

  static {
    PARSER.declareBoolean(RefreshRequest::setAllowNoIndices, ALLOW_NO_INDICES);
    PARSER.declareObject(RefreshRequest::setExpandWildcards, (p, t) -> ExpandWildcards.PARSER.apply(p, null), EXPAND_WILDCARDS);
    PARSER.declareBoolean(RefreshRequest::setIgnoreUnavailable, IGNORE_UNAVAILABLE);
  }

}
