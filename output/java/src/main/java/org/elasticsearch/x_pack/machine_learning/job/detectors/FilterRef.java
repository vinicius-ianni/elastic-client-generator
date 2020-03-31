
package org.elasticsearch.x_pack.machine_learning.job.detectors;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.id.*;
import org.elasticsearch.x_pack.machine_learning.job.detectors.*;

public class FilterRef  {
  
  private Id _filterId;
  public Id getFilterId() { return this._filterId; }
  public FilterRef setFilterId(Id val) { this._filterId = val; return this; }


  private RuleFilterType _filterType;
  public RuleFilterType getFilterType() { return this._filterType; }
  public FilterRef setFilterType(RuleFilterType val) { this._filterType = val; return this; }

}
