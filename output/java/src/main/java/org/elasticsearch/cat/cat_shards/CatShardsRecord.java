
package org.elasticsearch.cat.cat_shards;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class CatShardsRecord  {
  
  private String _completionSize;
  public String getCompletionSize() { return this._completionSize; }
  public CatShardsRecord setCompletionSize(String val) { this._completionSize = val; return this; }


  private String _docs;
  public String getDocs() { return this._docs; }
  public CatShardsRecord setDocs(String val) { this._docs = val; return this; }


  private String _fielddataEvictions;
  public String getFielddataEvictions() { return this._fielddataEvictions; }
  public CatShardsRecord setFielddataEvictions(String val) { this._fielddataEvictions = val; return this; }


  private String _fielddataMemorySize;
  public String getFielddataMemorySize() { return this._fielddataMemorySize; }
  public CatShardsRecord setFielddataMemorySize(String val) { this._fielddataMemorySize = val; return this; }


  private String _filterCacheMemorySize;
  public String getFilterCacheMemorySize() { return this._filterCacheMemorySize; }
  public CatShardsRecord setFilterCacheMemorySize(String val) { this._filterCacheMemorySize = val; return this; }


  private String _flushTotal;
  public String getFlushTotal() { return this._flushTotal; }
  public CatShardsRecord setFlushTotal(String val) { this._flushTotal = val; return this; }


  private String _flushTotalTime;
  public String getFlushTotalTime() { return this._flushTotalTime; }
  public CatShardsRecord setFlushTotalTime(String val) { this._flushTotalTime = val; return this; }


  private String _getCurrent;
  public String getGetCurrent() { return this._getCurrent; }
  public CatShardsRecord setGetCurrent(String val) { this._getCurrent = val; return this; }


  private String _getExistsTime;
  public String getGetExistsTime() { return this._getExistsTime; }
  public CatShardsRecord setGetExistsTime(String val) { this._getExistsTime = val; return this; }


  private String _getExistsTotal;
  public String getGetExistsTotal() { return this._getExistsTotal; }
  public CatShardsRecord setGetExistsTotal(String val) { this._getExistsTotal = val; return this; }


  private String _getMissingTime;
  public String getGetMissingTime() { return this._getMissingTime; }
  public CatShardsRecord setGetMissingTime(String val) { this._getMissingTime = val; return this; }


  private String _getMissingTotal;
  public String getGetMissingTotal() { return this._getMissingTotal; }
  public CatShardsRecord setGetMissingTotal(String val) { this._getMissingTotal = val; return this; }


  private String _getTime;
  public String getGetTime() { return this._getTime; }
  public CatShardsRecord setGetTime(String val) { this._getTime = val; return this; }


  private String _getTotal;
  public String getGetTotal() { return this._getTotal; }
  public CatShardsRecord setGetTotal(String val) { this._getTotal = val; return this; }


  private String _id;
  public String getId() { return this._id; }
  public CatShardsRecord setId(String val) { this._id = val; return this; }


  private String _idCacheMemorySize;
  public String getIdCacheMemorySize() { return this._idCacheMemorySize; }
  public CatShardsRecord setIdCacheMemorySize(String val) { this._idCacheMemorySize = val; return this; }


  private String _index;
  public String getIndex() { return this._index; }
  public CatShardsRecord setIndex(String val) { this._index = val; return this; }


  private String _indexingDeleteCurrent;
  public String getIndexingDeleteCurrent() { return this._indexingDeleteCurrent; }
  public CatShardsRecord setIndexingDeleteCurrent(String val) { this._indexingDeleteCurrent = val; return this; }


  private String _indexingDeleteTime;
  public String getIndexingDeleteTime() { return this._indexingDeleteTime; }
  public CatShardsRecord setIndexingDeleteTime(String val) { this._indexingDeleteTime = val; return this; }


  private String _indexingDeleteTotal;
  public String getIndexingDeleteTotal() { return this._indexingDeleteTotal; }
  public CatShardsRecord setIndexingDeleteTotal(String val) { this._indexingDeleteTotal = val; return this; }


  private String _indexingIndexCurrent;
  public String getIndexingIndexCurrent() { return this._indexingIndexCurrent; }
  public CatShardsRecord setIndexingIndexCurrent(String val) { this._indexingIndexCurrent = val; return this; }


  private String _indexingIndexTime;
  public String getIndexingIndexTime() { return this._indexingIndexTime; }
  public CatShardsRecord setIndexingIndexTime(String val) { this._indexingIndexTime = val; return this; }


  private String _indexingIndexTotal;
  public String getIndexingIndexTotal() { return this._indexingIndexTotal; }
  public CatShardsRecord setIndexingIndexTotal(String val) { this._indexingIndexTotal = val; return this; }


  private String _ip;
  public String getIp() { return this._ip; }
  public CatShardsRecord setIp(String val) { this._ip = val; return this; }


  private String _mergesCurrent;
  public String getMergesCurrent() { return this._mergesCurrent; }
  public CatShardsRecord setMergesCurrent(String val) { this._mergesCurrent = val; return this; }


  private String _mergesCurrentDocs;
  public String getMergesCurrentDocs() { return this._mergesCurrentDocs; }
  public CatShardsRecord setMergesCurrentDocs(String val) { this._mergesCurrentDocs = val; return this; }


  private String _mergesCurrentSize;
  public String getMergesCurrentSize() { return this._mergesCurrentSize; }
  public CatShardsRecord setMergesCurrentSize(String val) { this._mergesCurrentSize = val; return this; }


  private String _mergesTotalDocs;
  public String getMergesTotalDocs() { return this._mergesTotalDocs; }
  public CatShardsRecord setMergesTotalDocs(String val) { this._mergesTotalDocs = val; return this; }


  private String _mergesTotalSize;
  public String getMergesTotalSize() { return this._mergesTotalSize; }
  public CatShardsRecord setMergesTotalSize(String val) { this._mergesTotalSize = val; return this; }


  private String _mergesTotalTime;
  public String getMergesTotalTime() { return this._mergesTotalTime; }
  public CatShardsRecord setMergesTotalTime(String val) { this._mergesTotalTime = val; return this; }


  private String _node;
  public String getNode() { return this._node; }
  public CatShardsRecord setNode(String val) { this._node = val; return this; }


  private String _percolateCurrent;
  public String getPercolateCurrent() { return this._percolateCurrent; }
  public CatShardsRecord setPercolateCurrent(String val) { this._percolateCurrent = val; return this; }


  private String _percolateMemorySize;
  public String getPercolateMemorySize() { return this._percolateMemorySize; }
  public CatShardsRecord setPercolateMemorySize(String val) { this._percolateMemorySize = val; return this; }


  private String _percolateQueries;
  public String getPercolateQueries() { return this._percolateQueries; }
  public CatShardsRecord setPercolateQueries(String val) { this._percolateQueries = val; return this; }


  private String _percolateTime;
  public String getPercolateTime() { return this._percolateTime; }
  public CatShardsRecord setPercolateTime(String val) { this._percolateTime = val; return this; }


  private String _percolateTotal;
  public String getPercolateTotal() { return this._percolateTotal; }
  public CatShardsRecord setPercolateTotal(String val) { this._percolateTotal = val; return this; }


  private String _prirep;
  public String getPrirep() { return this._prirep; }
  public CatShardsRecord setPrirep(String val) { this._prirep = val; return this; }


  private String _refreshTime;
  public String getRefreshTime() { return this._refreshTime; }
  public CatShardsRecord setRefreshTime(String val) { this._refreshTime = val; return this; }


  private String _refreshTotal;
  public String getRefreshTotal() { return this._refreshTotal; }
  public CatShardsRecord setRefreshTotal(String val) { this._refreshTotal = val; return this; }


  private String _searchFetchCurrent;
  public String getSearchFetchCurrent() { return this._searchFetchCurrent; }
  public CatShardsRecord setSearchFetchCurrent(String val) { this._searchFetchCurrent = val; return this; }


  private String _searchFetchTime;
  public String getSearchFetchTime() { return this._searchFetchTime; }
  public CatShardsRecord setSearchFetchTime(String val) { this._searchFetchTime = val; return this; }


  private String _searchFetchTotal;
  public String getSearchFetchTotal() { return this._searchFetchTotal; }
  public CatShardsRecord setSearchFetchTotal(String val) { this._searchFetchTotal = val; return this; }


  private String _searchOpenContexts;
  public String getSearchOpenContexts() { return this._searchOpenContexts; }
  public CatShardsRecord setSearchOpenContexts(String val) { this._searchOpenContexts = val; return this; }


  private String _searchQueryCurrent;
  public String getSearchQueryCurrent() { return this._searchQueryCurrent; }
  public CatShardsRecord setSearchQueryCurrent(String val) { this._searchQueryCurrent = val; return this; }


  private String _searchQueryTime;
  public String getSearchQueryTime() { return this._searchQueryTime; }
  public CatShardsRecord setSearchQueryTime(String val) { this._searchQueryTime = val; return this; }


  private String _searchQueryTotal;
  public String getSearchQueryTotal() { return this._searchQueryTotal; }
  public CatShardsRecord setSearchQueryTotal(String val) { this._searchQueryTotal = val; return this; }


  private String _segmentsCount;
  public String getSegmentsCount() { return this._segmentsCount; }
  public CatShardsRecord setSegmentsCount(String val) { this._segmentsCount = val; return this; }


  private String _segmentsFixedBitsetMemory;
  public String getSegmentsFixedBitsetMemory() { return this._segmentsFixedBitsetMemory; }
  public CatShardsRecord setSegmentsFixedBitsetMemory(String val) { this._segmentsFixedBitsetMemory = val; return this; }


  private String _segmentsIndexWriterMaxMemory;
  public String getSegmentsIndexWriterMaxMemory() { return this._segmentsIndexWriterMaxMemory; }
  public CatShardsRecord setSegmentsIndexWriterMaxMemory(String val) { this._segmentsIndexWriterMaxMemory = val; return this; }


  private String _segmentsIndexWriterMemory;
  public String getSegmentsIndexWriterMemory() { return this._segmentsIndexWriterMemory; }
  public CatShardsRecord setSegmentsIndexWriterMemory(String val) { this._segmentsIndexWriterMemory = val; return this; }


  private String _segmentsMemory;
  public String getSegmentsMemory() { return this._segmentsMemory; }
  public CatShardsRecord setSegmentsMemory(String val) { this._segmentsMemory = val; return this; }


  private String _segmentsVersionMapMemory;
  public String getSegmentsVersionMapMemory() { return this._segmentsVersionMapMemory; }
  public CatShardsRecord setSegmentsVersionMapMemory(String val) { this._segmentsVersionMapMemory = val; return this; }


  private String _shard;
  public String getShard() { return this._shard; }
  public CatShardsRecord setShard(String val) { this._shard = val; return this; }


  private String _state;
  public String getState() { return this._state; }
  public CatShardsRecord setState(String val) { this._state = val; return this; }


  private String _store;
  public String getStore() { return this._store; }
  public CatShardsRecord setStore(String val) { this._store = val; return this; }


  private String _warmerCurrent;
  public String getWarmerCurrent() { return this._warmerCurrent; }
  public CatShardsRecord setWarmerCurrent(String val) { this._warmerCurrent = val; return this; }


  private String _warmerTotal;
  public String getWarmerTotal() { return this._warmerTotal; }
  public CatShardsRecord setWarmerTotal(String val) { this._warmerTotal = val; return this; }


  private String _warmerTotalTime;
  public String getWarmerTotalTime() { return this._warmerTotalTime; }
  public CatShardsRecord setWarmerTotalTime(String val) { this._warmerTotalTime = val; return this; }

}
