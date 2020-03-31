
package org.elasticsearch.analysis.char_filters;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class MappingCharFilter  {
  
  private String[] _mappings;
  public String[] getMappings() { return this._mappings; }
  public MappingCharFilter setMappings(String[] val) { this._mappings = val; return this; }


  private String _mappingsPath;
  public String getMappingsPath() { return this._mappingsPath; }
  public MappingCharFilter setMappingsPath(String val) { this._mappingsPath = val; return this; }

}
