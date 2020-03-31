
package org.elasticsearch.x_pack.machine_learning.update_data_feed;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.aggregations.*;
import org.elasticsearch.x_pack.machine_learning.datafeed.*;
import org.elasticsearch.common_options.time_unit.*;
import org.elasticsearch.common_abstractions.infer.indices.*;
import org.elasticsearch.query_dsl.abstractions.container.*;
import org.elasticsearch.common_options.scripting.*;
import org.elasticsearch.internal.*;

public class UpdateDatafeedResponse  {
  
  private Map<String, AggregationContainer> _aggregations;
  public Map<String, AggregationContainer> getAggregations() { return this._aggregations; }
  public UpdateDatafeedResponse setAggregations(Map<String, AggregationContainer> val) { this._aggregations = val; return this; }


  private ChunkingConfig _chunkingConfig;
  public ChunkingConfig getChunkingConfig() { return this._chunkingConfig; }
  public UpdateDatafeedResponse setChunkingConfig(ChunkingConfig val) { this._chunkingConfig = val; return this; }


  private String _datafeedId;
  public String getDatafeedId() { return this._datafeedId; }
  public UpdateDatafeedResponse setDatafeedId(String val) { this._datafeedId = val; return this; }


  private Time _frequency;
  public Time getFrequency() { return this._frequency; }
  public UpdateDatafeedResponse setFrequency(Time val) { this._frequency = val; return this; }


  private Indices _indices;
  public Indices getIndices() { return this._indices; }
  public UpdateDatafeedResponse setIndices(Indices val) { this._indices = val; return this; }


  private String _jobId;
  public String getJobId() { return this._jobId; }
  public UpdateDatafeedResponse setJobId(String val) { this._jobId = val; return this; }


  private QueryContainer _query;
  public QueryContainer getQuery() { return this._query; }
  public UpdateDatafeedResponse setQuery(QueryContainer val) { this._query = val; return this; }


  private Time _queryDelay;
  public Time getQueryDelay() { return this._queryDelay; }
  public UpdateDatafeedResponse setQueryDelay(Time val) { this._queryDelay = val; return this; }


  private Map<String, ScriptField> _scriptFields;
  public Map<String, ScriptField> getScriptFields() { return this._scriptFields; }
  public UpdateDatafeedResponse setScriptFields(Map<String, ScriptField> val) { this._scriptFields = val; return this; }


  private Integer _scrollSize;
  public Integer getScrollSize() { return this._scrollSize; }
  public UpdateDatafeedResponse setScrollSize(Integer val) { this._scrollSize = val; return this; }

}
