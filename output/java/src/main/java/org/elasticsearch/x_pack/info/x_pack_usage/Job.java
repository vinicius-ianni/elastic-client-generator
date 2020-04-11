
package org.elasticsearch.x_pack.info.x_pack_usage;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;
import org.elasticsearch.x_pack.machine_learning.job.config.*;
import org.elasticsearch.common_options.time_unit.*;
import org.elasticsearch.internal.*;

public class Job  implements XContentable<Job> {
  
  static final ParseField ANALYSIS_CONFIG = new ParseField("analysis_config");
  private AnalysisConfig _analysisConfig;
  public AnalysisConfig getAnalysisConfig() { return this._analysisConfig; }
  public Job setAnalysisConfig(AnalysisConfig val) { this._analysisConfig = val; return this; }


  static final ParseField ANALYSIS_LIMITS = new ParseField("analysis_limits");
  private AnalysisLimits _analysisLimits;
  public AnalysisLimits getAnalysisLimits() { return this._analysisLimits; }
  public Job setAnalysisLimits(AnalysisLimits val) { this._analysisLimits = val; return this; }


  static final ParseField BACKGROUND_PERSIST_INTERVAL = new ParseField("background_persist_interval");
  private Time _backgroundPersistInterval;
  public Time getBackgroundPersistInterval() { return this._backgroundPersistInterval; }
  public Job setBackgroundPersistInterval(Time val) { this._backgroundPersistInterval = val; return this; }


  static final ParseField CREATE_TIME = new ParseField("create_time");
  private Date _createTime;
  public Date getCreateTime() { return this._createTime; }
  public Job setCreateTime(Date val) { this._createTime = val; return this; }


  static final ParseField DATA_DESCRIPTION = new ParseField("data_description");
  private DataDescription _dataDescription;
  public DataDescription getDataDescription() { return this._dataDescription; }
  public Job setDataDescription(DataDescription val) { this._dataDescription = val; return this; }


  static final ParseField DESCRIPTION = new ParseField("description");
  private String _description;
  public String getDescription() { return this._description; }
  public Job setDescription(String val) { this._description = val; return this; }


  static final ParseField FINISHED_TIME = new ParseField("finished_time");
  private Date _finishedTime;
  public Date getFinishedTime() { return this._finishedTime; }
  public Job setFinishedTime(Date val) { this._finishedTime = val; return this; }


  static final ParseField JOB_ID = new ParseField("job_id");
  private String _jobId;
  public String getJobId() { return this._jobId; }
  public Job setJobId(String val) { this._jobId = val; return this; }


  static final ParseField JOB_TYPE = new ParseField("job_type");
  private String _jobType;
  public String getJobType() { return this._jobType; }
  public Job setJobType(String val) { this._jobType = val; return this; }


  static final ParseField MODEL_PLOT = new ParseField("model_plot");
  private ModelPlotConfig _modelPlot;
  public ModelPlotConfig getModelPlot() { return this._modelPlot; }
  public Job setModelPlot(ModelPlotConfig val) { this._modelPlot = val; return this; }


  static final ParseField MODEL_SNAPSHOT_ID = new ParseField("model_snapshot_id");
  private String _modelSnapshotId;
  public String getModelSnapshotId() { return this._modelSnapshotId; }
  public Job setModelSnapshotId(String val) { this._modelSnapshotId = val; return this; }


  static final ParseField MODEL_SNAPSHOT_RETENTION_DAYS = new ParseField("model_snapshot_retention_days");
  private Long _modelSnapshotRetentionDays;
  public Long getModelSnapshotRetentionDays() { return this._modelSnapshotRetentionDays; }
  public Job setModelSnapshotRetentionDays(Long val) { this._modelSnapshotRetentionDays = val; return this; }


  static final ParseField RENORMALIZATION_WINDOW_DAYS = new ParseField("renormalization_window_days");
  private Long _renormalizationWindowDays;
  public Long getRenormalizationWindowDays() { return this._renormalizationWindowDays; }
  public Job setRenormalizationWindowDays(Long val) { this._renormalizationWindowDays = val; return this; }


  static final ParseField RESULTS_INDEX_NAME = new ParseField("results_index_name");
  private String _resultsIndexName;
  public String getResultsIndexName() { return this._resultsIndexName; }
  public Job setResultsIndexName(String val) { this._resultsIndexName = val; return this; }


  static final ParseField RESULTS_RETENTION_DAYS = new ParseField("results_retention_days");
  private Long _resultsRetentionDays;
  public Long getResultsRetentionDays() { return this._resultsRetentionDays; }
  public Job setResultsRetentionDays(Long val) { this._resultsRetentionDays = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public Job fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return Job.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<Job, Void> PARSER =
    new ConstructingObjectParser<>(Job.class.getName(), false, args -> new Job());

  static {
    PARSER.declareObject(Job::setAnalysisConfig, (p, t) -> AnalysisConfig.PARSER.apply(p, t), ANALYSIS_CONFIG);
    PARSER.declareObject(Job::setAnalysisLimits, (p, t) -> AnalysisLimits.PARSER.apply(p, t), ANALYSIS_LIMITS);
    PARSER.declareObject(Job::setBackgroundPersistInterval, (p, t) -> Time.PARSER.apply(p, t), BACKGROUND_PERSIST_INTERVAL);
    PARSER.declareObject(Job::setCreateTime, (p, t) -> Date.from(Instant.from(DateTimeFormatter.ISO_DATE.parse(p.text()))), CREATE_TIME);
    PARSER.declareObject(Job::setDataDescription, (p, t) -> DataDescription.PARSER.apply(p, t), DATA_DESCRIPTION);
    PARSER.declareString(Job::setDescription, DESCRIPTION);
    PARSER.declareObject(Job::setFinishedTime, (p, t) -> Date.from(Instant.from(DateTimeFormatter.ISO_DATE.parse(p.text()))), FINISHED_TIME);
    PARSER.declareString(Job::setJobId, JOB_ID);
    PARSER.declareString(Job::setJobType, JOB_TYPE);
    PARSER.declareObject(Job::setModelPlot, (p, t) -> ModelPlotConfig.PARSER.apply(p, t), MODEL_PLOT);
    PARSER.declareString(Job::setModelSnapshotId, MODEL_SNAPSHOT_ID);
    PARSER.declareLong(Job::setModelSnapshotRetentionDays, MODEL_SNAPSHOT_RETENTION_DAYS);
    PARSER.declareLong(Job::setRenormalizationWindowDays, RENORMALIZATION_WINDOW_DAYS);
    PARSER.declareString(Job::setResultsIndexName, RESULTS_INDEX_NAME);
    PARSER.declareLong(Job::setResultsRetentionDays, RESULTS_RETENTION_DAYS);
  }

}
