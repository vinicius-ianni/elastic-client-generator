
package org.elasticsearch.x_pack.ilm.move_to_step;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class StepKey  {
  
  private String _action;
  public String getAction() { return this._action; }
  public StepKey setAction(String val) { this._action = val; return this; }


  private String _name;
  public String getName() { return this._name; }
  public StepKey setName(String val) { this._name = val; return this; }


  private String _phase;
  public String getPhase() { return this._phase; }
  public StepKey setPhase(String val) { this._phase = val; return this; }

}
