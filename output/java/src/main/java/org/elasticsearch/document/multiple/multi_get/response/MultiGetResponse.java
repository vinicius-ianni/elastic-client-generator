
package org.elasticsearch.document.multiple.multi_get.response;

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
import org.elasticsearch.document.multiple.multi_get.response.*;

public class MultiGetResponse  implements XContentable<MultiGetResponse> {
  
  static final ParseField HITS = new ParseField("hits");
  private List<MultiGetHit<Object>> _hits;
  public List<MultiGetHit<Object>> getHits() { return this._hits; }
  public MultiGetResponse setHits(List<MultiGetHit<Object>> val) { this._hits = val; return this; }


  static final ParseField IS_VALID = new ParseField("is_valid");
  private Boolean _isValid;
  public Boolean getIsValid() { return this._isValid; }
  public MultiGetResponse setIsValid(Boolean val) { this._isValid = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    builder.startObject();
    if (_hits != null) {
      builder.array(HITS.getPreferredName(), _hits);
    }
    builder.field(IS_VALID.getPreferredName(), _isValid);
    builder.endObject();
    return builder;
  }

  @Override
  public MultiGetResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return MultiGetResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<MultiGetResponse, Void> PARSER =
    new ConstructingObjectParser<>(MultiGetResponse.class.getName(), false, args -> new MultiGetResponse());

  static {
    MultiGetHit<Object> _hits = new MultiGetHit<Object>();
    PARSER.declareObjectArray(MultiGetResponse::setHits, (p, t) -> _hits.PARSER.apply(p, t), HITS);
    PARSER.declareBoolean(MultiGetResponse::setIsValid, IS_VALID);
  }

}
