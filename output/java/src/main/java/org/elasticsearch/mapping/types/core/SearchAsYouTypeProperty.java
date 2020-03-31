
package org.elasticsearch.mapping.types.core;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.mapping.types.core.*;
import org.elasticsearch.internal.*;
import org.elasticsearch.mapping.*;

public class SearchAsYouTypeProperty  {
  
  private String _analyzer;
  public String getAnalyzer() { return this._analyzer; }
  public SearchAsYouTypeProperty setAnalyzer(String val) { this._analyzer = val; return this; }


  private Boolean _index;
  public Boolean getIndex() { return this._index; }
  public SearchAsYouTypeProperty setIndex(Boolean val) { this._index = val; return this; }


  private IndexOptions _indexOptions;
  public IndexOptions getIndexOptions() { return this._indexOptions; }
  public SearchAsYouTypeProperty setIndexOptions(IndexOptions val) { this._indexOptions = val; return this; }


  private Integer _maxShingleSize;
  public Integer getMaxShingleSize() { return this._maxShingleSize; }
  public SearchAsYouTypeProperty setMaxShingleSize(Integer val) { this._maxShingleSize = val; return this; }


  private Boolean _norms;
  public Boolean getNorms() { return this._norms; }
  public SearchAsYouTypeProperty setNorms(Boolean val) { this._norms = val; return this; }


  private String _searchAnalyzer;
  public String getSearchAnalyzer() { return this._searchAnalyzer; }
  public SearchAsYouTypeProperty setSearchAnalyzer(String val) { this._searchAnalyzer = val; return this; }


  private String _searchQuoteAnalyzer;
  public String getSearchQuoteAnalyzer() { return this._searchQuoteAnalyzer; }
  public SearchAsYouTypeProperty setSearchQuoteAnalyzer(String val) { this._searchQuoteAnalyzer = val; return this; }


  private TermVectorOption _termVector;
  public TermVectorOption getTermVector() { return this._termVector; }
  public SearchAsYouTypeProperty setTermVector(TermVectorOption val) { this._termVector = val; return this; }

}
