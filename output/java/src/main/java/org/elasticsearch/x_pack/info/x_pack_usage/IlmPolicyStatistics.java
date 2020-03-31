
package org.elasticsearch.x_pack.info.x_pack_usage;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.ilm.*;
import org.elasticsearch.internal.*;

public class IlmPolicyStatistics  {
  
  private Phases _phases;
  public Phases getPhases() { return this._phases; }
  public IlmPolicyStatistics setPhases(Phases val) { this._phases = val; return this; }


  private Integer _indicesManaged;
  public Integer getIndicesManaged() { return this._indicesManaged; }
  public IlmPolicyStatistics setIndicesManaged(Integer val) { this._indicesManaged = val; return this; }

}
