
package org.elasticsearch.x_pack.ssl.get_certificates;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.ssl.get_certificates.*;

public class GetCertificatesResponse  {
  
  private ClusterCertificateInformation[] _certificates;
  public ClusterCertificateInformation[] getCertificates() { return this._certificates; }
  public GetCertificatesResponse setCertificates(ClusterCertificateInformation[] val) { this._certificates = val; return this; }

}
