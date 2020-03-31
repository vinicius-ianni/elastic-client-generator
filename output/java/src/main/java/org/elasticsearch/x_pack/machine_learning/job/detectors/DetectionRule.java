
package org.elasticsearch.x_pack.machine_learning.job.detectors;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.machine_learning.job.detectors.*;
import org.elasticsearch.common_abstractions.infer.field.*;

public class DetectionRule  {
  
  private RuleAction[] _actions;
  public RuleAction[] getActions() { return this._actions; }
  public DetectionRule setActions(RuleAction[] val) { this._actions = val; return this; }


  private RuleCondition[] _conditions;
  public RuleCondition[] getConditions() { return this._conditions; }
  public DetectionRule setConditions(RuleCondition[] val) { this._conditions = val; return this; }


  private Map<Field, FilterRef> _scope;
  public Map<Field, FilterRef> getScope() { return this._scope; }
  public DetectionRule setScope(Map<Field, FilterRef> val) { this._scope = val; return this; }

}
