
package org.elasticsearch.document.multiple.multi_get.request;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.document.multiple.multi_get.request.*;
import org.elasticsearch.common_abstractions.infer.join_field_routing.*;

public class MultiGetRequest  implements XContentable<MultiGetRequest> {
  
  static final ParseField STORED_FIELDS = new ParseField("stored_fields");
  private List<Field> _storedFields;
  public List<Field> getStoredFields() { return this._storedFields; }
  public MultiGetRequest setStoredFields(List<Field> val) { this._storedFields = val; return this; }


  static final ParseField DOCS = new ParseField("docs");
  private List<MultiGetOperation> _docs;
  public List<MultiGetOperation> getDocs() { return this._docs; }
  public MultiGetRequest setDocs(List<MultiGetOperation> val) { this._docs = val; return this; }


  static final ParseField PREFERENCE = new ParseField("preference");
  private String _preference;
  public String getPreference() { return this._preference; }
  public MultiGetRequest setPreference(String val) { this._preference = val; return this; }


  static final ParseField REALTIME = new ParseField("realtime");
  private Boolean _realtime;
  public Boolean getRealtime() { return this._realtime; }
  public MultiGetRequest setRealtime(Boolean val) { this._realtime = val; return this; }


  static final ParseField REFRESH = new ParseField("refresh");
  private Boolean _refresh;
  public Boolean getRefresh() { return this._refresh; }
  public MultiGetRequest setRefresh(Boolean val) { this._refresh = val; return this; }


  static final ParseField ROUTING = new ParseField("routing");
  private Routing _routing;
  public Routing getRouting() { return this._routing; }
  public MultiGetRequest setRouting(Routing val) { this._routing = val; return this; }


  static final ParseField SOURCE_ENABLED = new ParseField("source_enabled");
  private Boolean _sourceEnabled;
  public Boolean getSourceEnabled() { return this._sourceEnabled; }
  public MultiGetRequest setSourceEnabled(Boolean val) { this._sourceEnabled = val; return this; }


  static final ParseField SOURCE_EXCLUDES = new ParseField("source_excludes");
  private List<Field> _sourceExcludes;
  public List<Field> getSourceExcludes() { return this._sourceExcludes; }
  public MultiGetRequest setSourceExcludes(List<Field> val) { this._sourceExcludes = val; return this; }


  static final ParseField SOURCE_INCLUDES = new ParseField("source_includes");
  private List<Field> _sourceIncludes;
  public List<Field> getSourceIncludes() { return this._sourceIncludes; }
  public MultiGetRequest setSourceIncludes(List<Field> val) { this._sourceIncludes = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public MultiGetRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return MultiGetRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<MultiGetRequest, Void> PARSER =
    new ConstructingObjectParser<>(MultiGetRequest.class.getName(), false, args -> new MultiGetRequest());

  static {
    PARSER.declareObjectArray(MultiGetRequest::setStoredFields, (p, t) -> Field.PARSER.apply(p), STORED_FIELDS);
    PARSER.declareObjectArray(MultiGetRequest::setDocs, (p, t) -> MultiGetOperation.PARSER.apply(p), DOCS);
    PARSER.declareString(MultiGetRequest::setPreference, PREFERENCE);
    PARSER.declareBoolean(MultiGetRequest::setRealtime, REALTIME);
    PARSER.declareBoolean(MultiGetRequest::setRefresh, REFRESH);
    PARSER.declareRouting(MultiGetRequest::setRouting, (p, t) -> Routing.createFrom(p), ROUTING);
    PARSER.declareBoolean(MultiGetRequest::setSourceEnabled, SOURCE_ENABLED);
    PARSER.declareObjectArray(MultiGetRequest::setSourceExcludes, (p, t) -> Field.PARSER.apply(p), SOURCE_EXCLUDES);
    PARSER.declareObjectArray(MultiGetRequest::setSourceIncludes, (p, t) -> Field.PARSER.apply(p), SOURCE_INCLUDES);
  }

}
