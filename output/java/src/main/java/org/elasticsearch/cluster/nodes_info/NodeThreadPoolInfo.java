
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

public class NodeThreadPoolInfo  implements XContentable<NodeThreadPoolInfo> {
  
  static final ParseField KEEP_ALIVE = new ParseField("keep_alive");
  private String _keepAlive;
  public String getKeepAlive() { return this._keepAlive; }
  public NodeThreadPoolInfo setKeepAlive(String val) { this._keepAlive = val; return this; }


  static final ParseField MAX = new ParseField("max");
  private Integer _max;
  public Integer getMax() { return this._max; }
  public NodeThreadPoolInfo setMax(Integer val) { this._max = val; return this; }


  static final ParseField CORE = new ParseField("core");
  private Integer _core;
  public Integer getCore() { return this._core; }
  public NodeThreadPoolInfo setCore(Integer val) { this._core = val; return this; }


  static final ParseField SIZE = new ParseField("size");
  private Integer _size;
  public Integer getSize() { return this._size; }
  public NodeThreadPoolInfo setSize(Integer val) { this._size = val; return this; }


  static final ParseField QUEUE_SIZE = new ParseField("queue_size");
  private Integer _queueSize;
  public Integer getQueueSize() { return this._queueSize; }
  public NodeThreadPoolInfo setQueueSize(Integer val) { this._queueSize = val; return this; }


  static final ParseField TYPE = new ParseField("type");
  private String _type;
  public String getType() { return this._type; }
  public NodeThreadPoolInfo setType(String val) { this._type = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public NodeThreadPoolInfo fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return NodeThreadPoolInfo.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<NodeThreadPoolInfo, Void> PARSER =
    new ConstructingObjectParser<>(NodeThreadPoolInfo.class.getName(), false, args -> new NodeThreadPoolInfo());

  static {
    PARSER.declareString(NodeThreadPoolInfo::setKeepAlive, KEEP_ALIVE);
    PARSER.declareInteger(NodeThreadPoolInfo::setMax, MAX);
    PARSER.declareInteger(NodeThreadPoolInfo::setCore, CORE);
    PARSER.declareInteger(NodeThreadPoolInfo::setSize, SIZE);
    PARSER.declareInteger(NodeThreadPoolInfo::setQueueSize, QUEUE_SIZE);
    PARSER.declareString(NodeThreadPoolInfo::setType, TYPE);
  }

}
