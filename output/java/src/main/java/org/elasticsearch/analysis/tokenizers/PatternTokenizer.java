
package org.elasticsearch.analysis.tokenizers;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class PatternTokenizer  {
  
  private String _flags;
  public String getFlags() { return this._flags; }
  public PatternTokenizer setFlags(String val) { this._flags = val; return this; }


  private Integer _group;
  public Integer getGroup() { return this._group; }
  public PatternTokenizer setGroup(Integer val) { this._group = val; return this; }


  private String _pattern;
  public String getPattern() { return this._pattern; }
  public PatternTokenizer setPattern(String val) { this._pattern = val; return this; }

}
