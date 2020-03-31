
package org.elasticsearch.cat.cat_segments;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class CatSegmentsRecord  {
  
  private String _committed;
  public String getCommitted() { return this._committed; }
  public CatSegmentsRecord setCommitted(String val) { this._committed = val; return this; }


  private String _compound;
  public String getCompound() { return this._compound; }
  public CatSegmentsRecord setCompound(String val) { this._compound = val; return this; }


  private String _docsCount;
  public String getDocsCount() { return this._docsCount; }
  public CatSegmentsRecord setDocsCount(String val) { this._docsCount = val; return this; }


  private String _docsDeleted;
  public String getDocsDeleted() { return this._docsDeleted; }
  public CatSegmentsRecord setDocsDeleted(String val) { this._docsDeleted = val; return this; }


  private String _generation;
  public String getGeneration() { return this._generation; }
  public CatSegmentsRecord setGeneration(String val) { this._generation = val; return this; }


  private String _id;
  public String getId() { return this._id; }
  public CatSegmentsRecord setId(String val) { this._id = val; return this; }


  private String _index;
  public String getIndex() { return this._index; }
  public CatSegmentsRecord setIndex(String val) { this._index = val; return this; }


  private String _ip;
  public String getIp() { return this._ip; }
  public CatSegmentsRecord setIp(String val) { this._ip = val; return this; }


  private String _prirep;
  public String getPrirep() { return this._prirep; }
  public CatSegmentsRecord setPrirep(String val) { this._prirep = val; return this; }


  private String _searchable;
  public String getSearchable() { return this._searchable; }
  public CatSegmentsRecord setSearchable(String val) { this._searchable = val; return this; }


  private String _segment;
  public String getSegment() { return this._segment; }
  public CatSegmentsRecord setSegment(String val) { this._segment = val; return this; }


  private String _shard;
  public String getShard() { return this._shard; }
  public CatSegmentsRecord setShard(String val) { this._shard = val; return this; }


  private String _size;
  public String getSize() { return this._size; }
  public CatSegmentsRecord setSize(String val) { this._size = val; return this; }


  private String _sizeMemory;
  public String getSizeMemory() { return this._sizeMemory; }
  public CatSegmentsRecord setSizeMemory(String val) { this._sizeMemory = val; return this; }


  private String _version;
  public String getVersion() { return this._version; }
  public CatSegmentsRecord setVersion(String val) { this._version = val; return this; }

}
