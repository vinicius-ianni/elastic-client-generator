
package org.elasticsearch.query_dsl.joining.parent_id;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.id.*;
import org.elasticsearch.common_abstractions.infer.relation_name.*;

public class ParentIdQuery  {
  
  private Id _id;
  public Id getId() { return this._id; }
  public ParentIdQuery setId(Id val) { this._id = val; return this; }


  private Boolean _ignoreUnmapped;
  public Boolean getIgnoreUnmapped() { return this._ignoreUnmapped; }
  public ParentIdQuery setIgnoreUnmapped(Boolean val) { this._ignoreUnmapped = val; return this; }


  private RelationName _type;
  public RelationName getType() { return this._type; }
  public ParentIdQuery setType(RelationName val) { this._type = val; return this; }

}
