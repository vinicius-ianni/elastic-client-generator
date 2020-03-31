
package org.elasticsearch.query_dsl.specialized.more_like_this;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;
import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.query_dsl.specialized.more_like_this.like.*;
import org.elasticsearch.common_options.minimum_should_match.*;
import org.elasticsearch.common_abstractions.infer.join_field_routing.*;
import org.elasticsearch.analysis.*;
import org.elasticsearch.common.*;

public class MoreLikeThisQuery  {
  
  private String _analyzer;
  public String getAnalyzer() { return this._analyzer; }
  public MoreLikeThisQuery setAnalyzer(String val) { this._analyzer = val; return this; }


  private Double _boostTerms;
  public Double getBoostTerms() { return this._boostTerms; }
  public MoreLikeThisQuery setBoostTerms(Double val) { this._boostTerms = val; return this; }


  private Field[] _fields;
  public Field[] getFields() { return this._fields; }
  public MoreLikeThisQuery setFields(Field[] val) { this._fields = val; return this; }


  private Boolean _include;
  public Boolean getInclude() { return this._include; }
  public MoreLikeThisQuery setInclude(Boolean val) { this._include = val; return this; }


  private Like[] _like;
  public Like[] getLike() { return this._like; }
  public MoreLikeThisQuery setLike(Like[] val) { this._like = val; return this; }


  private Integer _maxDocFreq;
  public Integer getMaxDocFreq() { return this._maxDocFreq; }
  public MoreLikeThisQuery setMaxDocFreq(Integer val) { this._maxDocFreq = val; return this; }


  private Integer _maxQueryTerms;
  public Integer getMaxQueryTerms() { return this._maxQueryTerms; }
  public MoreLikeThisQuery setMaxQueryTerms(Integer val) { this._maxQueryTerms = val; return this; }


  private Integer _maxWordLength;
  public Integer getMaxWordLength() { return this._maxWordLength; }
  public MoreLikeThisQuery setMaxWordLength(Integer val) { this._maxWordLength = val; return this; }


  private Integer _minDocFreq;
  public Integer getMinDocFreq() { return this._minDocFreq; }
  public MoreLikeThisQuery setMinDocFreq(Integer val) { this._minDocFreq = val; return this; }


  private MinimumShouldMatch _minimumShouldMatch;
  public MinimumShouldMatch getMinimumShouldMatch() { return this._minimumShouldMatch; }
  public MoreLikeThisQuery setMinimumShouldMatch(MinimumShouldMatch val) { this._minimumShouldMatch = val; return this; }


  private Integer _minTermFreq;
  public Integer getMinTermFreq() { return this._minTermFreq; }
  public MoreLikeThisQuery setMinTermFreq(Integer val) { this._minTermFreq = val; return this; }


  private Integer _minWordLength;
  public Integer getMinWordLength() { return this._minWordLength; }
  public MoreLikeThisQuery setMinWordLength(Integer val) { this._minWordLength = val; return this; }


  private Map<Field, String> _perFieldAnalyzer;
  public Map<Field, String> getPerFieldAnalyzer() { return this._perFieldAnalyzer; }
  public MoreLikeThisQuery setPerFieldAnalyzer(Map<Field, String> val) { this._perFieldAnalyzer = val; return this; }


  private Routing _routing;
  public Routing getRouting() { return this._routing; }
  public MoreLikeThisQuery setRouting(Routing val) { this._routing = val; return this; }


  private StopWords _stopWords;
  public StopWords getStopWords() { return this._stopWords; }
  public MoreLikeThisQuery setStopWords(StopWords val) { this._stopWords = val; return this; }


  private Like[] _unlike;
  public Like[] getUnlike() { return this._unlike; }
  public MoreLikeThisQuery setUnlike(Like[] val) { this._unlike = val; return this; }


  private Long _version;
  public Long getVersion() { return this._version; }
  public MoreLikeThisQuery setVersion(Long val) { this._version = val; return this; }


  private VersionType _versionType;
  public VersionType getVersionType() { return this._versionType; }
  public MoreLikeThisQuery setVersionType(VersionType val) { this._versionType = val; return this; }

}
