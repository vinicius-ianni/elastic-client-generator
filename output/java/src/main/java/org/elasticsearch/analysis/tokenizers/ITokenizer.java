
package org.elasticsearch.analysis.tokenizers;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class ITokenizer  {
  
  private String _type;
  public String getType() { return this._type; }
  public ITokenizer setType(String val) { this._type = val; return this; }


  private String _version;
  public String getVersion() { return this._version; }
  public ITokenizer setVersion(String val) { this._version = val; return this; }

}
