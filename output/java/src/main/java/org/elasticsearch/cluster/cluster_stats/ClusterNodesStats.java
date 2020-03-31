
package org.elasticsearch.cluster.cluster_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.cluster.cluster_stats.*;
import org.elasticsearch.internal.*;
import org.elasticsearch.common_options.stats.*;

public class ClusterNodesStats  {
  
  private ClusterNodeCount _count;
  public ClusterNodeCount getCount() { return this._count; }
  public ClusterNodesStats setCount(ClusterNodeCount val) { this._count = val; return this; }


  private Map<String, Integer> _discoveryTypes;
  public Map<String, Integer> getDiscoveryTypes() { return this._discoveryTypes; }
  public ClusterNodesStats setDiscoveryTypes(Map<String, Integer> val) { this._discoveryTypes = val; return this; }


  private ClusterFileSystem _fs;
  public ClusterFileSystem getFs() { return this._fs; }
  public ClusterNodesStats setFs(ClusterFileSystem val) { this._fs = val; return this; }


  private ClusterJvm _jvm;
  public ClusterJvm getJvm() { return this._jvm; }
  public ClusterNodesStats setJvm(ClusterJvm val) { this._jvm = val; return this; }


  private ClusterNetworkTypes _networkTypes;
  public ClusterNetworkTypes getNetworkTypes() { return this._networkTypes; }
  public ClusterNodesStats setNetworkTypes(ClusterNetworkTypes val) { this._networkTypes = val; return this; }


  private ClusterOperatingSystemStats _os;
  public ClusterOperatingSystemStats getOs() { return this._os; }
  public ClusterNodesStats setOs(ClusterOperatingSystemStats val) { this._os = val; return this; }


  private NodePackagingType[] _packagingTypes;
  public NodePackagingType[] getPackagingTypes() { return this._packagingTypes; }
  public ClusterNodesStats setPackagingTypes(NodePackagingType[] val) { this._packagingTypes = val; return this; }


  private PluginStats[] _plugins;
  public PluginStats[] getPlugins() { return this._plugins; }
  public ClusterNodesStats setPlugins(PluginStats[] val) { this._plugins = val; return this; }


  private ClusterProcess _process;
  public ClusterProcess getProcess() { return this._process; }
  public ClusterNodesStats setProcess(ClusterProcess val) { this._process = val; return this; }


  private String[] _versions;
  public String[] getVersions() { return this._versions; }
  public ClusterNodesStats setVersions(String[] val) { this._versions = val; return this; }

}
