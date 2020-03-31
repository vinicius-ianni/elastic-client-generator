
package org.elasticsearch.aggregations.pipeline.moving_average.models;

public enum HoltWintersType {
  Add("add"),
    Mult("mult");
  private final String textRepresentation;

  private HoltWintersType(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
