
package org.elasticsearch.common_options.date_math;

public enum DateMathTimeUnit {
  Seconds("s"),
    Minutes("m"),
    Hours("h"),
    Days("d"),
    Weeks("w"),
    Months("M"),
    Years("y");
  private final String textRepresentation;

  private DateMathTimeUnit(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
