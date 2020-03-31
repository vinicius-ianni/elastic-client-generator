
package org.elasticsearch.search.suggesters.term_suggester;

public enum StringDistance {
  Internal("internal"),
    DamerauLevenshtein("damerau_levenshtein"),
    Levenshtein("levenshtein"),
    JaroWinkler("jaro_winkler"),
    Ngram("ngram");
  private final String textRepresentation;

  private StringDistance(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
