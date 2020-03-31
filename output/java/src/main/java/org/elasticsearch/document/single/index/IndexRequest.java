
package org.elasticsearch.document.single.index;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.common.*;
import org.elasticsearch.common_abstractions.infer.join_field_routing.*;
import org.elasticsearch.common_options.time_unit.*;

public class IndexRequest<TDocument>  {
  
  private TDocument _document;
  public TDocument getDocument() { return this._document; }
  public IndexRequest<TDocument> setDocument(TDocument val) { this._document = val; return this; }


  private Long _ifPrimaryTerm;
  public Long getIfPrimaryTerm() { return this._ifPrimaryTerm; }
  public IndexRequest<TDocument> setIfPrimaryTerm(Long val) { this._ifPrimaryTerm = val; return this; }


  private Long _ifSequenceNumber;
  public Long getIfSequenceNumber() { return this._ifSequenceNumber; }
  public IndexRequest<TDocument> setIfSequenceNumber(Long val) { this._ifSequenceNumber = val; return this; }


  private OpType _opType;
  public OpType getOpType() { return this._opType; }
  public IndexRequest<TDocument> setOpType(OpType val) { this._opType = val; return this; }


  private String _pipeline;
  public String getPipeline() { return this._pipeline; }
  public IndexRequest<TDocument> setPipeline(String val) { this._pipeline = val; return this; }


  private Refresh _refresh;
  public Refresh getRefresh() { return this._refresh; }
  public IndexRequest<TDocument> setRefresh(Refresh val) { this._refresh = val; return this; }


  private Routing _routing;
  public Routing getRouting() { return this._routing; }
  public IndexRequest<TDocument> setRouting(Routing val) { this._routing = val; return this; }


  private Time _timeout;
  public Time getTimeout() { return this._timeout; }
  public IndexRequest<TDocument> setTimeout(Time val) { this._timeout = val; return this; }


  private Long _version;
  public Long getVersion() { return this._version; }
  public IndexRequest<TDocument> setVersion(Long val) { this._version = val; return this; }


  private VersionType _versionType;
  public VersionType getVersionType() { return this._versionType; }
  public IndexRequest<TDocument> setVersionType(VersionType val) { this._versionType = val; return this; }


  private String _waitForActiveShards;
  public String getWaitForActiveShards() { return this._waitForActiveShards; }
  public IndexRequest<TDocument> setWaitForActiveShards(String val) { this._waitForActiveShards = val; return this; }

}
