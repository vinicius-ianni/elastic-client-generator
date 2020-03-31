
package org.elasticsearch.x_pack.machine_learning.get_jobs;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.x_pack.info.x_pack_usage.*;

public class GetJobsResponse  {
  
  private Long _count;
  public Long getCount() { return this._count; }
  public GetJobsResponse setCount(Long val) { this._count = val; return this; }


  private Job[] _jobs;
  public Job[] getJobs() { return this._jobs; }
  public GetJobsResponse setJobs(Job[] val) { this._jobs = val; return this; }

}
