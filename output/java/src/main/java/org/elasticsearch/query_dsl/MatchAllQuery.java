
package org.elasticsearch.query_dsl;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class MatchAllQuery  {
  
  private String _normField;
  public String getNormField() { return this._normField; }
  public MatchAllQuery setNormField(String val) { this._normField = val; return this; }

}
