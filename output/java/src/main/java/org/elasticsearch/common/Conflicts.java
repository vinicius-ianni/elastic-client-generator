
package org.elasticsearch.common;

public enum Conflicts {
  Abort("abort"),
    Proceed("proceed");
  private final String textRepresentation;

  private Conflicts(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
