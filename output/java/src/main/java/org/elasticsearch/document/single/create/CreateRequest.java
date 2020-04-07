
package org.elasticsearch.document.single.create;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.common.*;
import org.elasticsearch.common_abstractions.infer.join_field_routing.*;
import org.elasticsearch.common_options.time_unit.*;
import org.elasticsearch.internal.*;

public class CreateRequest<TDocument>  implements XContentable<CreateRequest> {
  
  static final ParseField DOCUMENT = new ParseField("document");
  private TDocument _document;
  public TDocument getDocument() { return this._document; }
  public CreateRequest<TDocument> setDocument(TDocument val) { this._document = val; return this; }


  static final ParseField PIPELINE = new ParseField("pipeline");
  private String _pipeline;
  public String getPipeline() { return this._pipeline; }
  public CreateRequest<TDocument> setPipeline(String val) { this._pipeline = val; return this; }


  static final ParseField REFRESH = new ParseField("refresh");
  private Refresh _refresh;
  public Refresh getRefresh() { return this._refresh; }
  public CreateRequest<TDocument> setRefresh(Refresh val) { this._refresh = val; return this; }


  static final ParseField ROUTING = new ParseField("routing");
  private Routing _routing;
  public Routing getRouting() { return this._routing; }
  public CreateRequest<TDocument> setRouting(Routing val) { this._routing = val; return this; }


  static final ParseField TIMEOUT = new ParseField("timeout");
  private Time _timeout;
  public Time getTimeout() { return this._timeout; }
  public CreateRequest<TDocument> setTimeout(Time val) { this._timeout = val; return this; }


  static final ParseField VERSION = new ParseField("version");
  private Long _version;
  public Long getVersion() { return this._version; }
  public CreateRequest<TDocument> setVersion(Long val) { this._version = val; return this; }


  static final ParseField VERSION_TYPE = new ParseField("version_type");
  private VersionType _versionType;
  public VersionType getVersionType() { return this._versionType; }
  public CreateRequest<TDocument> setVersionType(VersionType val) { this._versionType = val; return this; }


  static final ParseField WAIT_FOR_ACTIVE_SHARDS = new ParseField("wait_for_active_shards");
  private String _waitForActiveShards;
  public String getWaitForActiveShards() { return this._waitForActiveShards; }
  public CreateRequest<TDocument> setWaitForActiveShards(String val) { this._waitForActiveShards = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public CreateRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return CreateRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<CreateRequest, Void> PARSER =
    new ConstructingObjectParser<>(CreateRequest.class.getName(), false, args -> new CreateRequest());

  static {
    PARSER.declareObject(CreateRequest::setDocument, (p, t) -> TDocument.PARSER.apply(p, null), DOCUMENT);
    PARSER.declareString(CreateRequest::setPipeline, PIPELINE);
    PARSER.declareObject(CreateRequest::setRefresh, (p, t) -> Refresh.PARSER.apply(p, null), REFRESH);
    PARSER.declareRouting(CreateRequest::setRouting, (p, t) -> Routing.createFrom(p), ROUTING);
    PARSER.declareObject(CreateRequest::setTimeout, (p, t) -> Time.PARSER.apply(p, null), TIMEOUT);
    PARSER.declareLong(CreateRequest::setVersion, VERSION);
    PARSER.declareObject(CreateRequest::setVersionType, (p, t) -> VersionType.PARSER.apply(p, null), VERSION_TYPE);
    PARSER.declareString(CreateRequest::setWaitForActiveShards, WAIT_FOR_ACTIVE_SHARDS);
  }

}
