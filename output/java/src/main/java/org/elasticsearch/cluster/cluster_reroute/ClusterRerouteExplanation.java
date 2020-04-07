
package org.elasticsearch.cluster.cluster_reroute;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.cluster.cluster_reroute.*;

public class ClusterRerouteExplanation  implements XContentable<ClusterRerouteExplanation> {
  
  static final ParseField COMMAND = new ParseField("command");
  private String _command;
  public String getCommand() { return this._command; }
  public ClusterRerouteExplanation setCommand(String val) { this._command = val; return this; }


  static final ParseField DECISIONS = new ParseField("decisions");
  private List<ClusterRerouteDecision> _decisions;
  public List<ClusterRerouteDecision> getDecisions() { return this._decisions; }
  public ClusterRerouteExplanation setDecisions(List<ClusterRerouteDecision> val) { this._decisions = val; return this; }


  static final ParseField PARAMETERS = new ParseField("parameters");
  private ClusterRerouteParameters _parameters;
  public ClusterRerouteParameters getParameters() { return this._parameters; }
  public ClusterRerouteExplanation setParameters(ClusterRerouteParameters val) { this._parameters = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ClusterRerouteExplanation fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ClusterRerouteExplanation.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ClusterRerouteExplanation, Void> PARSER =
    new ConstructingObjectParser<>(ClusterRerouteExplanation.class.getName(), false, args -> new ClusterRerouteExplanation());

  static {
    PARSER.declareString(ClusterRerouteExplanation::setCommand, COMMAND);
    PARSER.declareObjectArray(ClusterRerouteExplanation::setDecisions, (p, t) -> ClusterRerouteDecision.PARSER.apply(p), DECISIONS);
    PARSER.declareObject(ClusterRerouteExplanation::setParameters, (p, t) -> ClusterRerouteParameters.PARSER.apply(p, null), PARAMETERS);
  }

}
