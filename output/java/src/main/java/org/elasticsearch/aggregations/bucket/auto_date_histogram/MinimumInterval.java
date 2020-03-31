
package org.elasticsearch.aggregations.bucket.auto_date_histogram;

public enum MinimumInterval {
  Second("second"),
    Minute("minute"),
    Hour("hour"),
    Day("day"),
    Month("month"),
    Year("year");
  private final String textRepresentation;

  private MinimumInterval(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
