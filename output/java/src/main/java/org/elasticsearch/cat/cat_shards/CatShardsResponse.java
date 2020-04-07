
package org.elasticsearch.cat.cat_shards;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.cat.cat_shards.*;

public class CatShardsResponse  implements XContentable<CatShardsResponse> {
  
  static final ParseField RECORDS = new ParseField("records");
  private List<CatShardsRecord> _records;
  public List<CatShardsRecord> getRecords() { return this._records; }
  public CatShardsResponse setRecords(List<CatShardsRecord> val) { this._records = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public CatShardsResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return CatShardsResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<CatShardsResponse, Void> PARSER =
    new ConstructingObjectParser<>(CatShardsResponse.class.getName(), false, args -> new CatShardsResponse());

  static {
    PARSER.declareObjectArray(CatShardsResponse::setRecords, (p, t) -> CatShardsRecord.PARSER.apply(p), RECORDS);
  }

}
