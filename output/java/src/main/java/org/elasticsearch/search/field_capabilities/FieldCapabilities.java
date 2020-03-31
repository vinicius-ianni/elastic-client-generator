
package org.elasticsearch.search.field_capabilities;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.indices.*;

public class FieldCapabilities  {
  
  private Boolean _aggregatable;
  public Boolean getAggregatable() { return this._aggregatable; }
  public FieldCapabilities setAggregatable(Boolean val) { this._aggregatable = val; return this; }


  private Indices _indices;
  public Indices getIndices() { return this._indices; }
  public FieldCapabilities setIndices(Indices val) { this._indices = val; return this; }


  private Indices _nonAggregatableIndices;
  public Indices getNonAggregatableIndices() { return this._nonAggregatableIndices; }
  public FieldCapabilities setNonAggregatableIndices(Indices val) { this._nonAggregatableIndices = val; return this; }


  private Indices _nonSearchableIndices;
  public Indices getNonSearchableIndices() { return this._nonSearchableIndices; }
  public FieldCapabilities setNonSearchableIndices(Indices val) { this._nonSearchableIndices = val; return this; }


  private Boolean _searchable;
  public Boolean getSearchable() { return this._searchable; }
  public FieldCapabilities setSearchable(Boolean val) { this._searchable = val; return this; }

}
