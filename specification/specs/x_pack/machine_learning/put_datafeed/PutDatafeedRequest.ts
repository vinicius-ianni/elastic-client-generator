@rest_spec_name("ml.put_datafeed")
class PutDatafeedRequest extends RequestBase {
	aggregations: Dictionary<string, AggregationContainer>;
	chunking_config: ChunkingConfig;
	frequency: Time;
	@prop_serializer("IndicesFormatter")
	indices: Indices;
	job_id: Id;
	query: QueryContainer;
	query_delay: Time;
	script_fields: Dictionary<string, ScriptField>;
	scroll_size: integer;
}
