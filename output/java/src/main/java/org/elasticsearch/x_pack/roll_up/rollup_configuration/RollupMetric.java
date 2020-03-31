
package org.elasticsearch.x_pack.roll_up.rollup_configuration;

public enum RollupMetric {
  Min("min"),
    Max("max"),
    Sum("sum"),
    Avg("avg"),
    ValueCount("value_count");
  private final String textRepresentation;

  private RollupMetric(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
