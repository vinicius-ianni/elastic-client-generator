
package org.elasticsearch.x_pack.license.start_trial_license;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class StartTrialLicenseRequest  {
  
  private Boolean _acknowledge;
  public Boolean getAcknowledge() { return this._acknowledge; }
  public StartTrialLicenseRequest setAcknowledge(Boolean val) { this._acknowledge = val; return this; }


  private String _typeQueryString;
  public String getTypeQueryString() { return this._typeQueryString; }
  public StartTrialLicenseRequest setTypeQueryString(String val) { this._typeQueryString = val; return this; }

}
