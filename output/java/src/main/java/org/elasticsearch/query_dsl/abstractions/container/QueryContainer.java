
package org.elasticsearch.query_dsl.abstractions.container;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.query_dsl.compound.bool.*;
import org.elasticsearch.query_dsl.compound.boosting.*;
import org.elasticsearch.query_dsl.full_text.common_terms.*;
import org.elasticsearch.query_dsl.compound.constant_score.*;
import org.elasticsearch.query_dsl.compound.dismax.*;
import org.elasticsearch.query_dsl.term_level.exists.*;
import org.elasticsearch.query_dsl.compound.function_score.*;
import org.elasticsearch.query_dsl.term_level.fuzzy.*;
import org.elasticsearch.query_dsl.geo.bounding_box.*;
import org.elasticsearch.query_dsl.geo.distance.*;
import org.elasticsearch.query_dsl.geo.polygon.*;
import org.elasticsearch.query_dsl.geo.shape.*;
import org.elasticsearch.query_dsl.specialized.shape.*;
import org.elasticsearch.query_dsl.joining.has_child.*;
import org.elasticsearch.query_dsl.joining.has_parent.*;
import org.elasticsearch.query_dsl.term_level.ids.*;
import org.elasticsearch.query_dsl.full_text.intervals.*;
import org.elasticsearch.query_dsl.full_text.match.*;
import org.elasticsearch.query_dsl.*;
import org.elasticsearch.query_dsl.full_text.match_phrase.*;
import org.elasticsearch.query_dsl.full_text.match_phrase_prefix.*;
import org.elasticsearch.query_dsl.specialized.more_like_this.*;
import org.elasticsearch.query_dsl.full_text.multi_match.*;
import org.elasticsearch.query_dsl.joining.nested.*;
import org.elasticsearch.query_dsl.joining.parent_id.*;
import org.elasticsearch.query_dsl.specialized.percolate.*;
import org.elasticsearch.query_dsl.term_level.prefix.*;
import org.elasticsearch.query_dsl.full_text.query_string.*;
import org.elasticsearch.query_dsl.term_level.range.*;
import org.elasticsearch.query_dsl.nest_specific.*;
import org.elasticsearch.query_dsl.term_level.regexp.*;
import org.elasticsearch.query_dsl.specialized.script.*;
import org.elasticsearch.query_dsl.specialized.script_score.*;
import org.elasticsearch.query_dsl.full_text.simple_query_string.*;
import org.elasticsearch.query_dsl.span.containing.*;
import org.elasticsearch.query_dsl.span.field_masking.*;
import org.elasticsearch.query_dsl.span.first.*;
import org.elasticsearch.query_dsl.span.multi_term.*;
import org.elasticsearch.query_dsl.span.near.*;
import org.elasticsearch.query_dsl.span.not.*;
import org.elasticsearch.query_dsl.span.or.*;
import org.elasticsearch.query_dsl.span.term.*;
import org.elasticsearch.query_dsl.span.within.*;
import org.elasticsearch.query_dsl.term_level.term.*;
import org.elasticsearch.query_dsl.term_level.terms.*;
import org.elasticsearch.query_dsl.term_level.terms_set.*;
import org.elasticsearch.query_dsl.term_level.wildcard.*;
import org.elasticsearch.query_dsl.specialized.rank_feature.*;
import org.elasticsearch.query_dsl.specialized.distance_feature.*;
import org.elasticsearch.query_dsl.specialized.pinned.*;

public class QueryContainer  {
  
  private BoolQuery _bool;
  public BoolQuery getBool() { return this._bool; }
  public QueryContainer setBool(BoolQuery val) { this._bool = val; return this; }


  private BoostingQuery _boosting;
  public BoostingQuery getBoosting() { return this._boosting; }
  public QueryContainer setBoosting(BoostingQuery val) { this._boosting = val; return this; }


  private CommonTermsQuery _common;
  public CommonTermsQuery getCommon() { return this._common; }
  public QueryContainer setCommon(CommonTermsQuery val) { this._common = val; return this; }


  private ConstantScoreQuery _constantScore;
  public ConstantScoreQuery getConstantScore() { return this._constantScore; }
  public QueryContainer setConstantScore(ConstantScoreQuery val) { this._constantScore = val; return this; }


  private DisMaxQuery _disMax;
  public DisMaxQuery getDisMax() { return this._disMax; }
  public QueryContainer setDisMax(DisMaxQuery val) { this._disMax = val; return this; }


  private ExistsQuery _exists;
  public ExistsQuery getExists() { return this._exists; }
  public QueryContainer setExists(ExistsQuery val) { this._exists = val; return this; }


  private FunctionScoreQuery _functionScore;
  public FunctionScoreQuery getFunctionScore() { return this._functionScore; }
  public QueryContainer setFunctionScore(FunctionScoreQuery val) { this._functionScore = val; return this; }


  private FuzzyQuery _fuzzy;
  public FuzzyQuery getFuzzy() { return this._fuzzy; }
  public QueryContainer setFuzzy(FuzzyQuery val) { this._fuzzy = val; return this; }


