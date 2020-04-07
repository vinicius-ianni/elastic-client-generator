
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

public class SnapshotLifecycleInvocationRecord  implements XContentable<SnapshotLifecycleInvocationRecord> {
  
  static final ParseField SNAPSHOT_NAME = new ParseField("snapshot_name");
  private String _snapshotName;
  public String getSnapshotName() { return this._snapshotName; }
  public SnapshotLifecycleInvocationRecord setSnapshotName(String val) { this._snapshotName = val; return this; }


  static final ParseField TIME = new ParseField("time");
  private Date _time;
  public Date getTime() { return this._time; }
  public SnapshotLifecycleInvocationRecord setTime(Date val) { this._time = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public SnapshotLifecycleInvocationRecord fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return SnapshotLifecycleInvocationRecord.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<SnapshotLifecycleInvocationRecord, Void> PARSER =
    new ConstructingObjectParser<>(SnapshotLifecycleInvocationRecord.class.getName(), false, args -> new SnapshotLifecycleInvocationRecord());

  static {
    PARSER.declareString(SnapshotLifecycleInvocationRecord::setSnapshotName, SNAPSHOT_NAME);
    PARSER.declareDate(SnapshotLifecycleInvocationRecord::setTime, (p, t) -> Date.createFrom(p), TIME);
  }

}
