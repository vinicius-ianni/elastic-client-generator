
package org.elasticsearch.search.search.hits;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class HitMetadata<TDocument>  {
  
  private String _id;
  public String getId() { return this._id; }
  public HitMetadata<TDocument> setId(String val) { this._id = val; return this; }


  private String _index;
  public String getIndex() { return this._index; }
  public HitMetadata<TDocument> setIndex(String val) { this._index = val; return this; }


  private Long _primaryTerm;
  public Long getPrimaryTerm() { return this._primaryTerm; }
  public HitMetadata<TDocument> setPrimaryTerm(Long val) { this._primaryTerm = val; return this; }


  private String _routing;
  public String getRouting() { return this._routing; }
  public HitMetadata<TDocument> setRouting(String val) { this._routing = val; return this; }


  private Long _seqNo;
  public Long getSeqNo() { return this._seqNo; }
  public HitMetadata<TDocument> setSeqNo(Long val) { this._seqNo = val; return this; }


  private TDocument _source;
  public TDocument getSource() { return this._source; }
  public HitMetadata<TDocument> setSource(TDocument val) { this._source = val; return this; }


  private String _type;
  public String getType() { return this._type; }
  public HitMetadata<TDocument> setType(String val) { this._type = val; return this; }


  private Long _version;
  public Long getVersion() { return this._version; }
  public HitMetadata<TDocument> setVersion(Long val) { this._version = val; return this; }

}
