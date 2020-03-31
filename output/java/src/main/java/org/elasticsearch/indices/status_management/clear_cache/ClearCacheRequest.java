
package org.elasticsearch.indices.status_management.clear_cache;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common.*;
import org.elasticsearch.common_abstractions.infer.field.*;

public class ClearCacheRequest  {
  
  private Boolean _allowNoIndices;
  public Boolean getAllowNoIndices() { return this._allowNoIndices; }
  public ClearCacheRequest setAllowNoIndices(Boolean val) { this._allowNoIndices = val; return this; }


  private ExpandWildcards _expandWildcards;
  public ExpandWildcards getExpandWildcards() { return this._expandWildcards; }
  public ClearCacheRequest setExpandWildcards(ExpandWildcards val) { this._expandWildcards = val; return this; }


  private Boolean _fielddata;
  public Boolean getFielddata() { return this._fielddata; }
  public ClearCacheRequest setFielddata(Boolean val) { this._fielddata = val; return this; }


  private Field[] _fields;
  public Field[] getFields() { return this._fields; }
  public ClearCacheRequest setFields(Field[] val) { this._fields = val; return this; }


  private Boolean _ignoreUnavailable;
  public Boolean getIgnoreUnavailable() { return this._ignoreUnavailable; }
  public ClearCacheRequest setIgnoreUnavailable(Boolean val) { this._ignoreUnavailable = val; return this; }


  private Boolean _query;
  public Boolean getQuery() { return this._query; }
  public ClearCacheRequest setQuery(Boolean val) { this._query = val; return this; }


  private Boolean _request;
  public Boolean getRequest() { return this._request; }
  public ClearCacheRequest setRequest(Boolean val) { this._request = val; return this; }

}
