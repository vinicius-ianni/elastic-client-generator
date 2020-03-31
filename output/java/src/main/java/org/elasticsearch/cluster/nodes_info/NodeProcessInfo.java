
package org.elasticsearch.cluster.nodes_info;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class NodeProcessInfo  {
  
  private Long _id;
  public Long getId() { return this._id; }
  public NodeProcessInfo setId(Long val) { this._id = val; return this; }


  private Boolean _mlockall;
  public Boolean getMlockall() { return this._mlockall; }
  public NodeProcessInfo setMlockall(Boolean val) { this._mlockall = val; return this; }


  private Long _refreshIntervalInMillis;
  public Long getRefreshIntervalInMillis() { return this._refreshIntervalInMillis; }
  public NodeProcessInfo setRefreshIntervalInMillis(Long val) { this._refreshIntervalInMillis = val; return this; }

}
