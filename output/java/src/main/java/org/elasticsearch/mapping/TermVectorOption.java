
package org.elasticsearch.mapping;

public enum TermVectorOption {
  No("no"),
    Yes("yes"),
    WithOffsets("with_offsets"),
    WithPositions("with_positions"),
    WithPositionsOffsets("with_positions_offsets"),
    WithPositionsOffsetsPayloads("with_positions_offsets_payloads");
  private final String textRepresentation;

  private TermVectorOption(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
