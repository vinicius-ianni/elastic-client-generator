
package org.elasticsearch.ingest.processors;

public enum DateRounding {
  S("s"),
    M("m"),
    H("h"),
    D("d"),
    W("w"),
    M("M"),
    Y("y");
  private final String textRepresentation;

  private DateRounding(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
