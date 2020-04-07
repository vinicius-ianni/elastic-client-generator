
package org.elasticsearch.cat.cat_thread_pool;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.cat.cat_thread_pool.*;

public class CatThreadPoolResponse  implements XContentable<CatThreadPoolResponse> {
  
  static final ParseField RECORDS = new ParseField("records");
  private List<CatThreadPoolRecord> _records;
  public List<CatThreadPoolRecord> getRecords() { return this._records; }
  public CatThreadPoolResponse setRecords(List<CatThreadPoolRecord> val) { this._records = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public CatThreadPoolResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return CatThreadPoolResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<CatThreadPoolResponse, Void> PARSER =
    new ConstructingObjectParser<>(CatThreadPoolResponse.class.getName(), false, args -> new CatThreadPoolResponse());

  static {
    PARSER.declareObjectArray(CatThreadPoolResponse::setRecords, (p, t) -> CatThreadPoolRecord.PARSER.apply(p), RECORDS);
  }

}
