
package org.elasticsearch.analysis.tokenizers;

public enum NoriDecompoundMode {
  Discard("discard"),
    None("none"),
    Mixed("mixed");
  private final String textRepresentation;

  private NoriDecompoundMode(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
