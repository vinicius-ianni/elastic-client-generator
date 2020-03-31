
package org.elasticsearch.x_pack.ilm.explain_lifecycle;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.common_abstractions.infer.index_name.*;
import org.elasticsearch.common_options.time_unit.*;

public class LifecycleExplain  {
  
  private String _action;
  public String getAction() { return this._action; }
  public LifecycleExplain setAction(String val) { this._action = val; return this; }


  private Date _actionTimeMillis;
  public Date getActionTimeMillis() { return this._actionTimeMillis; }
  public LifecycleExplain setActionTimeMillis(Date val) { this._actionTimeMillis = val; return this; }


  private String _failedStep;
  public String getFailedStep() { return this._failedStep; }
  public LifecycleExplain setFailedStep(String val) { this._failedStep = val; return this; }


  private IndexName _index;
  public IndexName getIndex() { return this._index; }
  public LifecycleExplain setIndex(IndexName val) { this._index = val; return this; }


  private Date _lifecycleDateMillis;
  public Date getLifecycleDateMillis() { return this._lifecycleDateMillis; }
  public LifecycleExplain setLifecycleDateMillis(Date val) { this._lifecycleDateMillis = val; return this; }


  private Boolean _managed;
  public Boolean getManaged() { return this._managed; }
  public LifecycleExplain setManaged(Boolean val) { this._managed = val; return this; }


  private String _phase;
  public String getPhase() { return this._phase; }
  public LifecycleExplain setPhase(String val) { this._phase = val; return this; }


  private Date _phaseTimeMillis;
  public Date getPhaseTimeMillis() { return this._phaseTimeMillis; }
  public LifecycleExplain setPhaseTimeMillis(Date val) { this._phaseTimeMillis = val; return this; }


  private String _policy;
  public String getPolicy() { return this._policy; }
  public LifecycleExplain setPolicy(String val) { this._policy = val; return this; }


  private String _step;
  public String getStep() { return this._step; }
  public LifecycleExplain setStep(String val) { this._step = val; return this; }


  private Map<String, Object> _stepInfo;
  public Map<String, Object> getStepInfo() { return this._stepInfo; }
  public LifecycleExplain setStepInfo(Map<String, Object> val) { this._stepInfo = val; return this; }


  private Date _stepTimeMillis;
  public Date getStepTimeMillis() { return this._stepTimeMillis; }
  public LifecycleExplain setStepTimeMillis(Date val) { this._stepTimeMillis = val; return this; }


  private Time _age;
  public Time getAge() { return this._age; }
  public LifecycleExplain setAge(Time val) { this._age = val; return this; }

}
