
package org.elasticsearch.ingest.simulate_pipeline;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.id.*;
import org.elasticsearch.common_abstractions.infer.index_name.*;

public class SimulatePipelineDocument  {
  
  private Id _id;
  public Id getId() { return this._id; }
  public SimulatePipelineDocument setId(Id val) { this._id = val; return this; }


  private IndexName _index;
  public IndexName getIndex() { return this._index; }
  public SimulatePipelineDocument setIndex(IndexName val) { this._index = val; return this; }


  private Object _source;
  public Object getSource() { return this._source; }
  public SimulatePipelineDocument setSource(Object val) { this._source = val; return this; }

}
