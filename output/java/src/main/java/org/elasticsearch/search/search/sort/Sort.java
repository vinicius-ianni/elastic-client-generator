
package org.elasticsearch.search.search.sort;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.search.search.sort.*;
import org.elasticsearch.common_abstractions.infer.field.*;

public class Sort  implements XContentable<Sort> {
  
  static final ParseField MISSING = new ParseField("missing");
  private Object _missing;
  public Object getMissing() { return this._missing; }
  public Sort setMissing(Object val) { this._missing = val; return this; }


  static final ParseField MODE = new ParseField("mode");
  private SortMode _mode;
  public SortMode getMode() { return this._mode; }
  public Sort setMode(SortMode val) { this._mode = val; return this; }


  static final ParseField NUMERIC_TYPE = new ParseField("numeric_type");
  private NumericType _numericType;
  public NumericType getNumericType() { return this._numericType; }
  public Sort setNumericType(NumericType val) { this._numericType = val; return this; }


  static final ParseField NESTED = new ParseField("nested");
  private NestedSort _nested;
  public NestedSort getNested() { return this._nested; }
  public Sort setNested(NestedSort val) { this._nested = val; return this; }


  static final ParseField ORDER = new ParseField("order");
  private SortOrder _order;
  public SortOrder getOrder() { return this._order; }
  public Sort setOrder(SortOrder val) { this._order = val; return this; }


  static final ParseField SORT_KEY = new ParseField("sort_key");
  private Field _sortKey;
  public Field getSortKey() { return this._sortKey; }
  public Sort setSortKey(Field val) { this._sortKey = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public Sort fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return Sort.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<Sort, Void> PARSER =
    new ConstructingObjectParser<>(Sort.class.getName(), false, args -> new Sort());

  static {
    PARSER.declareObject(Sort::setMissing, (p, t) -> Object.PARSER.apply(p, null), MISSING);
    PARSER.declareObject(Sort::setMode, (p, t) -> SortMode.PARSER.apply(p, null), MODE);
    PARSER.declareObject(Sort::setNumericType, (p, t) -> NumericType.PARSER.apply(p, null), NUMERIC_TYPE);
    PARSER.declareObject(Sort::setNested, (p, t) -> NestedSort.PARSER.apply(p, null), NESTED);
    PARSER.declareObject(Sort::setOrder, (p, t) -> SortOrder.PARSER.apply(p, null), ORDER);
    PARSER.declareField(Sort::setSortKey, (p, t) -> Field.createFrom(p), SORT_KEY);
  }

}
