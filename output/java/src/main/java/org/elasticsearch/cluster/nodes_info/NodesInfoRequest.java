
package org.elasticsearch.cluster.nodes_info;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_options.time_unit.*;

public class NodesInfoRequest  {
  
  private Boolean _flatSettings;
  public Boolean getFlatSettings() { return this._flatSettings; }
  public NodesInfoRequest setFlatSettings(Boolean val) { this._flatSettings = val; return this; }


  private Time _timeout;
  public Time getTimeout() { return this._timeout; }
  public NodesInfoRequest setTimeout(Time val) { this._timeout = val; return this; }

}
