
package org.elasticsearch.indices.monitoring.indices_recovery;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.index_name.*;
import org.elasticsearch.indices.monitoring.indices_recovery.*;
import org.elasticsearch.common_abstractions.response.*;

public class RecoveryStatusResponse extends DictionaryResponseBase<IndexName, RecoveryStatus> {
  
  private Map<IndexName, RecoveryStatus> _indices;
  public Map<IndexName, RecoveryStatus> getIndices() { return this._indices; }
  public RecoveryStatusResponse setIndices(Map<IndexName, RecoveryStatus> val) { this._indices = val; return this; }

}
