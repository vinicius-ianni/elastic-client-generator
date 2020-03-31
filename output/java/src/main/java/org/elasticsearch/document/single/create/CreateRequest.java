
package org.elasticsearch.document.single.create;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common.*;
import org.elasticsearch.common_abstractions.infer.join_field_routing.*;
import org.elasticsearch.common_options.time_unit.*;
import org.elasticsearch.internal.*;

public class CreateRequest<TDocument>  {
  
  private TDocument _document;
  public TDocument getDocument() { return this._document; }
  public CreateRequest<TDocument> setDocument(TDocument val) { this._document = val; return this; }


  private String _pipeline;
  public String getPipeline() { return this._pipeline; }
  public CreateRequest<TDocument> setPipeline(String val) { this._pipeline = val; return this; }


  private Refresh _refresh;
  public Refresh getRefresh() { return this._refresh; }
  public CreateRequest<TDocument> setRefresh(Refresh val) { this._refresh = val; return this; }


  private Routing _routing;
  public Routing getRouting() { return this._routing; }
  public CreateRequest<TDocument> setRouting(Routing val) { this._routing = val; return this; }


  private Time _timeout;
  public Time getTimeout() { return this._timeout; }
  public CreateRequest<TDocument> setTimeout(Time val) { this._timeout = val; return this; }


  private Long _version;
  public Long getVersion() { return this._version; }
  public CreateRequest<TDocument> setVersion(Long val) { this._version = val; return this; }


  private VersionType _versionType;
  public VersionType getVersionType() { return this._versionType; }
  public CreateRequest<TDocument> setVersionType(VersionType val) { this._versionType = val; return this; }


  private String _waitForActiveShards;
  public String getWaitForActiveShards() { return this._waitForActiveShards; }
  public CreateRequest<TDocument> setWaitForActiveShards(String val) { this._waitForActiveShards = val; return this; }

}
