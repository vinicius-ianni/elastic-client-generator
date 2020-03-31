
package org.elasticsearch.cluster.cluster_allocation_explain;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.index_name.*;
import org.elasticsearch.internal.*;

public class ClusterAllocationExplainRequest  {
  
  private IndexName _index;
  public IndexName getIndex() { return this._index; }
  public ClusterAllocationExplainRequest setIndex(IndexName val) { this._index = val; return this; }


  private Boolean _primary;
  public Boolean getPrimary() { return this._primary; }
  public ClusterAllocationExplainRequest setPrimary(Boolean val) { this._primary = val; return this; }


  private Integer _shard;
  public Integer getShard() { return this._shard; }
  public ClusterAllocationExplainRequest setShard(Integer val) { this._shard = val; return this; }


  private Boolean _includeDiskInfo;
  public Boolean getIncludeDiskInfo() { return this._includeDiskInfo; }
  public ClusterAllocationExplainRequest setIncludeDiskInfo(Boolean val) { this._includeDiskInfo = val; return this; }


  private Boolean _includeYesDecisions;
  public Boolean getIncludeYesDecisions() { return this._includeYesDecisions; }
  public ClusterAllocationExplainRequest setIncludeYesDecisions(Boolean val) { this._includeYesDecisions = val; return this; }

}
