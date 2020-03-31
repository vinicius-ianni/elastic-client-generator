
package org.elasticsearch.mapping;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.mapping.meta_fields.all.*;
import org.elasticsearch.mapping.*;
import org.elasticsearch.mapping.dynamic_template.*;
import org.elasticsearch.mapping.meta_fields.field_names.*;
import org.elasticsearch.mapping.meta_fields.index.*;
import org.elasticsearch.common_abstractions.infer.property_name.*;
import org.elasticsearch.mapping.types.*;
import org.elasticsearch.mapping.meta_fields.routing.*;
import org.elasticsearch.mapping.meta_fields.size.*;
import org.elasticsearch.mapping.meta_fields.source.*;

public class TypeMapping  {
  
  private AllField _allField;
  public AllField getAllField() { return this._allField; }
  public TypeMapping setAllField(AllField val) { this._allField = val; return this; }


  private Boolean _dateDetection;
  public Boolean getDateDetection() { return this._dateDetection; }
  public TypeMapping setDateDetection(Boolean val) { this._dateDetection = val; return this; }


  private Either<Boolean, DynamicMapping> _dynamic;
  public Either<Boolean, DynamicMapping> getDynamic() { return this._dynamic; }
  public TypeMapping setDynamic(Either<Boolean, DynamicMapping> val) { this._dynamic = val; return this; }


  private String[] _dynamicDateFormats;
  public String[] getDynamicDateFormats() { return this._dynamicDateFormats; }
  public TypeMapping setDynamicDateFormats(String[] val) { this._dynamicDateFormats = val; return this; }


  private Map<String, DynamicTemplate> _dynamicTemplates;
  public Map<String, DynamicTemplate> getDynamicTemplates() { return this._dynamicTemplates; }
  public TypeMapping setDynamicTemplates(Map<String, DynamicTemplate> val) { this._dynamicTemplates = val; return this; }


  private FieldNamesField _fieldNames;
  public FieldNamesField getFieldNames() { return this._fieldNames; }
  public TypeMapping setFieldNames(FieldNamesField val) { this._fieldNames = val; return this; }


  private IndexField _indexField;
  public IndexField getIndexField() { return this._indexField; }
  public TypeMapping setIndexField(IndexField val) { this._indexField = val; return this; }


  private Map<String, Object> _meta;
  public Map<String, Object> getMeta() { return this._meta; }
  public TypeMapping setMeta(Map<String, Object> val) { this._meta = val; return this; }


  private Boolean _numericDetection;
  public Boolean getNumericDetection() { return this._numericDetection; }
  public TypeMapping setNumericDetection(Boolean val) { this._numericDetection = val; return this; }


  private Map<PropertyName, IProperty> _properties;
  public Map<PropertyName, IProperty> getProperties() { return this._properties; }
  public TypeMapping setProperties(Map<PropertyName, IProperty> val) { this._properties = val; return this; }


  private RoutingField _routing;
  public RoutingField getRouting() { return this._routing; }
  public TypeMapping setRouting(RoutingField val) { this._routing = val; return this; }


  private SizeField _size;
  public SizeField getSize() { return this._size; }
  public TypeMapping setSize(SizeField val) { this._size = val; return this; }


  private SourceField _source;
  public SourceField getSource() { return this._source; }
  public TypeMapping setSource(SourceField val) { this._source = val; return this; }

}
