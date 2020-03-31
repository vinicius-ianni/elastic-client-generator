
package org.elasticsearch.x_pack.migration.deprecation_info;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.migration.deprecation_info.*;

public class DeprecationInfo  {
  
  private String _details;
  public String getDetails() { return this._details; }
  public DeprecationInfo setDetails(String val) { this._details = val; return this; }


  private DeprecationWarningLevel _level;
  public DeprecationWarningLevel getLevel() { return this._level; }
  public DeprecationInfo setLevel(DeprecationWarningLevel val) { this._level = val; return this; }


  private String _message;
  public String getMessage() { return this._message; }
  public DeprecationInfo setMessage(String val) { this._message = val; return this; }


  private String _url;
  public String getUrl() { return this._url; }
  public DeprecationInfo setUrl(String val) { this._url = val; return this; }

}
