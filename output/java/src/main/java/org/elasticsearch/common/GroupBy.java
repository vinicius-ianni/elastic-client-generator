
package org.elasticsearch.common;

public enum GroupBy {
  Nodes("nodes"),
    Parents("parents"),
    None("none");
  private final String textRepresentation;

  private GroupBy(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
