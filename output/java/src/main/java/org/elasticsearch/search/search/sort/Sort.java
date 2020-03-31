
package org.elasticsearch.search.search.sort;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.search.search.sort.*;
import org.elasticsearch.common_abstractions.infer.field.*;

public class Sort  {
  
  private Object _missing;
  public Object getMissing() { return this._missing; }
  public Sort setMissing(Object val) { this._missing = val; return this; }


  private SortMode _mode;
  public SortMode getMode() { return this._mode; }
  public Sort setMode(SortMode val) { this._mode = val; return this; }


  private NumericType _numericType;
  public NumericType getNumericType() { return this._numericType; }
  public Sort setNumericType(NumericType val) { this._numericType = val; return this; }


  private NestedSort _nested;
  public NestedSort getNested() { return this._nested; }
  public Sort setNested(NestedSort val) { this._nested = val; return this; }


  private SortOrder _order;
  public SortOrder getOrder() { return this._order; }
  public Sort setOrder(SortOrder val) { this._order = val; return this; }


  private Field _sortKey;
  public Field getSortKey() { return this._sortKey; }
  public Sort setSortKey(Field val) { this._sortKey = val; return this; }

}
