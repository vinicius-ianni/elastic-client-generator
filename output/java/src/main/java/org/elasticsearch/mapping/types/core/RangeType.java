
package org.elasticsearch.mapping.types.core;

public enum RangeType {
  IntegerRange("integer_range"),
    FloatRange("float_range"),
    LongRange("long_range"),
    DoubleRange("double_range"),
    DateRange("date_range"),
    IpRange("ip_range");
  private final String textRepresentation;

  private RangeType(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
