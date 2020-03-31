
package org.elasticsearch.mapping.types.specialized.generic;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.modules.indices.fielddata.string.*;
import org.elasticsearch.mapping.types.core.*;
import org.elasticsearch.mapping.*;

public class GenericProperty  {
  
  private String _analyzer;
  public String getAnalyzer() { return this._analyzer; }
  public GenericProperty setAnalyzer(String val) { this._analyzer = val; return this; }


  private Double _boost;
  public Double getBoost() { return this._boost; }
  public GenericProperty setBoost(Double val) { this._boost = val; return this; }


  private StringFielddata _fielddata;
  public StringFielddata getFielddata() { return this._fielddata; }
  public GenericProperty setFielddata(StringFielddata val) { this._fielddata = val; return this; }


  private Integer _ignoreAbove;
  public Integer getIgnoreAbove() { return this._ignoreAbove; }
  public GenericProperty setIgnoreAbove(Integer val) { this._ignoreAbove = val; return this; }


  private Boolean _index;
  public Boolean getIndex() { return this._index; }
  public GenericProperty setIndex(Boolean val) { this._index = val; return this; }


  private IndexOptions _indexOptions;
  public IndexOptions getIndexOptions() { return this._indexOptions; }
  public GenericProperty setIndexOptions(IndexOptions val) { this._indexOptions = val; return this; }


  private Boolean _norms;
  public Boolean getNorms() { return this._norms; }
  public GenericProperty setNorms(Boolean val) { this._norms = val; return this; }


  private String _nullValue;
  public String getNullValue() { return this._nullValue; }
  public GenericProperty setNullValue(String val) { this._nullValue = val; return this; }


  private Integer _positionIncrementGap;
  public Integer getPositionIncrementGap() { return this._positionIncrementGap; }
  public GenericProperty setPositionIncrementGap(Integer val) { this._positionIncrementGap = val; return this; }


  private String _searchAnalyzer;
  public String getSearchAnalyzer() { return this._searchAnalyzer; }
  public GenericProperty setSearchAnalyzer(String val) { this._searchAnalyzer = val; return this; }


  private TermVectorOption _termVector;
  public TermVectorOption getTermVector() { return this._termVector; }
  public GenericProperty setTermVector(TermVectorOption val) { this._termVector = val; return this; }


  private String _type;
  public String getType() { return this._type; }
  public GenericProperty setType(String val) { this._type = val; return this; }

}
