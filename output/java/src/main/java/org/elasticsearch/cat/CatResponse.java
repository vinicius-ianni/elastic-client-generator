
package org.elasticsearch.cat;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class CatResponse<TCatRecord>  implements XContentable<CatResponse> {
  
  static final ParseField RECORDS = new ParseField("records");
  private List<TCatRecord> _records;
  public List<TCatRecord> getRecords() { return this._records; }
  public CatResponse<TCatRecord> setRecords(List<TCatRecord> val) { this._records = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public CatResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return CatResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<CatResponse, Void> PARSER =
    new ConstructingObjectParser<>(CatResponse.class.getName(), false, args -> new CatResponse());

  static {
    PARSER.declareObjectArray(CatResponse::setRecords, (p, t) -> TCatRecord.PARSER.apply(p), RECORDS);
  }

}
