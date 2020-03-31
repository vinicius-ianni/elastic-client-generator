
package org.elasticsearch.document.single.term_vectors;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.document.single.term_vectors.*;
import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.common_abstractions.infer.join_field_routing.*;
import org.elasticsearch.internal.*;
import org.elasticsearch.common.*;

public class TermVectorsRequest<TDocument>  {
  
  private TDocument _doc;
  public TDocument getDoc() { return this._doc; }
  public TermVectorsRequest<TDocument> setDoc(TDocument val) { this._doc = val; return this; }


  private TermVectorFilter _filter;
  public TermVectorFilter getFilter() { return this._filter; }
  public TermVectorsRequest<TDocument> setFilter(TermVectorFilter val) { this._filter = val; return this; }


  private Map<Field, String> _perFieldAnalyzer;
  public Map<Field, String> getPerFieldAnalyzer() { return this._perFieldAnalyzer; }
  public TermVectorsRequest<TDocument> setPerFieldAnalyzer(Map<Field, String> val) { this._perFieldAnalyzer = val; return this; }


  private Boolean _fieldStatistics;
  public Boolean getFieldStatistics() { return this._fieldStatistics; }
  public TermVectorsRequest<TDocument> setFieldStatistics(Boolean val) { this._fieldStatistics = val; return this; }


  private Field[] _fields;
  public Field[] getFields() { return this._fields; }
  public TermVectorsRequest<TDocument> setFields(Field[] val) { this._fields = val; return this; }


  private Boolean _offsets;
  public Boolean getOffsets() { return this._offsets; }
  public TermVectorsRequest<TDocument> setOffsets(Boolean val) { this._offsets = val; return this; }


  private Boolean _payloads;
  public Boolean getPayloads() { return this._payloads; }
  public TermVectorsRequest<TDocument> setPayloads(Boolean val) { this._payloads = val; return this; }


  private Boolean _positions;
  public Boolean getPositions() { return this._positions; }
  public TermVectorsRequest<TDocument> setPositions(Boolean val) { this._positions = val; return this; }


  private String _preference;
  public String getPreference() { return this._preference; }
  public TermVectorsRequest<TDocument> setPreference(String val) { this._preference = val; return this; }


  private Boolean _realtime;
  public Boolean getRealtime() { return this._realtime; }
  public TermVectorsRequest<TDocument> setRealtime(Boolean val) { this._realtime = val; return this; }


  private Routing _routing;
  public Routing getRouting() { return this._routing; }
  public TermVectorsRequest<TDocument> setRouting(Routing val) { this._routing = val; return this; }


  private Boolean _termStatistics;
  public Boolean getTermStatistics() { return this._termStatistics; }
  public TermVectorsRequest<TDocument> setTermStatistics(Boolean val) { this._termStatistics = val; return this; }


  private Long _version;
  public Long getVersion() { return this._version; }
  public TermVectorsRequest<TDocument> setVersion(Long val) { this._version = val; return this; }


  private VersionType _versionType;
  public VersionType getVersionType() { return this._versionType; }
  public TermVectorsRequest<TDocument> setVersionType(VersionType val) { this._versionType = val; return this; }

}
