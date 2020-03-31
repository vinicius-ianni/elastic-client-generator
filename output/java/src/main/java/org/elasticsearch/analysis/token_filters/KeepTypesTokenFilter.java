
package org.elasticsearch.analysis.token_filters;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.analysis.token_filters.*;

public class KeepTypesTokenFilter  {
  
  private KeepTypesMode _mode;
  public KeepTypesMode getMode() { return this._mode; }
  public KeepTypesTokenFilter setMode(KeepTypesMode val) { this._mode = val; return this; }


  private String[] _types;
  public String[] getTypes() { return this._types; }
  public KeepTypesTokenFilter setTypes(String[] val) { this._types = val; return this; }

}
