
package org.elasticsearch.x_pack.roll_up.get_rollup_job;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.roll_up.get_rollup_job.*;

public class RollupJobInformation  {
  
  private RollupJobConfiguration _config;
  public RollupJobConfiguration getConfig() { return this._config; }
  public RollupJobInformation setConfig(RollupJobConfiguration val) { this._config = val; return this; }


  private RollupJobStats _stats;
  public RollupJobStats getStats() { return this._stats; }
  public RollupJobInformation setStats(RollupJobStats val) { this._stats = val; return this; }


  private RollupJobStatus _status;
  public RollupJobStatus getStatus() { return this._status; }
  public RollupJobInformation setStatus(RollupJobStatus val) { this._status = val; return this; }

}
