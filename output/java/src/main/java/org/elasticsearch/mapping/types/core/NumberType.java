
package org.elasticsearch.mapping.types.core;

public enum NumberType {
  Float("float"),
    HalfFloat("half_float"),
    ScaledFloat("scaled_float"),
    Double("double"),
    Integer("integer"),
    Long("long"),
    Short("short"),
    Byte("byte");
  private final String textRepresentation;

  private NumberType(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
