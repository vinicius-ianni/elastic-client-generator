
package org.elasticsearch.cluster.nodes_info;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.cluster.nodes_info.*;
import org.elasticsearch.common_options.stats.*;

public class NodeInfo  implements XContentable<NodeInfo> {
  
  static final ParseField BUILD_HASH = new ParseField("build_hash");
  private String _buildHash;
  public String getBuildHash() { return this._buildHash; }
  public NodeInfo setBuildHash(String val) { this._buildHash = val; return this; }


  static final ParseField HOST = new ParseField("host");
  private String _host;
  public String getHost() { return this._host; }
  public NodeInfo setHost(String val) { this._host = val; return this; }


  static final ParseField HTTP = new ParseField("http");
  private NodeInfoHttp _http;
  public NodeInfoHttp getHttp() { return this._http; }
  public NodeInfo setHttp(NodeInfoHttp val) { this._http = val; return this; }


  static final ParseField IP = new ParseField("ip");
  private String _ip;
  public String getIp() { return this._ip; }
  public NodeInfo setIp(String val) { this._ip = val; return this; }


  static final ParseField JVM = new ParseField("jvm");
  private NodeJvmInfo _jvm;
  public NodeJvmInfo getJvm() { return this._jvm; }
  public NodeInfo setJvm(NodeJvmInfo val) { this._jvm = val; return this; }


  static final ParseField NAME = new ParseField("name");
  private String _name;
  public String getName() { return this._name; }
  public NodeInfo setName(String val) { this._name = val; return this; }


  static final ParseField NETWORK = new ParseField("network");
  private NodeInfoNetwork _network;
  public NodeInfoNetwork getNetwork() { return this._network; }
  public NodeInfo setNetwork(NodeInfoNetwork val) { this._network = val; return this; }


  static final ParseField OS = new ParseField("os");
  private NodeOperatingSystemInfo _os;
  public NodeOperatingSystemInfo getOs() { return this._os; }
  public NodeInfo setOs(NodeOperatingSystemInfo val) { this._os = val; return this; }


  static final ParseField PLUGINS = new ParseField("plugins");
  private List<PluginStats> _plugins;
  public List<PluginStats> getPlugins() { return this._plugins; }
  public NodeInfo setPlugins(List<PluginStats> val) { this._plugins = val; return this; }


  static final ParseField PROCESS = new ParseField("process");
  private NodeProcessInfo _process;
  public NodeProcessInfo getProcess() { return this._process; }
  public NodeInfo setProcess(NodeProcessInfo val) { this._process = val; return this; }


  static final ParseField ROLES = new ParseField("roles");
  private List<NodeRole> _roles;
  public List<NodeRole> getRoles() { return this._roles; }
  public NodeInfo setRoles(List<NodeRole> val) { this._roles = val; return this; }


  static final ParseField SETTINGS = new ParseField("settings");
  private List<String> _settings;
  public List<String> getSettings() { return this._settings; }
  public NodeInfo setSettings(List<String> val) { this._settings = val; return this; }


  static final ParseField THREAD_POOL = new ParseField("thread_pool");
  private NamedContainer<String, NodeThreadPoolInfo> _threadPool;
  public NamedContainer<String, NodeThreadPoolInfo> getThreadPool() { return this._threadPool; }
  public NodeInfo setThreadPool(NamedContainer<String, NodeThreadPoolInfo> val) { this._threadPool = val; return this; }


  static final ParseField TRANSPORT = new ParseField("transport");
  private NodeInfoTransport _transport;
  public NodeInfoTransport getTransport() { return this._transport; }
  public NodeInfo setTransport(NodeInfoTransport val) { this._transport = val; return this; }


  static final ParseField TRANSPORT_ADDRESS = new ParseField("transport_address");
  private String _transportAddress;
  public String getTransportAddress() { return this._transportAddress; }
  public NodeInfo setTransportAddress(String val) { this._transportAddress = val; return this; }


  static final ParseField VERSION = new ParseField("version");
  private String _version;
  public String getVersion() { return this._version; }
  public NodeInfo setVersion(String val) { this._version = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public NodeInfo fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return NodeInfo.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<NodeInfo, Void> PARSER =
    new ConstructingObjectParser<>(NodeInfo.class.getName(), false, args -> new NodeInfo());

  static {
    PARSER.declareString(NodeInfo::setBuildHash, BUILD_HASH);
    PARSER.declareString(NodeInfo::setHost, HOST);
    PARSER.declareObject(NodeInfo::setHttp, (p, t) -> NodeInfoHttp.PARSER.apply(p, null), HTTP);
    PARSER.declareString(NodeInfo::setIp, IP);
    PARSER.declareObject(NodeInfo::setJvm, (p, t) -> NodeJvmInfo.PARSER.apply(p, null), JVM);
    PARSER.declareString(NodeInfo::setName, NAME);
    PARSER.declareObject(NodeInfo::setNetwork, (p, t) -> NodeInfoNetwork.PARSER.apply(p, null), NETWORK);
    PARSER.declareObject(NodeInfo::setOs, (p, t) -> NodeOperatingSystemInfo.PARSER.apply(p, null), OS);
    PARSER.declareObjectArray(NodeInfo::setPlugins, (p, t) -> PluginStats.PARSER.apply(p), PLUGINS);
    PARSER.declareObject(NodeInfo::setProcess, (p, t) -> NodeProcessInfo.PARSER.apply(p, null), PROCESS);
    PARSER.declareObjectArray(NodeInfo::setRoles, (p, t) -> NodeRole.PARSER.apply(p), ROLES);
    PARSER.declareStringArray(NodeInfo::setSettings, SETTINGS);
    PARSER.declareObject(NodeInfo::setThreadPool, (p, t) ->  new NamedContainer<>(n -> () -> n,pp -> NodeThreadPoolInfo.PARSER.apply(pp, null)), THREAD_POOL);;
    PARSER.declareObject(NodeInfo::setTransport, (p, t) -> NodeInfoTransport.PARSER.apply(p, null), TRANSPORT);
    PARSER.declareString(NodeInfo::setTransportAddress, TRANSPORT_ADDRESS);
    PARSER.declareString(NodeInfo::setVersion, VERSION);
  }

}
