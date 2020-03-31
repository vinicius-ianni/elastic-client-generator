
package org.elasticsearch.document.multiple;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common.*;
import org.elasticsearch.internal.*;

public class BulkIndexByScrollFailure  {
  
  private MainError _cause;
  public MainError getCause() { return this._cause; }
  public BulkIndexByScrollFailure setCause(MainError val) { this._cause = val; return this; }


  private String _id;
  public String getId() { return this._id; }
  public BulkIndexByScrollFailure setId(String val) { this._id = val; return this; }


  private String _index;
  public String getIndex() { return this._index; }
  public BulkIndexByScrollFailure setIndex(String val) { this._index = val; return this; }


  private Integer _status;
  public Integer getStatus() { return this._status; }
  public BulkIndexByScrollFailure setStatus(Integer val) { this._status = val; return this; }


  private String _type;
  public String getType() { return this._type; }
  public BulkIndexByScrollFailure setType(String val) { this._type = val; return this; }

}
