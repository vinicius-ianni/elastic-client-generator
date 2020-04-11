
package org.elasticsearch.document.single.exists;

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
import org.elasticsearch.common_abstractions.infer.join_field_routing.*;
import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.internal.*;
import org.elasticsearch.common.*;

public class DocumentExistsRequest  implements XContentable<DocumentExistsRequest> {
  
  static final ParseField PREFERENCE = new ParseField("preference");
  private String _preference;
  public String getPreference() { return this._preference; }
  public DocumentExistsRequest setPreference(String val) { this._preference = val; return this; }


  static final ParseField REALTIME = new ParseField("realtime");
  private Boolean _realtime;
  public Boolean getRealtime() { return this._realtime; }
  public DocumentExistsRequest setRealtime(Boolean val) { this._realtime = val; return this; }


  static final ParseField REFRESH = new ParseField("refresh");
  private Boolean _refresh;
  public Boolean getRefresh() { return this._refresh; }
  public DocumentExistsRequest setRefresh(Boolean val) { this._refresh = val; return this; }


  static final ParseField ROUTING = new ParseField("routing");
  private Routing _routing;
  public Routing getRouting() { return this._routing; }
  public DocumentExistsRequest setRouting(Routing val) { this._routing = val; return this; }


  static final ParseField SOURCE_ENABLED = new ParseField("source_enabled");
  private Boolean _sourceEnabled;
  public Boolean getSourceEnabled() { return this._sourceEnabled; }
  public DocumentExistsRequest setSourceEnabled(Boolean val) { this._sourceEnabled = val; return this; }


  static final ParseField SOURCE_EXCLUDES = new ParseField("source_excludes");
  private List<Field> _sourceExcludes;
  public List<Field> getSourceExcludes() { return this._sourceExcludes; }
  public DocumentExistsRequest setSourceExcludes(List<Field> val) { this._sourceExcludes = val; return this; }


  static final ParseField SOURCE_INCLUDES = new ParseField("source_includes");
  private List<Field> _sourceIncludes;
  public List<Field> getSourceIncludes() { return this._sourceIncludes; }
  public DocumentExistsRequest setSourceIncludes(List<Field> val) { this._sourceIncludes = val; return this; }


  static final ParseField STORED_FIELDS = new ParseField("stored_fields");
  private List<Field> _storedFields;
  public List<Field> getStoredFields() { return this._storedFields; }
  public DocumentExistsRequest setStoredFields(List<Field> val) { this._storedFields = val; return this; }


  static final ParseField VERSION = new ParseField("version");
  private Long _version;
  public Long getVersion() { return this._version; }
  public DocumentExistsRequest setVersion(Long val) { this._version = val; return this; }


  static final ParseField VERSION_TYPE = new ParseField("version_type");
  private VersionType _versionType;
  public VersionType getVersionType() { return this._versionType; }
  public DocumentExistsRequest setVersionType(VersionType val) { this._versionType = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public DocumentExistsRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return DocumentExistsRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<DocumentExistsRequest, Void> PARSER =
    new ConstructingObjectParser<>(DocumentExistsRequest.class.getName(), false, args -> new DocumentExistsRequest());

  static {
    PARSER.declareString(DocumentExistsRequest::setPreference, PREFERENCE);
    PARSER.declareBoolean(DocumentExistsRequest::setRealtime, REALTIME);
    PARSER.declareBoolean(DocumentExistsRequest::setRefresh, REFRESH);
    PARSER.declareObject(DocumentExistsRequest::setRouting, (p, t) -> Routing.createFrom(p), ROUTING);
    PARSER.declareBoolean(DocumentExistsRequest::setSourceEnabled, SOURCE_ENABLED);
    PARSER.declareObjectArray(DocumentExistsRequest::setSourceExcludes, (p, t) -> Field.createFrom(p), SOURCE_EXCLUDES);
    PARSER.declareObjectArray(DocumentExistsRequest::setSourceIncludes, (p, t) -> Field.createFrom(p), SOURCE_INCLUDES);
    PARSER.declareObjectArray(DocumentExistsRequest::setStoredFields, (p, t) -> Field.createFrom(p), STORED_FIELDS);
    PARSER.declareLong(DocumentExistsRequest::setVersion, VERSION);
    PARSER.declareObject(DocumentExistsRequest::setVersionType, (p, t) -> VersionType.PARSER.apply(p), VERSION_TYPE);
  }

}
