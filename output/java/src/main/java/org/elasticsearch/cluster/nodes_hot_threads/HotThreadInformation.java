
package org.elasticsearch.cluster.nodes_hot_threads;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class HotThreadInformation  {
  
  private String[] _hosts;
  public String[] getHosts() { return this._hosts; }
  public HotThreadInformation setHosts(String[] val) { this._hosts = val; return this; }


  private String _nodeId;
  public String getNodeId() { return this._nodeId; }
  public HotThreadInformation setNodeId(String val) { this._nodeId = val; return this; }


  private String _nodeName;
  public String getNodeName() { return this._nodeName; }
  public HotThreadInformation setNodeName(String val) { this._nodeName = val; return this; }


  private String[] _threads;
  public String[] getThreads() { return this._threads; }
  public HotThreadInformation setThreads(String[] val) { this._threads = val; return this; }

}
