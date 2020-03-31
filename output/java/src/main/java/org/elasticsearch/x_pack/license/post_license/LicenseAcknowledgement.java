
package org.elasticsearch.x_pack.license.post_license;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class LicenseAcknowledgement  {
  
  private String[] _license;
  public String[] getLicense() { return this._license; }
  public LicenseAcknowledgement setLicense(String[] val) { this._license = val; return this; }


  private String _message;
  public String getMessage() { return this._message; }
  public LicenseAcknowledgement setMessage(String val) { this._message = val; return this; }

}
