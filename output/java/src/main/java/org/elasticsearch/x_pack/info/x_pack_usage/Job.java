
package org.elasticsearch.x_pack.info.x_pack_usage;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.machine_learning.job.config.*;
import org.elasticsearch.common_options.time_unit.*;
import org.elasticsearch.internal.*;

public class Job  {
  
  private AnalysisConfig _analysisConfig;
  public AnalysisConfig getAnalysisConfig() { return this._analysisConfig; }
  public Job setAnalysisConfig(AnalysisConfig val) { this._analysisConfig = val; return this; }


  private AnalysisLimits _analysisLimits;
  public AnalysisLimits getAnalysisLimits() { return this._analysisLimits; }
  public Job setAnalysisLimits(AnalysisLimits val) { this._analysisLimits = val; return this; }


  private Time _backgroundPersistInterval;
  public Time getBackgroundPersistInterval() { return this._backgroundPersistInterval; }
  public Job setBackgroundPersistInterval(Time val) { this._backgroundPersistInterval = val; return this; }


  private Date _createTime;
  public Date getCreateTime() { return this._createTime; }
  public Job setCreateTime(Date val) { this._createTime = val; return this; }


  private DataDescription _dataDescription;
  public DataDescription getDataDescription() { return this._dataDescription; }
  public Job setDataDescription(DataDescription val) { this._dataDescription = val; return this; }


  private String _description;
  public String getDescription() { return this._description; }
  public Job setDescription(String val) { this._description = val; return this; }


  private Date _finishedTime;
  public Date getFinishedTime() { return this._finishedTime; }
  public Job setFinishedTime(Date val) { this._finishedTime = val; return this; }


  private String _jobId;
  public String getJobId() { return this._jobId; }
  public Job setJobId(String val) { this._jobId = val; return this; }


  private String _jobType;
  public String getJobType() { return this._jobType; }
  public Job setJobType(String val) { this._jobType = val; return this; }


  private ModelPlotConfig _modelPlot;
  public ModelPlotConfig getModelPlot() { return this._modelPlot; }
  public Job setModelPlot(ModelPlotConfig val) { this._modelPlot = val; return this; }


  private String _modelSnapshotId;
  public String getModelSnapshotId() { return this._modelSnapshotId; }
  public Job setModelSnapshotId(String val) { this._modelSnapshotId = val; return this; }


  private Long _modelSnapshotRetentionDays;
  public Long getModelSnapshotRetentionDays() { return this._modelSnapshotRetentionDays; }
  public Job setModelSnapshotRetentionDays(Long val) { this._modelSnapshotRetentionDays = val; return this; }


  private Long _renormalizationWindowDays;
  public Long getRenormalizationWindowDays() { return this._renormalizationWindowDays; }
  public Job setRenormalizationWindowDays(Long val) { this._renormalizationWindowDays = val; return this; }


  private String _resultsIndexName;
  public String getResultsIndexName() { return this._resultsIndexName; }
  public Job setResultsIndexName(String val) { this._resultsIndexName = val; return this; }


  private Long _resultsRetentionDays;
  public Long getResultsRetentionDays() { return this._resultsRetentionDays; }
  public Job setResultsRetentionDays(Long val) { this._resultsRetentionDays = val; return this; }

}
