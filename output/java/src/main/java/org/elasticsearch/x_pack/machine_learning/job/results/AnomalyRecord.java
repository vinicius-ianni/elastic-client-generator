
package org.elasticsearch.x_pack.machine_learning.job.results;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.common_options.time_unit.*;
import org.elasticsearch.x_pack.machine_learning.job.results.*;

public class AnomalyRecord  {
  
  private Double[] _actual;
  public Double[] getActual() { return this._actual; }
  public AnomalyRecord setActual(Double[] val) { this._actual = val; return this; }


  private Time _bucketSpan;
  public Time getBucketSpan() { return this._bucketSpan; }
  public AnomalyRecord setBucketSpan(Time val) { this._bucketSpan = val; return this; }


  private String _byFieldName;
  public String getByFieldName() { return this._byFieldName; }
  public AnomalyRecord setByFieldName(String val) { this._byFieldName = val; return this; }


  private String _byFieldValue;
  public String getByFieldValue() { return this._byFieldValue; }
  public AnomalyRecord setByFieldValue(String val) { this._byFieldValue = val; return this; }


  private AnomalyCause[] _causes;
  public AnomalyCause[] getCauses() { return this._causes; }
  public AnomalyRecord setCauses(AnomalyCause[] val) { this._causes = val; return this; }


  private Integer _detectorIndex;
  public Integer getDetectorIndex() { return this._detectorIndex; }
  public AnomalyRecord setDetectorIndex(Integer val) { this._detectorIndex = val; return this; }


  private String _fieldName;
  public String getFieldName() { return this._fieldName; }
  public AnomalyRecord setFieldName(String val) { this._fieldName = val; return this; }


  private String _function;
  public String getFunction() { return this._function; }
  public AnomalyRecord setFunction(String val) { this._function = val; return this; }


  private String _functionDescription;
  public String getFunctionDescription() { return this._functionDescription; }
  public AnomalyRecord setFunctionDescription(String val) { this._functionDescription = val; return this; }


  private Influence[] _influencers;
  public Influence[] getInfluencers() { return this._influencers; }
  public AnomalyRecord setInfluencers(Influence[] val) { this._influencers = val; return this; }


  private Double _initialRecordScore;
  public Double getInitialRecordScore() { return this._initialRecordScore; }
  public AnomalyRecord setInitialRecordScore(Double val) { this._initialRecordScore = val; return this; }


  private Boolean _isInterim;
  public Boolean getIsInterim() { return this._isInterim; }
  public AnomalyRecord setIsInterim(Boolean val) { this._isInterim = val; return this; }


  private String _jobId;
  public String getJobId() { return this._jobId; }
  public AnomalyRecord setJobId(String val) { this._jobId = val; return this; }


  private String _overFieldName;
  public String getOverFieldName() { return this._overFieldName; }
  public AnomalyRecord setOverFieldName(String val) { this._overFieldName = val; return this; }


  private String _overFieldValue;
  public String getOverFieldValue() { return this._overFieldValue; }
  public AnomalyRecord setOverFieldValue(String val) { this._overFieldValue = val; return this; }


  private String _partitionFieldName;
  public String getPartitionFieldName() { return this._partitionFieldName; }
  public AnomalyRecord setPartitionFieldName(String val) { this._partitionFieldName = val; return this; }


  private String _partitionFieldValue;
  public String getPartitionFieldValue() { return this._partitionFieldValue; }
  public AnomalyRecord setPartitionFieldValue(String val) { this._partitionFieldValue = val; return this; }


  private Double _probability;
  public Double getProbability() { return this._probability; }
  public AnomalyRecord setProbability(Double val) { this._probability = val; return this; }


  private Double _recordScore;
  public Double getRecordScore() { return this._recordScore; }
  public AnomalyRecord setRecordScore(Double val) { this._recordScore = val; return this; }


  private String _resultType;
  public String getResultType() { return this._resultType; }
  public AnomalyRecord setResultType(String val) { this._resultType = val; return this; }


  private Date _timestamp;
  public Date getTimestamp() { return this._timestamp; }
  public AnomalyRecord setTimestamp(Date val) { this._timestamp = val; return this; }


  private Double[] _typical;
  public Double[] getTypical() { return this._typical; }
  public AnomalyRecord setTypical(Double[] val) { this._typical = val; return this; }

}
