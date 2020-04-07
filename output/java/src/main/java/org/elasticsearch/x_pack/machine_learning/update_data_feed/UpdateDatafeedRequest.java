
package org.elasticsearch.x_pack.machine_learning.update_data_feed;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.aggregations.*;
import org.elasticsearch.x_pack.machine_learning.datafeed.*;
import org.elasticsearch.common_options.time_unit.*;
import org.elasticsearch.common_abstractions.infer.indices.*;
import org.elasticsearch.common_abstractions.infer.id.*;
import org.elasticsearch.query_dsl.abstractions.container.*;
import org.elasticsearch.common_options.scripting.*;
import org.elasticsearch.internal.*;

public class UpdateDatafeedRequest  implements XContentable<UpdateDatafeedRequest> {
  
  static final ParseField AGGREGATIONS = new ParseField("aggregations");
  private NamedContainer<String, AggregationContainer> _aggregations;
  public NamedContainer<String, AggregationContainer> getAggregations() { return this._aggregations; }
  public UpdateDatafeedRequest setAggregations(NamedContainer<String, AggregationContainer> val) { this._aggregations = val; return this; }


  static final ParseField CHUNKING_CONFIG = new ParseField("chunking_config");
  private ChunkingConfig _chunkingConfig;
  public ChunkingConfig getChunkingConfig() { return this._chunkingConfig; }
  public UpdateDatafeedRequest setChunkingConfig(ChunkingConfig val) { this._chunkingConfig = val; return this; }


  static final ParseField FREQUENCY = new ParseField("frequency");
  private Time _frequency;
  public Time getFrequency() { return this._frequency; }
  public UpdateDatafeedRequest setFrequency(Time val) { this._frequency = val; return this; }


  static final ParseField INDICES = new ParseField("indices");
  private Indices _indices;
  public Indices getIndices() { return this._indices; }
  public UpdateDatafeedRequest setIndices(Indices val) { this._indices = val; return this; }


  static final ParseField JOB_ID = new ParseField("job_id");
  private Id _jobId;
  public Id getJobId() { return this._jobId; }
  public UpdateDatafeedRequest setJobId(Id val) { this._jobId = val; return this; }


  static final ParseField QUERY = new ParseField("query");
  private QueryContainer _query;
  public QueryContainer getQuery() { return this._query; }
  public UpdateDatafeedRequest setQuery(QueryContainer val) { this._query = val; return this; }


  static final ParseField QUERY_DELAY = new ParseField("query_delay");
  private Time _queryDelay;
  public Time getQueryDelay() { return this._queryDelay; }
  public UpdateDatafeedRequest setQueryDelay(Time val) { this._queryDelay = val; return this; }


  static final ParseField SCRIPT_FIELDS = new ParseField("script_fields");
  private NamedContainer<String, ScriptField> _scriptFields;
  public NamedContainer<String, ScriptField> getScriptFields() { return this._scriptFields; }
  public UpdateDatafeedRequest setScriptFields(NamedContainer<String, ScriptField> val) { this._scriptFields = val; return this; }


  static final ParseField SCROLL_SIZE = new ParseField("scroll_size");
  private Integer _scrollSize;
  public Integer getScrollSize() { return this._scrollSize; }
  public UpdateDatafeedRequest setScrollSize(Integer val) { this._scrollSize = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public UpdateDatafeedRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return UpdateDatafeedRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<UpdateDatafeedRequest, Void> PARSER =
    new ConstructingObjectParser<>(UpdateDatafeedRequest.class.getName(), false, args -> new UpdateDatafeedRequest());

  static {
    PARSER.declareObject(UpdateDatafeedRequest::setAggregations, (p, t) ->  new NamedContainer<>(n -> () -> n,pp -> AggregationContainer.PARSER.apply(pp, null)), AGGREGATIONS);;
    PARSER.declareObject(UpdateDatafeedRequest::setChunkingConfig, (p, t) -> ChunkingConfig.PARSER.apply(p, null), CHUNKING_CONFIG);
    PARSER.declareObject(UpdateDatafeedRequest::setFrequency, (p, t) -> Time.PARSER.apply(p, null), FREQUENCY);
    PARSER.declareIndices(UpdateDatafeedRequest::setIndices, (p, t) -> Indices.createFrom(p), INDICES);
    PARSER.declareId(UpdateDatafeedRequest::setJobId, (p, t) -> Id.createFrom(p), JOB_ID);
    PARSER.declareObject(UpdateDatafeedRequest::setQuery, (p, t) -> QueryContainer.PARSER.apply(p, null), QUERY);
    PARSER.declareObject(UpdateDatafeedRequest::setQueryDelay, (p, t) -> Time.PARSER.apply(p, null), QUERY_DELAY);
    PARSER.declareObject(UpdateDatafeedRequest::setScriptFields, (p, t) ->  new NamedContainer<>(n -> () -> n,pp -> ScriptField.PARSER.apply(pp, null)), SCRIPT_FIELDS);;
    PARSER.declareInteger(UpdateDatafeedRequest::setScrollSize, SCROLL_SIZE);
  }

}
