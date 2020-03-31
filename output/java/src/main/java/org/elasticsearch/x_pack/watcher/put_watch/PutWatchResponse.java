
package org.elasticsearch.x_pack.watcher.put_watch;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class PutWatchResponse  {
  
  private Boolean _created;
  public Boolean getCreated() { return this._created; }
  public PutWatchResponse setCreated(Boolean val) { this._created = val; return this; }


  private String _id;
  public String getId() { return this._id; }
  public PutWatchResponse setId(String val) { this._id = val; return this; }


  private Integer _version;
  public Integer getVersion() { return this._version; }
  public PutWatchResponse setVersion(Integer val) { this._version = val; return this; }


  private Long _seqNo;
  public Long getSeqNo() { return this._seqNo; }
  public PutWatchResponse setSeqNo(Long val) { this._seqNo = val; return this; }


  private Long _primaryTerm;
  public Long getPrimaryTerm() { return this._primaryTerm; }
  public PutWatchResponse setPrimaryTerm(Long val) { this._primaryTerm = val; return this; }

}
