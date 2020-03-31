
package org.elasticsearch.x_pack.migration.deprecation_info;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.migration.deprecation_info.*;

public class DeprecationInfoResponse  {
  
  private DeprecationInfo[] _clusterSettings;
  public DeprecationInfo[] getClusterSettings() { return this._clusterSettings; }
  public DeprecationInfoResponse setClusterSettings(DeprecationInfo[] val) { this._clusterSettings = val; return this; }


  private Map<String, DeprecationInfo[]> _indexSettings;
  public Map<String, DeprecationInfo[]> getIndexSettings() { return this._indexSettings; }
  public DeprecationInfoResponse setIndexSettings(Map<String, DeprecationInfo[]> val) { this._indexSettings = val; return this; }


  private DeprecationInfo[] _nodeSettings;
  public DeprecationInfo[] getNodeSettings() { return this._nodeSettings; }
  public DeprecationInfoResponse setNodeSettings(DeprecationInfo[] val) { this._nodeSettings = val; return this; }

}
