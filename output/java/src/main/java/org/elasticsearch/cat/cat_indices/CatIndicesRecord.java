
package org.elasticsearch.cat.cat_indices;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class CatIndicesRecord  {
  
  private String _docsCount;
  public String getDocsCount() { return this._docsCount; }
  public CatIndicesRecord setDocsCount(String val) { this._docsCount = val; return this; }


  private String _docsDeleted;
  public String getDocsDeleted() { return this._docsDeleted; }
  public CatIndicesRecord setDocsDeleted(String val) { this._docsDeleted = val; return this; }


  private String _health;
  public String getHealth() { return this._health; }
  public CatIndicesRecord setHealth(String val) { this._health = val; return this; }


  private String _index;
  public String getIndex() { return this._index; }
  public CatIndicesRecord setIndex(String val) { this._index = val; return this; }


  private String _uuid;
  public String getUuid() { return this._uuid; }
  public CatIndicesRecord setUuid(String val) { this._uuid = val; return this; }


  private String _pri;
  public String getPri() { return this._pri; }
  public CatIndicesRecord setPri(String val) { this._pri = val; return this; }


  private String _priStoreSize;
  public String getPriStoreSize() { return this._priStoreSize; }
  public CatIndicesRecord setPriStoreSize(String val) { this._priStoreSize = val; return this; }


  private String _rep;
  public String getRep() { return this._rep; }
  public CatIndicesRecord setRep(String val) { this._rep = val; return this; }


  private String _status;
  public String getStatus() { return this._status; }
  public CatIndicesRecord setStatus(String val) { this._status = val; return this; }


  private String _storeSize;
  public String getStoreSize() { return this._storeSize; }
  public CatIndicesRecord setStoreSize(String val) { this._storeSize = val; return this; }


  private String _tm;
  public String getTm() { return this._tm; }
  public CatIndicesRecord setTm(String val) { this._tm = val; return this; }

}
