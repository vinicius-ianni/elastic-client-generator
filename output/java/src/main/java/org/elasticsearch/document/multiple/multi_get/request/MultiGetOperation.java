
package org.elasticsearch.document.multiple.multi_get.request;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.id.*;
import org.elasticsearch.common_abstractions.infer.index_name.*;
import org.elasticsearch.search.search.source_filtering.*;
import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.internal.*;
import org.elasticsearch.common.*;

public class MultiGetOperation  {
  
  private Boolean _canBeFlattened;
  public Boolean getCanBeFlattened() { return this._canBeFlattened; }
  public MultiGetOperation setCanBeFlattened(Boolean val) { this._canBeFlattened = val; return this; }


  private Id _id;
  public Id getId() { return this._id; }
  public MultiGetOperation setId(Id val) { this._id = val; return this; }


  private IndexName _index;
  public IndexName getIndex() { return this._index; }
  public MultiGetOperation setIndex(IndexName val) { this._index = val; return this; }


  private String _routing;
  public String getRouting() { return this._routing; }
  public MultiGetOperation setRouting(String val) { this._routing = val; return this; }


  private Either<Boolean, SourceFilter> _source;
  public Either<Boolean, SourceFilter> getSource() { return this._source; }
  public MultiGetOperation setSource(Either<Boolean, SourceFilter> val) { this._source = val; return this; }


  private Field[] _storedFields;
  public Field[] getStoredFields() { return this._storedFields; }
  public MultiGetOperation setStoredFields(Field[] val) { this._storedFields = val; return this; }


  private Long _version;
  public Long getVersion() { return this._version; }
  public MultiGetOperation setVersion(Long val) { this._version = val; return this; }


  private VersionType _versionType;
  public VersionType getVersionType() { return this._versionType; }
  public MultiGetOperation setVersionType(VersionType val) { this._versionType = val; return this; }

}
