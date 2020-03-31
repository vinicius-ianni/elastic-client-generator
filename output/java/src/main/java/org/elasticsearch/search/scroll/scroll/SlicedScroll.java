
package org.elasticsearch.search.scroll.scroll;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.internal.*;

public class SlicedScroll  {
  
  private Field _field;
  public Field getField() { return this._field; }
  public SlicedScroll setField(Field val) { this._field = val; return this; }


  private Integer _id;
  public Integer getId() { return this._id; }
  public SlicedScroll setId(Integer val) { this._id = val; return this; }


  private Integer _max;
  public Integer getMax() { return this._max; }
  public SlicedScroll setMax(Integer val) { this._max = val; return this; }

}
