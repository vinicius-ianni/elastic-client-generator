
package org.elasticsearch.x_pack.roll_up.get_rollup_index_capabilities;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.field.*;

public class RollupIndexCapabilitiesJob  {
  
  private Map<Field, Map<String, String>> _fields;
  public Map<Field, Map<String, String>> getFields() { return this._fields; }
  public RollupIndexCapabilitiesJob setFields(Map<Field, Map<String, String>> val) { this._fields = val; return this; }


  private String _indexPattern;
  public String getIndexPattern() { return this._indexPattern; }
  public RollupIndexCapabilitiesJob setIndexPattern(String val) { this._indexPattern = val; return this; }


  private String _jobId;
  public String getJobId() { return this._jobId; }
  public RollupIndexCapabilitiesJob setJobId(String val) { this._jobId = val; return this; }


  private String _rollupIndex;
  public String getRollupIndex() { return this._rollupIndex; }
  public RollupIndexCapabilitiesJob setRollupIndex(String val) { this._rollupIndex = val; return this; }

}
