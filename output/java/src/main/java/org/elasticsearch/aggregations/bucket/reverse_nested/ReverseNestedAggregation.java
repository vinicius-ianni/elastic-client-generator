
package org.elasticsearch.aggregations.bucket.reverse_nested;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.field.*;

public class ReverseNestedAggregation  {
  
  private Field _path;
  public Field getPath() { return this._path; }
  public ReverseNestedAggregation setPath(Field val) { this._path = val; return this; }

}
