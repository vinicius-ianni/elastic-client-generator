
package org.elasticsearch.cluster.cluster_allocation_explain;

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
import org.elasticsearch.cluster.cluster_allocation_explain.*;

public class UnassignedInformation  implements XContentable<UnassignedInformation> {
  
  static final ParseField AT = new ParseField("at");
  private Date _at;
  public Date getAt() { return this._at; }
  public UnassignedInformation setAt(Date val) { this._at = val; return this; }


  static final ParseField LAST_ALLOCATION_STATUS = new ParseField("last_allocation_status");
  private String _lastAllocationStatus;
  public String getLastAllocationStatus() { return this._lastAllocationStatus; }
  public UnassignedInformation setLastAllocationStatus(String val) { this._lastAllocationStatus = val; return this; }


  static final ParseField REASON = new ParseField("reason");
  private UnassignedInformationReason _reason;
  public UnassignedInformationReason getReason() { return this._reason; }
  public UnassignedInformation setReason(UnassignedInformationReason val) { this._reason = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public UnassignedInformation fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return UnassignedInformation.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<UnassignedInformation, Void> PARSER =
    new ConstructingObjectParser<>(UnassignedInformation.class.getName(), false, args -> new UnassignedInformation());

  static {
    PARSER.declareDate(UnassignedInformation::setAt, (p, t) -> Date.createFrom(p), AT);
    PARSER.declareString(UnassignedInformation::setLastAllocationStatus, LAST_ALLOCATION_STATUS);
    PARSER.declareObject(UnassignedInformation::setReason, (p, t) -> UnassignedInformationReason.PARSER.apply(p, null), REASON);
  }

}
