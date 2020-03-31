
package org.elasticsearch.common_options.shape;

public enum ShapeRelation {
  Intersects("intersects"),
    Disjoint("disjoint"),
    Within("within");
  private final String textRepresentation;

  private ShapeRelation(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
