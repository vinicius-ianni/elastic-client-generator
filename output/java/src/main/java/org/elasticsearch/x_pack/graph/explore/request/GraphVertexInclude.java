
package org.elasticsearch.x_pack.graph.explore.request;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class GraphVertexInclude  {
  
  private Double _boost;
  public Double getBoost() { return this._boost; }
  public GraphVertexInclude setBoost(Double val) { this._boost = val; return this; }


  private String _term;
  public String getTerm() { return this._term; }
  public GraphVertexInclude setTerm(String val) { this._term = val; return this; }

}
