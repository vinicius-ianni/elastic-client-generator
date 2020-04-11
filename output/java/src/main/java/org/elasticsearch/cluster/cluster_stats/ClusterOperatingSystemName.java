
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

public class ClusterOperatingSystemName  implements XContentable<ClusterOperatingSystemName> {
  
  static final ParseField COUNT = new ParseField("count");
  private Integer _count;
  public Integer getCount() { return this._count; }
  public ClusterOperatingSystemName setCount(Integer val) { this._count = val; return this; }


  static final ParseField NAME = new ParseField("name");
  private String _name;
  public String getName() { return this._name; }
  public ClusterOperatingSystemName setName(String val) { this._name = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ClusterOperatingSystemName fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ClusterOperatingSystemName.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ClusterOperatingSystemName, Void> PARSER =
    new ConstructingObjectParser<>(ClusterOperatingSystemName.class.getName(), false, args -> new ClusterOperatingSystemName());

  static {
    PARSER.declareInt(ClusterOperatingSystemName::setCount, COUNT);
    PARSER.declareString(ClusterOperatingSystemName::setName, NAME);
  }

}
