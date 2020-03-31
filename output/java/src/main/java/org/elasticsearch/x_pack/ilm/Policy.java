
package org.elasticsearch.x_pack.ilm;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.ilm.*;

public class Policy  {
  
  private Phases _phases;
  public Phases getPhases() { return this._phases; }
  public Policy setPhases(Phases val) { this._phases = val; return this; }

}
