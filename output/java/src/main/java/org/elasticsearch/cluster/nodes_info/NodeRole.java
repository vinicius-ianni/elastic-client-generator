
package org.elasticsearch.cluster.nodes_info;

public enum NodeRole {
  Master("master"),
    Data("data"),
    Client("client"),
    Ingest("ingest"),
    Ml("ml");
  private final String textRepresentation;

  private NodeRole(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
