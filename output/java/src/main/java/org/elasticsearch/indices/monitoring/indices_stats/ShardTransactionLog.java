
package org.elasticsearch.indices.monitoring.indices_stats;

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

public class ShardTransactionLog  implements XContentable<ShardTransactionLog> {
  
  static final ParseField OPERATIONS = new ParseField("operations");
  private Long _operations;
  public Long getOperations() { return this._operations; }
  public ShardTransactionLog setOperations(Long val) { this._operations = val; return this; }


  static final ParseField SIZE_IN_BYTES = new ParseField("size_in_bytes");
  private Long _sizeInBytes;
  public Long getSizeInBytes() { return this._sizeInBytes; }
  public ShardTransactionLog setSizeInBytes(Long val) { this._sizeInBytes = val; return this; }


  static final ParseField UNCOMMITTED_OPERATIONS = new ParseField("uncommitted_operations");
  private Long _uncommittedOperations;
  public Long getUncommittedOperations() { return this._uncommittedOperations; }
  public ShardTransactionLog setUncommittedOperations(Long val) { this._uncommittedOperations = val; return this; }


  static final ParseField UNCOMMITTED_SIZE_IN_BYTES = new ParseField("uncommitted_size_in_bytes");
  private Long _uncommittedSizeInBytes;
  public Long getUncommittedSizeInBytes() { return this._uncommittedSizeInBytes; }
  public ShardTransactionLog setUncommittedSizeInBytes(Long val) { this._uncommittedSizeInBytes = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ShardTransactionLog fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ShardTransactionLog.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ShardTransactionLog, Void> PARSER =
    new ConstructingObjectParser<>(ShardTransactionLog.class.getName(), false, args -> new ShardTransactionLog());

  static {
    PARSER.declareLong(ShardTransactionLog::setOperations, OPERATIONS);
    PARSER.declareLong(ShardTransactionLog::setSizeInBytes, SIZE_IN_BYTES);
    PARSER.declareLong(ShardTransactionLog::setUncommittedOperations, UNCOMMITTED_OPERATIONS);
    PARSER.declareLong(ShardTransactionLog::setUncommittedSizeInBytes, UNCOMMITTED_SIZE_IN_BYTES);
  }

}
