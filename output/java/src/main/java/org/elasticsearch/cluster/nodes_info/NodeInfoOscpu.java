
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


import org.elasticsearch.internal.*;

public class NodeInfoOscpu  implements XContentable<NodeInfoOscpu> {
  
  static final ParseField CACHE_SIZE = new ParseField("cache_size");
  private String _cacheSize;
  public String getCacheSize() { return this._cacheSize; }
  public NodeInfoOscpu setCacheSize(String val) { this._cacheSize = val; return this; }


  static final ParseField CACHE_SIZE_IN_BYTES = new ParseField("cache_size_in_bytes");
  private Integer _cacheSizeInBytes;
  public Integer getCacheSizeInBytes() { return this._cacheSizeInBytes; }
  public NodeInfoOscpu setCacheSizeInBytes(Integer val) { this._cacheSizeInBytes = val; return this; }


  static final ParseField CORES_PER_SOCKET = new ParseField("cores_per_socket");
  private Integer _coresPerSocket;
  public Integer getCoresPerSocket() { return this._coresPerSocket; }
  public NodeInfoOscpu setCoresPerSocket(Integer val) { this._coresPerSocket = val; return this; }


  static final ParseField MHZ = new ParseField("mhz");
  private Integer _mhz;
  public Integer getMhz() { return this._mhz; }
  public NodeInfoOscpu setMhz(Integer val) { this._mhz = val; return this; }


  static final ParseField MODEL = new ParseField("model");
  private String _model;
  public String getModel() { return this._model; }
  public NodeInfoOscpu setModel(String val) { this._model = val; return this; }


  static final ParseField TOTAL_CORES = new ParseField("total_cores");
  private Integer _totalCores;
  public Integer getTotalCores() { return this._totalCores; }
  public NodeInfoOscpu setTotalCores(Integer val) { this._totalCores = val; return this; }


  static final ParseField TOTAL_SOCKETS = new ParseField("total_sockets");
  private Integer _totalSockets;
  public Integer getTotalSockets() { return this._totalSockets; }
  public NodeInfoOscpu setTotalSockets(Integer val) { this._totalSockets = val; return this; }


  static final ParseField VENDOR = new ParseField("vendor");
  private String _vendor;
  public String getVendor() { return this._vendor; }
  public NodeInfoOscpu setVendor(String val) { this._vendor = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public NodeInfoOscpu fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return NodeInfoOscpu.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<NodeInfoOscpu, Void> PARSER =
    new ConstructingObjectParser<>(NodeInfoOscpu.class.getName(), false, args -> new NodeInfoOscpu());

  static {
    PARSER.declareString(NodeInfoOscpu::setCacheSize, CACHE_SIZE);
    PARSER.declareInteger(NodeInfoOscpu::setCacheSizeInBytes, CACHE_SIZE_IN_BYTES);
    PARSER.declareInteger(NodeInfoOscpu::setCoresPerSocket, CORES_PER_SOCKET);
    PARSER.declareInteger(NodeInfoOscpu::setMhz, MHZ);
    PARSER.declareString(NodeInfoOscpu::setModel, MODEL);
    PARSER.declareInteger(NodeInfoOscpu::setTotalCores, TOTAL_CORES);
    PARSER.declareInteger(NodeInfoOscpu::setTotalSockets, TOTAL_SOCKETS);
    PARSER.declareString(NodeInfoOscpu::setVendor, VENDOR);
  }

}
