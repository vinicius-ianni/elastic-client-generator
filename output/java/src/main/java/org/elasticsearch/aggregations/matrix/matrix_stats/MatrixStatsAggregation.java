
package org.elasticsearch.aggregations.matrix.matrix_stats;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.aggregations.matrix.matrix_stats.*;

public class MatrixStatsAggregation  implements XContentable<MatrixStatsAggregation> {
  
  static final ParseField MODE = new ParseField("mode");
  private MatrixStatsMode _mode;
  public MatrixStatsMode getMode() { return this._mode; }
  public MatrixStatsAggregation setMode(MatrixStatsMode val) { this._mode = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public MatrixStatsAggregation fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return MatrixStatsAggregation.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<MatrixStatsAggregation, Void> PARSER =
    new ConstructingObjectParser<>(MatrixStatsAggregation.class.getName(), false, args -> new MatrixStatsAggregation());

  static {
    PARSER.declareObject(MatrixStatsAggregation::setMode, (p, t) -> MatrixStatsMode.PARSER.apply(p, null), MODE);
  }

}
