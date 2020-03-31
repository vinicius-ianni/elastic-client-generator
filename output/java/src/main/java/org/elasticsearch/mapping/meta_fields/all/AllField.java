
package org.elasticsearch.mapping.meta_fields.all;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class AllField  {
  
  private String _analyzer;
  public String getAnalyzer() { return this._analyzer; }
  public AllField setAnalyzer(String val) { this._analyzer = val; return this; }


  private Boolean _enabled;
  public Boolean getEnabled() { return this._enabled; }
  public AllField setEnabled(Boolean val) { this._enabled = val; return this; }


  private Boolean _omitNorms;
  public Boolean getOmitNorms() { return this._omitNorms; }
  public AllField setOmitNorms(Boolean val) { this._omitNorms = val; return this; }


  private String _searchAnalyzer;
  public String getSearchAnalyzer() { return this._searchAnalyzer; }
  public AllField setSearchAnalyzer(String val) { this._searchAnalyzer = val; return this; }


  private String _similarity;
  public String getSimilarity() { return this._similarity; }
  public AllField setSimilarity(String val) { this._similarity = val; return this; }


  private Boolean _store;
  public Boolean getStore() { return this._store; }
  public AllField setStore(Boolean val) { this._store = val; return this; }


  private Boolean _storeTermVectorOffsets;
  public Boolean getStoreTermVectorOffsets() { return this._storeTermVectorOffsets; }
  public AllField setStoreTermVectorOffsets(Boolean val) { this._storeTermVectorOffsets = val; return this; }


  private Boolean _storeTermVectorPayloads;
  public Boolean getStoreTermVectorPayloads() { return this._storeTermVectorPayloads; }
  public AllField setStoreTermVectorPayloads(Boolean val) { this._storeTermVectorPayloads = val; return this; }


  private Boolean _storeTermVectorPositions;
  public Boolean getStoreTermVectorPositions() { return this._storeTermVectorPositions; }
  public AllField setStoreTermVectorPositions(Boolean val) { this._storeTermVectorPositions = val; return this; }


  private Boolean _storeTermVectors;
  public Boolean getStoreTermVectors() { return this._storeTermVectors; }
  public AllField setStoreTermVectors(Boolean val) { this._storeTermVectors = val; return this; }

}
