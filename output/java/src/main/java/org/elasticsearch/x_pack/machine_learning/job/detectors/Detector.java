
package org.elasticsearch.x_pack.machine_learning.job.detectors;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.machine_learning.job.detectors.*;
import org.elasticsearch.internal.*;
import org.elasticsearch.x_pack.machine_learning.put_job.*;

public class Detector  {
  
  private DetectionRule[] _customRules;
  public DetectionRule[] getCustomRules() { return this._customRules; }
  public Detector setCustomRules(DetectionRule[] val) { this._customRules = val; return this; }


  private String _detectorDescription;
  public String getDetectorDescription() { return this._detectorDescription; }
  public Detector setDetectorDescription(String val) { this._detectorDescription = val; return this; }


  private Integer _detectorIndex;
  public Integer getDetectorIndex() { return this._detectorIndex; }
  public Detector setDetectorIndex(Integer val) { this._detectorIndex = val; return this; }


  private ExcludeFrequent _excludeFrequent;
  public ExcludeFrequent getExcludeFrequent() { return this._excludeFrequent; }
  public Detector setExcludeFrequent(ExcludeFrequent val) { this._excludeFrequent = val; return this; }


  private String _function;
  public String getFunction() { return this._function; }
  public Detector setFunction(String val) { this._function = val; return this; }


  private Boolean _useNull;
  public Boolean getUseNull() { return this._useNull; }
  public Detector setUseNull(Boolean val) { this._useNull = val; return this; }

}
