
package org.elasticsearch.x_pack.watcher.condition;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;
import org.elasticsearch.x_pack.watcher.condition.*;

public class ArrayCompareCondition  implements XContentable<ArrayCompareCondition> {
  
  static final ParseField ARRAY_PATH = new ParseField("array_path");
  private String _arrayPath;
  public String getArrayPath() { return this._arrayPath; }
  public ArrayCompareCondition setArrayPath(String val) { this._arrayPath = val; return this; }


  static final ParseField COMPARISON = new ParseField("comparison");
  private String _comparison;
  public String getComparison() { return this._comparison; }
  public ArrayCompareCondition setComparison(String val) { this._comparison = val; return this; }


  static final ParseField PATH = new ParseField("path");
  private String _path;
  public String getPath() { return this._path; }
  public ArrayCompareCondition setPath(String val) { this._path = val; return this; }


  static final ParseField QUANTIFIER = new ParseField("quantifier");
  private Quantifier _quantifier;
  public Quantifier getQuantifier() { return this._quantifier; }
  public ArrayCompareCondition setQuantifier(Quantifier val) { this._quantifier = val; return this; }


  static final ParseField VALUE = new ParseField("value");
  private Object _value;
  public Object getValue() { return this._value; }
  public ArrayCompareCondition setValue(Object val) { this._value = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    builder.startObject();
    builder.field(ARRAY_PATH.getPreferredName(), _arrayPath);
    builder.field(COMPARISON.getPreferredName(), _comparison);
    builder.field(PATH.getPreferredName(), _path);
    if (_quantifier != null) {
      builder.field(QUANTIFIER.getPreferredName());
      _quantifier.toXContent(builder, params);
    }
    builder.field(VALUE.getPreferredName(), _value);
    builder.endObject();
    return builder;
  }

  @Override
  public ArrayCompareCondition fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ArrayCompareCondition.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ArrayCompareCondition, Void> PARSER =
    new ConstructingObjectParser<>(ArrayCompareCondition.class.getName(), false, args -> new ArrayCompareCondition());

  static {
    PARSER.declareString(ArrayCompareCondition::setArrayPath, ARRAY_PATH);
    PARSER.declareString(ArrayCompareCondition::setComparison, COMPARISON);
    PARSER.declareString(ArrayCompareCondition::setPath, PATH);
    PARSER.declareObject(ArrayCompareCondition::setQuantifier, (p, t) -> Quantifier.PARSER.apply(p), QUANTIFIER);
    PARSER.declareObject(ArrayCompareCondition::setValue, (p, t) -> p.objectText(), VALUE);
  }

}
