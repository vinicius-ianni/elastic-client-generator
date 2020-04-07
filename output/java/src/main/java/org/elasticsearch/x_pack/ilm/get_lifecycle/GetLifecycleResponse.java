
package org.elasticsearch.x_pack.ilm.get_lifecycle;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.x_pack.ilm.get_lifecycle.*;
import org.elasticsearch.common_abstractions.response.*;

public class GetLifecycleResponse extends DictionaryResponseBase<String, LifecyclePolicy> implements XContentable<GetLifecycleResponse> {
  
  static final ParseField POLICIES = new ParseField("policies");
  private NamedContainer<String, LifecyclePolicy> _policies;
  public NamedContainer<String, LifecyclePolicy> getPolicies() { return this._policies; }
  public GetLifecycleResponse setPolicies(NamedContainer<String, LifecyclePolicy> val) { this._policies = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public GetLifecycleResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return GetLifecycleResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<GetLifecycleResponse, Void> PARSER =
    new ConstructingObjectParser<>(GetLifecycleResponse.class.getName(), false, args -> new GetLifecycleResponse());

  static {
    PARSER.declareObject(GetLifecycleResponse::setPolicies, (p, t) ->  new NamedContainer<>(n -> () -> n,pp -> LifecyclePolicy.PARSER.apply(pp, null)), POLICIES);;
  }

}
