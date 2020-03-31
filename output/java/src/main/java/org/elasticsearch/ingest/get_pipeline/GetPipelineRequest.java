
package org.elasticsearch.ingest.get_pipeline;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_options.time_unit.*;

public class GetPipelineRequest  {
  
  private Time _masterTimeout;
  public Time getMasterTimeout() { return this._masterTimeout; }
  public GetPipelineRequest setMasterTimeout(Time val) { this._masterTimeout = val; return this; }

}
