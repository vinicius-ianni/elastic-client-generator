
package org.elasticsearch.cat.cat_templates;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.cat.cat_templates.*;

public class CatTemplatesResponse  {
  
  private CatTemplatesRecord[] _records;
  public CatTemplatesRecord[] getRecords() { return this._records; }
  public CatTemplatesResponse setRecords(CatTemplatesRecord[] val) { this._records = val; return this; }

}
