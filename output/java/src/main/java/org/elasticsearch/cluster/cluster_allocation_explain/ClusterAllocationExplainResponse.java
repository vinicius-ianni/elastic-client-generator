
package org.elasticsearch.cluster.cluster_allocation_explain;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.internal.*;
import org.elasticsearch.cluster.cluster_allocation_explain.*;

public class ClusterAllocationExplainResponse  implements XContentable<ClusterAllocationExplainResponse> {
  
  static final ParseField ALLOCATE_EXPLANATION = new ParseField("allocate_explanation");
  private String _allocateExplanation;
  public String getAllocateExplanation() { return this._allocateExplanation; }
  public ClusterAllocationExplainResponse setAllocateExplanation(String val) { this._allocateExplanation = val; return this; }


  static final ParseField ALLOCATION_DELAY = new ParseField("allocation_delay");
  private String _allocationDelay;
  public String getAllocationDelay() { return this._allocationDelay; }
  public ClusterAllocationExplainResponse setAllocationDelay(String val) { this._allocationDelay = val; return this; }


  static final ParseField ALLOCATION_DELAY_IN_MILLIS = new ParseField("allocation_delay_in_millis");
  private Long _allocationDelayInMillis;
  public Long getAllocationDelayInMillis() { return this._allocationDelayInMillis; }
  public ClusterAllocationExplainResponse setAllocationDelayInMillis(Long val) { this._allocationDelayInMillis = val; return this; }


  static final ParseField CAN_ALLOCATE = new ParseField("can_allocate");
  private Decision _canAllocate;
  public Decision getCanAllocate() { return this._canAllocate; }
  public ClusterAllocationExplainResponse setCanAllocate(Decision val) { this._canAllocate = val; return this; }


  static final ParseField CAN_MOVE_TO_OTHER_NODE = new ParseField("can_move_to_other_node");
  private Decision _canMoveToOtherNode;
  public Decision getCanMoveToOtherNode() { return this._canMoveToOtherNode; }
  public ClusterAllocationExplainResponse setCanMoveToOtherNode(Decision val) { this._canMoveToOtherNode = val; return this; }


  static final ParseField CAN_REBALANCE_CLUSTER = new ParseField("can_rebalance_cluster");
  private Decision _canRebalanceCluster;
  public Decision getCanRebalanceCluster() { return this._canRebalanceCluster; }
  public ClusterAllocationExplainResponse setCanRebalanceCluster(Decision val) { this._canRebalanceCluster = val; return this; }


  static final ParseField CAN_REBALANCE_CLUSTER_DECISIONS = new ParseField("can_rebalance_cluster_decisions");
  private List<AllocationDecision> _canRebalanceClusterDecisions;
  public List<AllocationDecision> getCanRebalanceClusterDecisions() { return this._canRebalanceClusterDecisions; }
  public ClusterAllocationExplainResponse setCanRebalanceClusterDecisions(List<AllocationDecision> val) { this._canRebalanceClusterDecisions = val; return this; }


  static final ParseField CAN_REBALANCE_TO_OTHER_NODE = new ParseField("can_rebalance_to_other_node");
  private Decision _canRebalanceToOtherNode;
  public Decision getCanRebalanceToOtherNode() { return this._canRebalanceToOtherNode; }
  public ClusterAllocationExplainResponse setCanRebalanceToOtherNode(Decision val) { this._canRebalanceToOtherNode = val; return this; }


  static final ParseField CAN_REMAIN_DECISIONS = new ParseField("can_remain_decisions");
  private List<AllocationDecision> _canRemainDecisions;
  public List<AllocationDecision> getCanRemainDecisions() { return this._canRemainDecisions; }
  public ClusterAllocationExplainResponse setCanRemainDecisions(List<AllocationDecision> val) { this._canRemainDecisions = val; return this; }


  static final ParseField CAN_REMAIN_ON_CURRENT_NODE = new ParseField("can_remain_on_current_node");
  private Decision _canRemainOnCurrentNode;
  public Decision getCanRemainOnCurrentNode() { return this._canRemainOnCurrentNode; }
  public ClusterAllocationExplainResponse setCanRemainOnCurrentNode(Decision val) { this._canRemainOnCurrentNode = val; return this; }


