
package org.elasticsearch.x_pack.watcher.input;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.watcher.input.*;

public class ChainInput  {
  
  private Map<String, InputContainer> _inputs;
  public Map<String, InputContainer> getInputs() { return this._inputs; }
  public ChainInput setInputs(Map<String, InputContainer> val) { this._inputs = val; return this; }

}
