
package org.elasticsearch.document.multiple.bulk.bulk_operation;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.id.*;
import org.elasticsearch.common_abstractions.infer.index_name.*;
import org.elasticsearch.internal.*;
import org.elasticsearch.common_abstractions.infer.join_field_routing.*;
import org.elasticsearch.common.*;

public class BulkOperation  {
  
  private Id _id;
  public Id getId() { return this._id; }
  public BulkOperation setId(Id val) { this._id = val; return this; }


  private IndexName _index;
  public IndexName getIndex() { return this._index; }
  public BulkOperation setIndex(IndexName val) { this._index = val; return this; }


  private String _operation;
  public String getOperation() { return this._operation; }
  public BulkOperation setOperation(String val) { this._operation = val; return this; }


  private Integer _retryOnConflict;
  public Integer getRetryOnConflict() { return this._retryOnConflict; }
  public BulkOperation setRetryOnConflict(Integer val) { this._retryOnConflict = val; return this; }


  private Routing _routing;
  public Routing getRouting() { return this._routing; }
  public BulkOperation setRouting(Routing val) { this._routing = val; return this; }


  private Long _version;
  public Long getVersion() { return this._version; }
  public BulkOperation setVersion(Long val) { this._version = val; return this; }


  private VersionType _versionType;
  public VersionType getVersionType() { return this._versionType; }
  public BulkOperation setVersionType(VersionType val) { this._versionType = val; return this; }

}
