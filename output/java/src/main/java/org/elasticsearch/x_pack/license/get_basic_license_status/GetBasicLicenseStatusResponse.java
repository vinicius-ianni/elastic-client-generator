
package org.elasticsearch.x_pack.license.get_basic_license_status;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class GetBasicLicenseStatusResponse  {
  
  private Boolean _eligibleToStartBasic;
  public Boolean getEligibleToStartBasic() { return this._eligibleToStartBasic; }
  public GetBasicLicenseStatusResponse setEligibleToStartBasic(Boolean val) { this._eligibleToStartBasic = val; return this; }

}
