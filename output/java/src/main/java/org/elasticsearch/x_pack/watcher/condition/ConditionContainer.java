
package org.elasticsearch.x_pack.watcher.condition;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.watcher.condition.*;

public class ConditionContainer  {
  
  private AlwaysCondition _always;
  public AlwaysCondition getAlways() { return this._always; }
  public ConditionContainer setAlways(AlwaysCondition val) { this._always = val; return this; }


  private ArrayCompareCondition _arrayCompare;
  public ArrayCompareCondition getArrayCompare() { return this._arrayCompare; }
  public ConditionContainer setArrayCompare(ArrayCompareCondition val) { this._arrayCompare = val; return this; }


  private CompareCondition _compare;
  public CompareCondition getCompare() { return this._compare; }
  public ConditionContainer setCompare(CompareCondition val) { this._compare = val; return this; }


  private NeverCondition _never;
  public NeverCondition getNever() { return this._never; }
  public ConditionContainer setNever(NeverCondition val) { this._never = val; return this; }


  private ScriptCondition _script;
  public ScriptCondition getScript() { return this._script; }
  public ConditionContainer setScript(ScriptCondition val) { this._script = val; return this; }

}
