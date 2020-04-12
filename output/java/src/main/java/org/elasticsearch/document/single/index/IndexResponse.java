
package org.elasticsearch.document.single.index;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


public class IndexResponse  implements XContentable<IndexResponse> {
  
  static final ParseField IS_VALID = new ParseField("is_valid");
  private Boolean _isValid;
  public Boolean getIsValid() { return this._isValid; }
  public IndexResponse setIsValid(Boolean val) { this._isValid = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    builder.field(IS_VALID.getPreferredName(), _isValid);
    return builder;
  }

  @Override
  public IndexResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return IndexResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<IndexResponse, Void> PARSER =
    new ConstructingObjectParser<>(IndexResponse.class.getName(), false, args -> new IndexResponse());

  static {
    PARSER.declareBoolean(IndexResponse::setIsValid, IS_VALID);
  }

}
