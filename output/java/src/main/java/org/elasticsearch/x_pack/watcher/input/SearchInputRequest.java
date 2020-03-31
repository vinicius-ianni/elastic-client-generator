
package org.elasticsearch.x_pack.watcher.input;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.search.search.*;
import org.elasticsearch.common_abstractions.infer.index_name.*;
import org.elasticsearch.x_pack.watcher.input.*;
import org.elasticsearch.common.*;
import org.elasticsearch.search.search_template.*;

public class SearchInputRequest  {
  
  private SearchRequest _body;
  public SearchRequest getBody() { return this._body; }
  public SearchInputRequest setBody(SearchRequest val) { this._body = val; return this; }


  private IndexName[] _indices;
  public IndexName[] getIndices() { return this._indices; }
  public SearchInputRequest setIndices(IndexName[] val) { this._indices = val; return this; }


  private IndicesOptions _indicesOptions;
  public IndicesOptions getIndicesOptions() { return this._indicesOptions; }
  public SearchInputRequest setIndicesOptions(IndicesOptions val) { this._indicesOptions = val; return this; }


  private SearchType _searchType;
  public SearchType getSearchType() { return this._searchType; }
  public SearchInputRequest setSearchType(SearchType val) { this._searchType = val; return this; }


  private SearchTemplateRequest _template;
  public SearchTemplateRequest getTemplate() { return this._template; }
  public SearchInputRequest setTemplate(SearchTemplateRequest val) { this._template = val; return this; }

}
