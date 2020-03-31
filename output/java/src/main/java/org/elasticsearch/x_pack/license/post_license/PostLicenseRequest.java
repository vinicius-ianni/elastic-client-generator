
package org.elasticsearch.x_pack.license.post_license;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.license.get_license.*;

public class PostLicenseRequest  {
  
  private Boolean _acknowledge;
  public Boolean getAcknowledge() { return this._acknowledge; }
  public PostLicenseRequest setAcknowledge(Boolean val) { this._acknowledge = val; return this; }


  private License _license;
  public License getLicense() { return this._license; }
  public PostLicenseRequest setLicense(License val) { this._license = val; return this; }

}
