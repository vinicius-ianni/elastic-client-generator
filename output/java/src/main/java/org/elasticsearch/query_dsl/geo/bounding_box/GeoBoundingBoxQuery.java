
package org.elasticsearch.query_dsl.geo.bounding_box;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.query_dsl.geo.bounding_box.*;
import org.elasticsearch.query_dsl.geo.*;

public class GeoBoundingBoxQuery  {
  
  private BoundingBox _boundingBox;
  public BoundingBox getBoundingBox() { return this._boundingBox; }
  public GeoBoundingBoxQuery setBoundingBox(BoundingBox val) { this._boundingBox = val; return this; }


  private GeoExecution _type;
  public GeoExecution getType() { return this._type; }
  public GeoBoundingBoxQuery setType(GeoExecution val) { this._type = val; return this; }


  private GeoValidationMethod _validationMethod;
  public GeoValidationMethod getValidationMethod() { return this._validationMethod; }
  public GeoBoundingBoxQuery setValidationMethod(GeoValidationMethod val) { this._validationMethod = val; return this; }

}
