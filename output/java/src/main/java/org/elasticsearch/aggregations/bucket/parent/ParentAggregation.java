
package org.elasticsearch.aggregations.bucket.parent;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.relation_name.*;

public class ParentAggregation  {
  
  private RelationName _type;
  public RelationName getType() { return this._type; }
  public ParentAggregation setType(RelationName val) { this._type = val; return this; }

}
