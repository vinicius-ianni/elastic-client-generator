
package org.elasticsearch.document.multiple.multi_term_vectors;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.document.multiple.multi_term_vectors.*;
import org.elasticsearch.common_abstractions.infer.id.*;
import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.common_abstractions.infer.join_field_routing.*;
import org.elasticsearch.internal.*;
import org.elasticsearch.common.*;

public class MultiTermVectorsRequest  {
  
  private MultiTermVectorOperation[] _docs;
  public MultiTermVectorOperation[] getDocs() { return this._docs; }
  public MultiTermVectorsRequest setDocs(MultiTermVectorOperation[] val) { this._docs = val; return this; }


  private Id[] _ids;
  public Id[] getIds() { return this._ids; }
  public MultiTermVectorsRequest setIds(Id[] val) { this._ids = val; return this; }


  private Boolean _fieldStatistics;
  public Boolean getFieldStatistics() { return this._fieldStatistics; }
  public MultiTermVectorsRequest setFieldStatistics(Boolean val) { this._fieldStatistics = val; return this; }


  private Field[] _fields;
  public Field[] getFields() { return this._fields; }
  public MultiTermVectorsRequest setFields(Field[] val) { this._fields = val; return this; }


  private Boolean _offsets;
  public Boolean getOffsets() { return this._offsets; }
  public MultiTermVectorsRequest setOffsets(Boolean val) { this._offsets = val; return this; }


  private Boolean _payloads;
  public Boolean getPayloads() { return this._payloads; }
  public MultiTermVectorsRequest setPayloads(Boolean val) { this._payloads = val; return this; }


  private Boolean _positions;
  public Boolean getPositions() { return this._positions; }
  public MultiTermVectorsRequest setPositions(Boolean val) { this._positions = val; return this; }


  private String _preference;
  public String getPreference() { return this._preference; }
  public MultiTermVectorsRequest setPreference(String val) { this._preference = val; return this; }


  private Boolean _realtime;
  public Boolean getRealtime() { return this._realtime; }
  public MultiTermVectorsRequest setRealtime(Boolean val) { this._realtime = val; return this; }


  private Routing _routing;
  public Routing getRouting() { return this._routing; }
  public MultiTermVectorsRequest setRouting(Routing val) { this._routing = val; return this; }


  private Boolean _termStatistics;
  public Boolean getTermStatistics() { return this._termStatistics; }
  public MultiTermVectorsRequest setTermStatistics(Boolean val) { this._termStatistics = val; return this; }


  private Long _version;
  public Long getVersion() { return this._version; }
  public MultiTermVectorsRequest setVersion(Long val) { this._version = val; return this; }


  private VersionType _versionType;
  public VersionType getVersionType() { return this._versionType; }
  public MultiTermVectorsRequest setVersionType(VersionType val) { this._versionType = val; return this; }

}
