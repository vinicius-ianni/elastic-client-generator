
package org.elasticsearch.indices.mapping_management.put_mapping;

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
import org.elasticsearch.common.*;
import org.elasticsearch.common_options.time_unit.*;

public class PutMappingRequest  {
  
  private AllField _allField;
  public AllField getAllField() { return this._allField; }
  public PutMappingRequest setAllField(AllField val) { this._allField = val; return this; }


  private Boolean _dateDetection;
  public Boolean getDateDetection() { return this._dateDetection; }
  public PutMappingRequest setDateDetection(Boolean val) { this._dateDetection = val; return this; }


  private Either<Boolean, DynamicMapping> _dynamic;
  public Either<Boolean, DynamicMapping> getDynamic() { return this._dynamic; }
  public PutMappingRequest setDynamic(Either<Boolean, DynamicMapping> val) { this._dynamic = val; return this; }


  private String[] _dynamicDateFormats;
  public String[] getDynamicDateFormats() { return this._dynamicDateFormats; }
  public PutMappingRequest setDynamicDateFormats(String[] val) { this._dynamicDateFormats = val; return this; }


  private Map<String, DynamicTemplate> _dynamicTemplates;
  public Map<String, DynamicTemplate> getDynamicTemplates() { return this._dynamicTemplates; }
  public PutMappingRequest setDynamicTemplates(Map<String, DynamicTemplate> val) { this._dynamicTemplates = val; return this; }


  private FieldNamesField _fieldNamesField;
  public FieldNamesField getFieldNamesField() { return this._fieldNamesField; }
  public PutMappingRequest setFieldNamesField(FieldNamesField val) { this._fieldNamesField = val; return this; }


  private IndexField _indexField;
  public IndexField getIndexField() { return this._indexField; }
  public PutMappingRequest setIndexField(IndexField val) { this._indexField = val; return this; }


  private Map<String, Object> _meta;
  public Map<String, Object> getMeta() { return this._meta; }
  public PutMappingRequest setMeta(Map<String, Object> val) { this._meta = val; return this; }


  private Boolean _numericDetection;
  public Boolean getNumericDetection() { return this._numericDetection; }
  public PutMappingRequest setNumericDetection(Boolean val) { this._numericDetection = val; return this; }


  private Map<PropertyName, IProperty> _properties;
  public Map<PropertyName, IProperty> getProperties() { return this._properties; }
  public PutMappingRequest setProperties(Map<PropertyName, IProperty> val) { this._properties = val; return this; }


  private RoutingField _routingField;
  public RoutingField getRoutingField() { return this._routingField; }
  public PutMappingRequest setRoutingField(RoutingField val) { this._routingField = val; return this; }


  private SizeField _sizeField;
  public SizeField getSizeField() { return this._sizeField; }
  public PutMappingRequest setSizeField(SizeField val) { this._sizeField = val; return this; }


  private SourceField _sourceField;
  public SourceField getSourceField() { return this._sourceField; }
  public PutMappingRequest setSourceField(SourceField val) { this._sourceField = val; return this; }


  private Boolean _allowNoIndices;
  public Boolean getAllowNoIndices() { return this._allowNoIndices; }
  public PutMappingRequest setAllowNoIndices(Boolean val) { this._allowNoIndices = val; return this; }


  private ExpandWildcards _expandWildcards;
  public ExpandWildcards getExpandWildcards() { return this._expandWildcards; }
  public PutMappingRequest setExpandWildcards(ExpandWildcards val) { this._expandWildcards = val; return this; }


  private Boolean _ignoreUnavailable;
  public Boolean getIgnoreUnavailable() { return this._ignoreUnavailable; }
  public PutMappingRequest setIgnoreUnavailable(Boolean val) { this._ignoreUnavailable = val; return this; }


  private Boolean _includeTypeName;
  public Boolean getIncludeTypeName() { return this._includeTypeName; }
  public PutMappingRequest setIncludeTypeName(Boolean val) { this._includeTypeName = val; return this; }


  private Time _masterTimeout;
  public Time getMasterTimeout() { return this._masterTimeout; }
  public PutMappingRequest setMasterTimeout(Time val) { this._masterTimeout = val; return this; }


  private Time _timeout;
  public Time getTimeout() { return this._timeout; }
  public PutMappingRequest setTimeout(Time val) { this._timeout = val; return this; }

}
