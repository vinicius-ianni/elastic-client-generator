
package org.elasticsearch.aggregations.bucket.date_histogram;

public enum DateInterval {
  Second("second"),
    Minute("minute"),
    Hour("hour"),
    Day("day"),
    Week("week"),
    Month("month"),
    Quarter("quarter"),
    Year("year");
  private final String textRepresentation;

  private DateInterval(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
