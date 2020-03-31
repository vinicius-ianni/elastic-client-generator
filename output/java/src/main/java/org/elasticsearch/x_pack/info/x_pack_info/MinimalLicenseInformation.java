
package org.elasticsearch.x_pack.info.x_pack_info;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.x_pack.license.get_license.*;

public class MinimalLicenseInformation  {
  
  private Long _expiryDateInMillis;
  public Long getExpiryDateInMillis() { return this._expiryDateInMillis; }
  public MinimalLicenseInformation setExpiryDateInMillis(Long val) { this._expiryDateInMillis = val; return this; }


  private LicenseType _mode;
  public LicenseType getMode() { return this._mode; }
  public MinimalLicenseInformation setMode(LicenseType val) { this._mode = val; return this; }


  private LicenseStatus _status;
  public LicenseStatus getStatus() { return this._status; }
  public MinimalLicenseInformation setStatus(LicenseStatus val) { this._status = val; return this; }


  private LicenseType _type;
  public LicenseType getType() { return this._type; }
  public MinimalLicenseInformation setType(LicenseType val) { this._type = val; return this; }


  private String _uid;
  public String getUid() { return this._uid; }
  public MinimalLicenseInformation setUid(String val) { this._uid = val; return this; }

}
