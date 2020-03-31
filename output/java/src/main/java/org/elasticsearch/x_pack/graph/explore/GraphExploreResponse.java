
package org.elasticsearch.x_pack.graph.explore;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.graph.explore.response.*;
import org.elasticsearch.common.*;
import org.elasticsearch.internal.*;

public class GraphExploreResponse  {
  
  private GraphConnection[] _connections;
  public GraphConnection[] getConnections() { return this._connections; }
  public GraphExploreResponse setConnections(GraphConnection[] val) { this._connections = val; return this; }


  private ShardFailure[] _failures;
  public ShardFailure[] getFailures() { return this._failures; }
  public GraphExploreResponse setFailures(ShardFailure[] val) { this._failures = val; return this; }


  private Boolean _timedOut;
  public Boolean getTimedOut() { return this._timedOut; }
  public GraphExploreResponse setTimedOut(Boolean val) { this._timedOut = val; return this; }


  private Long _took;
  public Long getTook() { return this._took; }
  public GraphExploreResponse setTook(Long val) { this._took = val; return this; }


  private GraphVertex[] _vertices;
  public GraphVertex[] getVertices() { return this._vertices; }
  public GraphExploreResponse setVertices(GraphVertex[] val) { this._vertices = val; return this; }

}
