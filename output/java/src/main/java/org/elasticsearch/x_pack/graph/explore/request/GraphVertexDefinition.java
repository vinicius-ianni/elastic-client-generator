
package org.elasticsearch.x_pack.graph.explore.request;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.x_pack.graph.explore.request.*;
import org.elasticsearch.internal.*;

public class GraphVertexDefinition  implements XContentable<GraphVertexDefinition> {
  
  static final ParseField EXCLUDE = new ParseField("exclude");
  private List<String> _exclude;
  public List<String> getExclude() { return this._exclude; }
  public GraphVertexDefinition setExclude(List<String> val) { this._exclude = val; return this; }


  static final ParseField FIELD = new ParseField("field");
  private Field _field;
  public Field getField() { return this._field; }
  public GraphVertexDefinition setField(Field val) { this._field = val; return this; }


  static final ParseField INCLUDE = new ParseField("include");
  private List<GraphVertexInclude> _include;
  public List<GraphVertexInclude> getInclude() { return this._include; }
  public GraphVertexDefinition setInclude(List<GraphVertexInclude> val) { this._include = val; return this; }


  static final ParseField MIN_DOC_COUNT = new ParseField("min_doc_count");
  private Long _minDocCount;
  public Long getMinDocCount() { return this._minDocCount; }
  public GraphVertexDefinition setMinDocCount(Long val) { this._minDocCount = val; return this; }


  static final ParseField SHARD_MIN_DOC_COUNT = new ParseField("shard_min_doc_count");
  private Long _shardMinDocCount;
  public Long getShardMinDocCount() { return this._shardMinDocCount; }
  public GraphVertexDefinition setShardMinDocCount(Long val) { this._shardMinDocCount = val; return this; }


  static final ParseField SIZE = new ParseField("size");
  private Integer _size;
  public Integer getSize() { return this._size; }
  public GraphVertexDefinition setSize(Integer val) { this._size = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public GraphVertexDefinition fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return GraphVertexDefinition.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<GraphVertexDefinition, Void> PARSER =
    new ConstructingObjectParser<>(GraphVertexDefinition.class.getName(), false, args -> new GraphVertexDefinition());

  static {
    PARSER.declareStringArray(GraphVertexDefinition::setExclude, EXCLUDE);
    PARSER.declareField(GraphVertexDefinition::setField, (p, t) -> Field.createFrom(p), FIELD);
    PARSER.declareObjectArray(GraphVertexDefinition::setInclude, (p, t) -> GraphVertexInclude.PARSER.apply(p), INCLUDE);
    PARSER.declareLong(GraphVertexDefinition::setMinDocCount, MIN_DOC_COUNT);
    PARSER.declareLong(GraphVertexDefinition::setShardMinDocCount, SHARD_MIN_DOC_COUNT);
    PARSER.declareInteger(GraphVertexDefinition::setSize, SIZE);
  }

}
