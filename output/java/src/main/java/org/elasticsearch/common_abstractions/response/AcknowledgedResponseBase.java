
package org.elasticsearch.common_abstractions.response;

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


public class AcknowledgedResponseBase  implements XContentable<AcknowledgedResponseBase> {
  
  static final ParseField ACKNOWLEDGED = new ParseField("acknowledged");
  private Boolean _acknowledged;
  public Boolean getAcknowledged() { return this._acknowledged; }
  public AcknowledgedResponseBase setAcknowledged(Boolean val) { this._acknowledged = val; return this; }


  static final ParseField IS_VALID = new ParseField("is_valid");
  private Boolean _isValid;
  public Boolean getIsValid() { return this._isValid; }
  public AcknowledgedResponseBase setIsValid(Boolean val) { this._isValid = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    builder.startObject();
    if (_acknowledged != null) {
      builder.field(ACKNOWLEDGED.getPreferredName(), _acknowledged);
    }
    if (_isValid != null) {
      builder.field(IS_VALID.getPreferredName(), _isValid);
    }
    builder.endObject();
    return builder;
  }

  @Override
  public AcknowledgedResponseBase fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return AcknowledgedResponseBase.PARSER.apply(parser, null);
  }

  public static final ObjectParser<AcknowledgedResponseBase, Void> PARSER =
    new ObjectParser<>(AcknowledgedResponseBase.class.getName(), false, AcknowledgedResponseBase::new);

  static {
    PARSER.declareBoolean(AcknowledgedResponseBase::setAcknowledged, ACKNOWLEDGED);
    PARSER.declareBoolean(AcknowledgedResponseBase::setIsValid, IS_VALID);
  }

}
