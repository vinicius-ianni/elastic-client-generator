
package org.elasticsearch.document.single.update;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_options.scripting.*;
import org.elasticsearch.search.search.source_filtering.*;
import org.elasticsearch.internal.*;
import org.elasticsearch.common.*;
import org.elasticsearch.common_abstractions.infer.join_field_routing.*;
import org.elasticsearch.common_options.time_unit.*;

public class UpdateRequest<TDocument, TPartialDocument>  {
  
  private Boolean _detectNoop;
  public Boolean getDetectNoop() { return this._detectNoop; }
  public UpdateRequest<TDocument, TPartialDocument> setDetectNoop(Boolean val) { this._detectNoop = val; return this; }


  private TPartialDocument _doc;
  public TPartialDocument getDoc() { return this._doc; }
  public UpdateRequest<TDocument, TPartialDocument> setDoc(TPartialDocument val) { this._doc = val; return this; }


  private Boolean _docAsUpsert;
  public Boolean getDocAsUpsert() { return this._docAsUpsert; }
  public UpdateRequest<TDocument, TPartialDocument> setDocAsUpsert(Boolean val) { this._docAsUpsert = val; return this; }


  private Script _script;
  public Script getScript() { return this._script; }
  public UpdateRequest<TDocument, TPartialDocument> setScript(Script val) { this._script = val; return this; }


  private Boolean _scriptedUpsert;
  public Boolean getScriptedUpsert() { return this._scriptedUpsert; }
  public UpdateRequest<TDocument, TPartialDocument> setScriptedUpsert(Boolean val) { this._scriptedUpsert = val; return this; }


  private Either<Boolean, SourceFilter> _source;
  public Either<Boolean, SourceFilter> getSource() { return this._source; }
  public UpdateRequest<TDocument, TPartialDocument> setSource(Either<Boolean, SourceFilter> val) { this._source = val; return this; }


  private TDocument _upsert;
  public TDocument getUpsert() { return this._upsert; }
  public UpdateRequest<TDocument, TPartialDocument> setUpsert(TDocument val) { this._upsert = val; return this; }


  private Long _ifPrimaryTerm;
  public Long getIfPrimaryTerm() { return this._ifPrimaryTerm; }
  public UpdateRequest<TDocument, TPartialDocument> setIfPrimaryTerm(Long val) { this._ifPrimaryTerm = val; return this; }


  private Long _ifSequenceNumber;
  public Long getIfSequenceNumber() { return this._ifSequenceNumber; }
  public UpdateRequest<TDocument, TPartialDocument> setIfSequenceNumber(Long val) { this._ifSequenceNumber = val; return this; }


  private String _lang;
  public String getLang() { return this._lang; }
  public UpdateRequest<TDocument, TPartialDocument> setLang(String val) { this._lang = val; return this; }


  private Refresh _refresh;
  public Refresh getRefresh() { return this._refresh; }
  public UpdateRequest<TDocument, TPartialDocument> setRefresh(Refresh val) { this._refresh = val; return this; }


  private Long _retryOnConflict;
  public Long getRetryOnConflict() { return this._retryOnConflict; }
  public UpdateRequest<TDocument, TPartialDocument> setRetryOnConflict(Long val) { this._retryOnConflict = val; return this; }


  private Routing _routing;
  public Routing getRouting() { return this._routing; }
  public UpdateRequest<TDocument, TPartialDocument> setRouting(Routing val) { this._routing = val; return this; }


  private Boolean _sourceEnabled;
  public Boolean getSourceEnabled() { return this._sourceEnabled; }
  public UpdateRequest<TDocument, TPartialDocument> setSourceEnabled(Boolean val) { this._sourceEnabled = val; return this; }


  private Time _timeout;
  public Time getTimeout() { return this._timeout; }
  public UpdateRequest<TDocument, TPartialDocument> setTimeout(Time val) { this._timeout = val; return this; }


  private String _waitForActiveShards;
  public String getWaitForActiveShards() { return this._waitForActiveShards; }
  public UpdateRequest<TDocument, TPartialDocument> setWaitForActiveShards(String val) { this._waitForActiveShards = val; return this; }

}
