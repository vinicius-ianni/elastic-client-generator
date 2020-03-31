
package org.elasticsearch.cluster.nodes_info;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class NodeInfoHttp  {
  
  private String[] _boundAddress;
  public String[] getBoundAddress() { return this._boundAddress; }
  public NodeInfoHttp setBoundAddress(String[] val) { this._boundAddress = val; return this; }


  private String _maxContentLength;
  public String getMaxContentLength() { return this._maxContentLength; }
  public NodeInfoHttp setMaxContentLength(String val) { this._maxContentLength = val; return this; }


  private Long _maxContentLengthInBytes;
  public Long getMaxContentLengthInBytes() { return this._maxContentLengthInBytes; }
  public NodeInfoHttp setMaxContentLengthInBytes(Long val) { this._maxContentLengthInBytes = val; return this; }


  private String _publishAddress;
  public String getPublishAddress() { return this._publishAddress; }
  public NodeInfoHttp setPublishAddress(String val) { this._publishAddress = val; return this; }

}
