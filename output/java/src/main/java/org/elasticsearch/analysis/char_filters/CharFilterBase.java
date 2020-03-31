
package org.elasticsearch.analysis.char_filters;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class CharFilterBase  {
  
  private String _type;
  public String getType() { return this._type; }
  public CharFilterBase setType(String val) { this._type = val; return this; }


  private String _version;
  public String getVersion() { return this._version; }
  public CharFilterBase setVersion(String val) { this._version = val; return this; }

}
