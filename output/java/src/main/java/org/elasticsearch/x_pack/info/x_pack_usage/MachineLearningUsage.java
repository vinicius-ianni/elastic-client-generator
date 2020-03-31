
package org.elasticsearch.x_pack.info.x_pack_usage;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.x_pack.info.x_pack_usage.*;

public class MachineLearningUsage  {
  
  private Integer _nodeCount;
  public Integer getNodeCount() { return this._nodeCount; }
  public MachineLearningUsage setNodeCount(Integer val) { this._nodeCount = val; return this; }


  private Map<String, DataFeed> _datafeeds;
  public Map<String, DataFeed> getDatafeeds() { return this._datafeeds; }
  public MachineLearningUsage setDatafeeds(Map<String, DataFeed> val) { this._datafeeds = val; return this; }


  private Map<String, Job> _jobs;
  public Map<String, Job> getJobs() { return this._jobs; }
  public MachineLearningUsage setJobs(Map<String, Job> val) { this._jobs = val; return this; }

}
