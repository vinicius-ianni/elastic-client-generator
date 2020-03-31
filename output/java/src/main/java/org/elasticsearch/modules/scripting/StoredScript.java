
package org.elasticsearch.modules.scripting;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class StoredScript  {
  
  private String _lang;
  public String getLang() { return this._lang; }
  public StoredScript setLang(String val) { this._lang = val; return this; }


  private String _source;
  public String getSource() { return this._source; }
  public StoredScript setSource(String val) { this._source = val; return this; }

}
