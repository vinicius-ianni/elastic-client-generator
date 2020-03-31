
package org.elasticsearch.x_pack.watcher.condition;

public enum Quantifier {
  Some("some"),
    All("all");
  private final String textRepresentation;

  private Quantifier(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
