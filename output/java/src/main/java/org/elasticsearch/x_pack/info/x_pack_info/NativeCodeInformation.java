
package org.elasticsearch.x_pack.info.x_pack_info;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class NativeCodeInformation  {
  
  private String _buildHash;
  public String getBuildHash() { return this._buildHash; }
  public NativeCodeInformation setBuildHash(String val) { this._buildHash = val; return this; }


  private String _version;
  public String getVersion() { return this._version; }
  public NativeCodeInformation setVersion(String val) { this._version = val; return this; }

}
