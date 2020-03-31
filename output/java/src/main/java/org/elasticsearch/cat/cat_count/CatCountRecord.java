
package org.elasticsearch.cat.cat_count;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class CatCountRecord  {
  
  private String _count;
  public String getCount() { return this._count; }
  public CatCountRecord setCount(String val) { this._count = val; return this; }


  private String _epoch;
  public String getEpoch() { return this._epoch; }
  public CatCountRecord setEpoch(String val) { this._epoch = val; return this; }


  private String _timestamp;
  public String getTimestamp() { return this._timestamp; }
  public CatCountRecord setTimestamp(String val) { this._timestamp = val; return this; }

}
