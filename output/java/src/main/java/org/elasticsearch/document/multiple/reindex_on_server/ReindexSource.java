
package org.elasticsearch.document.multiple.reindex_on_server;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.indices.*;
import org.elasticsearch.query_dsl.abstractions.container.*;
import org.elasticsearch.document.multiple.reindex_on_server.*;
import org.elasticsearch.internal.*;
import org.elasticsearch.search.scroll.scroll.*;
import org.elasticsearch.search.search.sort.*;
import org.elasticsearch.common_abstractions.infer.field.*;

public class ReindexSource  {
  
  private Indices _index;
  public Indices getIndex() { return this._index; }
  public ReindexSource setIndex(Indices val) { this._index = val; return this; }


  private QueryContainer _query;
  public QueryContainer getQuery() { return this._query; }
  public ReindexSource setQuery(QueryContainer val) { this._query = val; return this; }


  private RemoteSource _remote;
  public RemoteSource getRemote() { return this._remote; }
  public ReindexSource setRemote(RemoteSource val) { this._remote = val; return this; }


  private Integer _size;
  public Integer getSize() { return this._size; }
  public ReindexSource setSize(Integer val) { this._size = val; return this; }


  private SlicedScroll _slice;
  public SlicedScroll getSlice() { return this._slice; }
  public ReindexSource setSlice(SlicedScroll val) { this._slice = val; return this; }


  private Sort[] _sort;
  public Sort[] getSort() { return this._sort; }
  public ReindexSource setSort(Sort[] val) { this._sort = val; return this; }


  private Field[] _source;
  public Field[] getSource() { return this._source; }
  public ReindexSource setSource(Field[] val) { this._source = val; return this; }

}
