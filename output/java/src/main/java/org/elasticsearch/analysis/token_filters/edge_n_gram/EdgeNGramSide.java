
package org.elasticsearch.analysis.token_filters.edge_n_gram;

public enum EdgeNGramSide {
  Front("front"),
    Back("back");
  private final String textRepresentation;

  private EdgeNGramSide(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
