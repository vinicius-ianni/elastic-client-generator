
package org.elasticsearch.query_dsl.full_text.multi_match;

public enum TextQueryType {
  BestFields("best_fields"),
    MostFields("most_fields"),
    CrossFields("cross_fields"),
    Phrase("phrase"),
    PhrasePrefix("phrase_prefix"),
    BoolPrefix("bool_prefix");
  private final String textRepresentation;

  private TextQueryType(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
