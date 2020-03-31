
package org.elasticsearch.x_pack.license.get_license;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.x_pack.license.get_license.*;

public class License  {
  
  private Long _expiryDateInMillis;
  public Long getExpiryDateInMillis() { return this._expiryDateInMillis; }
  public License setExpiryDateInMillis(Long val) { this._expiryDateInMillis = val; return this; }


  private Long _issueDateInMillis;
  public Long getIssueDateInMillis() { return this._issueDateInMillis; }
  public License setIssueDateInMillis(Long val) { this._issueDateInMillis = val; return this; }


  private String _issuedTo;
  public String getIssuedTo() { return this._issuedTo; }
  public License setIssuedTo(String val) { this._issuedTo = val; return this; }


  private String _issuer;
  public String getIssuer() { return this._issuer; }
  public License setIssuer(String val) { this._issuer = val; return this; }


  private Long _maxNodes;
  public Long getMaxNodes() { return this._maxNodes; }
  public License setMaxNodes(Long val) { this._maxNodes = val; return this; }


  private String _signature;
  public String getSignature() { return this._signature; }
  public License setSignature(String val) { this._signature = val; return this; }


  private LicenseType _type;
  public LicenseType getType() { return this._type; }
  public License setType(LicenseType val) { this._type = val; return this; }


  private String _uid;
  public String getUid() { return this._uid; }
  public License setUid(String val) { this._uid = val; return this; }

}
