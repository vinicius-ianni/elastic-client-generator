
package org.elasticsearch.cat.cat_nodes;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.cat.cat_nodes.*;

public class CatNodesResponse  {
  
  private CatNodesRecord[] _records;
  public CatNodesRecord[] getRecords() { return this._records; }
  public CatNodesResponse setRecords(CatNodesRecord[] val) { this._records = val; return this; }

}
