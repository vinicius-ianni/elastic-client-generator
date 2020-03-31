
package org.elasticsearch.cluster.cluster_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class ClusterOperatingSystemName  {
  
  private Integer _count;
  public Integer getCount() { return this._count; }
  public ClusterOperatingSystemName setCount(Integer val) { this._count = val; return this; }


  private String _name;
  public String getName() { return this._name; }
  public ClusterOperatingSystemName setName(String val) { this._name = val; return this; }

}
