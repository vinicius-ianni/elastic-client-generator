
package org.elasticsearch.x_pack.machine_learning.job.config;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.machine_learning.job.process.*;
import org.elasticsearch.x_pack.machine_learning.job.config.*;
import org.elasticsearch.x_pack.machine_learning.datafeed.*;
import org.elasticsearch.common_options.time_unit.*;

public class JobStats  {
  
  private String _assignmentExplanation;
  public String getAssignmentExplanation() { return this._assignmentExplanation; }
  public JobStats setAssignmentExplanation(String val) { this._assignmentExplanation = val; return this; }


  private DataCounts _dataCounts;
  public DataCounts getDataCounts() { return this._dataCounts; }
  public JobStats setDataCounts(DataCounts val) { this._dataCounts = val; return this; }


  private JobForecastStatistics _forecastsStats;
  public JobForecastStatistics getForecastsStats() { return this._forecastsStats; }
  public JobStats setForecastsStats(JobForecastStatistics val) { this._forecastsStats = val; return this; }


  private String _jobId;
  public String getJobId() { return this._jobId; }
  public JobStats setJobId(String val) { this._jobId = val; return this; }


  private ModelSizeStats _modelSizeStats;
  public ModelSizeStats getModelSizeStats() { return this._modelSizeStats; }
  public JobStats setModelSizeStats(ModelSizeStats val) { this._modelSizeStats = val; return this; }


  private DiscoveryNode _node;
  public DiscoveryNode getNode() { return this._node; }
  public JobStats setNode(DiscoveryNode val) { this._node = val; return this; }


  private Time _openTime;
  public Time getOpenTime() { return this._openTime; }
  public JobStats setOpenTime(Time val) { this._openTime = val; return this; }


  private JobState _state;
  public JobState getState() { return this._state; }
  public JobStats setState(JobState val) { this._state = val; return this; }


  private TimingStats _timingStats;
  public TimingStats getTimingStats() { return this._timingStats; }
  public JobStats setTimingStats(TimingStats val) { this._timingStats = val; return this; }

}
