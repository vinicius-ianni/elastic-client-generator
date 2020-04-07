
package org.elasticsearch.x_pack.info.x_pack_usage;

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

public class JobStatistics  implements XContentable<JobStatistics> {
  
  static final ParseField AVG = new ParseField("avg");
  private Double _avg;
  public Double getAvg() { return this._avg; }
  public JobStatistics setAvg(Double val) { this._avg = val; return this; }


  static final ParseField MAX = new ParseField("max");
  private Double _max;
  public Double getMax() { return this._max; }
  public JobStatistics setMax(Double val) { this._max = val; return this; }


  static final ParseField MIN = new ParseField("min");
  private Double _min;
  public Double getMin() { return this._min; }
  public JobStatistics setMin(Double val) { this._min = val; return this; }


  static final ParseField TOTAL = new ParseField("total");
  private Double _total;
  public Double getTotal() { return this._total; }
  public JobStatistics setTotal(Double val) { this._total = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public JobStatistics fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return JobStatistics.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<JobStatistics, Void> PARSER =
    new ConstructingObjectParser<>(JobStatistics.class.getName(), false, args -> new JobStatistics());

  static {
    PARSER.declareDouble(JobStatistics::setAvg, AVG);
    PARSER.declareDouble(JobStatistics::setMax, MAX);
    PARSER.declareDouble(JobStatistics::setMin, MIN);
    PARSER.declareDouble(JobStatistics::setTotal, TOTAL);
  }

}
