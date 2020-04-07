
package org.elasticsearch.x_pack.slm;

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
import org.elasticsearch.x_pack.slm.*;

public class SnapshotLifecyclePolicyMetadata  implements XContentable<SnapshotLifecyclePolicyMetadata> {
  
  static final ParseField MODIFIED_DATE_MILLIS = new ParseField("modified_date_millis");
  private Date _modifiedDateMillis;
  public Date getModifiedDateMillis() { return this._modifiedDateMillis; }
  public SnapshotLifecyclePolicyMetadata setModifiedDateMillis(Date val) { this._modifiedDateMillis = val; return this; }


  static final ParseField NEXT_EXECUTION_MILLIS = new ParseField("next_execution_millis");
  private Date _nextExecutionMillis;
  public Date getNextExecutionMillis() { return this._nextExecutionMillis; }
  public SnapshotLifecyclePolicyMetadata setNextExecutionMillis(Date val) { this._nextExecutionMillis = val; return this; }


  static final ParseField POLICY = new ParseField("policy");
  private SnapshotLifecyclePolicy _policy;
  public SnapshotLifecyclePolicy getPolicy() { return this._policy; }
  public SnapshotLifecyclePolicyMetadata setPolicy(SnapshotLifecyclePolicy val) { this._policy = val; return this; }


  static final ParseField VERSION = new ParseField("version");
  private Integer _version;
  public Integer getVersion() { return this._version; }
  public SnapshotLifecyclePolicyMetadata setVersion(Integer val) { this._version = val; return this; }


  static final ParseField IN_PROGRESS = new ParseField("in_progress");
  private SnapshotLifecycleInProgress _inProgress;
  public SnapshotLifecycleInProgress getInProgress() { return this._inProgress; }
  public SnapshotLifecyclePolicyMetadata setInProgress(SnapshotLifecycleInProgress val) { this._inProgress = val; return this; }


  static final ParseField LAST_SUCCESS = new ParseField("last_success");
  private SnapshotLifecycleInvocationRecord _lastSuccess;
  public SnapshotLifecycleInvocationRecord getLastSuccess() { return this._lastSuccess; }
  public SnapshotLifecyclePolicyMetadata setLastSuccess(SnapshotLifecycleInvocationRecord val) { this._lastSuccess = val; return this; }


  static final ParseField LAST_FAILURE = new ParseField("last_failure");
  private SnapshotLifecycleInvocationRecord _lastFailure;
  public SnapshotLifecycleInvocationRecord getLastFailure() { return this._lastFailure; }
  public SnapshotLifecyclePolicyMetadata setLastFailure(SnapshotLifecycleInvocationRecord val) { this._lastFailure = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public SnapshotLifecyclePolicyMetadata fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return SnapshotLifecyclePolicyMetadata.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<SnapshotLifecyclePolicyMetadata, Void> PARSER =
    new ConstructingObjectParser<>(SnapshotLifecyclePolicyMetadata.class.getName(), false, args -> new SnapshotLifecyclePolicyMetadata());

  static {
    PARSER.declareDate(SnapshotLifecyclePolicyMetadata::setModifiedDateMillis, (p, t) -> Date.createFrom(p), MODIFIED_DATE_MILLIS);
    PARSER.declareDate(SnapshotLifecyclePolicyMetadata::setNextExecutionMillis, (p, t) -> Date.createFrom(p), NEXT_EXECUTION_MILLIS);
    PARSER.declareObject(SnapshotLifecyclePolicyMetadata::setPolicy, (p, t) -> SnapshotLifecyclePolicy.PARSER.apply(p, null), POLICY);
    PARSER.declareInteger(SnapshotLifecyclePolicyMetadata::setVersion, VERSION);
    PARSER.declareObject(SnapshotLifecyclePolicyMetadata::setInProgress, (p, t) -> SnapshotLifecycleInProgress.PARSER.apply(p, null), IN_PROGRESS);
    PARSER.declareObject(SnapshotLifecyclePolicyMetadata::setLastSuccess, (p, t) -> SnapshotLifecycleInvocationRecord.PARSER.apply(p, null), LAST_SUCCESS);
    PARSER.declareObject(SnapshotLifecyclePolicyMetadata::setLastFailure, (p, t) -> SnapshotLifecycleInvocationRecord.PARSER.apply(p, null), LAST_FAILURE);
  }

}
