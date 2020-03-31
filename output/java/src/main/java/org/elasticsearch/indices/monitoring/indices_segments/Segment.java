
package org.elasticsearch.indices.monitoring.indices_segments;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class Segment  {
  
  private Map<String, String> _attributes;
  public Map<String, String> getAttributes() { return this._attributes; }
  public Segment setAttributes(Map<String, String> val) { this._attributes = val; return this; }


  private Boolean _committed;
  public Boolean getCommitted() { return this._committed; }
  public Segment setCommitted(Boolean val) { this._committed = val; return this; }


  private Boolean _compound;
  public Boolean getCompound() { return this._compound; }
  public Segment setCompound(Boolean val) { this._compound = val; return this; }


  private Long _deletedDocs;
  public Long getDeletedDocs() { return this._deletedDocs; }
  public Segment setDeletedDocs(Long val) { this._deletedDocs = val; return this; }


  private Integer _generation;
  public Integer getGeneration() { return this._generation; }
  public Segment setGeneration(Integer val) { this._generation = val; return this; }


  private Double _memoryInBytes;
  public Double getMemoryInBytes() { return this._memoryInBytes; }
  public Segment setMemoryInBytes(Double val) { this._memoryInBytes = val; return this; }


  private Boolean _search;
  public Boolean getSearch() { return this._search; }
  public Segment setSearch(Boolean val) { this._search = val; return this; }


  private Double _sizeInBytes;
  public Double getSizeInBytes() { return this._sizeInBytes; }
  public Segment setSizeInBytes(Double val) { this._sizeInBytes = val; return this; }


  private Long _numDocs;
  public Long getNumDocs() { return this._numDocs; }
  public Segment setNumDocs(Long val) { this._numDocs = val; return this; }


  private String _version;
  public String getVersion() { return this._version; }
  public Segment setVersion(String val) { this._version = val; return this; }

}
