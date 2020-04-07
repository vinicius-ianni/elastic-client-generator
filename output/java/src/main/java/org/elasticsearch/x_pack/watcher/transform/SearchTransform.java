
package org.elasticsearch.x_pack.watcher.transform;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.x_pack.watcher.input.*;
import org.elasticsearch.common_options.time_unit.*;

public class SearchTransform  implements XContentable<SearchTransform> {
  
  static final ParseField REQUEST = new ParseField("request");
  private SearchInputRequest _request;
  public SearchInputRequest getRequest() { return this._request; }
  public SearchTransform setRequest(SearchInputRequest val) { this._request = val; return this; }


  static final ParseField TIMEOUT = new ParseField("timeout");
  private Time _timeout;
  public Time getTimeout() { return this._timeout; }
  public SearchTransform setTimeout(Time val) { this._timeout = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public SearchTransform fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return SearchTransform.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<SearchTransform, Void> PARSER =
    new ConstructingObjectParser<>(SearchTransform.class.getName(), false, args -> new SearchTransform());

  static {
    PARSER.declareObject(SearchTransform::setRequest, (p, t) -> SearchInputRequest.PARSER.apply(p, null), REQUEST);
    PARSER.declareObject(SearchTransform::setTimeout, (p, t) -> Time.PARSER.apply(p, null), TIMEOUT);
  }

}
