
package org.elasticsearch.x_pack.machine_learning.get_anomaly_records;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.internal.*;
import org.elasticsearch.x_pack.machine_learning.job.results.*;

public class GetAnomalyRecordsResponse  implements XContentable<GetAnomalyRecordsResponse> {
  
  static final ParseField COUNT = new ParseField("count");
  private Long _count;
  public Long getCount() { return this._count; }
  public GetAnomalyRecordsResponse setCount(Long val) { this._count = val; return this; }


  static final ParseField RECORDS = new ParseField("records");
  private List<AnomalyRecord> _records;
  public List<AnomalyRecord> getRecords() { return this._records; }
  public GetAnomalyRecordsResponse setRecords(List<AnomalyRecord> val) { this._records = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public GetAnomalyRecordsResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return GetAnomalyRecordsResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<GetAnomalyRecordsResponse, Void> PARSER =
    new ConstructingObjectParser<>(GetAnomalyRecordsResponse.class.getName(), false, args -> new GetAnomalyRecordsResponse());

  static {
    PARSER.declareLong(GetAnomalyRecordsResponse::setCount, COUNT);
    PARSER.declareObjectArray(GetAnomalyRecordsResponse::setRecords, (p, t) -> AnomalyRecord.PARSER.apply(p), RECORDS);
  }

}
