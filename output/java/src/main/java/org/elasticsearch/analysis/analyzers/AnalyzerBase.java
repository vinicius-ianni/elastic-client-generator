
package org.elasticsearch.analysis.analyzers;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class AnalyzerBase  {
  
  private String _type;
  public String getType() { return this._type; }
  public AnalyzerBase setType(String val) { this._type = val; return this; }


  private String _version;
  public String getVersion() { return this._version; }
  public AnalyzerBase setVersion(String val) { this._version = val; return this; }

}
