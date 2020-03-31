
package org.elasticsearch.x_pack.watcher.put_watch;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.x_pack.watcher.action.*;
import org.elasticsearch.x_pack.watcher.condition.*;
import org.elasticsearch.x_pack.watcher.input.*;
import org.elasticsearch.x_pack.watcher.transform.*;
import org.elasticsearch.x_pack.watcher.trigger.*;

public class PutWatchRequest  {
  
  private Boolean _active;
  public Boolean getActive() { return this._active; }
  public PutWatchRequest setActive(Boolean val) { this._active = val; return this; }


  private Long _ifPrimaryTerm;
  public Long getIfPrimaryTerm() { return this._ifPrimaryTerm; }
  public PutWatchRequest setIfPrimaryTerm(Long val) { this._ifPrimaryTerm = val; return this; }


  private Long _ifSequenceNumber;
  public Long getIfSequenceNumber() { return this._ifSequenceNumber; }
  public PutWatchRequest setIfSequenceNumber(Long val) { this._ifSequenceNumber = val; return this; }


  private Long _version;
  public Long getVersion() { return this._version; }
  public PutWatchRequest setVersion(Long val) { this._version = val; return this; }


  private Map<String, Action> _actions;
  public Map<String, Action> getActions() { return this._actions; }
  public PutWatchRequest setActions(Map<String, Action> val) { this._actions = val; return this; }


  private ConditionContainer _condition;
  public ConditionContainer getCondition() { return this._condition; }
  public PutWatchRequest setCondition(ConditionContainer val) { this._condition = val; return this; }


  private InputContainer _input;
  public InputContainer getInput() { return this._input; }
  public PutWatchRequest setInput(InputContainer val) { this._input = val; return this; }


  private Map<String, Object> _metadata;
  public Map<String, Object> getMetadata() { return this._metadata; }
  public PutWatchRequest setMetadata(Map<String, Object> val) { this._metadata = val; return this; }


  private String _throttlePeriod;
  public String getThrottlePeriod() { return this._throttlePeriod; }
  public PutWatchRequest setThrottlePeriod(String val) { this._throttlePeriod = val; return this; }


  private TransformContainer _transform;
  public TransformContainer getTransform() { return this._transform; }
  public PutWatchRequest setTransform(TransformContainer val) { this._transform = val; return this; }


  private TriggerContainer _trigger;
  public TriggerContainer getTrigger() { return this._trigger; }
  public PutWatchRequest setTrigger(TriggerContainer val) { this._trigger = val; return this; }

}
