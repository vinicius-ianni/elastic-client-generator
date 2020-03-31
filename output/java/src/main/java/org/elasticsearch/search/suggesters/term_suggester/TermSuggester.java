
package org.elasticsearch.search.suggesters.term_suggester;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.search.suggesters.term_suggester.*;
import org.elasticsearch.common.*;

public class TermSuggester  {
  
  private Boolean _lowercaseTerms;
  public Boolean getLowercaseTerms() { return this._lowercaseTerms; }
  public TermSuggester setLowercaseTerms(Boolean val) { this._lowercaseTerms = val; return this; }


  private Integer _maxEdits;
  public Integer getMaxEdits() { return this._maxEdits; }
  public TermSuggester setMaxEdits(Integer val) { this._maxEdits = val; return this; }


  private Integer _maxInspections;
  public Integer getMaxInspections() { return this._maxInspections; }
  public TermSuggester setMaxInspections(Integer val) { this._maxInspections = val; return this; }


  private Float _maxTermFreq;
  public Float getMaxTermFreq() { return this._maxTermFreq; }
  public TermSuggester setMaxTermFreq(Float val) { this._maxTermFreq = val; return this; }


  private Float _minDocFreq;
  public Float getMinDocFreq() { return this._minDocFreq; }
  public TermSuggester setMinDocFreq(Float val) { this._minDocFreq = val; return this; }


  private Integer _minWordLength;
  public Integer getMinWordLength() { return this._minWordLength; }
  public TermSuggester setMinWordLength(Integer val) { this._minWordLength = val; return this; }


  private Integer _prefixLength;
  public Integer getPrefixLength() { return this._prefixLength; }
  public TermSuggester setPrefixLength(Integer val) { this._prefixLength = val; return this; }


  private Integer _shardSize;
  public Integer getShardSize() { return this._shardSize; }
  public TermSuggester setShardSize(Integer val) { this._shardSize = val; return this; }


  private SuggestSort _sort;
  public SuggestSort getSort() { return this._sort; }
  public TermSuggester setSort(SuggestSort val) { this._sort = val; return this; }


  private StringDistance _stringDistance;
  public StringDistance getStringDistance() { return this._stringDistance; }
  public TermSuggester setStringDistance(StringDistance val) { this._stringDistance = val; return this; }


  private SuggestMode _suggestMode;
  public SuggestMode getSuggestMode() { return this._suggestMode; }
  public TermSuggester setSuggestMode(SuggestMode val) { this._suggestMode = val; return this; }


  private String _text;
  public String getText() { return this._text; }
  public TermSuggester setText(String val) { this._text = val; return this; }

}
