
package org.elasticsearch.x_pack.graph.explore.response;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class GraphConnection  {
  
  private Long _docCount;
  public Long getDocCount() { return this._docCount; }
  public GraphConnection setDocCount(Long val) { this._docCount = val; return this; }


  private Long _source;
  public Long getSource() { return this._source; }
  public GraphConnection setSource(Long val) { this._source = val; return this; }


  private Long _target;
  public Long getTarget() { return this._target; }
  public GraphConnection setTarget(Long val) { this._target = val; return this; }


  private Double _weight;
  public Double getWeight() { return this._weight; }
  public GraphConnection setWeight(Double val) { this._weight = val; return this; }

}
