
package org.elasticsearch.cat.cat_health;

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
import org.elasticsearch.cat.cat_health.*;

public class CatHealthResponse  implements XContentable<CatHealthResponse> {
  
  static final ParseField RECORDS = new ParseField("records");
  private List<CatHealthRecord> _records;
  public List<CatHealthRecord> getRecords() { return this._records; }
  public CatHealthResponse setRecords(List<CatHealthRecord> val) { this._records = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    if (_records != null) {
      builder.array(RECORDS.getPreferredName(), _records);
    }
    return builder;
  }

  @Override
  public CatHealthResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return CatHealthResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<CatHealthResponse, Void> PARSER =
    new ConstructingObjectParser<>(CatHealthResponse.class.getName(), false, args -> new CatHealthResponse());

  static {
    PARSER.declareObjectArray(CatHealthResponse::setRecords, (p, t) -> CatHealthRecord.PARSER.apply(p, t), RECORDS);
  }

}
