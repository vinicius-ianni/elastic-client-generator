
package org.elasticsearch.search.search.hits;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.search.explain.*;
import org.elasticsearch.common_abstractions.lazy_document.*;
import org.elasticsearch.search.search.hits.*;
import org.elasticsearch.internal.*;

public class Hit<TDocument>  {
  
  private Explanation _explanation;
  public Explanation getExplanation() { return this._explanation; }
  public Hit<TDocument> setExplanation(Explanation val) { this._explanation = val; return this; }


  private Map<String, LazyDocument> _fields;
  public Map<String, LazyDocument> getFields() { return this._fields; }
  public Hit<TDocument> setFields(Map<String, LazyDocument> val) { this._fields = val; return this; }


  private Map<String, String[]> _highlight;
  public Map<String, String[]> getHighlight() { return this._highlight; }
  public Hit<TDocument> setHighlight(Map<String, String[]> val) { this._highlight = val; return this; }


  private Map<String, InnerHitsResult> _innerHits;
  public Map<String, InnerHitsResult> getInnerHits() { return this._innerHits; }
  public Hit<TDocument> setInnerHits(Map<String, InnerHitsResult> val) { this._innerHits = val; return this; }


  private String[] _matchedQueries;
  public String[] getMatchedQueries() { return this._matchedQueries; }
  public Hit<TDocument> setMatchedQueries(String[] val) { this._matchedQueries = val; return this; }


  private NestedIdentity _nested;
  public NestedIdentity getNested() { return this._nested; }
  public Hit<TDocument> setNested(NestedIdentity val) { this._nested = val; return this; }


  private Double _score;
  public Double getScore() { return this._score; }
  public Hit<TDocument> setScore(Double val) { this._score = val; return this; }


  private Object[] _sort;
  public Object[] getSort() { return this._sort; }
  public Hit<TDocument> setSort(Object[] val) { this._sort = val; return this; }

}
