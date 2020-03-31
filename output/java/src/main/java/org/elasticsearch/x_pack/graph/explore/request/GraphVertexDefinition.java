
package org.elasticsearch.x_pack.graph.explore.request;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.x_pack.graph.explore.request.*;
import org.elasticsearch.internal.*;

public class GraphVertexDefinition  {
  
  private String[] _exclude;
  public String[] getExclude() { return this._exclude; }
  public GraphVertexDefinition setExclude(String[] val) { this._exclude = val; return this; }


  private Field _field;
  public Field getField() { return this._field; }
  public GraphVertexDefinition setField(Field val) { this._field = val; return this; }


  private GraphVertexInclude[] _include;
  public GraphVertexInclude[] getInclude() { return this._include; }
  public GraphVertexDefinition setInclude(GraphVertexInclude[] val) { this._include = val; return this; }


  private Long _minDocCount;
  public Long getMinDocCount() { return this._minDocCount; }
  public GraphVertexDefinition setMinDocCount(Long val) { this._minDocCount = val; return this; }


  private Long _shardMinDocCount;
  public Long getShardMinDocCount() { return this._shardMinDocCount; }
  public GraphVertexDefinition setShardMinDocCount(Long val) { this._shardMinDocCount = val; return this; }


  private Integer _size;
  public Integer getSize() { return this._size; }
  public GraphVertexDefinition setSize(Integer val) { this._size = val; return this; }

}
