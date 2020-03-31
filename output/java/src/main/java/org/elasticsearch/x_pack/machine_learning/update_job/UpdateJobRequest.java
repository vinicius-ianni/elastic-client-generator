
package org.elasticsearch.x_pack.machine_learning.update_job;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.machine_learning.job.config.*;
import org.elasticsearch.common_options.time_unit.*;
import org.elasticsearch.internal.*;

public class UpdateJobRequest  {
  
  private AnalysisMemoryLimit _analysisLimits;
  public AnalysisMemoryLimit getAnalysisLimits() { return this._analysisLimits; }
  public UpdateJobRequest setAnalysisLimits(AnalysisMemoryLimit val) { this._analysisLimits = val; return this; }


  private Time _backgroundPersistInterval;
  public Time getBackgroundPersistInterval() { return this._backgroundPersistInterval; }
  public UpdateJobRequest setBackgroundPersistInterval(Time val) { this._backgroundPersistInterval = val; return this; }


  private Map<String, Object> _customSettings;
  public Map<String, Object> getCustomSettings() { return this._customSettings; }
  public UpdateJobRequest setCustomSettings(Map<String, Object> val) { this._customSettings = val; return this; }


  private String _description;
  public String getDescription() { return this._description; }
  public UpdateJobRequest setDescription(String val) { this._description = val; return this; }


  private ModelPlotConfigEnabled _modelPlotConfig;
  public ModelPlotConfigEnabled getModelPlotConfig() { return this._modelPlotConfig; }
  public UpdateJobRequest setModelPlotConfig(ModelPlotConfigEnabled val) { this._modelPlotConfig = val; return this; }


  private Long _modelSnapshotRetentionDays;
  public Long getModelSnapshotRetentionDays() { return this._modelSnapshotRetentionDays; }
  public UpdateJobRequest setModelSnapshotRetentionDays(Long val) { this._modelSnapshotRetentionDays = val; return this; }


  private Long _renormalizationWindowDays;
  public Long getRenormalizationWindowDays() { return this._renormalizationWindowDays; }
  public UpdateJobRequest setRenormalizationWindowDays(Long val) { this._renormalizationWindowDays = val; return this; }


  private Long _resultsRetentionDays;
  public Long getResultsRetentionDays() { return this._resultsRetentionDays; }
  public UpdateJobRequest setResultsRetentionDays(Long val) { this._resultsRetentionDays = val; return this; }

}
