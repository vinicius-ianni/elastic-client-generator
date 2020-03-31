
package org.elasticsearch.x_pack.machine_learning.get_anomaly_records;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.x_pack.machine_learning.job.results.*;

public class GetAnomalyRecordsResponse  {
  
  private Long _count;
  public Long getCount() { return this._count; }
  public GetAnomalyRecordsResponse setCount(Long val) { this._count = val; return this; }


  private AnomalyRecord[] _records;
  public AnomalyRecord[] getRecords() { return this._records; }
  public GetAnomalyRecordsResponse setRecords(AnomalyRecord[] val) { this._records = val; return this; }

}
