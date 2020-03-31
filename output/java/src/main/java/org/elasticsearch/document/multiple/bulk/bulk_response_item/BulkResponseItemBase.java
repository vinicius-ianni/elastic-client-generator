
package org.elasticsearch.document.multiple.bulk.bulk_response_item;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common.*;
import org.elasticsearch.internal.*;
import org.elasticsearch.common_options.hit.*;

public class BulkResponseItemBase  {
  
  private MainError _error;
  public MainError getError() { return this._error; }
  public BulkResponseItemBase setError(MainError val) { this._error = val; return this; }


  private String _id;
  public String getId() { return this._id; }
  public BulkResponseItemBase setId(String val) { this._id = val; return this; }


  private String _index;
  public String getIndex() { return this._index; }
  public BulkResponseItemBase setIndex(String val) { this._index = val; return this; }


  private String _operation;
  public String getOperation() { return this._operation; }
  public BulkResponseItemBase setOperation(String val) { this._operation = val; return this; }


  private Long _primaryTerm;
  public Long getPrimaryTerm() { return this._primaryTerm; }
  public BulkResponseItemBase setPrimaryTerm(Long val) { this._primaryTerm = val; return this; }


  private String _result;
  public String getResult() { return this._result; }
  public BulkResponseItemBase setResult(String val) { this._result = val; return this; }


  private Long _seqNo;
  public Long getSeqNo() { return this._seqNo; }
  public BulkResponseItemBase setSeqNo(Long val) { this._seqNo = val; return this; }


  private ShardStatistics _shards;
  public ShardStatistics getShards() { return this._shards; }
  public BulkResponseItemBase setShards(ShardStatistics val) { this._shards = val; return this; }


  private Integer _status;
  public Integer getStatus() { return this._status; }
  public BulkResponseItemBase setStatus(Integer val) { this._status = val; return this; }


  private String _type;
  public String getType() { return this._type; }
  public BulkResponseItemBase setType(String val) { this._type = val; return this; }


  private Long _version;
  public Long getVersion() { return this._version; }
  public BulkResponseItemBase setVersion(Long val) { this._version = val; return this; }


  private Boolean _isValid;
  public Boolean getIsValid() { return this._isValid; }
  public BulkResponseItemBase setIsValid(Boolean val) { this._isValid = val; return this; }

}
