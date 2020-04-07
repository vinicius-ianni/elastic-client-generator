
package org.elasticsearch.common_options.hit;

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

public class ClusterStatistics  implements XContentable<ClusterStatistics> {
  
  static final ParseField SKIPPED = new ParseField("skipped");
  private Integer _skipped;
  public Integer getSkipped() { return this._skipped; }
  public ClusterStatistics setSkipped(Integer val) { this._skipped = val; return this; }


  static final ParseField SUCCESSFUL = new ParseField("successful");
  private Integer _successful;
  public Integer getSuccessful() { return this._successful; }
  public ClusterStatistics setSuccessful(Integer val) { this._successful = val; return this; }


  static final ParseField TOTAL = new ParseField("total");
  private Integer _total;
  public Integer getTotal() { return this._total; }
  public ClusterStatistics setTotal(Integer val) { this._total = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ClusterStatistics fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ClusterStatistics.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ClusterStatistics, Void> PARSER =
    new ConstructingObjectParser<>(ClusterStatistics.class.getName(), false, args -> new ClusterStatistics());

  static {
    PARSER.declareInteger(ClusterStatistics::setSkipped, SKIPPED);
    PARSER.declareInteger(ClusterStatistics::setSuccessful, SUCCESSFUL);
    PARSER.declareInteger(ClusterStatistics::setTotal, TOTAL);
  }

}
