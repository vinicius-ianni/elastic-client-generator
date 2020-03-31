
package org.elasticsearch.query_dsl.geo;

public enum GeoValidationMethod {
  Coerce("coerce"),
    IgnoreMalformed("ignore_malformed"),
    Strict("strict");
  private final String textRepresentation;

  private GeoValidationMethod(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
