
package org.elasticsearch.modules.scripting.execute_painless_script;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.index_name.*;
import org.elasticsearch.query_dsl.abstractions.container.*;

public class PainlessContextSetup  {
  
  private Object _document;
  public Object getDocument() { return this._document; }
  public PainlessContextSetup setDocument(Object val) { this._document = val; return this; }


  private IndexName _index;
  public IndexName getIndex() { return this._index; }
  public PainlessContextSetup setIndex(IndexName val) { this._index = val; return this; }


  private QueryContainer _query;
  public QueryContainer getQuery() { return this._query; }
  public PainlessContextSetup setQuery(QueryContainer val) { this._query = val; return this; }

}
