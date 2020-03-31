
package org.elasticsearch.cluster.nodes_info;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class NodeInfoTransport  {
  
  private String[] _boundAddress;
  public String[] getBoundAddress() { return this._boundAddress; }
  public NodeInfoTransport setBoundAddress(String[] val) { this._boundAddress = val; return this; }


  private String _publishAddress;
  public String getPublishAddress() { return this._publishAddress; }
  public NodeInfoTransport setPublishAddress(String val) { this._publishAddress = val; return this; }

}
