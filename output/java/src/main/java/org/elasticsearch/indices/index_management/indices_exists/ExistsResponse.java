
package org.elasticsearch.indices.index_management.indices_exists;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class ExistsResponse  {
  
  private Boolean _exists;
  public Boolean getExists() { return this._exists; }
  public ExistsResponse setExists(Boolean val) { this._exists = val; return this; }

}
