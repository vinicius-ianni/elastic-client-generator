
package org.elasticsearch.query_dsl.visitor;

public enum VisitorScope {
  Unknown("Unknown"),
    Query("Query"),
    Filter("Filter"),
    Must("Must"),
    MustNot("MustNot"),
    Should("Should"),
    PositiveQuery("PositiveQuery"),
    NegativeQuery("NegativeQuery"),
    Span("Span");
  private final String textRepresentation;

  private VisitorScope(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
