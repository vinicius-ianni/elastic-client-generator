
package org.elasticsearch.mapping.types.core;

public enum IndexOptions {
  Docs("docs"),
    Freqs("freqs"),
    Positions("positions"),
    Offsets("offsets");
  private final String textRepresentation;

  private IndexOptions(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
