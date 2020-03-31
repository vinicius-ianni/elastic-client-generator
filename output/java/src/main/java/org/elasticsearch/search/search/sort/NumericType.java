
package org.elasticsearch.search.search.sort;

public enum NumericType {
  Long("long"),
    Double("double"),
    Date("date"),
    DateNanos("date_nanos");
  private final String textRepresentation;

  private NumericType(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