  static final ParseField CONFIGURED_DELAY = new ParseField("configured_delay");
  private String _configuredDelay;
  public String getConfiguredDelay() { return this._configuredDelay; }
  public ClusterAllocationExplainResponse setConfiguredDelay(String val) { this._configuredDelay = val; return this; }


  static final ParseField CONFIGURED_DELAY_IN_MILLS = new ParseField("configured_delay_in_mills");
  private Long _configuredDelayInMills;
  public Long getConfiguredDelayInMills() { return this._configuredDelayInMills; }
  public ClusterAllocationExplainResponse setConfiguredDelayInMills(Long val) { this._configuredDelayInMills = val; return this; }


  static final ParseField CURRENT_NODE = new ParseField("current_node");
  private CurrentNode _currentNode;
  public CurrentNode getCurrentNode() { return this._currentNode; }
  public ClusterAllocationExplainResponse setCurrentNode(CurrentNode val) { this._currentNode = val; return this; }


  static final ParseField CURRENT_STATE = new ParseField("current_state");
  private String _currentState;
  public String getCurrentState() { return this._currentState; }
  public ClusterAllocationExplainResponse setCurrentState(String val) { this._currentState = val; return this; }


  static final ParseField INDEX = new ParseField("index");
  private String _index;
  public String getIndex() { return this._index; }
  public ClusterAllocationExplainResponse setIndex(String val) { this._index = val; return this; }


  static final ParseField MOVE_EXPLANATION = new ParseField("move_explanation");
  private String _moveExplanation;
  public String getMoveExplanation() { return this._moveExplanation; }
  public ClusterAllocationExplainResponse setMoveExplanation(String val) { this._moveExplanation = val; return this; }


  static final ParseField NODE_ALLOCATION_DECISIONS = new ParseField("node_allocation_decisions");
  private List<NodeAllocationExplanation> _nodeAllocationDecisions;
  public List<NodeAllocationExplanation> getNodeAllocationDecisions() { return this._nodeAllocationDecisions; }
  public ClusterAllocationExplainResponse setNodeAllocationDecisions(List<NodeAllocationExplanation> val) { this._nodeAllocationDecisions = val; return this; }


  static final ParseField PRIMARY = new ParseField("primary");
  private Boolean _primary;
  public Boolean getPrimary() { return this._primary; }
  public ClusterAllocationExplainResponse setPrimary(Boolean val) { this._primary = val; return this; }


  static final ParseField REBALANCE_EXPLANATION = new ParseField("rebalance_explanation");
  private String _rebalanceExplanation;
  public String getRebalanceExplanation() { return this._rebalanceExplanation; }
  public ClusterAllocationExplainResponse setRebalanceExplanation(String val) { this._rebalanceExplanation = val; return this; }


  static final ParseField REMAINING_DELAY = new ParseField("remaining_delay");
  private String _remainingDelay;
  public String getRemainingDelay() { return this._remainingDelay; }
  public ClusterAllocationExplainResponse setRemainingDelay(String val) { this._remainingDelay = val; return this; }


  static final ParseField REMAINING_DELAY_IN_MILLIS = new ParseField("remaining_delay_in_millis");
  private Long _remainingDelayInMillis;
  public Long getRemainingDelayInMillis() { return this._remainingDelayInMillis; }
  public ClusterAllocationExplainResponse setRemainingDelayInMillis(Long val) { this._remainingDelayInMillis = val; return this; }


  static final ParseField SHARD = new ParseField("shard");
  private Integer _shard;
  public Integer getShard() { return this._shard; }
  public ClusterAllocationExplainResponse setShard(Integer val) { this._shard = val; return this; }


