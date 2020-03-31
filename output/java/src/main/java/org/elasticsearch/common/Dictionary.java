
package org.elasticsearch.common;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class Dictionary<TKey, TValue>  {
  
  private TKey _key;
  public TKey getKey() { return this._key; }
  public Dictionary<TKey, TValue> setKey(TKey val) { this._key = val; return this; }


  private TValue _value;
  public TValue getValue() { return this._value; }
  public Dictionary<TKey, TValue> setValue(TValue val) { this._value = val; return this; }

}
