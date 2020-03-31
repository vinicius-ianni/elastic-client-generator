
package org.elasticsearch.x_pack.graph.explore.response;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class GraphVertex  {
  
  private Long _depth;
  public Long getDepth() { return this._depth; }
  public GraphVertex setDepth(Long val) { this._depth = val; return this; }


  private String _field;
  public String getField() { return this._field; }
  public GraphVertex setField(String val) { this._field = val; return this; }


  private String _term;
  public String getTerm() { return this._term; }
  public GraphVertex setTerm(String val) { this._term = val; return this; }


  private Double _weight;
  public Double getWeight() { return this._weight; }
  public GraphVertex setWeight(Double val) { this._weight = val; return this; }

}
