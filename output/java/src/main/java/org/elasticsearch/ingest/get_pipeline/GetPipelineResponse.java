
package org.elasticsearch.ingest.get_pipeline;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.ingest.*;
import org.elasticsearch.common_abstractions.response.*;

public class GetPipelineResponse extends DictionaryResponseBase<String, Pipeline> {
  
  private Map<String, Pipeline> _pipelines;
  public Map<String, Pipeline> getPipelines() { return this._pipelines; }
  public GetPipelineResponse setPipelines(Map<String, Pipeline> val) { this._pipelines = val; return this; }

}
