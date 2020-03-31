
package org.elasticsearch.query_dsl.geo.w_k_t;

public enum TokenType {
  None("None"),
    Word("Word"),
    LParen("LParen"),
    RParen("RParen"),
    Comma("Comma");
  private final String textRepresentation;

  private TokenType(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
