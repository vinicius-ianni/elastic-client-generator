
package org.elasticsearch.query_dsl.term_level.term;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class TermQuery  {
  
  private Object _value;
  public Object getValue() { return this._value; }
  public TermQuery setValue(Object val) { this._value = val; return this; }

}
