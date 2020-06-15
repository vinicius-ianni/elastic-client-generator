class LifecycleExplain {
	action: string;
	@prop_serializer("DateTimeOffsetEpochMillisecondsFormatter")
	action_time_millis: Date;
	failed_step: string;
	index: IndexName;
	@prop_serializer("DateTimeOffsetEpochMillisecondsFormatter")
	lifecycle_date_millis: Date;
	managed: boolean;
	phase: string;
	@prop_serializer("DateTimeOffsetEpochMillisecondsFormatter")
	phase_time_millis: Date;
	policy: string;
	step: string;
	step_info: Dictionary<string, any>;
	@prop_serializer("DateTimeOffsetEpochMillisecondsFormatter")
	step_time_millis: Date;
	age: Time;
}
