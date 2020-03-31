
package org.elasticsearch.analysis.token_filters.delimited_payload;

public enum DelimitedPayloadEncoding {
  Int("int"),
    Float("float"),
    Identity("identity");
  private final String textRepresentation;

  private DelimitedPayloadEncoding(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
