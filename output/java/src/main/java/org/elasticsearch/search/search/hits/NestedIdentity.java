
package org.elasticsearch.search.search.hits;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.search.search.hits.*;
import org.elasticsearch.internal.*;

public class NestedIdentity  {
  
  private Field _field;
  public Field getField() { return this._field; }
  public NestedIdentity setField(Field val) { this._field = val; return this; }


  private NestedIdentity _nested;
  public NestedIdentity getNested() { return this._nested; }
  public NestedIdentity setNested(NestedIdentity val) { this._nested = val; return this; }


  private Integer _offset;
  public Integer getOffset() { return this._offset; }
  public NestedIdentity setOffset(Integer val) { this._offset = val; return this; }

}
