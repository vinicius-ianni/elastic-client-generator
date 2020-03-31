
package org.elasticsearch.ingest.simulate_pipeline;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.ingest.simulate_pipeline.*;
import org.elasticsearch.ingest.*;

public class SimulatePipelineRequest  {
  
  private SimulatePipelineDocument[] _docs;
  public SimulatePipelineDocument[] getDocs() { return this._docs; }
  public SimulatePipelineRequest setDocs(SimulatePipelineDocument[] val) { this._docs = val; return this; }


  private Pipeline _pipeline;
  public Pipeline getPipeline() { return this._pipeline; }
  public SimulatePipelineRequest setPipeline(Pipeline val) { this._pipeline = val; return this; }


  private Boolean _verbose;
  public Boolean getVerbose() { return this._verbose; }
  public SimulatePipelineRequest setVerbose(Boolean val) { this._verbose = val; return this; }

}
