
package org.elasticsearch.x_pack.watcher.input;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class SimpleInput  {
  
  private Map<String, Object> _payload;
  public Map<String, Object> getPayload() { return this._payload; }
  public SimpleInput setPayload(Map<String, Object> val) { this._payload = val; return this; }

}
