
package org.elasticsearch.x_pack.license.start_trial_license;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class StartTrialLicenseResponse  {
  
  private String _errorMessage;
  public String getErrorMessage() { return this._errorMessage; }
  public StartTrialLicenseResponse setErrorMessage(String val) { this._errorMessage = val; return this; }


  private Boolean _trialWasStarted;
  public Boolean getTrialWasStarted() { return this._trialWasStarted; }
  public StartTrialLicenseResponse setTrialWasStarted(Boolean val) { this._trialWasStarted = val; return this; }

}
