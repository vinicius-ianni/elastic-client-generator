
package org.elasticsearch.mapping.types.complex.flattened;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.mapping.types.core.*;

public class FlattenedProperty  {
  
  private Double _boost;
  public Double getBoost() { return this._boost; }
  public FlattenedProperty setBoost(Double val) { this._boost = val; return this; }


  private Integer _depthLimit;
  public Integer getDepthLimit() { return this._depthLimit; }
  public FlattenedProperty setDepthLimit(Integer val) { this._depthLimit = val; return this; }


  private Boolean _docValues;
  public Boolean getDocValues() { return this._docValues; }
  public FlattenedProperty setDocValues(Boolean val) { this._docValues = val; return this; }


  private Boolean _eagerGlobalOrdinals;
  public Boolean getEagerGlobalOrdinals() { return this._eagerGlobalOrdinals; }
  public FlattenedProperty setEagerGlobalOrdinals(Boolean val) { this._eagerGlobalOrdinals = val; return this; }


  private Integer _ignoreAbove;
  public Integer getIgnoreAbove() { return this._ignoreAbove; }
  public FlattenedProperty setIgnoreAbove(Integer val) { this._ignoreAbove = val; return this; }


  private Boolean _index;
  public Boolean getIndex() { return this._index; }
  public FlattenedProperty setIndex(Boolean val) { this._index = val; return this; }


  private IndexOptions _indexOptions;
  public IndexOptions getIndexOptions() { return this._indexOptions; }
  public FlattenedProperty setIndexOptions(IndexOptions val) { this._indexOptions = val; return this; }


  private String _nullValue;
  public String getNullValue() { return this._nullValue; }
  public FlattenedProperty setNullValue(String val) { this._nullValue = val; return this; }


  private String _similarity;
  public String getSimilarity() { return this._similarity; }
  public FlattenedProperty setSimilarity(String val) { this._similarity = val; return this; }


  private Boolean _splitQueriesOnWhitespace;
  public Boolean getSplitQueriesOnWhitespace() { return this._splitQueriesOnWhitespace; }
  public FlattenedProperty setSplitQueriesOnWhitespace(Boolean val) { this._splitQueriesOnWhitespace = val; return this; }

}
