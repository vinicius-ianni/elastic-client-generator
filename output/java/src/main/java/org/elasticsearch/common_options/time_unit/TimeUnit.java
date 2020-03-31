
package org.elasticsearch.common_options.time_unit;

public enum TimeUnit {
  Nanos("nanos"),
    Micros("micros"),
    Ms("ms"),
    S("s"),
    M("m"),
    H("h"),
    D("d");
  private final String textRepresentation;

  private TimeUnit(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
