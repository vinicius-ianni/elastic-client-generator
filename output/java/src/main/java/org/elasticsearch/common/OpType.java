
package org.elasticsearch.common;

public enum OpType {
  Index("index"),
    Create("create");
  private final String textRepresentation;

  private OpType(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
