
package org.elasticsearch.x_pack.graph.explore.response;

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

public class GraphConnection  implements XContentable<GraphConnection> {
  
  static final ParseField DOC_COUNT = new ParseField("doc_count");
  private Long _docCount;
  public Long getDocCount() { return this._docCount; }
  public GraphConnection setDocCount(Long val) { this._docCount = val; return this; }


  static final ParseField SOURCE = new ParseField("source");
  private Long _source;
  public Long getSource() { return this._source; }
  public GraphConnection setSource(Long val) { this._source = val; return this; }


  static final ParseField TARGET = new ParseField("target");
  private Long _target;
  public Long getTarget() { return this._target; }
  public GraphConnection setTarget(Long val) { this._target = val; return this; }


  static final ParseField WEIGHT = new ParseField("weight");
  private Double _weight;
  public Double getWeight() { return this._weight; }
  public GraphConnection setWeight(Double val) { this._weight = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public GraphConnection fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return GraphConnection.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<GraphConnection, Void> PARSER =
    new ConstructingObjectParser<>(GraphConnection.class.getName(), false, args -> new GraphConnection());

  static {
    PARSER.declareLong(GraphConnection::setDocCount, DOC_COUNT);
    PARSER.declareLong(GraphConnection::setSource, SOURCE);
    PARSER.declareLong(GraphConnection::setTarget, TARGET);
    PARSER.declareDouble(GraphConnection::setWeight, WEIGHT);
  }

}
