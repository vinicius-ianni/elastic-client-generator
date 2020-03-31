
package org.elasticsearch.cat.cat_node_attributes;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.cat.cat_node_attributes.*;

public class CatNodeAttributesResponse  {
  
  private CatNodeAttributesRecord[] _records;
  public CatNodeAttributesRecord[] getRecords() { return this._records; }
  public CatNodeAttributesResponse setRecords(CatNodeAttributesRecord[] val) { this._records = val; return this; }

}
