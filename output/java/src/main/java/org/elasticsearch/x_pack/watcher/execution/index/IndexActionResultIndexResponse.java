
package org.elasticsearch.x_pack.watcher.execution.index;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.index_name.*;
import org.elasticsearch.document.*;
import org.elasticsearch.internal.*;

public class IndexActionResultIndexResponse  {
  
  private Boolean _created;
  public Boolean getCreated() { return this._created; }
  public IndexActionResultIndexResponse setCreated(Boolean val) { this._created = val; return this; }


  private String _id;
  public String getId() { return this._id; }
  public IndexActionResultIndexResponse setId(String val) { this._id = val; return this; }


  private IndexName _index;
  public IndexName getIndex() { return this._index; }
  public IndexActionResultIndexResponse setIndex(IndexName val) { this._index = val; return this; }


  private Result _result;
  public Result getResult() { return this._result; }
  public IndexActionResultIndexResponse setResult(Result val) { this._result = val; return this; }


  private Integer _version;
  public Integer getVersion() { return this._version; }
  public IndexActionResultIndexResponse setVersion(Integer val) { this._version = val; return this; }

}
