
package org.elasticsearch.mapping.types;

public enum FieldType {
  None("none"),
    GeoPoint("geo_point"),
    GeoShape("geo_shape"),
    Ip("ip"),
    Binary("binary"),
    Keyword("keyword"),
    Text("text"),
    SearchAsYouType("search_as_you_type"),
    Date("date"),
    DateNanos("date_nanos"),
    Boolean("boolean"),
    Completion("completion"),
    Nested("nested"),
    Object("object"),
    Murmur3("murmur3"),
    TokenCount("token_count"),
    Percolator("percolator"),
    Integer("integer"),
    Long("long"),
    Short("short"),
    Byte("byte"),
    Float("float"),
    HalfFloat("half_float"),
    ScaledFloat("scaled_float"),
    Double("double"),
    IntegerRange("integer_range"),
    FloatRange("float_range"),
    LongRange("long_range"),
    DoubleRange("double_range"),
    DateRange("date_range"),
    IpRange("ip_range"),
    Alias("alias"),
    Join("join"),
    RankFeature("rank_feature"),
    RankFeatures("rank_features"),
    Flattened("flattened"),
    Shape("shape");
  private final String textRepresentation;

  private FieldType(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