  static final ParseField UNASSIGNED_INFO = new ParseField("unassigned_info");
  private UnassignedInformation _unassignedInfo;
  public UnassignedInformation getUnassignedInfo() { return this._unassignedInfo; }
  public ClusterAllocationExplainResponse setUnassignedInfo(UnassignedInformation val) { this._unassignedInfo = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ClusterAllocationExplainResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ClusterAllocationExplainResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ClusterAllocationExplainResponse, Void> PARSER =
    new ConstructingObjectParser<>(ClusterAllocationExplainResponse.class.getName(), false, args -> new ClusterAllocationExplainResponse());

  static {
    PARSER.declareString(ClusterAllocationExplainResponse::setAllocateExplanation, ALLOCATE_EXPLANATION);
    PARSER.declareString(ClusterAllocationExplainResponse::setAllocationDelay, ALLOCATION_DELAY);
    PARSER.declareLong(ClusterAllocationExplainResponse::setAllocationDelayInMillis, ALLOCATION_DELAY_IN_MILLIS);
    PARSER.declareObject(ClusterAllocationExplainResponse::setCanAllocate, (p, t) -> Decision.PARSER.apply(p, null), CAN_ALLOCATE);
    PARSER.declareObject(ClusterAllocationExplainResponse::setCanMoveToOtherNode, (p, t) -> Decision.PARSER.apply(p, null), CAN_MOVE_TO_OTHER_NODE);
    PARSER.declareObject(ClusterAllocationExplainResponse::setCanRebalanceCluster, (p, t) -> Decision.PARSER.apply(p, null), CAN_REBALANCE_CLUSTER);
    PARSER.declareObjectArray(ClusterAllocationExplainResponse::setCanRebalanceClusterDecisions, (p, t) -> AllocationDecision.PARSER.apply(p), CAN_REBALANCE_CLUSTER_DECISIONS);
    PARSER.declareObject(ClusterAllocationExplainResponse::setCanRebalanceToOtherNode, (p, t) -> Decision.PARSER.apply(p, null), CAN_REBALANCE_TO_OTHER_NODE);
    PARSER.declareObjectArray(ClusterAllocationExplainResponse::setCanRemainDecisions, (p, t) -> AllocationDecision.PARSER.apply(p), CAN_REMAIN_DECISIONS);
    PARSER.declareObject(ClusterAllocationExplainResponse::setCanRemainOnCurrentNode, (p, t) -> Decision.PARSER.apply(p, null), CAN_REMAIN_ON_CURRENT_NODE);
    PARSER.declareString(ClusterAllocationExplainResponse::setConfiguredDelay, CONFIGURED_DELAY);
    PARSER.declareLong(ClusterAllocationExplainResponse::setConfiguredDelayInMills, CONFIGURED_DELAY_IN_MILLS);
    PARSER.declareObject(ClusterAllocationExplainResponse::setCurrentNode, (p, t) -> CurrentNode.PARSER.apply(p, null), CURRENT_NODE);
    PARSER.declareString(ClusterAllocationExplainResponse::setCurrentState, CURRENT_STATE);
    PARSER.declareString(ClusterAllocationExplainResponse::setIndex, INDEX);
    PARSER.declareString(ClusterAllocationExplainResponse::setMoveExplanation, MOVE_EXPLANATION);
    PARSER.declareObjectArray(ClusterAllocationExplainResponse::setNodeAllocationDecisions, (p, t) -> NodeAllocationExplanation.PARSER.apply(p), NODE_ALLOCATION_DECISIONS);
    PARSER.declareBoolean(ClusterAllocationExplainResponse::setPrimary, PRIMARY);
    PARSER.declareString(ClusterAllocationExplainResponse::setRebalanceExplanation, REBALANCE_EXPLANATION);
    PARSER.declareString(ClusterAllocationExplainResponse::setRemainingDelay, REMAINING_DELAY);
    PARSER.declareLong(ClusterAllocationExplainResponse::setRemainingDelayInMillis, REMAINING_DELAY_IN_MILLIS);
    PARSER.declareInteger(ClusterAllocationExplainResponse::setShard, SHARD);
    PARSER.declareObject(ClusterAllocationExplainResponse::setUnassignedInfo, (p, t) -> UnassignedInformation.PARSER.apply(p, null), UNASSIGNED_INFO);
  }

}
