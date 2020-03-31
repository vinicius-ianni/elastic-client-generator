
package org.elasticsearch.aggregations.matrix.matrix_stats;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.aggregations.matrix.matrix_stats.*;

public class MatrixStatsAggregation  {
  
  private MatrixStatsMode _mode;
  public MatrixStatsMode getMode() { return this._mode; }
  public MatrixStatsAggregation setMode(MatrixStatsMode val) { this._mode = val; return this; }

}
