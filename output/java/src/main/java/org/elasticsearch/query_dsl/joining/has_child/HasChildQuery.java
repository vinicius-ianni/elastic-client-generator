
package org.elasticsearch.query_dsl.joining.has_child;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.search.search.inner_hits.*;
import org.elasticsearch.internal.*;
import org.elasticsearch.query_dsl.abstractions.container.*;
import org.elasticsearch.query_dsl.joining.has_child.*;
import org.elasticsearch.common_abstractions.infer.relation_name.*;

public class HasChildQuery  {
  
  private Boolean _ignoreUnmapped;
  public Boolean getIgnoreUnmapped() { return this._ignoreUnmapped; }
  public HasChildQuery setIgnoreUnmapped(Boolean val) { this._ignoreUnmapped = val; return this; }


  private InnerHits _innerHits;
  public InnerHits getInnerHits() { return this._innerHits; }
  public HasChildQuery setInnerHits(InnerHits val) { this._innerHits = val; return this; }


  private Integer _maxChildren;
  public Integer getMaxChildren() { return this._maxChildren; }
  public HasChildQuery setMaxChildren(Integer val) { this._maxChildren = val; return this; }


  private Integer _minChildren;
  public Integer getMinChildren() { return this._minChildren; }
  public HasChildQuery setMinChildren(Integer val) { this._minChildren = val; return this; }


  private QueryContainer _query;
  public QueryContainer getQuery() { return this._query; }
  public HasChildQuery setQuery(QueryContainer val) { this._query = val; return this; }


  private ChildScoreMode _scoreMode;
  public ChildScoreMode getScoreMode() { return this._scoreMode; }
  public HasChildQuery setScoreMode(ChildScoreMode val) { this._scoreMode = val; return this; }


  private RelationName _type;
  public RelationName getType() { return this._type; }
  public HasChildQuery setType(RelationName val) { this._type = val; return this; }

}
