
package org.elasticsearch.query_dsl.multi_term_query_rewrite;

public enum RewriteMultiTerm {
  ConstantScore("constant_score"),
    ScoringBoolean("scoring_boolean"),
    ConstantScoreBoolean("constant_score_boolean"),
    TopTermsN("top_terms_N"),
    TopTermsBoostN("top_terms_boost_N"),
    TopTermsBlendedFreqsN("top_terms_blended_freqs_N");
  private final String textRepresentation;

  private RewriteMultiTerm(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
