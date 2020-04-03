
package org.elasticsearch.ingest.processors;

public enum DateRounding {
  Seconds("s"),
    Minutes("m"),
    Hours("h"),
    Days("d"),
    Weeks("w"),
    Months("M"),
    Years("y");
  private final String textRepresentation;

  private DateRounding(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
