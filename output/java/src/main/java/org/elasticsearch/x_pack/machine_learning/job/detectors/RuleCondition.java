
package org.elasticsearch.x_pack.machine_learning.job.detectors;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.machine_learning.job.detectors.*;
import org.elasticsearch.internal.*;

public class RuleCondition  {
  
  private AppliesTo _appliesTo;
  public AppliesTo getAppliesTo() { return this._appliesTo; }
  public RuleCondition setAppliesTo(AppliesTo val) { this._appliesTo = val; return this; }


  private ConditionOperator _operator;
  public ConditionOperator getOperator() { return this._operator; }
  public RuleCondition setOperator(ConditionOperator val) { this._operator = val; return this; }


  private Double _value;
  public Double getValue() { return this._value; }
  public RuleCondition setValue(Double val) { this._value = val; return this; }

}
