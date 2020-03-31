
package org.elasticsearch.x_pack.watcher.condition;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class CompareCondition  {
  
  private String _comparison;
  public String getComparison() { return this._comparison; }
  public CompareCondition setComparison(String val) { this._comparison = val; return this; }


  private String _path;
  public String getPath() { return this._path; }
  public CompareCondition setPath(String val) { this._path = val; return this; }


  private Object _value;
  public Object getValue() { return this._value; }
  public CompareCondition setValue(Object val) { this._value = val; return this; }

}
