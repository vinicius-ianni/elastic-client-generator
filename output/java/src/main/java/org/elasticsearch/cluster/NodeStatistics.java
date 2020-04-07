
package org.elasticsearch.cluster;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.internal.*;
import org.elasticsearch.common.*;

public class NodeStatistics  implements XContentable<NodeStatistics> {
  
  static final ParseField FAILED = new ParseField("failed");
  private Integer _failed;
  public Integer getFailed() { return this._failed; }
  public NodeStatistics setFailed(Integer val) { this._failed = val; return this; }


  static final ParseField SUCCESSFUL = new ParseField("successful");
  private Integer _successful;
  public Integer getSuccessful() { return this._successful; }
  public NodeStatistics setSuccessful(Integer val) { this._successful = val; return this; }


  static final ParseField TOTAL = new ParseField("total");
  private Integer _total;
  public Integer getTotal() { return this._total; }
  public NodeStatistics setTotal(Integer val) { this._total = val; return this; }


  static final ParseField FAILURES = new ParseField("failures");
  private List<ErrorCause> _failures;
  public List<ErrorCause> getFailures() { return this._failures; }
  public NodeStatistics setFailures(List<ErrorCause> val) { this._failures = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public NodeStatistics fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return NodeStatistics.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<NodeStatistics, Void> PARSER =
    new ConstructingObjectParser<>(NodeStatistics.class.getName(), false, args -> new NodeStatistics());

  static {
    PARSER.declareInteger(NodeStatistics::setFailed, FAILED);
    PARSER.declareInteger(NodeStatistics::setSuccessful, SUCCESSFUL);
    PARSER.declareInteger(NodeStatistics::setTotal, TOTAL);
    PARSER.declareObjectArray(NodeStatistics::setFailures, (p, t) -> ErrorCause.PARSER.apply(p), FAILURES);
  }

}
