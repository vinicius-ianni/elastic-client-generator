
package org.elasticsearch.indices.monitoring.indices_recovery;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.indices.monitoring.indices_recovery.*;
import org.elasticsearch.internal.*;

public class RecoveryIndexStatus  implements XContentable<RecoveryIndexStatus> {
  
  static final ParseField BYTES = new ParseField("bytes");
  private RecoveryBytes _bytes;
  public RecoveryBytes getBytes() { return this._bytes; }
  public RecoveryIndexStatus setBytes(RecoveryBytes val) { this._bytes = val; return this; }


  static final ParseField FILES = new ParseField("files");
  private RecoveryFiles _files;
  public RecoveryFiles getFiles() { return this._files; }
  public RecoveryIndexStatus setFiles(RecoveryFiles val) { this._files = val; return this; }


  static final ParseField SIZE = new ParseField("size");
  private RecoveryBytes _size;
  public RecoveryBytes getSize() { return this._size; }
  public RecoveryIndexStatus setSize(RecoveryBytes val) { this._size = val; return this; }


  static final ParseField SOURCE_THROTTLE_TIME_IN_MILLIS = new ParseField("source_throttle_time_in_millis");
  private Long _sourceThrottleTimeInMillis;
  public Long getSourceThrottleTimeInMillis() { return this._sourceThrottleTimeInMillis; }
  public RecoveryIndexStatus setSourceThrottleTimeInMillis(Long val) { this._sourceThrottleTimeInMillis = val; return this; }


  static final ParseField TARGET_THROTTLE_TIME_IN_MILLIS = new ParseField("target_throttle_time_in_millis");
  private Long _targetThrottleTimeInMillis;
  public Long getTargetThrottleTimeInMillis() { return this._targetThrottleTimeInMillis; }
  public RecoveryIndexStatus setTargetThrottleTimeInMillis(Long val) { this._targetThrottleTimeInMillis = val; return this; }


  static final ParseField TOTAL_TIME_IN_MILLIS = new ParseField("total_time_in_millis");
  private Long _totalTimeInMillis;
  public Long getTotalTimeInMillis() { return this._totalTimeInMillis; }
  public RecoveryIndexStatus setTotalTimeInMillis(Long val) { this._totalTimeInMillis = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public RecoveryIndexStatus fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return RecoveryIndexStatus.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<RecoveryIndexStatus, Void> PARSER =
    new ConstructingObjectParser<>(RecoveryIndexStatus.class.getName(), false, args -> new RecoveryIndexStatus());

  static {
    PARSER.declareObject(RecoveryIndexStatus::setBytes, (p, t) -> RecoveryBytes.PARSER.apply(p, null), BYTES);
    PARSER.declareObject(RecoveryIndexStatus::setFiles, (p, t) -> RecoveryFiles.PARSER.apply(p, null), FILES);
    PARSER.declareObject(RecoveryIndexStatus::setSize, (p, t) -> RecoveryBytes.PARSER.apply(p, null), SIZE);
    PARSER.declareLong(RecoveryIndexStatus::setSourceThrottleTimeInMillis, SOURCE_THROTTLE_TIME_IN_MILLIS);
    PARSER.declareLong(RecoveryIndexStatus::setTargetThrottleTimeInMillis, TARGET_THROTTLE_TIME_IN_MILLIS);
    PARSER.declareLong(RecoveryIndexStatus::setTotalTimeInMillis, TOTAL_TIME_IN_MILLIS);
  }

}
