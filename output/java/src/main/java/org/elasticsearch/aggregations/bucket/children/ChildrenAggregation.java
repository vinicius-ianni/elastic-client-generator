
package org.elasticsearch.aggregations.bucket.children;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.relation_name.*;

public class ChildrenAggregation  {
  
  private RelationName _type;
  public RelationName getType() { return this._type; }
  public ChildrenAggregation setType(RelationName val) { this._type = val; return this; }

}
