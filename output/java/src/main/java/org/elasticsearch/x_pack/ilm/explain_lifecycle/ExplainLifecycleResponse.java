
package org.elasticsearch.x_pack.ilm.explain_lifecycle;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.ilm.explain_lifecycle.*;

public class ExplainLifecycleResponse  {
  
  private Map<String, LifecycleExplain> _indices;
  public Map<String, LifecycleExplain> getIndices() { return this._indices; }
  public ExplainLifecycleResponse setIndices(Map<String, LifecycleExplain> val) { this._indices = val; return this; }

}
