
package org.elasticsearch.x_pack.graph.explore;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.join_field_routing.*;
import org.elasticsearch.common_options.time_unit.*;
import org.elasticsearch.x_pack.graph.explore.request.*;
import org.elasticsearch.query_dsl.abstractions.container.*;

public class GraphExploreRequest  {
  
  private Routing _routing;
  public Routing getRouting() { return this._routing; }
  public GraphExploreRequest setRouting(Routing val) { this._routing = val; return this; }


  private Time _timeout;
  public Time getTimeout() { return this._timeout; }
  public GraphExploreRequest setTimeout(Time val) { this._timeout = val; return this; }


  private Hop _connections;
  public Hop getConnections() { return this._connections; }
  public GraphExploreRequest setConnections(Hop val) { this._connections = val; return this; }


  private GraphExploreControls _controls;
  public GraphExploreControls getControls() { return this._controls; }
  public GraphExploreRequest setControls(GraphExploreControls val) { this._controls = val; return this; }


  private QueryContainer _query;
  public QueryContainer getQuery() { return this._query; }
  public GraphExploreRequest setQuery(QueryContainer val) { this._query = val; return this; }


  private GraphVertexDefinition[] _vertices;
  public GraphVertexDefinition[] getVertices() { return this._vertices; }
  public GraphExploreRequest setVertices(GraphVertexDefinition[] val) { this._vertices = val; return this; }

}
