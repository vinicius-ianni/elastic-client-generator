
package org.elasticsearch.x_pack.license.get_trial_license_status;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class GetTrialLicenseStatusResponse  {
  
  private Boolean _eligibleToStartTrial;
  public Boolean getEligibleToStartTrial() { return this._eligibleToStartTrial; }
  public GetTrialLicenseStatusResponse setEligibleToStartTrial(Boolean val) { this._eligibleToStartTrial = val; return this; }

}
