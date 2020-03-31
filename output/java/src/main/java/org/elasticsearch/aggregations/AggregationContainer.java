
package org.elasticsearch.aggregations;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.aggregations.bucket.adjacency_matrix.*;
import org.elasticsearch.aggregations.*;
import org.elasticsearch.aggregations.metric.average.*;
import org.elasticsearch.aggregations.pipeline.average_bucket.*;
import org.elasticsearch.aggregations.pipeline.bucket_script.*;
import org.elasticsearch.aggregations.pipeline.bucket_selector.*;
import org.elasticsearch.aggregations.pipeline.bucket_sort.*;
import org.elasticsearch.aggregations.metric.cardinality.*;
import org.elasticsearch.aggregations.bucket.children.*;
import org.elasticsearch.aggregations.bucket.composite.*;
import org.elasticsearch.aggregations.pipeline.cumulative_sum.*;
import org.elasticsearch.aggregations.pipeline.cumulative_cardinality.*;
import org.elasticsearch.aggregations.bucket.date_histogram.*;
import org.elasticsearch.aggregations.bucket.auto_date_histogram.*;
import org.elasticsearch.aggregations.bucket.date_range.*;
import org.elasticsearch.aggregations.pipeline.derivative.*;
import org.elasticsearch.aggregations.metric.extended_stats.*;
import org.elasticsearch.aggregations.pipeline.extended_stats_bucket.*;
import org.elasticsearch.aggregations.bucket.filter.*;
import org.elasticsearch.aggregations.bucket.filters.*;
import org.elasticsearch.aggregations.metric.geo_bounds.*;
import org.elasticsearch.aggregations.metric.geo_centroid.*;
import org.elasticsearch.aggregations.bucket.geo_distance.*;
import org.elasticsearch.aggregations.bucket.geo_hash_grid.*;
import org.elasticsearch.aggregations.bucket.geo_tile_grid.*;
import org.elasticsearch.aggregations.bucket.global.*;
import org.elasticsearch.aggregations.bucket.histogram.*;
import org.elasticsearch.aggregations.bucket.ip_range.*;
import org.elasticsearch.aggregations.matrix.matrix_stats.*;
import org.elasticsearch.aggregations.metric.max.*;
import org.elasticsearch.aggregations.pipeline.max_bucket.*;
import org.elasticsearch.aggregations.metric.min.*;
import org.elasticsearch.aggregations.pipeline.min_bucket.*;
import org.elasticsearch.aggregations.bucket.missing.*;
import org.elasticsearch.aggregations.pipeline.moving_average.*;
import org.elasticsearch.aggregations.pipeline.moving_function.*;
import org.elasticsearch.aggregations.bucket.nested.*;
import org.elasticsearch.aggregations.bucket.parent.*;
import org.elasticsearch.aggregations.metric.percentile_ranks.*;
import org.elasticsearch.aggregations.metric.percentiles.*;
import org.elasticsearch.aggregations.pipeline.percentiles_bucket.*;
import org.elasticsearch.aggregations.bucket.range.*;
import org.elasticsearch.aggregations.bucket.rare_terms.*;
import org.elasticsearch.aggregations.bucket.reverse_nested.*;
import org.elasticsearch.aggregations.bucket.sampler.*;
import org.elasticsearch.aggregations.metric.scripted_metric.*;
import org.elasticsearch.aggregations.pipeline.serial_differencing.*;
import org.elasticsearch.aggregations.bucket.significant_terms.*;
import org.elasticsearch.aggregations.bucket.significant_text.*;
import org.elasticsearch.aggregations.metric.stats.*;
import org.elasticsearch.aggregations.pipeline.stats_bucket.*;
import org.elasticsearch.aggregations.metric.sum.*;
import org.elasticsearch.aggregations.pipeline.sum_bucket.*;
import org.elasticsearch.aggregations.bucket.terms.*;
import org.elasticsearch.aggregations.metric.top_hits.*;
import org.elasticsearch.aggregations.metric.value_count.*;
import org.elasticsearch.aggregations.metric.weighted_average.*;
import org.elasticsearch.aggregations.metric.median_absolute_deviation.*;

public class AggregationContainer  {
  
  private AdjacencyMatrixAggregation _adjacencyMatrix;
  public AdjacencyMatrixAggregation getAdjacencyMatrix() { return this._adjacencyMatrix; }
  public AggregationContainer setAdjacencyMatrix(AdjacencyMatrixAggregation val) { this._adjacencyMatrix = val; return this; }


