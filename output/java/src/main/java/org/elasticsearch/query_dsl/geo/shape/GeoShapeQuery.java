
package org.elasticsearch.query_dsl.geo.shape;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.query_dsl.abstractions.field_lookup.*;
import org.elasticsearch.common_options.geo.*;
import org.elasticsearch.query_dsl.geo.shape.*;

public class GeoShapeQuery  {
  
  private Boolean _ignoreUnmapped;
  public Boolean getIgnoreUnmapped() { return this._ignoreUnmapped; }
  public GeoShapeQuery setIgnoreUnmapped(Boolean val) { this._ignoreUnmapped = val; return this; }


  private FieldLookup _indexedShape;
  public FieldLookup getIndexedShape() { return this._indexedShape; }
  public GeoShapeQuery setIndexedShape(FieldLookup val) { this._indexedShape = val; return this; }


  private GeoShapeRelation _relation;
  public GeoShapeRelation getRelation() { return this._relation; }
  public GeoShapeQuery setRelation(GeoShapeRelation val) { this._relation = val; return this; }


  private GeoShape _shape;
  public GeoShape getShape() { return this._shape; }
  public GeoShapeQuery setShape(GeoShape val) { this._shape = val; return this; }

}
