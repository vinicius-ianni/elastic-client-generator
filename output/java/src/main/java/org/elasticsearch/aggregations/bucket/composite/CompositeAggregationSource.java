
package org.elasticsearch.aggregations.bucket.composite;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.search.search.sort.*;

public class CompositeAggregationSource  {
  
  private Field _field;
  public Field getField() { return this._field; }
  public CompositeAggregationSource setField(Field val) { this._field = val; return this; }


  private Boolean _missingBucket;
  public Boolean getMissingBucket() { return this._missingBucket; }
  public CompositeAggregationSource setMissingBucket(Boolean val) { this._missingBucket = val; return this; }


  private String _name;
  public String getName() { return this._name; }
  public CompositeAggregationSource setName(String val) { this._name = val; return this; }


  private SortOrder _order;
  public SortOrder getOrder() { return this._order; }
  public CompositeAggregationSource setOrder(SortOrder val) { this._order = val; return this; }


  private String _sourceType;
  public String getSourceType() { return this._sourceType; }
  public CompositeAggregationSource setSourceType(String val) { this._sourceType = val; return this; }

}
