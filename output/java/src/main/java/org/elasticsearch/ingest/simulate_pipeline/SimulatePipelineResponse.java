
package org.elasticsearch.ingest.simulate_pipeline;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.ingest.simulate_pipeline.*;

public class SimulatePipelineResponse  {
  
  private PipelineSimulation[] _docs;
  public PipelineSimulation[] getDocs() { return this._docs; }
  public SimulatePipelineResponse setDocs(PipelineSimulation[] val) { this._docs = val; return this; }

}
