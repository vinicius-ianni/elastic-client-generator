
package org.elasticsearch.x_pack.license.post_license;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.license.post_license.*;
import org.elasticsearch.x_pack.license.get_license.*;

public class PostLicenseResponse  {
  
  private LicenseAcknowledgement _acknowledge;
  public LicenseAcknowledgement getAcknowledge() { return this._acknowledge; }
  public PostLicenseResponse setAcknowledge(LicenseAcknowledgement val) { this._acknowledge = val; return this; }


  private Boolean _acknowledged;
  public Boolean getAcknowledged() { return this._acknowledged; }
  public PostLicenseResponse setAcknowledged(Boolean val) { this._acknowledged = val; return this; }


  private LicenseStatus _licenseStatus;
  public LicenseStatus getLicenseStatus() { return this._licenseStatus; }
  public PostLicenseResponse setLicenseStatus(LicenseStatus val) { this._licenseStatus = val; return this; }

}
