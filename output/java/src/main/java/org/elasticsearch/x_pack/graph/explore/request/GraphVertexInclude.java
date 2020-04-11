
package org.elasticsearch.x_pack.graph.explore.request;

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

public class GraphVertexInclude  implements XContentable<GraphVertexInclude> {
  
  static final ParseField BOOST = new ParseField("boost");
  private Double _boost;
  public Double getBoost() { return this._boost; }
  public GraphVertexInclude setBoost(Double val) { this._boost = val; return this; }


  static final ParseField TERM = new ParseField("term");
  private String _term;
  public String getTerm() { return this._term; }
  public GraphVertexInclude setTerm(String val) { this._term = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public GraphVertexInclude fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return GraphVertexInclude.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<GraphVertexInclude, Void> PARSER =
    new ConstructingObjectParser<>(GraphVertexInclude.class.getName(), false, args -> new GraphVertexInclude());

  static {
    PARSER.declareDouble(GraphVertexInclude::setBoost, BOOST);
    PARSER.declareString(GraphVertexInclude::setTerm, TERM);
  }

}
