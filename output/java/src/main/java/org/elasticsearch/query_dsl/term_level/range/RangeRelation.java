
package org.elasticsearch.query_dsl.term_level.range;

public enum RangeRelation {
  Within("within"),
    Contains("contains"),
    Intersects("intersects");
  private final String textRepresentation;

  private RangeRelation(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
