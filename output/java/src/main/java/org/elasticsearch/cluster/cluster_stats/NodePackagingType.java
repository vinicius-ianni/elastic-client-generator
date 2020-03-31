
package org.elasticsearch.cluster.cluster_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class NodePackagingType  {
  
  private Integer _count;
  public Integer getCount() { return this._count; }
  public NodePackagingType setCount(Integer val) { this._count = val; return this; }


  private String _flavor;
  public String getFlavor() { return this._flavor; }
  public NodePackagingType setFlavor(String val) { this._flavor = val; return this; }


  private String _type;
  public String getType() { return this._type; }
  public NodePackagingType setType(String val) { this._type = val; return this; }

}
