
package org.elasticsearch.query_dsl;

public enum Operator {
  And("and"),
    Or("or");
  private final String textRepresentation;

  private Operator(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
