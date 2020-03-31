
package org.elasticsearch.common;

public enum Size {
  Raw("Raw"),
    K("k"),
    M("m"),
    G("g"),
    T("t"),
    P("p");
  private final String textRepresentation;

  private Size(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
