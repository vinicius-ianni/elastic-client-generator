
package org.elasticsearch.search.suggesters;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.search.suggesters.*;

public class SuggestDictionary<T>  {
  
  private Suggest<T>[] _item;
  public Suggest<T>[] getItem() { return this._item; }
  public SuggestDictionary<T> setItem(Suggest<T>[] val) { this._item = val; return this; }


  private String[] _keys;
  public String[] getKeys() { return this._keys; }
  public SuggestDictionary<T> setKeys(String[] val) { this._keys = val; return this; }


  private Suggest<T>[][] _values;
  public Suggest<T>[][] getValues() { return this._values; }
  public SuggestDictionary<T> setValues(Suggest<T>[][] val) { this._values = val; return this; }

}
