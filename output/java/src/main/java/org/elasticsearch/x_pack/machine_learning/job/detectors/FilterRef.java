
package org.elasticsearch.x_pack.machine_learning.job.detectors;

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
import org.elasticsearch.common_abstractions.infer.id.*;
import org.elasticsearch.x_pack.machine_learning.job.detectors.*;

public class FilterRef  implements XContentable<FilterRef> {
  
  static final ParseField FILTER_ID = new ParseField("filter_id");
  private Id _filterId;
  public Id getFilterId() { return this._filterId; }
  public FilterRef setFilterId(Id val) { this._filterId = val; return this; }


  static final ParseField FILTER_TYPE = new ParseField("filter_type");
  private RuleFilterType _filterType;
  public RuleFilterType getFilterType() { return this._filterType; }
  public FilterRef setFilterType(RuleFilterType val) { this._filterType = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    builder.field(FILTER_ID.getPreferredName());
    _filterId.toXContent(builder, params);
    if (_filterType != null) {
      builder.field(FILTER_TYPE.getPreferredName());
      _filterType.toXContent(builder, params);
    }
    return builder;
  }

  @Override
  public FilterRef fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return FilterRef.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<FilterRef, Void> PARSER =
    new ConstructingObjectParser<>(FilterRef.class.getName(), false, args -> new FilterRef());

  static {
    PARSER.declareObject(FilterRef::setFilterId, (p, t) -> Id.createFrom(p), FILTER_ID);
    PARSER.declareObject(FilterRef::setFilterType, (p, t) -> RuleFilterType.PARSER.apply(p), FILTER_TYPE);
  }

}
