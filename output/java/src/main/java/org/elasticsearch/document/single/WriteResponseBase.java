
package org.elasticsearch.document.single;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.document.*;
import org.elasticsearch.common_options.hit.*;

public class WriteResponseBase  {
  
  private String _id;
  public String getId() { return this._id; }
  public WriteResponseBase setId(String val) { this._id = val; return this; }


  private String _index;
  public String getIndex() { return this._index; }
  public WriteResponseBase setIndex(String val) { this._index = val; return this; }


  private Long _primaryTerm;
  public Long getPrimaryTerm() { return this._primaryTerm; }
  public WriteResponseBase setPrimaryTerm(Long val) { this._primaryTerm = val; return this; }


  private Result _result;
  public Result getResult() { return this._result; }
  public WriteResponseBase setResult(Result val) { this._result = val; return this; }


  private Long _seqNo;
  public Long getSeqNo() { return this._seqNo; }
  public WriteResponseBase setSeqNo(Long val) { this._seqNo = val; return this; }


  private ShardStatistics _shards;
  public ShardStatistics getShards() { return this._shards; }
  public WriteResponseBase setShards(ShardStatistics val) { this._shards = val; return this; }


  private String _type;
  public String getType() { return this._type; }
  public WriteResponseBase setType(String val) { this._type = val; return this; }


  private Long _version;
  public Long getVersion() { return this._version; }
  public WriteResponseBase setVersion(Long val) { this._version = val; return this; }

}
