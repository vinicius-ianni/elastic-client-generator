
package org.elasticsearch.query_dsl.joining.has_parent;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.search.search.inner_hits.*;
import org.elasticsearch.common_abstractions.infer.relation_name.*;
import org.elasticsearch.query_dsl.abstractions.container.*;

public class HasParentQuery  {
  
  private Boolean _ignoreUnmapped;
  public Boolean getIgnoreUnmapped() { return this._ignoreUnmapped; }
  public HasParentQuery setIgnoreUnmapped(Boolean val) { this._ignoreUnmapped = val; return this; }


  private InnerHits _innerHits;
  public InnerHits getInnerHits() { return this._innerHits; }
  public HasParentQuery setInnerHits(InnerHits val) { this._innerHits = val; return this; }


  private RelationName _parentType;
  public RelationName getParentType() { return this._parentType; }
  public HasParentQuery setParentType(RelationName val) { this._parentType = val; return this; }


  private QueryContainer _query;
  public QueryContainer getQuery() { return this._query; }
  public HasParentQuery setQuery(QueryContainer val) { this._query = val; return this; }


  private Boolean _score;
  public Boolean getScore() { return this._score; }
  public HasParentQuery setScore(Boolean val) { this._score = val; return this; }

}
