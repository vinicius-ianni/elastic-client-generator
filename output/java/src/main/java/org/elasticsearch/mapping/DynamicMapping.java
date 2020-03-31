
package org.elasticsearch.mapping;

public enum DynamicMapping {
  Strict("strict");
  private final String textRepresentation;

  private DynamicMapping(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
