
package org.elasticsearch.x_pack.machine_learning.job.config;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_options.time_unit.*;
import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.x_pack.machine_learning.job.detectors.*;

public class AnalysisConfig  {
  
  private Time _bucketSpan;
  public Time getBucketSpan() { return this._bucketSpan; }
  public AnalysisConfig setBucketSpan(Time val) { this._bucketSpan = val; return this; }


  private Field _categorizationFieldName;
  public Field getCategorizationFieldName() { return this._categorizationFieldName; }
  public AnalysisConfig setCategorizationFieldName(Field val) { this._categorizationFieldName = val; return this; }


  private String[] _categorizationFilters;
  public String[] getCategorizationFilters() { return this._categorizationFilters; }
  public AnalysisConfig setCategorizationFilters(String[] val) { this._categorizationFilters = val; return this; }


  private Detector[] _detectors;
  public Detector[] getDetectors() { return this._detectors; }
  public AnalysisConfig setDetectors(Detector[] val) { this._detectors = val; return this; }


  private Field[] _influencers;
  public Field[] getInfluencers() { return this._influencers; }
  public AnalysisConfig setInfluencers(Field[] val) { this._influencers = val; return this; }


  private Time _latency;
  public Time getLatency() { return this._latency; }
  public AnalysisConfig setLatency(Time val) { this._latency = val; return this; }


  private Boolean _multivariateByFields;
  public Boolean getMultivariateByFields() { return this._multivariateByFields; }
  public AnalysisConfig setMultivariateByFields(Boolean val) { this._multivariateByFields = val; return this; }


  private Field _summaryCountFieldName;
  public Field getSummaryCountFieldName() { return this._summaryCountFieldName; }
  public AnalysisConfig setSummaryCountFieldName(Field val) { this._summaryCountFieldName = val; return this; }

}