  private GeoBoundingBoxQuery _geoBoundingBox;
  public GeoBoundingBoxQuery getGeoBoundingBox() { return this._geoBoundingBox; }
  public QueryContainer setGeoBoundingBox(GeoBoundingBoxQuery val) { this._geoBoundingBox = val; return this; }


  private GeoDistanceQuery _geoDistance;
  public GeoDistanceQuery getGeoDistance() { return this._geoDistance; }
  public QueryContainer setGeoDistance(GeoDistanceQuery val) { this._geoDistance = val; return this; }


  private GeoPolygonQuery _geoPolygon;
  public GeoPolygonQuery getGeoPolygon() { return this._geoPolygon; }
  public QueryContainer setGeoPolygon(GeoPolygonQuery val) { this._geoPolygon = val; return this; }


  private GeoShapeQuery _geoShape;
  public GeoShapeQuery getGeoShape() { return this._geoShape; }
  public QueryContainer setGeoShape(GeoShapeQuery val) { this._geoShape = val; return this; }


  private ShapeQuery _shape;
  public ShapeQuery getShape() { return this._shape; }
  public QueryContainer setShape(ShapeQuery val) { this._shape = val; return this; }


  private HasChildQuery _hasChild;
  public HasChildQuery getHasChild() { return this._hasChild; }
  public QueryContainer setHasChild(HasChildQuery val) { this._hasChild = val; return this; }


  private HasParentQuery _hasParent;
  public HasParentQuery getHasParent() { return this._hasParent; }
  public QueryContainer setHasParent(HasParentQuery val) { this._hasParent = val; return this; }


  private IdsQuery _ids;
  public IdsQuery getIds() { return this._ids; }
  public QueryContainer setIds(IdsQuery val) { this._ids = val; return this; }


  private IntervalsQuery _intervals;
  public IntervalsQuery getIntervals() { return this._intervals; }
  public QueryContainer setIntervals(IntervalsQuery val) { this._intervals = val; return this; }


  private Boolean _isConditionless;
  public Boolean getIsConditionless() { return this._isConditionless; }
  public QueryContainer setIsConditionless(Boolean val) { this._isConditionless = val; return this; }


  private Boolean _isStrict;
  public Boolean getIsStrict() { return this._isStrict; }
  public QueryContainer setIsStrict(Boolean val) { this._isStrict = val; return this; }


  private Boolean _isVerbatim;
  public Boolean getIsVerbatim() { return this._isVerbatim; }
  public QueryContainer setIsVerbatim(Boolean val) { this._isVerbatim = val; return this; }


  private Boolean _isWritable;
  public Boolean getIsWritable() { return this._isWritable; }
  public QueryContainer setIsWritable(Boolean val) { this._isWritable = val; return this; }


  private MatchQuery _match;
  public MatchQuery getMatch() { return this._match; }
  public QueryContainer setMatch(MatchQuery val) { this._match = val; return this; }


  private MatchAllQuery _matchAll;
  public MatchAllQuery getMatchAll() { return this._matchAll; }
  public QueryContainer setMatchAll(MatchAllQuery val) { this._matchAll = val; return this; }


  private MatchNoneQuery _matchNone;
  public MatchNoneQuery getMatchNone() { return this._matchNone; }
  public QueryContainer setMatchNone(MatchNoneQuery val) { this._matchNone = val; return this; }


  private MatchPhraseQuery _matchPhrase;
  public MatchPhraseQuery getMatchPhrase() { return this._matchPhrase; }
  public QueryContainer setMatchPhrase(MatchPhraseQuery val) { this._matchPhrase = val; return this; }


  private MatchPhrasePrefixQuery _matchPhrasePrefix;
  public MatchPhrasePrefixQuery getMatchPhrasePrefix() { return this._matchPhrasePrefix; }
  public QueryContainer setMatchPhrasePrefix(MatchPhrasePrefixQuery val) { this._matchPhrasePrefix = val; return this; }


  private MoreLikeThisQuery _moreLikeThis;
  public MoreLikeThisQuery getMoreLikeThis() { return this._moreLikeThis; }
  public QueryContainer setMoreLikeThis(MoreLikeThisQuery val) { this._moreLikeThis = val; return this; }


  private MultiMatchQuery _multiMatch;
  public MultiMatchQuery getMultiMatch() { return this._multiMatch; }
  public QueryContainer setMultiMatch(MultiMatchQuery val) { this._multiMatch = val; return this; }


  private NestedQuery _nested;
  public NestedQuery getNested() { return this._nested; }
  public QueryContainer setNested(NestedQuery val) { this._nested = val; return this; }


  private ParentIdQuery _parentId;
  public ParentIdQuery getParentId() { return this._parentId; }
  public QueryContainer setParentId(ParentIdQuery val) { this._parentId = val; return this; }


  private PercolateQuery _percolate;
  public PercolateQuery getPercolate() { return this._percolate; }
  public QueryContainer setPercolate(PercolateQuery val) { this._percolate = val; return this; }


  private PrefixQuery _prefix;
  public PrefixQuery getPrefix() { return this._prefix; }
  public QueryContainer setPrefix(PrefixQuery val) { this._prefix = val; return this; }


