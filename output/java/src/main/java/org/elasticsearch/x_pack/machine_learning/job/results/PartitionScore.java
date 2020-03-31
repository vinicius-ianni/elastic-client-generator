
package org.elasticsearch.x_pack.machine_learning.job.results;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class PartitionScore  {
  
  private Double _initialRecordScore;
  public Double getInitialRecordScore() { return this._initialRecordScore; }
  public PartitionScore setInitialRecordScore(Double val) { this._initialRecordScore = val; return this; }


  private String _partitionFieldName;
  public String getPartitionFieldName() { return this._partitionFieldName; }
  public PartitionScore setPartitionFieldName(String val) { this._partitionFieldName = val; return this; }


  private String _partitionFieldValue;
  public String getPartitionFieldValue() { return this._partitionFieldValue; }
  public PartitionScore setPartitionFieldValue(String val) { this._partitionFieldValue = val; return this; }


  private Double _probability;
  public Double getProbability() { return this._probability; }
  public PartitionScore setProbability(Double val) { this._probability = val; return this; }


  private Double _recordScore;
  public Double getRecordScore() { return this._recordScore; }
  public PartitionScore setRecordScore(Double val) { this._recordScore = val; return this; }

}
