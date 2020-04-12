
package org.elasticsearch.cat.cat_allocation;

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
import org.elasticsearch.cat.cat_allocation.*;

public class CatAllocationResponse  implements XContentable<CatAllocationResponse> {
  
  static final ParseField RECORDS = new ParseField("records");
  private List<CatAllocationRecord> _records;
  public List<CatAllocationRecord> getRecords() { return this._records; }
  public CatAllocationResponse setRecords(List<CatAllocationRecord> val) { this._records = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    builder.startObject();
    if (_records != null) {
      builder.array(RECORDS.getPreferredName(), _records);
    }
    builder.endObject();
    return builder;
  }

  @Override
  public CatAllocationResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return CatAllocationResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<CatAllocationResponse, Void> PARSER =
    new ConstructingObjectParser<>(CatAllocationResponse.class.getName(), false, args -> new CatAllocationResponse());

  static {
    PARSER.declareObjectArray(CatAllocationResponse::setRecords, (p, t) -> CatAllocationRecord.PARSER.apply(p, t), RECORDS);
  }

}
