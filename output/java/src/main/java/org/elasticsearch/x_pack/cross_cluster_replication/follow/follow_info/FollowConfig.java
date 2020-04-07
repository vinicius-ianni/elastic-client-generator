
package org.elasticsearch.x_pack.cross_cluster_replication.follow.follow_info;

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
import org.elasticsearch.common_options.time_unit.*;

public class FollowConfig  implements XContentable<FollowConfig> {
  
  static final ParseField MAX_READ_REQUEST_OPERATION_COUNT = new ParseField("max_read_request_operation_count");
  private Integer _maxReadRequestOperationCount;
  public Integer getMaxReadRequestOperationCount() { return this._maxReadRequestOperationCount; }
  public FollowConfig setMaxReadRequestOperationCount(Integer val) { this._maxReadRequestOperationCount = val; return this; }


  static final ParseField MAX_READ_REQUEST_SIZE = new ParseField("max_read_request_size");
  private String _maxReadRequestSize;
  public String getMaxReadRequestSize() { return this._maxReadRequestSize; }
  public FollowConfig setMaxReadRequestSize(String val) { this._maxReadRequestSize = val; return this; }


  static final ParseField MAX_OUTSTANDING_READ_REQUESTS = new ParseField("max_outstanding_read_requests");
  private Integer _maxOutstandingReadRequests;
  public Integer getMaxOutstandingReadRequests() { return this._maxOutstandingReadRequests; }
  public FollowConfig setMaxOutstandingReadRequests(Integer val) { this._maxOutstandingReadRequests = val; return this; }


  static final ParseField MAX_WRITE_REQUEST_OPERATION_COUNT = new ParseField("max_write_request_operation_count");
  private Integer _maxWriteRequestOperationCount;
  public Integer getMaxWriteRequestOperationCount() { return this._maxWriteRequestOperationCount; }
  public FollowConfig setMaxWriteRequestOperationCount(Integer val) { this._maxWriteRequestOperationCount = val; return this; }


  static final ParseField MAX_WRITE_REQUEST_SIZE = new ParseField("max_write_request_size");
  private String _maxWriteRequestSize;
  public String getMaxWriteRequestSize() { return this._maxWriteRequestSize; }
  public FollowConfig setMaxWriteRequestSize(String val) { this._maxWriteRequestSize = val; return this; }


  static final ParseField MAX_OUTSTANDING_WRITE_REQUESTS = new ParseField("max_outstanding_write_requests");
  private Integer _maxOutstandingWriteRequests;
  public Integer getMaxOutstandingWriteRequests() { return this._maxOutstandingWriteRequests; }
  public FollowConfig setMaxOutstandingWriteRequests(Integer val) { this._maxOutstandingWriteRequests = val; return this; }


  static final ParseField MAX_WRITE_BUFFER_COUNT = new ParseField("max_write_buffer_count");
  private Integer _maxWriteBufferCount;
  public Integer getMaxWriteBufferCount() { return this._maxWriteBufferCount; }
  public FollowConfig setMaxWriteBufferCount(Integer val) { this._maxWriteBufferCount = val; return this; }


  static final ParseField MAX_WRITE_BUFFER_SIZE = new ParseField("max_write_buffer_size");
  private String _maxWriteBufferSize;
  public String getMaxWriteBufferSize() { return this._maxWriteBufferSize; }
  public FollowConfig setMaxWriteBufferSize(String val) { this._maxWriteBufferSize = val; return this; }


  static final ParseField MAX_RETRY_DELAY = new ParseField("max_retry_delay");
  private Time _maxRetryDelay;
  public Time getMaxRetryDelay() { return this._maxRetryDelay; }
  public FollowConfig setMaxRetryDelay(Time val) { this._maxRetryDelay = val; return this; }


  static final ParseField READ_POLL_TIMEOUT = new ParseField("read_poll_timeout");
  private Time _readPollTimeout;
  public Time getReadPollTimeout() { return this._readPollTimeout; }
  public FollowConfig setReadPollTimeout(Time val) { this._readPollTimeout = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public FollowConfig fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return FollowConfig.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<FollowConfig, Void> PARSER =
    new ConstructingObjectParser<>(FollowConfig.class.getName(), false, args -> new FollowConfig());

  static {
    PARSER.declareInteger(FollowConfig::setMaxReadRequestOperationCount, MAX_READ_REQUEST_OPERATION_COUNT);
    PARSER.declareString(FollowConfig::setMaxReadRequestSize, MAX_READ_REQUEST_SIZE);
    PARSER.declareInteger(FollowConfig::setMaxOutstandingReadRequests, MAX_OUTSTANDING_READ_REQUESTS);
    PARSER.declareInteger(FollowConfig::setMaxWriteRequestOperationCount, MAX_WRITE_REQUEST_OPERATION_COUNT);
    PARSER.declareString(FollowConfig::setMaxWriteRequestSize, MAX_WRITE_REQUEST_SIZE);
    PARSER.declareInteger(FollowConfig::setMaxOutstandingWriteRequests, MAX_OUTSTANDING_WRITE_REQUESTS);
    PARSER.declareInteger(FollowConfig::setMaxWriteBufferCount, MAX_WRITE_BUFFER_COUNT);
    PARSER.declareString(FollowConfig::setMaxWriteBufferSize, MAX_WRITE_BUFFER_SIZE);
    PARSER.declareObject(FollowConfig::setMaxRetryDelay, (p, t) -> Time.PARSER.apply(p, null), MAX_RETRY_DELAY);
    PARSER.declareObject(FollowConfig::setReadPollTimeout, (p, t) -> Time.PARSER.apply(p, null), READ_POLL_TIMEOUT);
  }

}
