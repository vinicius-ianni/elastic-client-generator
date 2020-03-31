
package org.elasticsearch.search.suggesters.phrase_suggester;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.internal.*;
import org.elasticsearch.common.*;

public class DirectGenerator  {
  
  private Field _field;
  public Field getField() { return this._field; }
  public DirectGenerator setField(Field val) { this._field = val; return this; }


  private Integer _maxEdits;
  public Integer getMaxEdits() { return this._maxEdits; }
  public DirectGenerator setMaxEdits(Integer val) { this._maxEdits = val; return this; }


  private Float _maxInspections;
  public Float getMaxInspections() { return this._maxInspections; }
  public DirectGenerator setMaxInspections(Float val) { this._maxInspections = val; return this; }


  private Float _maxTermFreq;
  public Float getMaxTermFreq() { return this._maxTermFreq; }
  public DirectGenerator setMaxTermFreq(Float val) { this._maxTermFreq = val; return this; }


  private Float _minDocFreq;
  public Float getMinDocFreq() { return this._minDocFreq; }
  public DirectGenerator setMinDocFreq(Float val) { this._minDocFreq = val; return this; }


  private Integer _minWordLength;
  public Integer getMinWordLength() { return this._minWordLength; }
  public DirectGenerator setMinWordLength(Integer val) { this._minWordLength = val; return this; }


  private String _postFilter;
  public String getPostFilter() { return this._postFilter; }
  public DirectGenerator setPostFilter(String val) { this._postFilter = val; return this; }


  private String _preFilter;
  public String getPreFilter() { return this._preFilter; }
  public DirectGenerator setPreFilter(String val) { this._preFilter = val; return this; }


  private Integer _prefixLength;
  public Integer getPrefixLength() { return this._prefixLength; }
  public DirectGenerator setPrefixLength(Integer val) { this._prefixLength = val; return this; }


  private Integer _size;
  public Integer getSize() { return this._size; }
  public DirectGenerator setSize(Integer val) { this._size = val; return this; }


  private SuggestMode _suggestMode;
  public SuggestMode getSuggestMode() { return this._suggestMode; }
  public DirectGenerator setSuggestMode(SuggestMode val) { this._suggestMode = val; return this; }

}