  private QueryStringQuery _queryString;
  public QueryStringQuery getQueryString() { return this._queryString; }
  public QueryContainer setQueryString(QueryStringQuery val) { this._queryString = val; return this; }


  private RangeQuery _range;
  public RangeQuery getRange() { return this._range; }
  public QueryContainer setRange(RangeQuery val) { this._range = val; return this; }


  private RawQuery _rawQuery;
  public RawQuery getRawQuery() { return this._rawQuery; }
  public QueryContainer setRawQuery(RawQuery val) { this._rawQuery = val; return this; }


  private RegexpQuery _regexp;
  public RegexpQuery getRegexp() { return this._regexp; }
  public QueryContainer setRegexp(RegexpQuery val) { this._regexp = val; return this; }


  private ScriptQuery _script;
  public ScriptQuery getScript() { return this._script; }
  public QueryContainer setScript(ScriptQuery val) { this._script = val; return this; }


  private ScriptScoreQuery _scriptScore;
  public ScriptScoreQuery getScriptScore() { return this._scriptScore; }
  public QueryContainer setScriptScore(ScriptScoreQuery val) { this._scriptScore = val; return this; }


  private SimpleQueryStringQuery _simpleQueryString;
  public SimpleQueryStringQuery getSimpleQueryString() { return this._simpleQueryString; }
  public QueryContainer setSimpleQueryString(SimpleQueryStringQuery val) { this._simpleQueryString = val; return this; }


  private SpanContainingQuery _spanContaining;
  public SpanContainingQuery getSpanContaining() { return this._spanContaining; }
  public QueryContainer setSpanContaining(SpanContainingQuery val) { this._spanContaining = val; return this; }


  private SpanFieldMaskingQuery _fieldMaskingSpan;
  public SpanFieldMaskingQuery getFieldMaskingSpan() { return this._fieldMaskingSpan; }
  public QueryContainer setFieldMaskingSpan(SpanFieldMaskingQuery val) { this._fieldMaskingSpan = val; return this; }


  private SpanFirstQuery _spanFirst;
  public SpanFirstQuery getSpanFirst() { return this._spanFirst; }
  public QueryContainer setSpanFirst(SpanFirstQuery val) { this._spanFirst = val; return this; }


  private SpanMultiTermQuery _spanMulti;
  public SpanMultiTermQuery getSpanMulti() { return this._spanMulti; }
  public QueryContainer setSpanMulti(SpanMultiTermQuery val) { this._spanMulti = val; return this; }


  private SpanNearQuery _spanNear;
  public SpanNearQuery getSpanNear() { return this._spanNear; }
  public QueryContainer setSpanNear(SpanNearQuery val) { this._spanNear = val; return this; }


  private SpanNotQuery _spanNot;
  public SpanNotQuery getSpanNot() { return this._spanNot; }
  public QueryContainer setSpanNot(SpanNotQuery val) { this._spanNot = val; return this; }


  private SpanOrQuery _spanOr;
  public SpanOrQuery getSpanOr() { return this._spanOr; }
  public QueryContainer setSpanOr(SpanOrQuery val) { this._spanOr = val; return this; }


  private SpanTermQuery _spanTerm;
  public SpanTermQuery getSpanTerm() { return this._spanTerm; }
  public QueryContainer setSpanTerm(SpanTermQuery val) { this._spanTerm = val; return this; }


  private SpanWithinQuery _spanWithin;
  public SpanWithinQuery getSpanWithin() { return this._spanWithin; }
  public QueryContainer setSpanWithin(SpanWithinQuery val) { this._spanWithin = val; return this; }


  private TermQuery _term;
  public TermQuery getTerm() { return this._term; }
  public QueryContainer setTerm(TermQuery val) { this._term = val; return this; }


  private TermsQuery _terms;
  public TermsQuery getTerms() { return this._terms; }
  public QueryContainer setTerms(TermsQuery val) { this._terms = val; return this; }


  private TermsSetQuery _termsSet;
  public TermsSetQuery getTermsSet() { return this._termsSet; }
  public QueryContainer setTermsSet(TermsSetQuery val) { this._termsSet = val; return this; }


  private WildcardQuery _wildcard;
  public WildcardQuery getWildcard() { return this._wildcard; }
  public QueryContainer setWildcard(WildcardQuery val) { this._wildcard = val; return this; }


  private RankFeatureQuery _rankFeature;
  public RankFeatureQuery getRankFeature() { return this._rankFeature; }
  public QueryContainer setRankFeature(RankFeatureQuery val) { this._rankFeature = val; return this; }


  private DistanceFeatureQuery _distanceFeature;
  public DistanceFeatureQuery getDistanceFeature() { return this._distanceFeature; }
  public QueryContainer setDistanceFeature(DistanceFeatureQuery val) { this._distanceFeature = val; return this; }


  private PinnedQuery _pinned;
  public PinnedQuery getPinned() { return this._pinned; }
  public QueryContainer setPinned(PinnedQuery val) { this._pinned = val; return this; }

}
