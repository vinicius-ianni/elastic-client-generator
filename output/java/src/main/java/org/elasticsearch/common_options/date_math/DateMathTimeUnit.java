
package org.elasticsearch.common_options.date_math;

public enum DateMathTimeUnit {
  S("s"),
    M("m"),
    H("h"),
    D("d"),
    W("w"),
    M("M"),
    Y("y");
  private final String textRepresentation;

  private DateMathTimeUnit(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
