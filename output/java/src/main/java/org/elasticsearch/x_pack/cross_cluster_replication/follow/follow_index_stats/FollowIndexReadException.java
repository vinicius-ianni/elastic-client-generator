
package org.elasticsearch.x_pack.cross_cluster_replication.follow.follow_index_stats;

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
import org.elasticsearch.common.*;

public class FollowIndexReadException  implements XContentable<FollowIndexReadException> {
  
  static final ParseField FROM_SEQ_NO = new ParseField("from_seq_no");
  private Long _fromSeqNo;
  public Long getFromSeqNo() { return this._fromSeqNo; }
  public FollowIndexReadException setFromSeqNo(Long val) { this._fromSeqNo = val; return this; }


  static final ParseField RETRIES = new ParseField("retries");
  private Integer _retries;
  public Integer getRetries() { return this._retries; }
  public FollowIndexReadException setRetries(Integer val) { this._retries = val; return this; }


  static final ParseField EXCEPTION = new ParseField("exception");
  private ErrorCause _exception;
  public ErrorCause getException() { return this._exception; }
  public FollowIndexReadException setException(ErrorCause val) { this._exception = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public FollowIndexReadException fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return FollowIndexReadException.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<FollowIndexReadException, Void> PARSER =
    new ConstructingObjectParser<>(FollowIndexReadException.class.getName(), false, args -> new FollowIndexReadException());

  static {
    PARSER.declareLong(FollowIndexReadException::setFromSeqNo, FROM_SEQ_NO);
    PARSER.declareInt(FollowIndexReadException::setRetries, RETRIES);
    PARSER.declareObject(FollowIndexReadException::setException, (p, t) -> ErrorCause.PARSER.apply(p, t), EXCEPTION);
  }

}
