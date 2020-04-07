
package org.elasticsearch.cluster.nodes_hot_threads;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.common_options.time_unit.*;
import org.elasticsearch.internal.*;
import org.elasticsearch.common.*;

public class NodesHotThreadsRequest  implements XContentable<NodesHotThreadsRequest> {
  
  static final ParseField IGNORE_IDLE_THREADS = new ParseField("ignore_idle_threads");
  private Boolean _ignoreIdleThreads;
  public Boolean getIgnoreIdleThreads() { return this._ignoreIdleThreads; }
  public NodesHotThreadsRequest setIgnoreIdleThreads(Boolean val) { this._ignoreIdleThreads = val; return this; }


  static final ParseField INTERVAL = new ParseField("interval");
  private Time _interval;
  public Time getInterval() { return this._interval; }
  public NodesHotThreadsRequest setInterval(Time val) { this._interval = val; return this; }


  static final ParseField SNAPSHOTS = new ParseField("snapshots");
  private Long _snapshots;
  public Long getSnapshots() { return this._snapshots; }
  public NodesHotThreadsRequest setSnapshots(Long val) { this._snapshots = val; return this; }


  static final ParseField THREAD_TYPE = new ParseField("thread_type");
  private ThreadType _threadType;
  public ThreadType getThreadType() { return this._threadType; }
  public NodesHotThreadsRequest setThreadType(ThreadType val) { this._threadType = val; return this; }


  static final ParseField THREADS = new ParseField("threads");
  private Long _threads;
  public Long getThreads() { return this._threads; }
  public NodesHotThreadsRequest setThreads(Long val) { this._threads = val; return this; }


  static final ParseField TIMEOUT = new ParseField("timeout");
  private Time _timeout;
  public Time getTimeout() { return this._timeout; }
  public NodesHotThreadsRequest setTimeout(Time val) { this._timeout = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public NodesHotThreadsRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return NodesHotThreadsRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<NodesHotThreadsRequest, Void> PARSER =
    new ConstructingObjectParser<>(NodesHotThreadsRequest.class.getName(), false, args -> new NodesHotThreadsRequest());

  static {
    PARSER.declareBoolean(NodesHotThreadsRequest::setIgnoreIdleThreads, IGNORE_IDLE_THREADS);
    PARSER.declareObject(NodesHotThreadsRequest::setInterval, (p, t) -> Time.PARSER.apply(p, null), INTERVAL);
    PARSER.declareLong(NodesHotThreadsRequest::setSnapshots, SNAPSHOTS);
    PARSER.declareObject(NodesHotThreadsRequest::setThreadType, (p, t) -> ThreadType.PARSER.apply(p, null), THREAD_TYPE);
    PARSER.declareLong(NodesHotThreadsRequest::setThreads, THREADS);
    PARSER.declareObject(NodesHotThreadsRequest::setTimeout, (p, t) -> Time.PARSER.apply(p, null), TIMEOUT);
  }

}
