
package org.elasticsearch.x_pack.watcher.input;

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

public class SearchInput  implements XContentable<SearchInput> {
  
  static final ParseField EXTRACT = new ParseField("extract");
  private List<String> _extract;
  public List<String> getExtract() { return this._extract; }
  public SearchInput setExtract(List<String> val) { this._extract = val; return this; }


  static final ParseField REQUEST = new ParseField("request");
  private SearchInputRequest _request;
  public SearchInputRequest getRequest() { return this._request; }
  public SearchInput setRequest(SearchInputRequest val) { this._request = val; return this; }


  static final ParseField TIMEOUT = new ParseField("timeout");
  private Time _timeout;
  public Time getTimeout() { return this._timeout; }
  public SearchInput setTimeout(Time val) { this._timeout = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public SearchInput fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return SearchInput.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<SearchInput, Void> PARSER =
    new ConstructingObjectParser<>(SearchInput.class.getName(), false, args -> new SearchInput());

  static {
    PARSER.declareStringArray(SearchInput::setExtract, EXTRACT);
    PARSER.declareObject(SearchInput::setRequest, (p, t) -> SearchInputRequest.PARSER.apply(p, null), REQUEST);
    PARSER.declareObject(SearchInput::setTimeout, (p, t) -> Time.PARSER.apply(p, null), TIMEOUT);
  }

}
