
package org.elasticsearch.index_modules.similarity;

public enum Normalization {
  No("no"),
    H1("h1"),
    H2("h2"),
    H3("h3"),
    Z("z");
  private final String textRepresentation;

  private Normalization(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
