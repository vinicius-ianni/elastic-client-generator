
package org.elasticsearch.cluster.cluster_allocation_explain;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.cluster.cluster_allocation_explain.*;

public class ClusterAllocationExplainResponse  {
  
  private String _allocateExplanation;
  public String getAllocateExplanation() { return this._allocateExplanation; }
  public ClusterAllocationExplainResponse setAllocateExplanation(String val) { this._allocateExplanation = val; return this; }


  private String _allocationDelay;
  public String getAllocationDelay() { return this._allocationDelay; }
  public ClusterAllocationExplainResponse setAllocationDelay(String val) { this._allocationDelay = val; return this; }


  private Long _allocationDelayInMillis;
  public Long getAllocationDelayInMillis() { return this._allocationDelayInMillis; }
  public ClusterAllocationExplainResponse setAllocationDelayInMillis(Long val) { this._allocationDelayInMillis = val; return this; }


  private Decision _canAllocate;
  public Decision getCanAllocate() { return this._canAllocate; }
  public ClusterAllocationExplainResponse setCanAllocate(Decision val) { this._canAllocate = val; return this; }


  private Decision _canMoveToOtherNode;
  public Decision getCanMoveToOtherNode() { return this._canMoveToOtherNode; }
  public ClusterAllocationExplainResponse setCanMoveToOtherNode(Decision val) { this._canMoveToOtherNode = val; return this; }


  private Decision _canRebalanceCluster;
  public Decision getCanRebalanceCluster() { return this._canRebalanceCluster; }
  public ClusterAllocationExplainResponse setCanRebalanceCluster(Decision val) { this._canRebalanceCluster = val; return this; }


  private AllocationDecision[] _canRebalanceClusterDecisions;
  public AllocationDecision[] getCanRebalanceClusterDecisions() { return this._canRebalanceClusterDecisions; }
  public ClusterAllocationExplainResponse setCanRebalanceClusterDecisions(AllocationDecision[] val) { this._canRebalanceClusterDecisions = val; return this; }


  private Decision _canRebalanceToOtherNode;
  public Decision getCanRebalanceToOtherNode() { return this._canRebalanceToOtherNode; }
  public ClusterAllocationExplainResponse setCanRebalanceToOtherNode(Decision val) { this._canRebalanceToOtherNode = val; return this; }


  private AllocationDecision[] _canRemainDecisions;
  public AllocationDecision[] getCanRemainDecisions() { return this._canRemainDecisions; }
  public ClusterAllocationExplainResponse setCanRemainDecisions(AllocationDecision[] val) { this._canRemainDecisions = val; return this; }


  private Decision _canRemainOnCurrentNode;
  public Decision getCanRemainOnCurrentNode() { return this._canRemainOnCurrentNode; }
  public ClusterAllocationExplainResponse setCanRemainOnCurrentNode(Decision val) { this._canRemainOnCurrentNode = val; return this; }


  private String _configuredDelay;
  public String getConfiguredDelay() { return this._configuredDelay; }
  public ClusterAllocationExplainResponse setConfiguredDelay(String val) { this._configuredDelay = val; return this; }


  private Long _configuredDelayInMills;
  public Long getConfiguredDelayInMills() { return this._configuredDelayInMills; }
  public ClusterAllocationExplainResponse setConfiguredDelayInMills(Long val) { this._configuredDelayInMills = val; return this; }


  private CurrentNode _currentNode;
  public CurrentNode getCurrentNode() { return this._currentNode; }
  public ClusterAllocationExplainResponse setCurrentNode(CurrentNode val) { this._currentNode = val; return this; }


  private String _currentState;
  public String getCurrentState() { return this._currentState; }
  public ClusterAllocationExplainResponse setCurrentState(String val) { this._currentState = val; return this; }


  private String _index;
  public String getIndex() { return this._index; }
  public ClusterAllocationExplainResponse setIndex(String val) { this._index = val; return this; }


  private String _moveExplanation;
  public String getMoveExplanation() { return this._moveExplanation; }
  public ClusterAllocationExplainResponse setMoveExplanation(String val) { this._moveExplanation = val; return this; }


  private NodeAllocationExplanation[] _nodeAllocationDecisions;
  public NodeAllocationExplanation[] getNodeAllocationDecisions() { return this._nodeAllocationDecisions; }
  public ClusterAllocationExplainResponse setNodeAllocationDecisions(NodeAllocationExplanation[] val) { this._nodeAllocationDecisions = val; return this; }


  private Boolean _primary;
  public Boolean getPrimary() { return this._primary; }
  public ClusterAllocationExplainResponse setPrimary(Boolean val) { this._primary = val; return this; }


  private String _rebalanceExplanation;
  public String getRebalanceExplanation() { return this._rebalanceExplanation; }
  public ClusterAllocationExplainResponse setRebalanceExplanation(String val) { this._rebalanceExplanation = val; return this; }


  private String _remainingDelay;
  public String getRemainingDelay() { return this._remainingDelay; }
  public ClusterAllocationExplainResponse setRemainingDelay(String val) { this._remainingDelay = val; return this; }


  private Long _remainingDelayInMillis;
  public Long getRemainingDelayInMillis() { return this._remainingDelayInMillis; }
  public ClusterAllocationExplainResponse setRemainingDelayInMillis(Long val) { this._remainingDelayInMillis = val; return this; }


  private Integer _shard;
  public Integer getShard() { return this._shard; }
  public ClusterAllocationExplainResponse setShard(Integer val) { this._shard = val; return this; }


  private UnassignedInformation _unassignedInfo;
  public UnassignedInformation getUnassignedInfo() { return this._unassignedInfo; }
  public ClusterAllocationExplainResponse setUnassignedInfo(UnassignedInformation val) { this._unassignedInfo = val; return this; }

}
