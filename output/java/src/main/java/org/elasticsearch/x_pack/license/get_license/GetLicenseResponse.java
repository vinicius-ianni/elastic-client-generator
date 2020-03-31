
package org.elasticsearch.x_pack.license.get_license;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.license.get_license.*;

public class GetLicenseResponse  {
  
  private Boolean _isValid;
  public Boolean getIsValid() { return this._isValid; }
  public GetLicenseResponse setIsValid(Boolean val) { this._isValid = val; return this; }


  private LicenseInformation _license;
  public LicenseInformation getLicense() { return this._license; }
  public GetLicenseResponse setLicense(LicenseInformation val) { this._license = val; return this; }

}
