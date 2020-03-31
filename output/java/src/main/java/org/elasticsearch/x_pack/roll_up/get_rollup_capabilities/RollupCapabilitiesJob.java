
package org.elasticsearch.x_pack.roll_up.get_rollup_capabilities;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.field.*;

public class RollupCapabilitiesJob  {
  
  private Map<Field, Map<String, Object>> _fields;
  public Map<Field, Map<String, Object>> getFields() { return this._fields; }
  public RollupCapabilitiesJob setFields(Map<Field, Map<String, Object>> val) { this._fields = val; return this; }


  private String _indexPattern;
  public String getIndexPattern() { return this._indexPattern; }
  public RollupCapabilitiesJob setIndexPattern(String val) { this._indexPattern = val; return this; }


  private String _jobId;
  public String getJobId() { return this._jobId; }
  public RollupCapabilitiesJob setJobId(String val) { this._jobId = val; return this; }


  private String _rollupIndex;
  public String getRollupIndex() { return this._rollupIndex; }
  public RollupCapabilitiesJob setRollupIndex(String val) { this._rollupIndex = val; return this; }

}
