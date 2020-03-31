
package org.elasticsearch.mapping.types.core;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.mapping.types.core.*;

public class KeywordProperty  {
  
  private Double _boost;
  public Double getBoost() { return this._boost; }
  public KeywordProperty setBoost(Double val) { this._boost = val; return this; }


  private Boolean _eagerGlobalOrdinals;
  public Boolean getEagerGlobalOrdinals() { return this._eagerGlobalOrdinals; }
  public KeywordProperty setEagerGlobalOrdinals(Boolean val) { this._eagerGlobalOrdinals = val; return this; }


  private Integer _ignoreAbove;
  public Integer getIgnoreAbove() { return this._ignoreAbove; }
  public KeywordProperty setIgnoreAbove(Integer val) { this._ignoreAbove = val; return this; }


  private Boolean _index;
  public Boolean getIndex() { return this._index; }
  public KeywordProperty setIndex(Boolean val) { this._index = val; return this; }


  private IndexOptions _indexOptions;
  public IndexOptions getIndexOptions() { return this._indexOptions; }
  public KeywordProperty setIndexOptions(IndexOptions val) { this._indexOptions = val; return this; }


  private String _normalizer;
  public String getNormalizer() { return this._normalizer; }
  public KeywordProperty setNormalizer(String val) { this._normalizer = val; return this; }


  private Boolean _norms;
  public Boolean getNorms() { return this._norms; }
  public KeywordProperty setNorms(Boolean val) { this._norms = val; return this; }


  private String _nullValue;
  public String getNullValue() { return this._nullValue; }
  public KeywordProperty setNullValue(String val) { this._nullValue = val; return this; }


  private Boolean _splitQueriesOnWhitespace;
  public Boolean getSplitQueriesOnWhitespace() { return this._splitQueriesOnWhitespace; }
  public KeywordProperty setSplitQueriesOnWhitespace(Boolean val) { this._splitQueriesOnWhitespace = val; return this; }

}
