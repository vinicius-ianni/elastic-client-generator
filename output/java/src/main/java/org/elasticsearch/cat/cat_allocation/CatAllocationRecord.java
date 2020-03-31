
package org.elasticsearch.cat.cat_allocation;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class CatAllocationRecord  {
  
  private String _diskAvail;
  public String getDiskAvail() { return this._diskAvail; }
  public CatAllocationRecord setDiskAvail(String val) { this._diskAvail = val; return this; }


  private String _diskRatio;
  public String getDiskRatio() { return this._diskRatio; }
  public CatAllocationRecord setDiskRatio(String val) { this._diskRatio = val; return this; }


  private String _diskUsed;
  public String getDiskUsed() { return this._diskUsed; }
  public CatAllocationRecord setDiskUsed(String val) { this._diskUsed = val; return this; }


  private String _ip;
  public String getIp() { return this._ip; }
  public CatAllocationRecord setIp(String val) { this._ip = val; return this; }


  private String _node;
  public String getNode() { return this._node; }
  public CatAllocationRecord setNode(String val) { this._node = val; return this; }


  private String _shards;
  public String getShards() { return this._shards; }
  public CatAllocationRecord setShards(String val) { this._shards = val; return this; }

}
