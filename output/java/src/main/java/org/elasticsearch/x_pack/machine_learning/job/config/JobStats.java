
package org.elasticsearch.x_pack.machine_learning.job.config;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.x_pack.machine_learning.job.process.*;
import org.elasticsearch.x_pack.machine_learning.job.config.*;
import org.elasticsearch.x_pack.machine_learning.datafeed.*;
import org.elasticsearch.common_options.time_unit.*;

public class JobStats  implements XContentable<JobStats> {
  
  static final ParseField ASSIGNMENT_EXPLANATION = new ParseField("assignment_explanation");
  private String _assignmentExplanation;
  public String getAssignmentExplanation() { return this._assignmentExplanation; }
  public JobStats setAssignmentExplanation(String val) { this._assignmentExplanation = val; return this; }


  static final ParseField DATA_COUNTS = new ParseField("data_counts");
  private DataCounts _dataCounts;
  public DataCounts getDataCounts() { return this._dataCounts; }
  public JobStats setDataCounts(DataCounts val) { this._dataCounts = val; return this; }


  static final ParseField FORECASTS_STATS = new ParseField("forecasts_stats");
  private JobForecastStatistics _forecastsStats;
  public JobForecastStatistics getForecastsStats() { return this._forecastsStats; }
  public JobStats setForecastsStats(JobForecastStatistics val) { this._forecastsStats = val; return this; }


  static final ParseField JOB_ID = new ParseField("job_id");
  private String _jobId;
  public String getJobId() { return this._jobId; }
  public JobStats setJobId(String val) { this._jobId = val; return this; }


  static final ParseField MODEL_SIZE_STATS = new ParseField("model_size_stats");
  private ModelSizeStats _modelSizeStats;
  public ModelSizeStats getModelSizeStats() { return this._modelSizeStats; }
  public JobStats setModelSizeStats(ModelSizeStats val) { this._modelSizeStats = val; return this; }


  static final ParseField NODE = new ParseField("node");
  private DiscoveryNode _node;
  public DiscoveryNode getNode() { return this._node; }
  public JobStats setNode(DiscoveryNode val) { this._node = val; return this; }


  static final ParseField OPEN_TIME = new ParseField("open_time");
  private Time _openTime;
  public Time getOpenTime() { return this._openTime; }
  public JobStats setOpenTime(Time val) { this._openTime = val; return this; }


  static final ParseField STATE = new ParseField("state");
  private JobState _state;
  public JobState getState() { return this._state; }
  public JobStats setState(JobState val) { this._state = val; return this; }


  static final ParseField TIMING_STATS = new ParseField("timing_stats");
  private TimingStats _timingStats;
  public TimingStats getTimingStats() { return this._timingStats; }
  public JobStats setTimingStats(TimingStats val) { this._timingStats = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public JobStats fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return JobStats.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<JobStats, Void> PARSER =
    new ConstructingObjectParser<>(JobStats.class.getName(), false, args -> new JobStats());

  static {
    PARSER.declareString(JobStats::setAssignmentExplanation, ASSIGNMENT_EXPLANATION);
    PARSER.declareObject(JobStats::setDataCounts, (p, t) -> DataCounts.PARSER.apply(p, null), DATA_COUNTS);
    PARSER.declareObject(JobStats::setForecastsStats, (p, t) -> JobForecastStatistics.PARSER.apply(p, null), FORECASTS_STATS);
    PARSER.declareString(JobStats::setJobId, JOB_ID);
    PARSER.declareObject(JobStats::setModelSizeStats, (p, t) -> ModelSizeStats.PARSER.apply(p, null), MODEL_SIZE_STATS);
    PARSER.declareObject(JobStats::setNode, (p, t) -> DiscoveryNode.PARSER.apply(p, null), NODE);
    PARSER.declareObject(JobStats::setOpenTime, (p, t) -> Time.PARSER.apply(p, null), OPEN_TIME);
    PARSER.declareObject(JobStats::setState, (p, t) -> JobState.PARSER.apply(p, null), STATE);
    PARSER.declareObject(JobStats::setTimingStats, (p, t) -> TimingStats.PARSER.apply(p, null), TIMING_STATS);
  }

}
