
package org.elasticsearch.x_pack.graph.explore.request;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.internal.*;

public class SampleDiversity  {
  
  private Field _field;
  public Field getField() { return this._field; }
  public SampleDiversity setField(Field val) { this._field = val; return this; }


  private Integer _maxDocsPerValue;
  public Integer getMaxDocsPerValue() { return this._maxDocsPerValue; }
  public SampleDiversity setMaxDocsPerValue(Integer val) { this._maxDocsPerValue = val; return this; }

}
