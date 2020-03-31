
package org.elasticsearch.cluster.cluster_allocation_explain;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.cluster.cluster_allocation_explain.*;

public class AllocationDecision  {
  
  private String _decider;
  public String getDecider() { return this._decider; }
  public AllocationDecision setDecider(String val) { this._decider = val; return this; }


  private AllocationExplainDecision _decision;
  public AllocationExplainDecision getDecision() { return this._decision; }
  public AllocationDecision setDecision(AllocationExplainDecision val) { this._decision = val; return this; }


  private String _explanation;
  public String getExplanation() { return this._explanation; }
  public AllocationDecision setExplanation(String val) { this._explanation = val; return this; }

}
