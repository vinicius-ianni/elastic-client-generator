
package org.elasticsearch.cat.cat_indices;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.cat.cat_indices.*;

public class CatIndicesResponse  implements XContentable<CatIndicesResponse> {
  
  static final ParseField RECORDS = new ParseField("records");
  private List<CatIndicesRecord> _records;
  public List<CatIndicesRecord> getRecords() { return this._records; }
  public CatIndicesResponse setRecords(List<CatIndicesRecord> val) { this._records = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public CatIndicesResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return CatIndicesResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<CatIndicesResponse, Void> PARSER =
    new ConstructingObjectParser<>(CatIndicesResponse.class.getName(), false, args -> new CatIndicesResponse());

  static {
    PARSER.declareObjectArray(CatIndicesResponse::setRecords, (p, t) -> CatIndicesRecord.PARSER.apply(p), RECORDS);
  }

}
