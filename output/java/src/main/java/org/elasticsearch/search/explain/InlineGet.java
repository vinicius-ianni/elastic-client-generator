
package org.elasticsearch.search.explain;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.lazy_document.*;

public class InlineGet<TDocument>  {
  
  private Map<String, LazyDocument> _fields;
  public Map<String, LazyDocument> getFields() { return this._fields; }
  public InlineGet<TDocument> setFields(Map<String, LazyDocument> val) { this._fields = val; return this; }


  private Boolean _found;
  public Boolean getFound() { return this._found; }
  public InlineGet<TDocument> setFound(Boolean val) { this._found = val; return this; }


  private TDocument _source;
  public TDocument getSource() { return this._source; }
  public InlineGet<TDocument> setSource(TDocument val) { this._source = val; return this; }

}
