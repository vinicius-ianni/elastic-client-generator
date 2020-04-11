
package org.elasticsearch.document.single.term_vectors;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;
import org.elasticsearch.document.single.term_vectors.*;
import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.common_abstractions.infer.join_field_routing.*;
import org.elasticsearch.internal.*;
import org.elasticsearch.common.*;

public class TermVectorsRequest<TDocument>  implements XContentable<TermVectorsRequest<TDocument>> {
  
  static final ParseField DOC = new ParseField("doc");
  private TDocument _doc;
  public TDocument getDoc() { return this._doc; }
  public TermVectorsRequest<TDocument> setDoc(TDocument val) { this._doc = val; return this; }


  static final ParseField FILTER = new ParseField("filter");
  private TermVectorFilter _filter;
  public TermVectorFilter getFilter() { return this._filter; }
  public TermVectorsRequest<TDocument> setFilter(TermVectorFilter val) { this._filter = val; return this; }


  static final ParseField PER_FIELD_ANALYZER = new ParseField("per_field_analyzer");
  private NamedContainer<Field, String> _perFieldAnalyzer;
  public NamedContainer<Field, String> getPerFieldAnalyzer() { return this._perFieldAnalyzer; }
  public TermVectorsRequest<TDocument> setPerFieldAnalyzer(NamedContainer<Field, String> val) { this._perFieldAnalyzer = val; return this; }


  static final ParseField FIELD_STATISTICS = new ParseField("field_statistics");
  private Boolean _fieldStatistics;
  public Boolean getFieldStatistics() { return this._fieldStatistics; }
  public TermVectorsRequest<TDocument> setFieldStatistics(Boolean val) { this._fieldStatistics = val; return this; }


  static final ParseField FIELDS = new ParseField("fields");
  private List<Field> _fields;
  public List<Field> getFields() { return this._fields; }
  public TermVectorsRequest<TDocument> setFields(List<Field> val) { this._fields = val; return this; }


  static final ParseField OFFSETS = new ParseField("offsets");
  private Boolean _offsets;
  public Boolean getOffsets() { return this._offsets; }
  public TermVectorsRequest<TDocument> setOffsets(Boolean val) { this._offsets = val; return this; }


  static final ParseField PAYLOADS = new ParseField("payloads");
  private Boolean _payloads;
  public Boolean getPayloads() { return this._payloads; }
  public TermVectorsRequest<TDocument> setPayloads(Boolean val) { this._payloads = val; return this; }


  static final ParseField POSITIONS = new ParseField("positions");
  private Boolean _positions;
  public Boolean getPositions() { return this._positions; }
  public TermVectorsRequest<TDocument> setPositions(Boolean val) { this._positions = val; return this; }


  static final ParseField PREFERENCE = new ParseField("preference");
  private String _preference;
  public String getPreference() { return this._preference; }
  public TermVectorsRequest<TDocument> setPreference(String val) { this._preference = val; return this; }


  static final ParseField REALTIME = new ParseField("realtime");
  private Boolean _realtime;
  public Boolean getRealtime() { return this._realtime; }
  public TermVectorsRequest<TDocument> setRealtime(Boolean val) { this._realtime = val; return this; }


  static final ParseField ROUTING = new ParseField("routing");
  private Routing _routing;
  public Routing getRouting() { return this._routing; }
  public TermVectorsRequest<TDocument> setRouting(Routing val) { this._routing = val; return this; }


  static final ParseField TERM_STATISTICS = new ParseField("term_statistics");
  private Boolean _termStatistics;
  public Boolean getTermStatistics() { return this._termStatistics; }
  public TermVectorsRequest<TDocument> setTermStatistics(Boolean val) { this._termStatistics = val; return this; }


  static final ParseField VERSION = new ParseField("version");
  private Long _version;
  public Long getVersion() { return this._version; }
  public TermVectorsRequest<TDocument> setVersion(Long val) { this._version = val; return this; }


  static final ParseField VERSION_TYPE = new ParseField("version_type");
  private VersionType _versionType;
  public VersionType getVersionType() { return this._versionType; }
  public TermVectorsRequest<TDocument> setVersionType(VersionType val) { this._versionType = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public TermVectorsRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return TermVectorsRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<TermVectorsRequest, Void> PARSER =
    new ConstructingObjectParser<>(TermVectorsRequest.class.getName(), false, args -> new TermVectorsRequest());

  static {
    PARSER.declareObject(TermVectorsRequest::setDoc, (p, t) -> null /* TODO TDocument */, DOC);
    PARSER.declareObject(TermVectorsRequest::setFilter, (p, t) -> TermVectorFilter.PARSER.apply(p, t), FILTER);
    PARSER.declareObject(TermVectorsRequest::setPerFieldAnalyzer, (p, t) -> new NamedContainer<>(n -> () -> new Field(n),pp -> pp.text()), PER_FIELD_ANALYZER);
    PARSER.declareBoolean(TermVectorsRequest::setFieldStatistics, FIELD_STATISTICS);
    PARSER.declareObjectArray(TermVectorsRequest::setFields, (p, t) -> Field.createFrom(p), FIELDS);
    PARSER.declareBoolean(TermVectorsRequest::setOffsets, OFFSETS);
    PARSER.declareBoolean(TermVectorsRequest::setPayloads, PAYLOADS);
    PARSER.declareBoolean(TermVectorsRequest::setPositions, POSITIONS);
    PARSER.declareString(TermVectorsRequest::setPreference, PREFERENCE);
    PARSER.declareBoolean(TermVectorsRequest::setRealtime, REALTIME);
    PARSER.declareObject(TermVectorsRequest::setRouting, (p, t) -> Routing.createFrom(p), ROUTING);
    PARSER.declareBoolean(TermVectorsRequest::setTermStatistics, TERM_STATISTICS);
    PARSER.declareLong(TermVectorsRequest::setVersion, VERSION);
    PARSER.declareObject(TermVectorsRequest::setVersionType, (p, t) -> VersionType.PARSER.apply(p), VERSION_TYPE);
  }

}
