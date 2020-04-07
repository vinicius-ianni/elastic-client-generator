
package org.elasticsearch.indices.index_management.delete_index;

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
import org.elasticsearch.common_options.time_unit.*;

public class DeleteIndexRequest  implements XContentable<DeleteIndexRequest> {
  
  static final ParseField ALLOW_NO_INDICES = new ParseField("allow_no_indices");
  private Boolean _allowNoIndices;
  public Boolean getAllowNoIndices() { return this._allowNoIndices; }
  public DeleteIndexRequest setAllowNoIndices(Boolean val) { this._allowNoIndices = val; return this; }


  static final ParseField EXPAND_WILDCARDS = new ParseField("expand_wildcards");
  private ExpandWildcards _expandWildcards;
  public ExpandWildcards getExpandWildcards() { return this._expandWildcards; }
  public DeleteIndexRequest setExpandWildcards(ExpandWildcards val) { this._expandWildcards = val; return this; }


  static final ParseField IGNORE_UNAVAILABLE = new ParseField("ignore_unavailable");
  private Boolean _ignoreUnavailable;
  public Boolean getIgnoreUnavailable() { return this._ignoreUnavailable; }
  public DeleteIndexRequest setIgnoreUnavailable(Boolean val) { this._ignoreUnavailable = val; return this; }


  static final ParseField MASTER_TIMEOUT = new ParseField("master_timeout");
  private Time _masterTimeout;
  public Time getMasterTimeout() { return this._masterTimeout; }
  public DeleteIndexRequest setMasterTimeout(Time val) { this._masterTimeout = val; return this; }


  static final ParseField TIMEOUT = new ParseField("timeout");
  private Time _timeout;
  public Time getTimeout() { return this._timeout; }
  public DeleteIndexRequest setTimeout(Time val) { this._timeout = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public DeleteIndexRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return DeleteIndexRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<DeleteIndexRequest, Void> PARSER =
    new ConstructingObjectParser<>(DeleteIndexRequest.class.getName(), false, args -> new DeleteIndexRequest());

  static {
    PARSER.declareBoolean(DeleteIndexRequest::setAllowNoIndices, ALLOW_NO_INDICES);
    PARSER.declareObject(DeleteIndexRequest::setExpandWildcards, (p, t) -> ExpandWildcards.PARSER.apply(p, null), EXPAND_WILDCARDS);
    PARSER.declareBoolean(DeleteIndexRequest::setIgnoreUnavailable, IGNORE_UNAVAILABLE);
    PARSER.declareObject(DeleteIndexRequest::setMasterTimeout, (p, t) -> Time.PARSER.apply(p, null), MASTER_TIMEOUT);
    PARSER.declareObject(DeleteIndexRequest::setTimeout, (p, t) -> Time.PARSER.apply(p, null), TIMEOUT);
  }

}
