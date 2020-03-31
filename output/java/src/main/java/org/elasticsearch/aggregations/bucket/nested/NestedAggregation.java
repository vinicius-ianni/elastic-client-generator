
package org.elasticsearch.aggregations.bucket.nested;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.field.*;

public class NestedAggregation  {
  
  private Field _path;
  public Field getPath() { return this._path; }
  public NestedAggregation setPath(Field val) { this._path = val; return this; }

}
