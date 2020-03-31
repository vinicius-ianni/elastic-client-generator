
package org.elasticsearch.query_dsl.specialized.shape;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.query_dsl.abstractions.field_lookup.*;
import org.elasticsearch.common_options.shape.*;
import org.elasticsearch.query_dsl.geo.shape.*;

public class ShapeQuery  {
  
  private Boolean _ignoreUnmapped;
  public Boolean getIgnoreUnmapped() { return this._ignoreUnmapped; }
  public ShapeQuery setIgnoreUnmapped(Boolean val) { this._ignoreUnmapped = val; return this; }


  private FieldLookup _indexedShape;
  public FieldLookup getIndexedShape() { return this._indexedShape; }
  public ShapeQuery setIndexedShape(FieldLookup val) { this._indexedShape = val; return this; }


  private ShapeRelation _relation;
  public ShapeRelation getRelation() { return this._relation; }
  public ShapeQuery setRelation(ShapeRelation val) { this._relation = val; return this; }


  private GeoShape _shape;
  public GeoShape getShape() { return this._shape; }
  public ShapeQuery setShape(GeoShape val) { this._shape = val; return this; }

}
