
package org.elasticsearch.query_dsl.abstractions.field_lookup;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.id.*;
import org.elasticsearch.common_abstractions.infer.index_name.*;
import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.common_abstractions.infer.join_field_routing.*;

public class FieldLookup  {
  
  private Id _id;
  public Id getId() { return this._id; }
  public FieldLookup setId(Id val) { this._id = val; return this; }


  private IndexName _index;
  public IndexName getIndex() { return this._index; }
  public FieldLookup setIndex(IndexName val) { this._index = val; return this; }


  private Field _path;
  public Field getPath() { return this._path; }
  public FieldLookup setPath(Field val) { this._path = val; return this; }


  private Routing _routing;
  public Routing getRouting() { return this._routing; }
  public FieldLookup setRouting(Routing val) { this._routing = val; return this; }

}
