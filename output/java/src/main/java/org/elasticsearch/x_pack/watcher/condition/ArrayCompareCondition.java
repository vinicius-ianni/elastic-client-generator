
package org.elasticsearch.x_pack.watcher.condition;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.watcher.condition.*;

public class ArrayCompareCondition  {
  
  private String _arrayPath;
  public String getArrayPath() { return this._arrayPath; }
  public ArrayCompareCondition setArrayPath(String val) { this._arrayPath = val; return this; }


  private String _comparison;
  public String getComparison() { return this._comparison; }
  public ArrayCompareCondition setComparison(String val) { this._comparison = val; return this; }


  private String _path;
  public String getPath() { return this._path; }
  public ArrayCompareCondition setPath(String val) { this._path = val; return this; }


  private Quantifier _quantifier;
  public Quantifier getQuantifier() { return this._quantifier; }
  public ArrayCompareCondition setQuantifier(Quantifier val) { this._quantifier = val; return this; }


  private Object _value;
  public Object getValue() { return this._value; }
  public ArrayCompareCondition setValue(Object val) { this._value = val; return this; }

}
