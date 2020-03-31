
package org.elasticsearch.index_modules.similarity.d_f_i;

public enum DfiIndependenceMeasure {
  Standardized("standardized"),
    Saturated("saturated"),
    Chisquared("chisquared");
  private final String textRepresentation;

  private DfiIndependenceMeasure(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
