
package org.elasticsearch.x_pack.info.x_pack_info;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.info.x_pack_info.*;

public class XPackInfoResponse  {
  
  private XPackBuildInformation _build;
  public XPackBuildInformation getBuild() { return this._build; }
  public XPackInfoResponse setBuild(XPackBuildInformation val) { this._build = val; return this; }


  private XPackFeatures _features;
  public XPackFeatures getFeatures() { return this._features; }
  public XPackInfoResponse setFeatures(XPackFeatures val) { this._features = val; return this; }


  private MinimalLicenseInformation _license;
  public MinimalLicenseInformation getLicense() { return this._license; }
  public XPackInfoResponse setLicense(MinimalLicenseInformation val) { this._license = val; return this; }


  private String _tagline;
  public String getTagline() { return this._tagline; }
  public XPackInfoResponse setTagline(String val) { this._tagline = val; return this; }

}