  private Map<String, AggregationContainer> _aggs;
  public Map<String, AggregationContainer> getAggs() { return this._aggs; }
  public AggregationContainer setAggs(Map<String, AggregationContainer> val) { this._aggs = val; return this; }


  private AverageAggregation _avg;
  public AverageAggregation getAvg() { return this._avg; }
  public AggregationContainer setAvg(AverageAggregation val) { this._avg = val; return this; }


  private AverageBucketAggregation _avgBucket;
  public AverageBucketAggregation getAvgBucket() { return this._avgBucket; }
  public AggregationContainer setAvgBucket(AverageBucketAggregation val) { this._avgBucket = val; return this; }


  private BucketScriptAggregation _bucketScript;
  public BucketScriptAggregation getBucketScript() { return this._bucketScript; }
  public AggregationContainer setBucketScript(BucketScriptAggregation val) { this._bucketScript = val; return this; }


  private BucketSelectorAggregation _bucketSelector;
  public BucketSelectorAggregation getBucketSelector() { return this._bucketSelector; }
  public AggregationContainer setBucketSelector(BucketSelectorAggregation val) { this._bucketSelector = val; return this; }


  private BucketSortAggregation _bucketSort;
  public BucketSortAggregation getBucketSort() { return this._bucketSort; }
  public AggregationContainer setBucketSort(BucketSortAggregation val) { this._bucketSort = val; return this; }


  private CardinalityAggregation _cardinality;
  public CardinalityAggregation getCardinality() { return this._cardinality; }
  public AggregationContainer setCardinality(CardinalityAggregation val) { this._cardinality = val; return this; }


  private ChildrenAggregation _children;
  public ChildrenAggregation getChildren() { return this._children; }
  public AggregationContainer setChildren(ChildrenAggregation val) { this._children = val; return this; }


  private CompositeAggregation _composite;
  public CompositeAggregation getComposite() { return this._composite; }
  public AggregationContainer setComposite(CompositeAggregation val) { this._composite = val; return this; }


  private CumulativeSumAggregation _cumulativeSum;
  public CumulativeSumAggregation getCumulativeSum() { return this._cumulativeSum; }
  public AggregationContainer setCumulativeSum(CumulativeSumAggregation val) { this._cumulativeSum = val; return this; }


  private CumulativeCardinalityAggregation _cumulativeCardinality;
  public CumulativeCardinalityAggregation getCumulativeCardinality() { return this._cumulativeCardinality; }
  public AggregationContainer setCumulativeCardinality(CumulativeCardinalityAggregation val) { this._cumulativeCardinality = val; return this; }


  private DateHistogramAggregation _dateHistogram;
  public DateHistogramAggregation getDateHistogram() { return this._dateHistogram; }
  public AggregationContainer setDateHistogram(DateHistogramAggregation val) { this._dateHistogram = val; return this; }


  private AutoDateHistogramAggregation _autoDateHistogram;
  public AutoDateHistogramAggregation getAutoDateHistogram() { return this._autoDateHistogram; }
  public AggregationContainer setAutoDateHistogram(AutoDateHistogramAggregation val) { this._autoDateHistogram = val; return this; }


  private DateRangeAggregation _dateRange;
  public DateRangeAggregation getDateRange() { return this._dateRange; }
  public AggregationContainer setDateRange(DateRangeAggregation val) { this._dateRange = val; return this; }


  private DerivativeAggregation _derivative;
  public DerivativeAggregation getDerivative() { return this._derivative; }
  public AggregationContainer setDerivative(DerivativeAggregation val) { this._derivative = val; return this; }


  private ExtendedStatsAggregation _extendedStats;
  public ExtendedStatsAggregation getExtendedStats() { return this._extendedStats; }
  public AggregationContainer setExtendedStats(ExtendedStatsAggregation val) { this._extendedStats = val; return this; }


  private ExtendedStatsBucketAggregation _extendedStatsBucket;
  public ExtendedStatsBucketAggregation getExtendedStatsBucket() { return this._extendedStatsBucket; }
  public AggregationContainer setExtendedStatsBucket(ExtendedStatsBucketAggregation val) { this._extendedStatsBucket = val; return this; }


  private FilterAggregation _filter;
  public FilterAggregation getFilter() { return this._filter; }
  public AggregationContainer setFilter(FilterAggregation val) { this._filter = val; return this; }


  private FiltersAggregation _filters;
  public FiltersAggregation getFilters() { return this._filters; }
  public AggregationContainer setFilters(FiltersAggregation val) { this._filters = val; return this; }


