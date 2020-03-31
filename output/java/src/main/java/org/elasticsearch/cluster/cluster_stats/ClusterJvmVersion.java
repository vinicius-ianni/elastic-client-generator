
package org.elasticsearch.cluster.cluster_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class ClusterJvmVersion  {
  
  private Boolean _bundledJdk;
  public Boolean getBundledJdk() { return this._bundledJdk; }
  public ClusterJvmVersion setBundledJdk(Boolean val) { this._bundledJdk = val; return this; }


  private Integer _count;
  public Integer getCount() { return this._count; }
  public ClusterJvmVersion setCount(Integer val) { this._count = val; return this; }


  private Boolean _usingBundledJdk;
  public Boolean getUsingBundledJdk() { return this._usingBundledJdk; }
  public ClusterJvmVersion setUsingBundledJdk(Boolean val) { this._usingBundledJdk = val; return this; }


  private String _version;
  public String getVersion() { return this._version; }
  public ClusterJvmVersion setVersion(String val) { this._version = val; return this; }


  private String _vmName;
  public String getVmName() { return this._vmName; }
  public ClusterJvmVersion setVmName(String val) { this._vmName = val; return this; }


  private String _vmVendor;
  public String getVmVendor() { return this._vmVendor; }
  public ClusterJvmVersion setVmVendor(String val) { this._vmVendor = val; return this; }


  private String _vmVersion;
  public String getVmVersion() { return this._vmVersion; }
  public ClusterJvmVersion setVmVersion(String val) { this._vmVersion = val; return this; }

}
