
package org.elasticsearch.x_pack.info.x_pack_info;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.info.x_pack_info.*;

public class XPackFeature  {
  
  private Boolean _available;
  public Boolean getAvailable() { return this._available; }
  public XPackFeature setAvailable(Boolean val) { this._available = val; return this; }


  private String _description;
  public String getDescription() { return this._description; }
  public XPackFeature setDescription(String val) { this._description = val; return this; }


  private Boolean _enabled;
  public Boolean getEnabled() { return this._enabled; }
  public XPackFeature setEnabled(Boolean val) { this._enabled = val; return this; }


  private NativeCodeInformation _nativeCodeInfo;
  public NativeCodeInformation getNativeCodeInfo() { return this._nativeCodeInfo; }
  public XPackFeature setNativeCodeInfo(NativeCodeInformation val) { this._nativeCodeInfo = val; return this; }

}