  private GeoBoundsAggregation _geoBounds;
  public GeoBoundsAggregation getGeoBounds() { return this._geoBounds; }
  public AggregationContainer setGeoBounds(GeoBoundsAggregation val) { this._geoBounds = val; return this; }


  private GeoCentroidAggregation _geoCentroid;
  public GeoCentroidAggregation getGeoCentroid() { return this._geoCentroid; }
  public AggregationContainer setGeoCentroid(GeoCentroidAggregation val) { this._geoCentroid = val; return this; }


  private GeoDistanceAggregation _geoDistance;
  public GeoDistanceAggregation getGeoDistance() { return this._geoDistance; }
  public AggregationContainer setGeoDistance(GeoDistanceAggregation val) { this._geoDistance = val; return this; }


  private GeoHashGridAggregation _geohashGrid;
  public GeoHashGridAggregation getGeohashGrid() { return this._geohashGrid; }
  public AggregationContainer setGeohashGrid(GeoHashGridAggregation val) { this._geohashGrid = val; return this; }


  private GeoTileGridAggregation _geotileGrid;
  public GeoTileGridAggregation getGeotileGrid() { return this._geotileGrid; }
  public AggregationContainer setGeotileGrid(GeoTileGridAggregation val) { this._geotileGrid = val; return this; }


  private GlobalAggregation _global;
  public GlobalAggregation getGlobal() { return this._global; }
  public AggregationContainer setGlobal(GlobalAggregation val) { this._global = val; return this; }


  private HistogramAggregation _histogram;
  public HistogramAggregation getHistogram() { return this._histogram; }
  public AggregationContainer setHistogram(HistogramAggregation val) { this._histogram = val; return this; }


  private IpRangeAggregation _ipRange;
  public IpRangeAggregation getIpRange() { return this._ipRange; }
  public AggregationContainer setIpRange(IpRangeAggregation val) { this._ipRange = val; return this; }


  private MatrixStatsAggregation _matrixStats;
  public MatrixStatsAggregation getMatrixStats() { return this._matrixStats; }
  public AggregationContainer setMatrixStats(MatrixStatsAggregation val) { this._matrixStats = val; return this; }


  private MaxAggregation _max;
  public MaxAggregation getMax() { return this._max; }
  public AggregationContainer setMax(MaxAggregation val) { this._max = val; return this; }


  private MaxBucketAggregation _maxBucket;
  public MaxBucketAggregation getMaxBucket() { return this._maxBucket; }
  public AggregationContainer setMaxBucket(MaxBucketAggregation val) { this._maxBucket = val; return this; }


  private Map<String, Object> _meta;
  public Map<String, Object> getMeta() { return this._meta; }
  public AggregationContainer setMeta(Map<String, Object> val) { this._meta = val; return this; }


  private MinAggregation _min;
  public MinAggregation getMin() { return this._min; }
  public AggregationContainer setMin(MinAggregation val) { this._min = val; return this; }


  private MinBucketAggregation _minBucket;
  public MinBucketAggregation getMinBucket() { return this._minBucket; }
  public AggregationContainer setMinBucket(MinBucketAggregation val) { this._minBucket = val; return this; }


  private MissingAggregation _missing;
  public MissingAggregation getMissing() { return this._missing; }
  public AggregationContainer setMissing(MissingAggregation val) { this._missing = val; return this; }


  private MovingAverageAggregation _movingAvg;
  public MovingAverageAggregation getMovingAvg() { return this._movingAvg; }
  public AggregationContainer setMovingAvg(MovingAverageAggregation val) { this._movingAvg = val; return this; }


  private MovingFunctionAggregation _movingFn;
  public MovingFunctionAggregation getMovingFn() { return this._movingFn; }
  public AggregationContainer setMovingFn(MovingFunctionAggregation val) { this._movingFn = val; return this; }


  private NestedAggregation _nested;
  public NestedAggregation getNested() { return this._nested; }
  public AggregationContainer setNested(NestedAggregation val) { this._nested = val; return this; }


  private ParentAggregation _parent;
  public ParentAggregation getParent() { return this._parent; }
  public AggregationContainer setParent(ParentAggregation val) { this._parent = val; return this; }


  private PercentileRanksAggregation _percentileRanks;
  public PercentileRanksAggregation getPercentileRanks() { return this._percentileRanks; }
  public AggregationContainer setPercentileRanks(PercentileRanksAggregation val) { this._percentileRanks = val; return this; }


