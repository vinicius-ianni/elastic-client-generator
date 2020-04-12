
package org.elasticsearch.cluster.cluster_stats;

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
import org.elasticsearch.internal.*;

public class ClusterJvmMemory  implements XContentable<ClusterJvmMemory> {
  
  static final ParseField HEAP_MAX_IN_BYTES = new ParseField("heap_max_in_bytes");
  private Long _heapMaxInBytes;
  public Long getHeapMaxInBytes() { return this._heapMaxInBytes; }
  public ClusterJvmMemory setHeapMaxInBytes(Long val) { this._heapMaxInBytes = val; return this; }


  static final ParseField HEAP_USED_IN_BYTES = new ParseField("heap_used_in_bytes");
  private Long _heapUsedInBytes;
  public Long getHeapUsedInBytes() { return this._heapUsedInBytes; }
  public ClusterJvmMemory setHeapUsedInBytes(Long val) { this._heapUsedInBytes = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    builder.field(HEAP_MAX_IN_BYTES.getPreferredName(), _heapMaxInBytes);
    builder.field(HEAP_USED_IN_BYTES.getPreferredName(), _heapUsedInBytes);
    return builder;
  }

  @Override
  public ClusterJvmMemory fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ClusterJvmMemory.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ClusterJvmMemory, Void> PARSER =
    new ConstructingObjectParser<>(ClusterJvmMemory.class.getName(), false, args -> new ClusterJvmMemory());

  static {
    PARSER.declareLong(ClusterJvmMemory::setHeapMaxInBytes, HEAP_MAX_IN_BYTES);
    PARSER.declareLong(ClusterJvmMemory::setHeapUsedInBytes, HEAP_USED_IN_BYTES);
  }

}
