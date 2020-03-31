
package org.elasticsearch.mapping.types.core;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.modules.indices.fielddata.*;
import org.elasticsearch.mapping.types.core.*;
import org.elasticsearch.mapping.*;

public class TextProperty  {
  
  private String _analyzer;
  public String getAnalyzer() { return this._analyzer; }
  public TextProperty setAnalyzer(String val) { this._analyzer = val; return this; }


  private Double _boost;
  public Double getBoost() { return this._boost; }
  public TextProperty setBoost(Double val) { this._boost = val; return this; }


  private Boolean _eagerGlobalOrdinals;
  public Boolean getEagerGlobalOrdinals() { return this._eagerGlobalOrdinals; }
  public TextProperty setEagerGlobalOrdinals(Boolean val) { this._eagerGlobalOrdinals = val; return this; }


  private Boolean _fielddata;
  public Boolean getFielddata() { return this._fielddata; }
  public TextProperty setFielddata(Boolean val) { this._fielddata = val; return this; }


  private FielddataFrequencyFilter _fielddataFrequencyFilter;
  public FielddataFrequencyFilter getFielddataFrequencyFilter() { return this._fielddataFrequencyFilter; }
  public TextProperty setFielddataFrequencyFilter(FielddataFrequencyFilter val) { this._fielddataFrequencyFilter = val; return this; }


  private Boolean _index;
  public Boolean getIndex() { return this._index; }
  public TextProperty setIndex(Boolean val) { this._index = val; return this; }


  private IndexOptions _indexOptions;
  public IndexOptions getIndexOptions() { return this._indexOptions; }
  public TextProperty setIndexOptions(IndexOptions val) { this._indexOptions = val; return this; }


  private Boolean _indexPhrases;
  public Boolean getIndexPhrases() { return this._indexPhrases; }
  public TextProperty setIndexPhrases(Boolean val) { this._indexPhrases = val; return this; }


  private TextIndexPrefixes _indexPrefixes;
  public TextIndexPrefixes getIndexPrefixes() { return this._indexPrefixes; }
  public TextProperty setIndexPrefixes(TextIndexPrefixes val) { this._indexPrefixes = val; return this; }


  private Boolean _norms;
  public Boolean getNorms() { return this._norms; }
  public TextProperty setNorms(Boolean val) { this._norms = val; return this; }


  private Integer _positionIncrementGap;
  public Integer getPositionIncrementGap() { return this._positionIncrementGap; }
  public TextProperty setPositionIncrementGap(Integer val) { this._positionIncrementGap = val; return this; }


  private String _searchAnalyzer;
  public String getSearchAnalyzer() { return this._searchAnalyzer; }
  public TextProperty setSearchAnalyzer(String val) { this._searchAnalyzer = val; return this; }


  private String _searchQuoteAnalyzer;
  public String getSearchQuoteAnalyzer() { return this._searchQuoteAnalyzer; }
  public TextProperty setSearchQuoteAnalyzer(String val) { this._searchQuoteAnalyzer = val; return this; }


  private TermVectorOption _termVector;
  public TermVectorOption getTermVector() { return this._termVector; }
  public TextProperty setTermVector(TermVectorOption val) { this._termVector = val; return this; }

}
