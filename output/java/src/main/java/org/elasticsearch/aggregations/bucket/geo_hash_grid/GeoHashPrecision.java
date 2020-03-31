
package org.elasticsearch.aggregations.bucket.geo_hash_grid;

public enum GeoHashPrecision {
  Precision1("Precision1"),
    Precision2("Precision2"),
    Precision3("Precision3"),
    Precision4("Precision4"),
    Precision5("Precision5"),
    Precision6("Precision6"),
    Precision7("Precision7"),
    Precision8("Precision8"),
    Precision9("Precision9"),
    Precision10("Precision10"),
    Precision11("Precision11"),
    Precision12("Precision12");
  private final String textRepresentation;

  private GeoHashPrecision(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
