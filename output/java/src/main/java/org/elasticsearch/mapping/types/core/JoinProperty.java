
package org.elasticsearch.mapping.types.core;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.relation_name.*;

public class JoinProperty  {
  
  private Map<RelationName, RelationName[]> _relations;
  public Map<RelationName, RelationName[]> getRelations() { return this._relations; }
  public JoinProperty setRelations(Map<RelationName, RelationName[]> val) { this._relations = val; return this; }

}
