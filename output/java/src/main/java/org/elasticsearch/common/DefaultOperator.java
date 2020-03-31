
package org.elasticsearch.common;

public enum DefaultOperator {
  And("AND"),
    Or("OR");
  private final String textRepresentation;

  private DefaultOperator(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
