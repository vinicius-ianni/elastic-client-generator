
package org.elasticsearch.query_dsl.specialized.more_like_this;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.internal.*;
import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.query_dsl.specialized.more_like_this.like.*;
import org.elasticsearch.common_options.minimum_should_match.*;
import org.elasticsearch.common_abstractions.infer.join_field_routing.*;
import org.elasticsearch.analysis.*;
import org.elasticsearch.common.*;

public class MoreLikeThisQuery  implements XContentable<MoreLikeThisQuery> {
  
  static final ParseField ANALYZER = new ParseField("analyzer");
  private String _analyzer;
  public String getAnalyzer() { return this._analyzer; }
  public MoreLikeThisQuery setAnalyzer(String val) { this._analyzer = val; return this; }


  static final ParseField BOOST_TERMS = new ParseField("boost_terms");
  private Double _boostTerms;
  public Double getBoostTerms() { return this._boostTerms; }
  public MoreLikeThisQuery setBoostTerms(Double val) { this._boostTerms = val; return this; }


  static final ParseField FIELDS = new ParseField("fields");
  private List<Field> _fields;
  public List<Field> getFields() { return this._fields; }
  public MoreLikeThisQuery setFields(List<Field> val) { this._fields = val; return this; }


  static final ParseField INCLUDE = new ParseField("include");
  private Boolean _include;
  public Boolean getInclude() { return this._include; }
  public MoreLikeThisQuery setInclude(Boolean val) { this._include = val; return this; }


  static final ParseField LIKE = new ParseField("like");
  private List<Like> _like;
  public List<Like> getLike() { return this._like; }
  public MoreLikeThisQuery setLike(List<Like> val) { this._like = val; return this; }


  static final ParseField MAX_DOC_FREQ = new ParseField("max_doc_freq");
  private Integer _maxDocFreq;
  public Integer getMaxDocFreq() { return this._maxDocFreq; }
  public MoreLikeThisQuery setMaxDocFreq(Integer val) { this._maxDocFreq = val; return this; }


  static final ParseField MAX_QUERY_TERMS = new ParseField("max_query_terms");
  private Integer _maxQueryTerms;
  public Integer getMaxQueryTerms() { return this._maxQueryTerms; }
  public MoreLikeThisQuery setMaxQueryTerms(Integer val) { this._maxQueryTerms = val; return this; }


  static final ParseField MAX_WORD_LENGTH = new ParseField("max_word_length");
  private Integer _maxWordLength;
  public Integer getMaxWordLength() { return this._maxWordLength; }
  public MoreLikeThisQuery setMaxWordLength(Integer val) { this._maxWordLength = val; return this; }


  static final ParseField MIN_DOC_FREQ = new ParseField("min_doc_freq");
  private Integer _minDocFreq;
  public Integer getMinDocFreq() { return this._minDocFreq; }
  public MoreLikeThisQuery setMinDocFreq(Integer val) { this._minDocFreq = val; return this; }


  static final ParseField MINIMUM_SHOULD_MATCH = new ParseField("minimum_should_match");
  private MinimumShouldMatch _minimumShouldMatch;
  public MinimumShouldMatch getMinimumShouldMatch() { return this._minimumShouldMatch; }
  public MoreLikeThisQuery setMinimumShouldMatch(MinimumShouldMatch val) { this._minimumShouldMatch = val; return this; }


  static final ParseField MIN_TERM_FREQ = new ParseField("min_term_freq");
  private Integer _minTermFreq;
  public Integer getMinTermFreq() { return this._minTermFreq; }
  public MoreLikeThisQuery setMinTermFreq(Integer val) { this._minTermFreq = val; return this; }


  static final ParseField MIN_WORD_LENGTH = new ParseField("min_word_length");
  private Integer _minWordLength;
  public Integer getMinWordLength() { return this._minWordLength; }
  public MoreLikeThisQuery setMinWordLength(Integer val) { this._minWordLength = val; return this; }


