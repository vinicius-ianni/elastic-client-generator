
package org.elasticsearch.x_pack.ssl.get_certificates;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class ClusterCertificateInformation  {
  
  private String _path;
  public String getPath() { return this._path; }
  public ClusterCertificateInformation setPath(String val) { this._path = val; return this; }


  private String _alias;
  public String getAlias() { return this._alias; }
  public ClusterCertificateInformation setAlias(String val) { this._alias = val; return this; }


  private String _format;
  public String getFormat() { return this._format; }
  public ClusterCertificateInformation setFormat(String val) { this._format = val; return this; }


  private String _subjectDn;
  public String getSubjectDn() { return this._subjectDn; }
  public ClusterCertificateInformation setSubjectDn(String val) { this._subjectDn = val; return this; }


  private String _serialNumber;
  public String getSerialNumber() { return this._serialNumber; }
  public ClusterCertificateInformation setSerialNumber(String val) { this._serialNumber = val; return this; }


  private Boolean _hasPrivateKey;
  public Boolean getHasPrivateKey() { return this._hasPrivateKey; }
  public ClusterCertificateInformation setHasPrivateKey(Boolean val) { this._hasPrivateKey = val; return this; }


  private Date _expiry;
  public Date getExpiry() { return this._expiry; }
  public ClusterCertificateInformation setExpiry(Date val) { this._expiry = val; return this; }

}
