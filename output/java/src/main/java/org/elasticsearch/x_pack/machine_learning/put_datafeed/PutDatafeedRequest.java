
package org.elasticsearch.x_pack.machine_learning.put_datafeed;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.aggregations.*;
import org.elasticsearch.x_pack.machine_learning.datafeed.*;
import org.elasticsearch.common_options.time_unit.*;
import org.elasticsearch.common_abstractions.infer.indices.*;
import org.elasticsearch.common_abstractions.infer.id.*;
import org.elasticsearch.query_dsl.abstractions.container.*;
import org.elasticsearch.common_options.scripting.*;
import org.elasticsearch.internal.*;

public class PutDatafeedRequest  {
  
  private Map<String, AggregationContainer> _aggregations;
  public Map<String, AggregationContainer> getAggregations() { return this._aggregations; }
  public PutDatafeedRequest setAggregations(Map<String, AggregationContainer> val) { this._aggregations = val; return this; }


  private ChunkingConfig _chunkingConfig;
  public ChunkingConfig getChunkingConfig() { return this._chunkingConfig; }
  public PutDatafeedRequest setChunkingConfig(ChunkingConfig val) { this._chunkingConfig = val; return this; }


  private Time _frequency;
  public Time getFrequency() { return this._frequency; }
  public PutDatafeedRequest setFrequency(Time val) { this._frequency = val; return this; }


  private Indices _indices;
  public Indices getIndices() { return this._indices; }
  public PutDatafeedRequest setIndices(Indices val) { this._indices = val; return this; }


  private Id _jobId;
  public Id getJobId() { return this._jobId; }
  public PutDatafeedRequest setJobId(Id val) { this._jobId = val; return this; }


  private QueryContainer _query;
  public QueryContainer getQuery() { return this._query; }
  public PutDatafeedRequest setQuery(QueryContainer val) { this._query = val; return this; }


  private Time _queryDelay;
  public Time getQueryDelay() { return this._queryDelay; }
  public PutDatafeedRequest setQueryDelay(Time val) { this._queryDelay = val; return this; }


  private Map<String, ScriptField> _scriptFields;
  public Map<String, ScriptField> getScriptFields() { return this._scriptFields; }
  public PutDatafeedRequest setScriptFields(Map<String, ScriptField> val) { this._scriptFields = val; return this; }


  private Integer _scrollSize;
  public Integer getScrollSize() { return this._scrollSize; }
  public PutDatafeedRequest setScrollSize(Integer val) { this._scrollSize = val; return this; }

}
