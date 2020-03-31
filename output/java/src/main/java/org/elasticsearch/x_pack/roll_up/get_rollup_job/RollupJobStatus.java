
package org.elasticsearch.x_pack.roll_up.get_rollup_job;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.roll_up.get_rollup_job.*;

public class RollupJobStatus  {
  
  private Map<String, Object> _currentPosition;
  public Map<String, Object> getCurrentPosition() { return this._currentPosition; }
  public RollupJobStatus setCurrentPosition(Map<String, Object> val) { this._currentPosition = val; return this; }


  private IndexingJobState _jobState;
  public IndexingJobState getJobState() { return this._jobState; }
  public RollupJobStatus setJobState(IndexingJobState val) { this._jobState = val; return this; }


  private Boolean _upgradedDocId;
  public Boolean getUpgradedDocId() { return this._upgradedDocId; }
  public RollupJobStatus setUpgradedDocId(Boolean val) { this._upgradedDocId = val; return this; }

}
