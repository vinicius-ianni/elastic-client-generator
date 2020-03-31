
package org.elasticsearch.query_dsl.specialized.pinned;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.id.*;
import org.elasticsearch.query_dsl.abstractions.container.*;

public class PinnedQuery  {
  
  private Id[] _ids;
  public Id[] getIds() { return this._ids; }
  public PinnedQuery setIds(Id[] val) { this._ids = val; return this; }


  private QueryContainer _organic;
  public QueryContainer getOrganic() { return this._organic; }
  public PinnedQuery setOrganic(QueryContainer val) { this._organic = val; return this; }

}
