
package org.elasticsearch.x_pack.watcher.execution.index;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.watcher.execution.index.*;

public class IndexActionResult  {
  
  private String _id;
  public String getId() { return this._id; }
  public IndexActionResult setId(String val) { this._id = val; return this; }


  private IndexActionResultIndexResponse _response;
  public IndexActionResultIndexResponse getResponse() { return this._response; }
  public IndexActionResult setResponse(IndexActionResultIndexResponse val) { this._response = val; return this; }

}
