
package org.elasticsearch.cluster;

public enum ClusterStatus {
  Green("green"),
    Yellow("yellow"),
    Red("red");
  private final String textRepresentation;

  private ClusterStatus(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
