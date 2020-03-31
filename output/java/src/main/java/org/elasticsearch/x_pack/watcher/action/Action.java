
package org.elasticsearch.x_pack.watcher.action;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.watcher.action.*;
import org.elasticsearch.common_options.time_unit.*;
import org.elasticsearch.internal.*;
import org.elasticsearch.x_pack.watcher.transform.*;
import org.elasticsearch.x_pack.watcher.condition.*;

public class Action  {
  
  private ActionType _actionType;
  public ActionType getActionType() { return this._actionType; }
  public Action setActionType(ActionType val) { this._actionType = val; return this; }


  private String _name;
  public String getName() { return this._name; }
  public Action setName(String val) { this._name = val; return this; }


  private Time _throttlePeriod;
  public Time getThrottlePeriod() { return this._throttlePeriod; }
  public Action setThrottlePeriod(Time val) { this._throttlePeriod = val; return this; }


  private String _foreach;
  public String getForeach() { return this._foreach; }
  public Action setForeach(String val) { this._foreach = val; return this; }


  private Integer _maxIterations;
  public Integer getMaxIterations() { return this._maxIterations; }
  public Action setMaxIterations(Integer val) { this._maxIterations = val; return this; }


  private TransformContainer _transform;
  public TransformContainer getTransform() { return this._transform; }
  public Action setTransform(TransformContainer val) { this._transform = val; return this; }


  private ConditionContainer _condition;
  public ConditionContainer getCondition() { return this._condition; }
  public Action setCondition(ConditionContainer val) { this._condition = val; return this; }

}
