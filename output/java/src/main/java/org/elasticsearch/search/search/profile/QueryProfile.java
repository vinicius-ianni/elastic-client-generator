
package org.elasticsearch.search.search.profile;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.search.search.profile.*;
import org.elasticsearch.internal.*;

public class QueryProfile  implements XContentable<QueryProfile> {
  
  static final ParseField BREAKDOWN = new ParseField("breakdown");
  private QueryBreakdown _breakdown;
  public QueryBreakdown getBreakdown() { return this._breakdown; }
  public QueryProfile setBreakdown(QueryBreakdown val) { this._breakdown = val; return this; }


  static final ParseField CHILDREN = new ParseField("children");
  private List<QueryProfile> _children;
  public List<QueryProfile> getChildren() { return this._children; }
  public QueryProfile setChildren(List<QueryProfile> val) { this._children = val; return this; }


  static final ParseField DESCRIPTION = new ParseField("description");
  private String _description;
  public String getDescription() { return this._description; }
  public QueryProfile setDescription(String val) { this._description = val; return this; }


  static final ParseField TIME_IN_NANOS = new ParseField("time_in_nanos");
  private Long _timeInNanos;
  public Long getTimeInNanos() { return this._timeInNanos; }
  public QueryProfile setTimeInNanos(Long val) { this._timeInNanos = val; return this; }


  static final ParseField TYPE = new ParseField("type");
  private String _type;
  public String getType() { return this._type; }
  public QueryProfile setType(String val) { this._type = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public QueryProfile fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return QueryProfile.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<QueryProfile, Void> PARSER =
    new ConstructingObjectParser<>(QueryProfile.class.getName(), false, args -> new QueryProfile());

  static {
    PARSER.declareObject(QueryProfile::setBreakdown, (p, t) -> QueryBreakdown.PARSER.apply(p, null), BREAKDOWN);
    PARSER.declareObjectArray(QueryProfile::setChildren, (p, t) -> QueryProfile.PARSER.apply(p), CHILDREN);
    PARSER.declareString(QueryProfile::setDescription, DESCRIPTION);
    PARSER.declareLong(QueryProfile::setTimeInNanos, TIME_IN_NANOS);
    PARSER.declareString(QueryProfile::setType, TYPE);
  }

}
