
package org.elasticsearch.cluster.nodes_hot_threads;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.cluster.nodes_hot_threads.*;

public class NodesHotThreadsResponse  {
  
  private HotThreadInformation[] _hotThreads;
  public HotThreadInformation[] getHotThreads() { return this._hotThreads; }
  public NodesHotThreadsResponse setHotThreads(HotThreadInformation[] val) { this._hotThreads = val; return this; }

}
