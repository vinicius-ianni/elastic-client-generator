
package org.elasticsearch.cluster.cluster_allocation_explain;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.cluster.cluster_allocation_explain.*;

public class UnassignedInformation  {
  
  private Date _at;
  public Date getAt() { return this._at; }
  public UnassignedInformation setAt(Date val) { this._at = val; return this; }


  private String _lastAllocationStatus;
  public String getLastAllocationStatus() { return this._lastAllocationStatus; }
  public UnassignedInformation setLastAllocationStatus(String val) { this._lastAllocationStatus = val; return this; }


  private UnassignedInformationReason _reason;
  public UnassignedInformationReason getReason() { return this._reason; }
  public UnassignedInformation setReason(UnassignedInformationReason val) { this._reason = val; return this; }

}
