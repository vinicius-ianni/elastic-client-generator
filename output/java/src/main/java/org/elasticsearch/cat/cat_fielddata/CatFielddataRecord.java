
package org.elasticsearch.cat.cat_fielddata;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class CatFielddataRecord  {
  
  private String _field;
  public String getField() { return this._field; }
  public CatFielddataRecord setField(String val) { this._field = val; return this; }


  private String _host;
  public String getHost() { return this._host; }
  public CatFielddataRecord setHost(String val) { this._host = val; return this; }


  private String _id;
  public String getId() { return this._id; }
  public CatFielddataRecord setId(String val) { this._id = val; return this; }


  private String _ip;
  public String getIp() { return this._ip; }
  public CatFielddataRecord setIp(String val) { this._ip = val; return this; }


  private String _node;
  public String getNode() { return this._node; }
  public CatFielddataRecord setNode(String val) { this._node = val; return this; }


  private String _size;
  public String getSize() { return this._size; }
  public CatFielddataRecord setSize(String val) { this._size = val; return this; }

}
