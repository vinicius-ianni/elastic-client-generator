
package org.elasticsearch.cluster.nodes_stats;

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

public class LoadAverageStats  implements XContentable<LoadAverageStats> {
  
  static final ParseField 15M = new ParseField("15m");
  private Float _15m;
  public Float get15m() { return this._15m; }
  public LoadAverageStats set15m(Float val) { this._15m = val; return this; }


  static final ParseField 5M = new ParseField("5m");
  private Float _5m;
  public Float get5m() { return this._5m; }
  public LoadAverageStats set5m(Float val) { this._5m = val; return this; }


  static final ParseField 1M = new ParseField("1m");
  private Float _1m;
  public Float get1m() { return this._1m; }
  public LoadAverageStats set1m(Float val) { this._1m = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public LoadAverageStats fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return LoadAverageStats.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<LoadAverageStats, Void> PARSER =
    new ConstructingObjectParser<>(LoadAverageStats.class.getName(), false, args -> new LoadAverageStats());

  static {
    PARSER.declareFloat(LoadAverageStats::set15m, 15M);
    PARSER.declareFloat(LoadAverageStats::set5m, 5M);
    PARSER.declareFloat(LoadAverageStats::set1m, 1M);
  }

}
