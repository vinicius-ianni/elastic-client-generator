
package org.elasticsearch.cat.cat_nodes;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class CatNodesRecord  {
  
  private String _build;
  public String getBuild() { return this._build; }
  public CatNodesRecord setBuild(String val) { this._build = val; return this; }


  private String _completionSize;
  public String getCompletionSize() { return this._completionSize; }
  public CatNodesRecord setCompletionSize(String val) { this._completionSize = val; return this; }


  private String _cpu;
  public String getCpu() { return this._cpu; }
  public CatNodesRecord setCpu(String val) { this._cpu = val; return this; }


  private String _diskAvailable;
  public String getDiskAvailable() { return this._diskAvailable; }
  public CatNodesRecord setDiskAvailable(String val) { this._diskAvailable = val; return this; }


  private String _fielddataEvictions;
  public String getFielddataEvictions() { return this._fielddataEvictions; }
  public CatNodesRecord setFielddataEvictions(String val) { this._fielddataEvictions = val; return this; }


  private String _fielddataMemory;
  public String getFielddataMemory() { return this._fielddataMemory; }
  public CatNodesRecord setFielddataMemory(String val) { this._fielddataMemory = val; return this; }


  private Integer _fileDescriptorCurrent;
  public Integer getFileDescriptorCurrent() { return this._fileDescriptorCurrent; }
  public CatNodesRecord setFileDescriptorCurrent(Integer val) { this._fileDescriptorCurrent = val; return this; }


  private Integer _fileDescriptorMax;
  public Integer getFileDescriptorMax() { return this._fileDescriptorMax; }
  public CatNodesRecord setFileDescriptorMax(Integer val) { this._fileDescriptorMax = val; return this; }


  private Integer _fileDescriptorPercent;
  public Integer getFileDescriptorPercent() { return this._fileDescriptorPercent; }
  public CatNodesRecord setFileDescriptorPercent(Integer val) { this._fileDescriptorPercent = val; return this; }


  private String _filterCacheEvictions;
  public String getFilterCacheEvictions() { return this._filterCacheEvictions; }
  public CatNodesRecord setFilterCacheEvictions(String val) { this._filterCacheEvictions = val; return this; }


  private String _filterCacheMemory;
  public String getFilterCacheMemory() { return this._filterCacheMemory; }
  public CatNodesRecord setFilterCacheMemory(String val) { this._filterCacheMemory = val; return this; }


  private String _flushTotal;
  public String getFlushTotal() { return this._flushTotal; }
  public CatNodesRecord setFlushTotal(String val) { this._flushTotal = val; return this; }


  private String _flushTotalTime;
  public String getFlushTotalTime() { return this._flushTotalTime; }
  public CatNodesRecord setFlushTotalTime(String val) { this._flushTotalTime = val; return this; }


  private String _getCurrent;
  public String getGetCurrent() { return this._getCurrent; }
  public CatNodesRecord setGetCurrent(String val) { this._getCurrent = val; return this; }


  private String _getExistsTime;
  public String getGetExistsTime() { return this._getExistsTime; }
  public CatNodesRecord setGetExistsTime(String val) { this._getExistsTime = val; return this; }


  private String _getExistsTotal;
  public String getGetExistsTotal() { return this._getExistsTotal; }
  public CatNodesRecord setGetExistsTotal(String val) { this._getExistsTotal = val; return this; }


  private String _getMissingTime;
  public String getGetMissingTime() { return this._getMissingTime; }
  public CatNodesRecord setGetMissingTime(String val) { this._getMissingTime = val; return this; }


  private String _getMissingTotal;
  public String getGetMissingTotal() { return this._getMissingTotal; }
  public CatNodesRecord setGetMissingTotal(String val) { this._getMissingTotal = val; return this; }


  private String _getTime;
  public String getGetTime() { return this._getTime; }
  public CatNodesRecord setGetTime(String val) { this._getTime = val; return this; }


  private String _getTotal;
  public String getGetTotal() { return this._getTotal; }
  public CatNodesRecord setGetTotal(String val) { this._getTotal = val; return this; }


  private String _heapCurrent;
  public String getHeapCurrent() { return this._heapCurrent; }
  public CatNodesRecord setHeapCurrent(String val) { this._heapCurrent = val; return this; }


  private String _heapMax;
  public String getHeapMax() { return this._heapMax; }
  public CatNodesRecord setHeapMax(String val) { this._heapMax = val; return this; }


  private String _heapPercent;
  public String getHeapPercent() { return this._heapPercent; }
  public CatNodesRecord setHeapPercent(String val) { this._heapPercent = val; return this; }


  private String _idCacheMemory;
  public String getIdCacheMemory() { return this._idCacheMemory; }
  public CatNodesRecord setIdCacheMemory(String val) { this._idCacheMemory = val; return this; }


  private String _indexingDeleteCurrent;
  public String getIndexingDeleteCurrent() { return this._indexingDeleteCurrent; }
  public CatNodesRecord setIndexingDeleteCurrent(String val) { this._indexingDeleteCurrent = val; return this; }


  private String _indexingDeleteTime;
  public String getIndexingDeleteTime() { return this._indexingDeleteTime; }
  public CatNodesRecord setIndexingDeleteTime(String val) { this._indexingDeleteTime = val; return this; }


  private String _indexingDeleteTotal;
  public String getIndexingDeleteTotal() { return this._indexingDeleteTotal; }
  public CatNodesRecord setIndexingDeleteTotal(String val) { this._indexingDeleteTotal = val; return this; }


  private String _indexingIndexCurrent;
  public String getIndexingIndexCurrent() { return this._indexingIndexCurrent; }
  public CatNodesRecord setIndexingIndexCurrent(String val) { this._indexingIndexCurrent = val; return this; }


  private String _indexingIndexTime;
  public String getIndexingIndexTime() { return this._indexingIndexTime; }
  public CatNodesRecord setIndexingIndexTime(String val) { this._indexingIndexTime = val; return this; }


  private String _indexingIndexTotal;
  public String getIndexingIndexTotal() { return this._indexingIndexTotal; }
  public CatNodesRecord setIndexingIndexTotal(String val) { this._indexingIndexTotal = val; return this; }


  private String _ip;
  public String getIp() { return this._ip; }
  public CatNodesRecord setIp(String val) { this._ip = val; return this; }


  private String _jdk;
  public String getJdk() { return this._jdk; }
  public CatNodesRecord setJdk(String val) { this._jdk = val; return this; }


  private String _load_15m;
  public String getLoad_15m() { return this._load_15m; }
  public CatNodesRecord setLoad_15m(String val) { this._load_15m = val; return this; }


  private String _load_5m;
  public String getLoad_5m() { return this._load_5m; }
  public CatNodesRecord setLoad_5m(String val) { this._load_5m = val; return this; }


  private String _load_1m;
  public String getLoad_1m() { return this._load_1m; }
  public CatNodesRecord setLoad_1m(String val) { this._load_1m = val; return this; }


  private String _master;
  public String getMaster() { return this._master; }
  public CatNodesRecord setMaster(String val) { this._master = val; return this; }


  private String _mergesCurrent;
  public String getMergesCurrent() { return this._mergesCurrent; }
  public CatNodesRecord setMergesCurrent(String val) { this._mergesCurrent = val; return this; }


  private String _mergesCurrentDocs;
  public String getMergesCurrentDocs() { return this._mergesCurrentDocs; }
  public CatNodesRecord setMergesCurrentDocs(String val) { this._mergesCurrentDocs = val; return this; }


  private String _mergesCurrentSize;
  public String getMergesCurrentSize() { return this._mergesCurrentSize; }
  public CatNodesRecord setMergesCurrentSize(String val) { this._mergesCurrentSize = val; return this; }


  private String _mergesTotal;
  public String getMergesTotal() { return this._mergesTotal; }
  public CatNodesRecord setMergesTotal(String val) { this._mergesTotal = val; return this; }


  private String _mergesTotalDocs;
  public String getMergesTotalDocs() { return this._mergesTotalDocs; }
  public CatNodesRecord setMergesTotalDocs(String val) { this._mergesTotalDocs = val; return this; }


  private String _mergesTotalTime;
  public String getMergesTotalTime() { return this._mergesTotalTime; }
  public CatNodesRecord setMergesTotalTime(String val) { this._mergesTotalTime = val; return this; }


  private String _name;
  public String getName() { return this._name; }
  public CatNodesRecord setName(String val) { this._name = val; return this; }


  private String _nodeId;
  public String getNodeId() { return this._nodeId; }
  public CatNodesRecord setNodeId(String val) { this._nodeId = val; return this; }


  private String _nodeRole;
  public String getNodeRole() { return this._nodeRole; }
  public CatNodesRecord setNodeRole(String val) { this._nodeRole = val; return this; }


  private String _percolateCurrent;
  public String getPercolateCurrent() { return this._percolateCurrent; }
  public CatNodesRecord setPercolateCurrent(String val) { this._percolateCurrent = val; return this; }


  private String _percolateMemory;
  public String getPercolateMemory() { return this._percolateMemory; }
  public CatNodesRecord setPercolateMemory(String val) { this._percolateMemory = val; return this; }


  private String _percolateQueries;
  public String getPercolateQueries() { return this._percolateQueries; }
  public CatNodesRecord setPercolateQueries(String val) { this._percolateQueries = val; return this; }


  private String _percolateTime;
  public String getPercolateTime() { return this._percolateTime; }
  public CatNodesRecord setPercolateTime(String val) { this._percolateTime = val; return this; }


  private String _percolateTotal;
  public String getPercolateTotal() { return this._percolateTotal; }
  public CatNodesRecord setPercolateTotal(String val) { this._percolateTotal = val; return this; }


  private String _pid;
  public String getPid() { return this._pid; }
  public CatNodesRecord setPid(String val) { this._pid = val; return this; }


  private String _port;
  public String getPort() { return this._port; }
  public CatNodesRecord setPort(String val) { this._port = val; return this; }


  private String _ramCurrent;
  public String getRamCurrent() { return this._ramCurrent; }
  public CatNodesRecord setRamCurrent(String val) { this._ramCurrent = val; return this; }


  private String _ramMax;
  public String getRamMax() { return this._ramMax; }
  public CatNodesRecord setRamMax(String val) { this._ramMax = val; return this; }


  private String _ramPercent;
  public String getRamPercent() { return this._ramPercent; }
  public CatNodesRecord setRamPercent(String val) { this._ramPercent = val; return this; }


  private String _refreshTime;
  public String getRefreshTime() { return this._refreshTime; }
  public CatNodesRecord setRefreshTime(String val) { this._refreshTime = val; return this; }


  private String _refreshTotal;
  public String getRefreshTotal() { return this._refreshTotal; }
  public CatNodesRecord setRefreshTotal(String val) { this._refreshTotal = val; return this; }


  private String _searchFetchCurrent;
  public String getSearchFetchCurrent() { return this._searchFetchCurrent; }
  public CatNodesRecord setSearchFetchCurrent(String val) { this._searchFetchCurrent = val; return this; }


  private String _searchFetchTime;
  public String getSearchFetchTime() { return this._searchFetchTime; }
  public CatNodesRecord setSearchFetchTime(String val) { this._searchFetchTime = val; return this; }


  private String _searchFetchTotal;
  public String getSearchFetchTotal() { return this._searchFetchTotal; }
  public CatNodesRecord setSearchFetchTotal(String val) { this._searchFetchTotal = val; return this; }


  private String _searchOpenContexts;
  public String getSearchOpenContexts() { return this._searchOpenContexts; }
  public CatNodesRecord setSearchOpenContexts(String val) { this._searchOpenContexts = val; return this; }


  private String _searchQueryCurrent;
  public String getSearchQueryCurrent() { return this._searchQueryCurrent; }
  public CatNodesRecord setSearchQueryCurrent(String val) { this._searchQueryCurrent = val; return this; }


  private String _searchQueryTime;
  public String getSearchQueryTime() { return this._searchQueryTime; }
  public CatNodesRecord setSearchQueryTime(String val) { this._searchQueryTime = val; return this; }


  private String _searchQueryTotal;
  public String getSearchQueryTotal() { return this._searchQueryTotal; }
  public CatNodesRecord setSearchQueryTotal(String val) { this._searchQueryTotal = val; return this; }


  private String _segmentsCount;
  public String getSegmentsCount() { return this._segmentsCount; }
  public CatNodesRecord setSegmentsCount(String val) { this._segmentsCount = val; return this; }


  private String _segmentsIndexWriterMaxMemory;
  public String getSegmentsIndexWriterMaxMemory() { return this._segmentsIndexWriterMaxMemory; }
  public CatNodesRecord setSegmentsIndexWriterMaxMemory(String val) { this._segmentsIndexWriterMaxMemory = val; return this; }


  private String _segmentsIndexWriterMemory;
  public String getSegmentsIndexWriterMemory() { return this._segmentsIndexWriterMemory; }
  public CatNodesRecord setSegmentsIndexWriterMemory(String val) { this._segmentsIndexWriterMemory = val; return this; }


  private String _segmentsMemory;
  public String getSegmentsMemory() { return this._segmentsMemory; }
  public CatNodesRecord setSegmentsMemory(String val) { this._segmentsMemory = val; return this; }


  private String _segmentsVersionMapMemory;
  public String getSegmentsVersionMapMemory() { return this._segmentsVersionMapMemory; }
  public CatNodesRecord setSegmentsVersionMapMemory(String val) { this._segmentsVersionMapMemory = val; return this; }


  private String _uptime;
  public String getUptime() { return this._uptime; }
  public CatNodesRecord setUptime(String val) { this._uptime = val; return this; }


  private String _version;
  public String getVersion() { return this._version; }
  public CatNodesRecord setVersion(String val) { this._version = val; return this; }

}
