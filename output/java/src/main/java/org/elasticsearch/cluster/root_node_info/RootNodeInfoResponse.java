
package org.elasticsearch.cluster.root_node_info;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.response.*;

public class RootNodeInfoResponse  {
  
  private String _name;
  public String getName() { return this._name; }
  public RootNodeInfoResponse setName(String val) { this._name = val; return this; }


  private String _clusterName;
  public String getClusterName() { return this._clusterName; }
  public RootNodeInfoResponse setClusterName(String val) { this._clusterName = val; return this; }


  private String _clusterUuid;
  public String getClusterUuid() { return this._clusterUuid; }
  public RootNodeInfoResponse setClusterUuid(String val) { this._clusterUuid = val; return this; }


  private ElasticsearchVersionInfo _version;
  public ElasticsearchVersionInfo getVersion() { return this._version; }
  public RootNodeInfoResponse setVersion(ElasticsearchVersionInfo val) { this._version = val; return this; }


  private String _tagline;
  public String getTagline() { return this._tagline; }
  public RootNodeInfoResponse setTagline(String val) { this._tagline = val; return this; }

}
