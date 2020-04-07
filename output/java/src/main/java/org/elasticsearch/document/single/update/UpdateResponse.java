
package org.elasticsearch.document.single.update;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.search.explain.*;

public class UpdateResponse<TDocument>  implements XContentable<UpdateResponse> {
  
  static final ParseField IS_VALID = new ParseField("is_valid");
  private Boolean _isValid;
  public Boolean getIsValid() { return this._isValid; }
  public UpdateResponse<TDocument> setIsValid(Boolean val) { this._isValid = val; return this; }


  static final ParseField GET = new ParseField("get");
  private InlineGet<TDocument> _get;
  public InlineGet<TDocument> getGet() { return this._get; }
  public UpdateResponse<TDocument> setGet(InlineGet<TDocument> val) { this._get = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public UpdateResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return UpdateResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<UpdateResponse, Void> PARSER =
    new ConstructingObjectParser<>(UpdateResponse.class.getName(), false, args -> new UpdateResponse());

  static {
    PARSER.declareBoolean(UpdateResponse::setIsValid, IS_VALID);
    PARSER.declareObject(UpdateResponse::setGet, (p, t) -> InlineGet<TDocument>.PARSER.apply(p, null), GET);
  }

}
