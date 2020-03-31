
package org.elasticsearch.search.suggesters;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class Suggest<T>  {
  
  private Integer _length;
  public Integer getLength() { return this._length; }
  public Suggest<T> setLength(Integer val) { this._length = val; return this; }


  private Integer _offset;
  public Integer getOffset() { return this._offset; }
  public Suggest<T> setOffset(Integer val) { this._offset = val; return this; }


  private SuggestOption<T>[] _options;
  public SuggestOption<T>[] getOptions() { return this._options; }
  public Suggest<T> setOptions(SuggestOption<T>[] val) { this._options = val; return this; }


  private String _text;
  public String getText() { return this._text; }
  public Suggest<T> setText(String val) { this._text = val; return this; }

}
