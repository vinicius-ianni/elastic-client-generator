
package org.elasticsearch.aggregations.metric.weighted_average;

public enum ValueType {
  String("string"),
    Long("long"),
    Double("double"),
    Number("number"),
    Date("date"),
    DateNanos("date_nanos"),
    Ip("ip"),
    Numeric("numeric"),
    GeoPoint("geo_point"),
    Boolean("boolean");
  private final String textRepresentation;

  private ValueType(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
