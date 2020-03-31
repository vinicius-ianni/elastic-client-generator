
package org.elasticsearch.mapping.types.core;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class TextIndexPrefixes  {
  
  private Integer _maxChars;
  public Integer getMaxChars() { return this._maxChars; }
  public TextIndexPrefixes setMaxChars(Integer val) { this._maxChars = val; return this; }


  private Integer _minChars;
  public Integer getMinChars() { return this._minChars; }
  public TextIndexPrefixes setMinChars(Integer val) { this._minChars = val; return this; }

}
