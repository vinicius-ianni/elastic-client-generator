
package org.elasticsearch.query_dsl.full_text.multi_match;

public enum ZeroTermsQuery {
  All("all"),
    None("none");
  private final String textRepresentation;

  private ZeroTermsQuery(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
