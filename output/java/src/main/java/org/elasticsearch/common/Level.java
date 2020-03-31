
package org.elasticsearch.common;

public enum Level {
  Cluster("cluster"),
    Indices("indices"),
    Shards("shards");
  private final String textRepresentation;

  private Level(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
