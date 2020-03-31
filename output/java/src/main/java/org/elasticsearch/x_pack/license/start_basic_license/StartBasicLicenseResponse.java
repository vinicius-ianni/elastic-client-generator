
package org.elasticsearch.x_pack.license.start_basic_license;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class StartBasicLicenseResponse  {
  
  private Map<String, String[]> _acknowledge;
  public Map<String, String[]> getAcknowledge() { return this._acknowledge; }
  public StartBasicLicenseResponse setAcknowledge(Map<String, String[]> val) { this._acknowledge = val; return this; }


  private Boolean _basicWasStarted;
  public Boolean getBasicWasStarted() { return this._basicWasStarted; }
  public StartBasicLicenseResponse setBasicWasStarted(Boolean val) { this._basicWasStarted = val; return this; }


  private String _errorMessage;
  public String getErrorMessage() { return this._errorMessage; }
  public StartBasicLicenseResponse setErrorMessage(String val) { this._errorMessage = val; return this; }

}
