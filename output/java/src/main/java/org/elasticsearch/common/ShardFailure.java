
package org.elasticsearch.common;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;
import org.elasticsearch.common.*;
import org.elasticsearch.internal.*;

public class ShardFailure  implements XContentable<ShardFailure> {
  
  static final ParseField INDEX = new ParseField("index");
  private String _index;
  public String getIndex() { return this._index; }
  public ShardFailure setIndex(String val) { this._index = val; return this; }


  static final ParseField NODE = new ParseField("node");
  private String _node;
  public String getNode() { return this._node; }
  public ShardFailure setNode(String val) { this._node = val; return this; }


  static final ParseField REASON = new ParseField("reason");
  private ErrorCause _reason;
  public ErrorCause getReason() { return this._reason; }
  public ShardFailure setReason(ErrorCause val) { this._reason = val; return this; }


  static final ParseField SHARD = new ParseField("shard");
  private Integer _shard;
  public Integer getShard() { return this._shard; }
  public ShardFailure setShard(Integer val) { this._shard = val; return this; }


  static final ParseField STATUS = new ParseField("status");
  private String _status;
  public String getStatus() { return this._status; }
  public ShardFailure setStatus(String val) { this._status = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    builder.field(INDEX.getPreferredName(), _index);
    builder.field(NODE.getPreferredName(), _node);
    if (_reason != null) {
      builder.field(REASON.getPreferredName());
      _reason.toXContent(builder, params);
    }
    builder.field(SHARD.getPreferredName(), _shard);
    builder.field(STATUS.getPreferredName(), _status);
    return builder;
  }

  @Override
  public ShardFailure fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ShardFailure.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ShardFailure, Void> PARSER =
    new ConstructingObjectParser<>(ShardFailure.class.getName(), false, args -> new ShardFailure());

  static {
    PARSER.declareString(ShardFailure::setIndex, INDEX);
    PARSER.declareString(ShardFailure::setNode, NODE);
    PARSER.declareObject(ShardFailure::setReason, (p, t) -> ErrorCause.PARSER.apply(p, t), REASON);
    PARSER.declareInt(ShardFailure::setShard, SHARD);
    PARSER.declareString(ShardFailure::setStatus, STATUS);
  }

}
