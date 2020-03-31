
package org.elasticsearch.query_dsl.term_level.regexp;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class RegexpQuery  {
  
  private String _flags;
  public String getFlags() { return this._flags; }
  public RegexpQuery setFlags(String val) { this._flags = val; return this; }


  private Integer _maxDeterminizedStates;
  public Integer getMaxDeterminizedStates() { return this._maxDeterminizedStates; }
  public RegexpQuery setMaxDeterminizedStates(Integer val) { this._maxDeterminizedStates = val; return this; }


  private String _value;
  public String getValue() { return this._value; }
  public RegexpQuery setValue(String val) { this._value = val; return this; }

}