  static final ParseField PER_FIELD_ANALYZER = new ParseField("per_field_analyzer");
  private NamedContainer<Field, String> _perFieldAnalyzer;
  public NamedContainer<Field, String> getPerFieldAnalyzer() { return this._perFieldAnalyzer; }
  public MoreLikeThisQuery setPerFieldAnalyzer(NamedContainer<Field, String> val) { this._perFieldAnalyzer = val; return this; }


  static final ParseField ROUTING = new ParseField("routing");
  private Routing _routing;
  public Routing getRouting() { return this._routing; }
  public MoreLikeThisQuery setRouting(Routing val) { this._routing = val; return this; }


  static final ParseField STOP_WORDS = new ParseField("stop_words");
  private StopWords _stopWords;
  public StopWords getStopWords() { return this._stopWords; }
  public MoreLikeThisQuery setStopWords(StopWords val) { this._stopWords = val; return this; }


  static final ParseField UNLIKE = new ParseField("unlike");
  private List<Like> _unlike;
  public List<Like> getUnlike() { return this._unlike; }
  public MoreLikeThisQuery setUnlike(List<Like> val) { this._unlike = val; return this; }


  static final ParseField VERSION = new ParseField("version");
  private Long _version;
  public Long getVersion() { return this._version; }
  public MoreLikeThisQuery setVersion(Long val) { this._version = val; return this; }


  static final ParseField VERSION_TYPE = new ParseField("version_type");
  private VersionType _versionType;
  public VersionType getVersionType() { return this._versionType; }
  public MoreLikeThisQuery setVersionType(VersionType val) { this._versionType = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public MoreLikeThisQuery fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return MoreLikeThisQuery.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<MoreLikeThisQuery, Void> PARSER =
    new ConstructingObjectParser<>(MoreLikeThisQuery.class.getName(), false, args -> new MoreLikeThisQuery());

  static {
    PARSER.declareString(MoreLikeThisQuery::setAnalyzer, ANALYZER);
    PARSER.declareDouble(MoreLikeThisQuery::setBoostTerms, BOOST_TERMS);
    PARSER.declareObjectArray(MoreLikeThisQuery::setFields, (p, t) -> Field.PARSER.apply(p), FIELDS);
    PARSER.declareBoolean(MoreLikeThisQuery::setInclude, INCLUDE);
    PARSER.declareObjectArray(MoreLikeThisQuery::setLike, (p, t) -> Like.PARSER.apply(p), LIKE);
    PARSER.declareInteger(MoreLikeThisQuery::setMaxDocFreq, MAX_DOC_FREQ);
    PARSER.declareInteger(MoreLikeThisQuery::setMaxQueryTerms, MAX_QUERY_TERMS);
    PARSER.declareInteger(MoreLikeThisQuery::setMaxWordLength, MAX_WORD_LENGTH);
    PARSER.declareInteger(MoreLikeThisQuery::setMinDocFreq, MIN_DOC_FREQ);
    PARSER.declareObject(MoreLikeThisQuery::setMinimumShouldMatch, (p, t) -> MinimumShouldMatch.PARSER.apply(p, null), MINIMUM_SHOULD_MATCH);
    PARSER.declareInteger(MoreLikeThisQuery::setMinTermFreq, MIN_TERM_FREQ);
    PARSER.declareInteger(MoreLikeThisQuery::setMinWordLength, MIN_WORD_LENGTH);
    PARSER.declareObject(MoreLikeThisQuery::setPerFieldAnalyzer, (p, t) ->  new NamedContainer<>(n -> () -> new Field(n),pp -> String.PARSER.apply(pp, null)), PER_FIELD_ANALYZER);;
    PARSER.declareRouting(MoreLikeThisQuery::setRouting, (p, t) -> Routing.createFrom(p), ROUTING);
    PARSER.declareObject(MoreLikeThisQuery::setStopWords, (p, t) -> StopWords.PARSER.apply(p, null), STOP_WORDS);
    PARSER.declareObjectArray(MoreLikeThisQuery::setUnlike, (p, t) -> Like.PARSER.apply(p), UNLIKE);
    PARSER.declareLong(MoreLikeThisQuery::setVersion, VERSION);
    PARSER.declareObject(MoreLikeThisQuery::setVersionType, (p, t) -> VersionType.PARSER.apply(p, null), VERSION_TYPE);
  }

}
