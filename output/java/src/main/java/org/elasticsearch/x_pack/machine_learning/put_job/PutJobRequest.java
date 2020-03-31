
package org.elasticsearch.x_pack.machine_learning.put_job;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.machine_learning.job.config.*;
import org.elasticsearch.internal.*;
import org.elasticsearch.common_abstractions.infer.index_name.*;

public class PutJobRequest  {
  
  private AnalysisConfig _analysisConfig;
  public AnalysisConfig getAnalysisConfig() { return this._analysisConfig; }
  public PutJobRequest setAnalysisConfig(AnalysisConfig val) { this._analysisConfig = val; return this; }


  private AnalysisLimits _analysisLimits;
  public AnalysisLimits getAnalysisLimits() { return this._analysisLimits; }
  public PutJobRequest setAnalysisLimits(AnalysisLimits val) { this._analysisLimits = val; return this; }


  private DataDescription _dataDescription;
  public DataDescription getDataDescription() { return this._dataDescription; }
  public PutJobRequest setDataDescription(DataDescription val) { this._dataDescription = val; return this; }


  private String _description;
  public String getDescription() { return this._description; }
  public PutJobRequest setDescription(String val) { this._description = val; return this; }


  private ModelPlotConfig _modelPlot;
  public ModelPlotConfig getModelPlot() { return this._modelPlot; }
  public PutJobRequest setModelPlot(ModelPlotConfig val) { this._modelPlot = val; return this; }


  private Long _modelSnapshotRetentionDays;
  public Long getModelSnapshotRetentionDays() { return this._modelSnapshotRetentionDays; }
  public PutJobRequest setModelSnapshotRetentionDays(Long val) { this._modelSnapshotRetentionDays = val; return this; }


  private IndexName _resultsIndexName;
  public IndexName getResultsIndexName() { return this._resultsIndexName; }
  public PutJobRequest setResultsIndexName(IndexName val) { this._resultsIndexName = val; return this; }

}
