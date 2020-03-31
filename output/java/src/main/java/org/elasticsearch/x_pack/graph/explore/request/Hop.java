
package org.elasticsearch.x_pack.graph.explore.request;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.graph.explore.request.*;
import org.elasticsearch.query_dsl.abstractions.container.*;

public class Hop  {
  
  private Hop _connections;
  public Hop getConnections() { return this._connections; }
  public Hop setConnections(Hop val) { this._connections = val; return this; }


  private QueryContainer _query;
  public QueryContainer getQuery() { return this._query; }
  public Hop setQuery(QueryContainer val) { this._query = val; return this; }


  private GraphVertexDefinition[] _vertices;
  public GraphVertexDefinition[] getVertices() { return this._vertices; }
  public Hop setVertices(GraphVertexDefinition[] val) { this._vertices = val; return this; }

}
