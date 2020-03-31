
package org.elasticsearch.x_pack.license.get_license;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.x_pack.license.get_license.*;

public class LicenseInformation  {
  
  private Date _expiryDate;
  public Date getExpiryDate() { return this._expiryDate; }
  public LicenseInformation setExpiryDate(Date val) { this._expiryDate = val; return this; }


  private Long _expiryDateInMillis;
  public Long getExpiryDateInMillis() { return this._expiryDateInMillis; }
  public LicenseInformation setExpiryDateInMillis(Long val) { this._expiryDateInMillis = val; return this; }


  private Date _issueDate;
  public Date getIssueDate() { return this._issueDate; }
  public LicenseInformation setIssueDate(Date val) { this._issueDate = val; return this; }


  private Long _issueDateInMillis;
  public Long getIssueDateInMillis() { return this._issueDateInMillis; }
  public LicenseInformation setIssueDateInMillis(Long val) { this._issueDateInMillis = val; return this; }


  private String _issuedTo;
  public String getIssuedTo() { return this._issuedTo; }
  public LicenseInformation setIssuedTo(String val) { this._issuedTo = val; return this; }


  private String _issuer;
  public String getIssuer() { return this._issuer; }
  public LicenseInformation setIssuer(String val) { this._issuer = val; return this; }


  private Long _maxNodes;
  public Long getMaxNodes() { return this._maxNodes; }
  public LicenseInformation setMaxNodes(Long val) { this._maxNodes = val; return this; }


  private LicenseStatus _status;
  public LicenseStatus getStatus() { return this._status; }
  public LicenseInformation setStatus(LicenseStatus val) { this._status = val; return this; }


  private LicenseType _type;
  public LicenseType getType() { return this._type; }
  public LicenseInformation setType(LicenseType val) { this._type = val; return this; }


  private String _uid;
  public String getUid() { return this._uid; }
  public LicenseInformation setUid(String val) { this._uid = val; return this; }

}
