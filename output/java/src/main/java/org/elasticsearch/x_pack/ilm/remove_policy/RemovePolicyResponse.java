
package org.elasticsearch.x_pack.ilm.remove_policy;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class RemovePolicyResponse  {
  
  private String[] _failedIndexes;
  public String[] getFailedIndexes() { return this._failedIndexes; }
  public RemovePolicyResponse setFailedIndexes(String[] val) { this._failedIndexes = val; return this; }


  private Boolean _hasFailures;
  public Boolean getHasFailures() { return this._hasFailures; }
  public RemovePolicyResponse setHasFailures(Boolean val) { this._hasFailures = val; return this; }

}
