
package org.elasticsearch.analysis.token_filters.synonym;

public enum SynonymFormat {
  Solr("solr"),
    Wordnet("wordnet");
  private final String textRepresentation;

  private SynonymFormat(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
