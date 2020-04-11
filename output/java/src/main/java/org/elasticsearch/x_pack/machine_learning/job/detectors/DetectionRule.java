
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
import org.elasticsearch.common_abstractions.infer.field.*;

public class DetectionRule  implements XContentable<DetectionRule> {
  
  static final ParseField ACTIONS = new ParseField("actions");
  private List<RuleAction> _actions;
  public List<RuleAction> getActions() { return this._actions; }
  public DetectionRule setActions(List<RuleAction> val) { this._actions = val; return this; }


  static final ParseField CONDITIONS = new ParseField("conditions");
  private List<RuleCondition> _conditions;
  public List<RuleCondition> getConditions() { return this._conditions; }
  public DetectionRule setConditions(List<RuleCondition> val) { this._conditions = val; return this; }


  static final ParseField SCOPE = new ParseField("scope");
  private NamedContainer<Field, FilterRef> _scope;
  public NamedContainer<Field, FilterRef> getScope() { return this._scope; }
  public DetectionRule setScope(NamedContainer<Field, FilterRef> val) { this._scope = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public DetectionRule fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return DetectionRule.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<DetectionRule, Void> PARSER =
    new ConstructingObjectParser<>(DetectionRule.class.getName(), false, args -> new DetectionRule());

  static {
    PARSER.declareObjectArray(DetectionRule::setActions, (p, t) -> RuleAction.PARSER.apply(p), ACTIONS);
    PARSER.declareObjectArray(DetectionRule::setConditions, (p, t) -> RuleCondition.PARSER.apply(p, t), CONDITIONS);
    PARSER.declareObject(DetectionRule::setScope, (p, t) -> new NamedContainer<>(n -> () -> new Field(n),pp -> FilterRef.PARSER.apply(pp, null)), SCOPE);
  }

}
