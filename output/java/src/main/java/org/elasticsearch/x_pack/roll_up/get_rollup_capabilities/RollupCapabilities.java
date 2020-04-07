
package org.elasticsearch.x_pack.roll_up.get_rollup_capabilities;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.x_pack.roll_up.get_rollup_capabilities.*;

public class RollupCapabilities  implements XContentable<RollupCapabilities> {
  
  static final ParseField ROLLUP_JOBS = new ParseField("rollup_jobs");
  private List<RollupCapabilitiesJob> _rollupJobs;
  public List<RollupCapabilitiesJob> getRollupJobs() { return this._rollupJobs; }
  public RollupCapabilities setRollupJobs(List<RollupCapabilitiesJob> val) { this._rollupJobs = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public RollupCapabilities fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return RollupCapabilities.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<RollupCapabilities, Void> PARSER =
    new ConstructingObjectParser<>(RollupCapabilities.class.getName(), false, args -> new RollupCapabilities());

  static {
    PARSER.declareObjectArray(RollupCapabilities::setRollupJobs, (p, t) -> RollupCapabilitiesJob.PARSER.apply(p), ROLLUP_JOBS);
  }

}
