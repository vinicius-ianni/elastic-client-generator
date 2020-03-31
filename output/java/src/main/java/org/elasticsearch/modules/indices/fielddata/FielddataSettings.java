
package org.elasticsearch.modules.indices.fielddata;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_options.time_unit.*;

public class FielddataSettings  {
  
  private Time _cacheExpire;
  public Time getCacheExpire() { return this._cacheExpire; }
  public FielddataSettings setCacheExpire(Time val) { this._cacheExpire = val; return this; }


  private String _cacheSize;
  public String getCacheSize() { return this._cacheSize; }
  public FielddataSettings setCacheSize(String val) { this._cacheSize = val; return this; }

}
