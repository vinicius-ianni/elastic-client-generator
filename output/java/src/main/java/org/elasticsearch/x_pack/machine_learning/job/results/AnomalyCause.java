
package org.elasticsearch.x_pack.machine_learning.job.results;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.x_pack.machine_learning.job.results.*;

public class AnomalyCause  {
  
  private Double[] _actual;
  public Double[] getActual() { return this._actual; }
  public AnomalyCause setActual(Double[] val) { this._actual = val; return this; }


  private String _byFieldName;
  public String getByFieldName() { return this._byFieldName; }
  public AnomalyCause setByFieldName(String val) { this._byFieldName = val; return this; }


  private String _byFieldValue;
  public String getByFieldValue() { return this._byFieldValue; }
  public AnomalyCause setByFieldValue(String val) { this._byFieldValue = val; return this; }


  private String _correlatedByFieldValue;
  public String getCorrelatedByFieldValue() { return this._correlatedByFieldValue; }
  public AnomalyCause setCorrelatedByFieldValue(String val) { this._correlatedByFieldValue = val; return this; }


  private String _fieldName;
  public String getFieldName() { return this._fieldName; }
  public AnomalyCause setFieldName(String val) { this._fieldName = val; return this; }


  private String _function;
  public String getFunction() { return this._function; }
  public AnomalyCause setFunction(String val) { this._function = val; return this; }


  private String _functionDescription;
  public String getFunctionDescription() { return this._functionDescription; }
  public AnomalyCause setFunctionDescription(String val) { this._functionDescription = val; return this; }


  private Influence[] _influencers;
  public Influence[] getInfluencers() { return this._influencers; }
  public AnomalyCause setInfluencers(Influence[] val) { this._influencers = val; return this; }


  private String _overFieldName;
  public String getOverFieldName() { return this._overFieldName; }
  public AnomalyCause setOverFieldName(String val) { this._overFieldName = val; return this; }


  private String _overFieldValue;
  public String getOverFieldValue() { return this._overFieldValue; }
  public AnomalyCause setOverFieldValue(String val) { this._overFieldValue = val; return this; }


  private String _partitionFieldName;
  public String getPartitionFieldName() { return this._partitionFieldName; }
  public AnomalyCause setPartitionFieldName(String val) { this._partitionFieldName = val; return this; }


  private String _partitionFieldValue;
  public String getPartitionFieldValue() { return this._partitionFieldValue; }
  public AnomalyCause setPartitionFieldValue(String val) { this._partitionFieldValue = val; return this; }


  private Double _probability;
  public Double getProbability() { return this._probability; }
  public AnomalyCause setProbability(Double val) { this._probability = val; return this; }


  private Double[] _typical;
  public Double[] getTypical() { return this._typical; }
  public AnomalyCause setTypical(Double[] val) { this._typical = val; return this; }

}
