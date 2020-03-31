
package org.elasticsearch.analysis.char_filters;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class PatternReplaceCharFilter  {
  
  private String _flags;
  public String getFlags() { return this._flags; }
  public PatternReplaceCharFilter setFlags(String val) { this._flags = val; return this; }


  private String _pattern;
  public String getPattern() { return this._pattern; }
  public PatternReplaceCharFilter setPattern(String val) { this._pattern = val; return this; }


  private String _replacement;
  public String getReplacement() { return this._replacement; }
  public PatternReplaceCharFilter setReplacement(String val) { this._replacement = val; return this; }

}
