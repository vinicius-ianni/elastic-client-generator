
package org.elasticsearch.x_pack.machine_learning.job.detectors;

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
import org.elasticsearch.x_pack.machine_learning.job.detectors.*;
import org.elasticsearch.internal.*;

public class RuleCondition  implements XContentable<RuleCondition> {
  
  static final ParseField APPLIES_TO = new ParseField("applies_to");
  private AppliesTo _appliesTo;
  public AppliesTo getAppliesTo() { return this._appliesTo; }
  public RuleCondition setAppliesTo(AppliesTo val) { this._appliesTo = val; return this; }


  static final ParseField OPERATOR = new ParseField("operator");
  private ConditionOperator _operator;
  public ConditionOperator getOperator() { return this._operator; }
  public RuleCondition setOperator(ConditionOperator val) { this._operator = val; return this; }


  static final ParseField VALUE = new ParseField("value");
  private Double _value;
  public Double getValue() { return this._value; }
  public RuleCondition setValue(Double val) { this._value = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    if (_appliesTo != null) {
      builder.field(APPLIES_TO.getPreferredName());
      _appliesTo.toXContent(builder, params);
    }
    if (_operator != null) {
      builder.field(OPERATOR.getPreferredName());
      _operator.toXContent(builder, params);
    }
    builder.field(VALUE.getPreferredName(), _value);
    return builder;
  }

  @Override
  public RuleCondition fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return RuleCondition.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<RuleCondition, Void> PARSER =
    new ConstructingObjectParser<>(RuleCondition.class.getName(), false, args -> new RuleCondition());

  static {
    PARSER.declareObject(RuleCondition::setAppliesTo, (p, t) -> AppliesTo.PARSER.apply(p), APPLIES_TO);
    PARSER.declareObject(RuleCondition::setOperator, (p, t) -> ConditionOperator.PARSER.apply(p), OPERATOR);
    PARSER.declareDouble(RuleCondition::setValue, VALUE);
  }

}
