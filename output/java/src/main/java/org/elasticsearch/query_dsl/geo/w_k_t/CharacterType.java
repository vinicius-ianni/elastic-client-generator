
package org.elasticsearch.query_dsl.geo.w_k_t;

public enum CharacterType {
  Whitespace("Whitespace"),
    Alpha("Alpha"),
    Comment("Comment");
  private final String textRepresentation;

  private CharacterType(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
