
package org.elasticsearch.cat.cat_nodes;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.cat.cat_nodes.*;

public class CatNodesResponse  implements XContentable<CatNodesResponse> {
  
  static final ParseField RECORDS = new ParseField("records");
  private List<CatNodesRecord> _records;
  public List<CatNodesRecord> getRecords() { return this._records; }
  public CatNodesResponse setRecords(List<CatNodesRecord> val) { this._records = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public CatNodesResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return CatNodesResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<CatNodesResponse, Void> PARSER =
    new ConstructingObjectParser<>(CatNodesResponse.class.getName(), false, args -> new CatNodesResponse());

  static {
    PARSER.declareObjectArray(CatNodesResponse::setRecords, (p, t) -> CatNodesRecord.PARSER.apply(p), RECORDS);
  }

}
