
package org.elasticsearch.analysis.tokenizers.n_gram;

public enum TokenChar {
  Letter("letter"),
    Digit("digit"),
    Whitespace("whitespace"),
    Punctuation("punctuation"),
    Symbol("symbol");
  private final String textRepresentation;

  private TokenChar(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
