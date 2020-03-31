
package org.elasticsearch.cat.cat_plugins;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.cat.cat_plugins.*;

public class CatPluginsResponse  {
  
  private CatPluginsRecord[] _records;
  public CatPluginsRecord[] getRecords() { return this._records; }
  public CatPluginsResponse setRecords(CatPluginsRecord[] val) { this._records = val; return this; }

}
