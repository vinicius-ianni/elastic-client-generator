
package org.elasticsearch.search.suggesters;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.internal.*;

public class Suggester  {
  
  private String _analyzer;
  public String getAnalyzer() { return this._analyzer; }
  public Suggester setAnalyzer(String val) { this._analyzer = val; return this; }


  private Field _field;
  public Field getField() { return this._field; }
  public Suggester setField(Field val) { this._field = val; return this; }


  private Integer _size;
  public Integer getSize() { return this._size; }
  public Suggester setSize(Integer val) { this._size = val; return this; }

}
