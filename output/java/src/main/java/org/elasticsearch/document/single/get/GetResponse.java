
package org.elasticsearch.document.single.get;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.lazy_document.*;
import org.elasticsearch.internal.*;

public class GetResponse<TDocument>  {
  
  private Map<String, LazyDocument> _fields;
  public Map<String, LazyDocument> getFields() { return this._fields; }
  public GetResponse<TDocument> setFields(Map<String, LazyDocument> val) { this._fields = val; return this; }


  private Boolean _found;
  public Boolean getFound() { return this._found; }
  public GetResponse<TDocument> setFound(Boolean val) { this._found = val; return this; }


  private String _id;
  public String getId() { return this._id; }
  public GetResponse<TDocument> setId(String val) { this._id = val; return this; }


  private String _index;
  public String getIndex() { return this._index; }
  public GetResponse<TDocument> setIndex(String val) { this._index = val; return this; }


  private Long _primaryTerm;
  public Long getPrimaryTerm() { return this._primaryTerm; }
  public GetResponse<TDocument> setPrimaryTerm(Long val) { this._primaryTerm = val; return this; }


  private String _routing;
  public String getRouting() { return this._routing; }
  public GetResponse<TDocument> setRouting(String val) { this._routing = val; return this; }


  private Long _seqNo;
  public Long getSeqNo() { return this._seqNo; }
  public GetResponse<TDocument> setSeqNo(Long val) { this._seqNo = val; return this; }


  private TDocument _source;
  public TDocument getSource() { return this._source; }
  public GetResponse<TDocument> setSource(TDocument val) { this._source = val; return this; }


  private String _type;
  public String getType() { return this._type; }
  public GetResponse<TDocument> setType(String val) { this._type = val; return this; }


  private Long _version;
  public Long getVersion() { return this._version; }
  public GetResponse<TDocument> setVersion(Long val) { this._version = val; return this; }

}
