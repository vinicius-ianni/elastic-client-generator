
package org.elasticsearch.x_pack.machine_learning.get_job_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.x_pack.machine_learning.job.config.*;

public class GetJobStatsResponse  {
  
  private Long _count;
  public Long getCount() { return this._count; }
  public GetJobStatsResponse setCount(Long val) { this._count = val; return this; }


  private JobStats[] _jobs;
  public JobStats[] getJobs() { return this._jobs; }
  public GetJobStatsResponse setJobs(JobStats[] val) { this._jobs = val; return this; }

}
