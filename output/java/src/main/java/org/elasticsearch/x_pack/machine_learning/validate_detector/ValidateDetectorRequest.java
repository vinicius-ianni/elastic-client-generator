
package org.elasticsearch.x_pack.machine_learning.validate_detector;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.machine_learning.job.detectors.*;

public class ValidateDetectorRequest  {
  
  private Detector _detector;
  public Detector getDetector() { return this._detector; }
  public ValidateDetectorRequest setDetector(Detector val) { this._detector = val; return this; }

}
