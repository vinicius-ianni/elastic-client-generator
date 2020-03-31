
package org.elasticsearch.search.suggesters;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.search.suggesters.context_suggester.*;
import org.elasticsearch.internal.*;
import org.elasticsearch.common_abstractions.lazy_document.*;
import org.elasticsearch.common_abstractions.infer.index_name.*;

public class SuggestOption<TDocument>  {
  
  private Boolean _collateMatch;
  public Boolean getCollateMatch() { return this._collateMatch; }
  public SuggestOption<TDocument> setCollateMatch(Boolean val) { this._collateMatch = val; return this; }


  private Map<String, Context[]> _contexts;
  public Map<String, Context[]> getContexts() { return this._contexts; }
  public SuggestOption<TDocument> setContexts(Map<String, Context[]> val) { this._contexts = val; return this; }


  private Double _score;
  public Double getScore() { return this._score; }
  public SuggestOption<TDocument> setScore(Double val) { this._score = val; return this; }


  private Map<String, LazyDocument> _fields;
  public Map<String, LazyDocument> getFields() { return this._fields; }
  public SuggestOption<TDocument> setFields(Map<String, LazyDocument> val) { this._fields = val; return this; }


  private Long _freq;
  public Long getFreq() { return this._freq; }
  public SuggestOption<TDocument> setFreq(Long val) { this._freq = val; return this; }


  private String _highlighted;
  public String getHighlighted() { return this._highlighted; }
  public SuggestOption<TDocument> setHighlighted(String val) { this._highlighted = val; return this; }


  private String _id;
  public String getId() { return this._id; }
  public SuggestOption<TDocument> setId(String val) { this._id = val; return this; }


  private IndexName _index;
  public IndexName getIndex() { return this._index; }
  public SuggestOption<TDocument> setIndex(IndexName val) { this._index = val; return this; }


  private Double _score;
  public Double getScore() { return this._score; }
  public SuggestOption<TDocument> setScore(Double val) { this._score = val; return this; }


  private TDocument _source;
  public TDocument getSource() { return this._source; }
  public SuggestOption<TDocument> setSource(TDocument val) { this._source = val; return this; }


  private String _text;
  public String getText() { return this._text; }
  public SuggestOption<TDocument> setText(String val) { this._text = val; return this; }

}
