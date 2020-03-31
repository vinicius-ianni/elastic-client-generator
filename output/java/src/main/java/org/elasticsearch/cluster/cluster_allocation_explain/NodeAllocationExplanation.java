
package org.elasticsearch.cluster.cluster_allocation_explain;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.cluster.cluster_allocation_explain.*;
import org.elasticsearch.internal.*;

public class NodeAllocationExplanation  {
  
  private AllocationDecision[] _deciders;
  public AllocationDecision[] getDeciders() { return this._deciders; }
  public NodeAllocationExplanation setDeciders(AllocationDecision[] val) { this._deciders = val; return this; }


  private Map<String, String> _nodeAttributes;
  public Map<String, String> getNodeAttributes() { return this._nodeAttributes; }
  public NodeAllocationExplanation setNodeAttributes(Map<String, String> val) { this._nodeAttributes = val; return this; }


  private Decision _nodeDecision;
  public Decision getNodeDecision() { return this._nodeDecision; }
  public NodeAllocationExplanation setNodeDecision(Decision val) { this._nodeDecision = val; return this; }


  private String _nodeId;
  public String getNodeId() { return this._nodeId; }
  public NodeAllocationExplanation setNodeId(String val) { this._nodeId = val; return this; }


  private String _nodeName;
  public String getNodeName() { return this._nodeName; }
  public NodeAllocationExplanation setNodeName(String val) { this._nodeName = val; return this; }


  private AllocationStore _store;
  public AllocationStore getStore() { return this._store; }
  public NodeAllocationExplanation setStore(AllocationStore val) { this._store = val; return this; }


  private String _transportAddress;
  public String getTransportAddress() { return this._transportAddress; }
  public NodeAllocationExplanation setTransportAddress(String val) { this._transportAddress = val; return this; }


  private Integer _weightRanking;
  public Integer getWeightRanking() { return this._weightRanking; }
  public NodeAllocationExplanation setWeightRanking(Integer val) { this._weightRanking = val; return this; }

}