  private PercentilesAggregation _percentiles;
  public PercentilesAggregation getPercentiles() { return this._percentiles; }
  public AggregationContainer setPercentiles(PercentilesAggregation val) { this._percentiles = val; return this; }


  private PercentilesBucketAggregation _percentilesBucket;
  public PercentilesBucketAggregation getPercentilesBucket() { return this._percentilesBucket; }
  public AggregationContainer setPercentilesBucket(PercentilesBucketAggregation val) { this._percentilesBucket = val; return this; }


  private RangeAggregation _range;
  public RangeAggregation getRange() { return this._range; }
  public AggregationContainer setRange(RangeAggregation val) { this._range = val; return this; }


  private RareTermsAggregation _rareTerms;
  public RareTermsAggregation getRareTerms() { return this._rareTerms; }
  public AggregationContainer setRareTerms(RareTermsAggregation val) { this._rareTerms = val; return this; }


  private ReverseNestedAggregation _reverseNested;
  public ReverseNestedAggregation getReverseNested() { return this._reverseNested; }
  public AggregationContainer setReverseNested(ReverseNestedAggregation val) { this._reverseNested = val; return this; }


  private SamplerAggregation _sampler;
  public SamplerAggregation getSampler() { return this._sampler; }
  public AggregationContainer setSampler(SamplerAggregation val) { this._sampler = val; return this; }


  private ScriptedMetricAggregation _scriptedMetric;
  public ScriptedMetricAggregation getScriptedMetric() { return this._scriptedMetric; }
  public AggregationContainer setScriptedMetric(ScriptedMetricAggregation val) { this._scriptedMetric = val; return this; }


  private SerialDifferencingAggregation _serialDiff;
  public SerialDifferencingAggregation getSerialDiff() { return this._serialDiff; }
  public AggregationContainer setSerialDiff(SerialDifferencingAggregation val) { this._serialDiff = val; return this; }


  private SignificantTermsAggregation _significantTerms;
  public SignificantTermsAggregation getSignificantTerms() { return this._significantTerms; }
  public AggregationContainer setSignificantTerms(SignificantTermsAggregation val) { this._significantTerms = val; return this; }


  private SignificantTextAggregation _significantText;
  public SignificantTextAggregation getSignificantText() { return this._significantText; }
  public AggregationContainer setSignificantText(SignificantTextAggregation val) { this._significantText = val; return this; }


  private StatsAggregation _stats;
  public StatsAggregation getStats() { return this._stats; }
  public AggregationContainer setStats(StatsAggregation val) { this._stats = val; return this; }


  private StatsBucketAggregation _statsBucket;
  public StatsBucketAggregation getStatsBucket() { return this._statsBucket; }
  public AggregationContainer setStatsBucket(StatsBucketAggregation val) { this._statsBucket = val; return this; }


  private SumAggregation _sum;
  public SumAggregation getSum() { return this._sum; }
  public AggregationContainer setSum(SumAggregation val) { this._sum = val; return this; }


  private SumBucketAggregation _sumBucket;
  public SumBucketAggregation getSumBucket() { return this._sumBucket; }
  public AggregationContainer setSumBucket(SumBucketAggregation val) { this._sumBucket = val; return this; }


  private TermsAggregation _terms;
  public TermsAggregation getTerms() { return this._terms; }
  public AggregationContainer setTerms(TermsAggregation val) { this._terms = val; return this; }


  private TopHitsAggregation _topHits;
  public TopHitsAggregation getTopHits() { return this._topHits; }
  public AggregationContainer setTopHits(TopHitsAggregation val) { this._topHits = val; return this; }


  private ValueCountAggregation _valueCount;
  public ValueCountAggregation getValueCount() { return this._valueCount; }
  public AggregationContainer setValueCount(ValueCountAggregation val) { this._valueCount = val; return this; }


  private WeightedAverageAggregation _weightedAvg;
  public WeightedAverageAggregation getWeightedAvg() { return this._weightedAvg; }
  public AggregationContainer setWeightedAvg(WeightedAverageAggregation val) { this._weightedAvg = val; return this; }


  private MedianAbsoluteDeviationAggregation _medianAbsoluteDeviation;
  public MedianAbsoluteDeviationAggregation getMedianAbsoluteDeviation() { return this._medianAbsoluteDeviation; }
  public AggregationContainer setMedianAbsoluteDeviation(MedianAbsoluteDeviationAggregation val) { this._medianAbsoluteDeviation = val; return this; }

}
