
package org.elasticsearch.document.multiple.multi_get.response;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common.*;
import org.elasticsearch.internal.*;

public class MultiGetHit<TDocument>  {
  
  private MainError _error;
  public MainError getError() { return this._error; }
  public MultiGetHit<TDocument> setError(MainError val) { this._error = val; return this; }


  private Boolean _found;
  public Boolean getFound() { return this._found; }
  public MultiGetHit<TDocument> setFound(Boolean val) { this._found = val; return this; }


  private String _id;
  public String getId() { return this._id; }
  public MultiGetHit<TDocument> setId(String val) { this._id = val; return this; }


  private String _index;
  public String getIndex() { return this._index; }
  public MultiGetHit<TDocument> setIndex(String val) { this._index = val; return this; }


  private String _routing;
  public String getRouting() { return this._routing; }
  public MultiGetHit<TDocument> setRouting(String val) { this._routing = val; return this; }


  private TDocument _source;
  public TDocument getSource() { return this._source; }
  public MultiGetHit<TDocument> setSource(TDocument val) { this._source = val; return this; }


  private String _type;
  public String getType() { return this._type; }
  public MultiGetHit<TDocument> setType(String val) { this._type = val; return this; }


  private Long _version;
  public Long getVersion() { return this._version; }
  public MultiGetHit<TDocument> setVersion(Long val) { this._version = val; return this; }


  private Long _sequenceNumber;
  public Long getSequenceNumber() { return this._sequenceNumber; }
  public MultiGetHit<TDocument> setSequenceNumber(Long val) { this._sequenceNumber = val; return this; }


  private Long _primaryTerm;
  public Long getPrimaryTerm() { return this._primaryTerm; }
  public MultiGetHit<TDocument> setPrimaryTerm(Long val) { this._primaryTerm = val; return this; }

}
