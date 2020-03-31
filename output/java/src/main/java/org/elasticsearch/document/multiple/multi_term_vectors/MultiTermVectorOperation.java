
package org.elasticsearch.document.multiple.multi_term_vectors;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.document.single.term_vectors.*;
import org.elasticsearch.common_abstractions.infer.id.*;
import org.elasticsearch.common_abstractions.infer.index_name.*;
import org.elasticsearch.common_abstractions.infer.join_field_routing.*;
import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.internal.*;
import org.elasticsearch.common.*;

public class MultiTermVectorOperation  {
  
  private Object _doc;
  public Object getDoc() { return this._doc; }
  public MultiTermVectorOperation setDoc(Object val) { this._doc = val; return this; }


  private Boolean _fieldStatistics;
  public Boolean getFieldStatistics() { return this._fieldStatistics; }
  public MultiTermVectorOperation setFieldStatistics(Boolean val) { this._fieldStatistics = val; return this; }


  private TermVectorFilter _filter;
  public TermVectorFilter getFilter() { return this._filter; }
  public MultiTermVectorOperation setFilter(TermVectorFilter val) { this._filter = val; return this; }


  private Id _id;
  public Id getId() { return this._id; }
  public MultiTermVectorOperation setId(Id val) { this._id = val; return this; }


  private IndexName _index;
  public IndexName getIndex() { return this._index; }
  public MultiTermVectorOperation setIndex(IndexName val) { this._index = val; return this; }


  private Boolean _offsets;
  public Boolean getOffsets() { return this._offsets; }
  public MultiTermVectorOperation setOffsets(Boolean val) { this._offsets = val; return this; }


  private Boolean _payloads;
  public Boolean getPayloads() { return this._payloads; }
  public MultiTermVectorOperation setPayloads(Boolean val) { this._payloads = val; return this; }


  private Boolean _positions;
  public Boolean getPositions() { return this._positions; }
  public MultiTermVectorOperation setPositions(Boolean val) { this._positions = val; return this; }


  private Routing _routing;
  public Routing getRouting() { return this._routing; }
  public MultiTermVectorOperation setRouting(Routing val) { this._routing = val; return this; }


  private Field[] _fields;
  public Field[] getFields() { return this._fields; }
  public MultiTermVectorOperation setFields(Field[] val) { this._fields = val; return this; }


  private Boolean _termStatistics;
  public Boolean getTermStatistics() { return this._termStatistics; }
  public MultiTermVectorOperation setTermStatistics(Boolean val) { this._termStatistics = val; return this; }


  private Long _version;
  public Long getVersion() { return this._version; }
  public MultiTermVectorOperation setVersion(Long val) { this._version = val; return this; }


  private VersionType _versionType;
  public VersionType getVersionType() { return this._versionType; }
  public MultiTermVectorOperation setVersionType(VersionType val) { this._versionType = val; return this; }

}
