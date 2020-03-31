
package org.elasticsearch.cat.cat_node_attributes;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class CatNodeAttributesRecord  {
  
  private String _attr;
  public String getAttr() { return this._attr; }
  public CatNodeAttributesRecord setAttr(String val) { this._attr = val; return this; }


  private String _host;
  public String getHost() { return this._host; }
  public CatNodeAttributesRecord setHost(String val) { this._host = val; return this; }


  private String _id;
  public String getId() { return this._id; }
  public CatNodeAttributesRecord setId(String val) { this._id = val; return this; }


  private String _ip;
  public String getIp() { return this._ip; }
  public CatNodeAttributesRecord setIp(String val) { this._ip = val; return this; }


  private String _node;
  public String getNode() { return this._node; }
  public CatNodeAttributesRecord setNode(String val) { this._node = val; return this; }


  private Long _port;
  public Long getPort() { return this._port; }
  public CatNodeAttributesRecord setPort(Long val) { this._port = val; return this; }


  private Long _pid;
  public Long getPid() { return this._pid; }
  public CatNodeAttributesRecord setPid(Long val) { this._pid = val; return this; }


  private String _value;
  public String getValue() { return this._value; }
  public CatNodeAttributesRecord setValue(String val) { this._value = val; return this; }

}
