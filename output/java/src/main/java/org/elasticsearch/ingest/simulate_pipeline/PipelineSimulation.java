
package org.elasticsearch.ingest.simulate_pipeline;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.ingest.simulate_pipeline.*;

public class PipelineSimulation  {
  
  private DocumentSimulation _doc;
  public DocumentSimulation getDoc() { return this._doc; }
  public PipelineSimulation setDoc(DocumentSimulation val) { this._doc = val; return this; }


  private PipelineSimulation[] _processorResults;
  public PipelineSimulation[] getProcessorResults() { return this._processorResults; }
  public PipelineSimulation setProcessorResults(PipelineSimulation[] val) { this._processorResults = val; return this; }


  private String _tag;
  public String getTag() { return this._tag; }
  public PipelineSimulation setTag(String val) { this._tag = val; return this; }

}
