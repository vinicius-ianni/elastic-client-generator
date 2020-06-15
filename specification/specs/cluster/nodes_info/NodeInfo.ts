class NodeInfo {
	build_hash: string;
	host: string;
	http: NodeInfoHttp;
	ip: string;
	jvm: NodeJvmInfo;
	name: string;
	network: NodeInfoNetwork;
	os: NodeOperatingSystemInfo;
	plugins: PluginStats[];
	process: NodeProcessInfo;
	roles: NodeRole[];
	settings: string[];
	@prop_serializer("VerbatimInterfaceReadOnlyDictionaryKeysFormatter`2")
	thread_pool: Dictionary<string, NodeThreadPoolInfo>;
	transport: NodeInfoTransport;
	transport_address: string;
	version: string;
}
